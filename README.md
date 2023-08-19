# art-gallery
Backend for art gallery. (Sell and Buy arts)

### USER
### Create User 
* curl -H "Content-Type: application/json" -X POST http://localhost:8080/user -d @user.json
#### sample request
    {
    "id" : "9a904279-8fac-4f6f-bcac-12c8725eec93",
    "firstName" : "Srp",
    "lastName" : "pqr",
    "emailId" : "srp@art.com",
    "createdDate" : "19-08-2023"
    }
