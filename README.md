
http://localhost:8080/api/orden/save


{
		"fecha":"2025-04-01",
		"total": 1625.50,
        "sucursal":{ "id":2040,
                     "nombre":""
        },
        "orden_id":1,
		"productos":[
			{	
                "codigo" : 18156,
				"descripcion": "Esmeriladora angular",
				"precio": 625
			},{ 
				"codigo": 17193,
				"descripcion":"Pala redonda",
				"precio": 100.50
			}
		 ]
}
#####################

http://localhost:8080/api/orden/findAll

http://localhost:8080/api/orden/find/1




#####################

http://localhost:8080/api/producto/updateprice/17193

    { 
				"codigo": 17193,
				"descripcion":"Pala redonda",
				"precio": 99.99
			}

#####################



   
