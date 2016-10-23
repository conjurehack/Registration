package com.esrx.organizations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:9000")
public class RegistrationService {

        //todo
        //      private String data = "10-20-2016";

        @Autowired
        private CellsRepository cellsRepository;

        @Autowired
        private SheltersRepository sheltersRepository;

        private static Map<Integer, String> grid = new HashMap<Integer, String>();

        static {
                grid.put(0, "A");
                grid.put(1, "B");
                grid.put(2, "C");
                grid.put(3, "D");
                grid.put(4, "E");
                grid.put(5, "F");
                grid.put(6, "G");
                grid.put(7, "H");
                grid.put(8, "I");
                grid.put(9, "J");
                grid.put(10, "K");
        }

        @RequestMapping("/shelterslist/{uuid}/{date}")
        public Shelters getShelters(@PathVariable("uuid") String uuid, @PathVariable("date") String data) {
                Shelters shelter = sheltersRepository.findOne(uuid);
                int capa=shelter.getTotalBeds();
                List<Cells> cells =  cellsRepository.findByshelterIdAndDate(shelter.getUuid(), data);
                if (cells.isEmpty()) {
                        System.out.println("cells are empty" );
                        for (int i =0; i < capa; i++) {
                                Cells cell = new Cells();
                                String cellNbr = grid.get(i/10) + i%10;
                                cell.setCellId(cellNbr);
                                cell.setShelterId(shelter.getUuid());
                                cell.setDate(data);
                                cells.add(cell);
                        }
                        cellsRepository.save(cells);

                }
                int availableCount = 0;
                for (Cells cell : cells) {
                        if (!cell.isReserved()) {
                                availableCount++;
                        }
                }
                shelter.setCells(cells);
                shelter.setAvailable(availableCount);
                shelter.setUnavailable(capa-availableCount);

                System.out.println(cells);

                return shelter;
        }


        @RequestMapping("/shelterslist")
        public List<Shelters> getShelters() {
                return sheltersRepository.findAll();
        }

        @RequestMapping("/shelterslist/{date}")
        public List<Shelters> getShelters(@PathVariable ("date") String date) {
                List<Shelters> shelters =  sheltersRepository.findAll();

                for (Shelters shelter : shelters) {
                        int capa=shelter.getTotalBeds();
                        List<Cells> cells =  cellsRepository.findByshelterIdAndDate(shelter.getUuid(), date);
                        if (cells.isEmpty()) {
                                System.out.println("cells are empty" );
                                for (int i =0; i < capa; i++) {
                                        Cells cell = new Cells();
                                        String cellNbr = grid.get(i/10) + i%10;
                                        cell.setCellId(cellNbr);
                                        cell.setShelterId(shelter.getUuid());
                                        cell.setDate(date);
                                        cells.add(cell);
                                }
                                cellsRepository.save(cells);

                        }
                        int availableCount = 0;
                        for (Cells cell : cells) {
                                if (!cell.isReserved()) {
                                        availableCount++;
                                }
                        }
                        shelter.setCells(cells);
                        shelter.setAvailable(availableCount);
                        shelter.setUnavailable(capa-availableCount);

                }

                return shelters;
        }


}