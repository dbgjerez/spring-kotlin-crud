# spring-kotlin-crud
API Example using Spring, Kotlin and MongoDB

# Usage
### Build
```bash
$ gradle clean build
```

### Run
```bash
$ java -jar build/libs/spring-kotlin-crud-*.jar
```

### Test using HTTPie
POST
```bash
$ echo -n '{"title":"the Lord of the Ring"}' | http :8080/book
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Date: Fri, 21 Dec 2018 07:46:35 GMT
Transfer-Encoding: chunked

{
    "id": "5c1c9a5b7cc1a642a2c76c12",
    "title": "the Lord of the Ring"
}
```
PUT
```bash
$ echo -n '{"id":"5c1c9a5b7cc1a642a2c76c12","title":"The Lord of The Rings"}' | http PUT :8080/book/5c1c9a5b7cc1a642a2c76c12 
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Date: Fri, 21 Dec 2018 07:48:22 GMT
Transfer-Encoding: chunked

{
    "id": "5c1c9a5b7cc1a642a2c76c12",
    "title": "The Lord of The Rings"
}

```
GET
```bash
08:48 $ http :8080/book/5c1c9a5b7cc1a642a2c76c12
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Date: Fri, 21 Dec 2018 07:49:12 GMT
Transfer-Encoding: chunked
{
    "id": "5c1c9a5b7cc1a642a2c76c12",
    "title": "The Lord of The Rings"
}

```
DELETE
```bash
$ http DELETE :8080/book/5c1c9a5b7cc1a642a2c76c12
HTTP/1.1 200 
Content-Length: 0
Date: Fri, 21 Dec 2018 07:49:50 GMT

```
