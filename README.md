# Registration Service

####Volunteer Registration
**http://localhost:8080/volunteers/**

####Donor Registration
**http://localhost:8080/donors/**

####Sample Workflow of CRUD operations on entity

#####1) Get the existing registrations

* GET on
http://localhost:8080/volunteers/

* create new registration
POST on 
http://localhost:8080/volunteers/

```json
{
    "lastName":"kishore",
    "firstName":"Janga",
    "email":"kxjanga@gmail.com",
    "phone":"11111111",
    "zipCode":"36005",
    "country":"usa",
    "password": "password"
    
    
 }
#####2) Update the existing registrations
 * GET on
http://localhost:8080/volunteers/
 

 * POST on 
http://localhost:8080/volunteers/

 PUT on
 http://localhost:8080/volunteers/580560bfc9ac3dc83609daa3
 {
    "lastName":"kishore",
    "firstName":"nga",
    "email":"kxjanga@gmail.com",
    "phone":"11111111",
    "zipCode":"36005",
    "country":"usa",
    "password": "password"
    
    
 }
 
#####3) Delete a registration
 FIrst do get and then delete on
 http://localhost:8080/volunteers/58055d2ac9ac3dc83609

