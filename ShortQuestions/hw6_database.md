### MySQL Relational Database

### 1. Create `oms_company_address` tabel

```SQL
CREATE TABLE oms_company_address (
    id bigint not null,
    address_name varchar(200),
    send_status int(1),
    receive_status int(1),
    name varchar(64),
    phone varchar(64),
    province varchar(64),
    city varchar(64),
    region varchar(64),
    detail_address varchar(200)
);
```

### 2. Insert some random data to `oms_company_address` table


![insert samples](https://github.com/Liam-Zhou/Chuwa0910/assets/70967683/1935048a-6124-485f-a368-88cf9422c3c7)


### 3. Write a SQL query to fetch all the data


![fetch all data](https://github.com/Liam-Zhou/Chuwa0910/assets/70967683/30b0f449-aeb9-4405-8942-b2e1ef5342ba)


### 4. Write a SQL query to fetch top 3

   
![fetch top 3](https://github.com/Liam-Zhou/Chuwa0910/assets/70967683/eb0cd66f-f205-4486-8d52-5e9073f8c167)


### 5. Update the table to set all the phone to 666-6666-8888

![update phone 1](https://github.com/Liam-Zhou/Chuwa0910/assets/70967683/c04d4a22-93e7-46ab-b746-602f669dd116)

![update phone 2](https://github.com/Liam-Zhou/Chuwa0910/assets/70967683/f18e2731-e868-48e9-bed5-99deb877d328)


### MongoDB No-SQL Database

### 1. Create `test` DB

``` 
use test
```

### 2. Create oms_company_address collection

```
db.createCollection("oms_company_address")
```

### 3. Insert a few random entries to `oms_company_address` collection

```
db.oms_company_address.insert([
    { id: "1", address: "364 Quinby Road", phone: "912-123-4067" },
    { id: "2", address: "368 Quinby Road", phone: "212-123-0567" },
    { id: "3", address: "370 Quinby Road", phone: "612-923-2567" },
    { id: "4", address: "372 Quinby Road", phone: "412-123-4567" },
    { id: "5", address: "472 Quinby Road", phone: "812-123-4567" }
])
```

### 4. Read one entry from `oms_company_address` collection

```
db.oms_company_address.findOne()
```

### 5. Read all entrie from `oms_company_address` collection

```
db.oms_company_address.find()
```

### 6. Update one entry from oms_company_address collection.

```
db.oms_company_address.update(
  {address_name: "364 Quinby Road"}, 
  {$set: {phone: "666-666-6666"}}
)
```

### 7. Remove one entry from oms_company_address collection 

```
db.oms_company_address.remove({address_name: "364 Quinby Road"})
```