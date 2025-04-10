// package com.springtest.demoapp.entities;

// import org.springframework.data.mongodb.core.mapping.Document;

// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Document(collection = "employees")
// @Getter @Setter @NoArgsConstructor
// public class EmployeeMongo {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     private int id;

//     private String name;

//     private String city;
    
//     private String status;

//     public EmployeeMongo(int id, String name, String city, String status) {
//         super();
//         this.id = id;
//         this.name = name;
//         this.city = city;
//         this.status = status;
//     }

//     // public EmployeeMongo() {
//     //     super();
//     // }

//     // public int getId() {
//     //     return id;
//     // }

//     // public void setId(int id) {
//     //     this.id = id;
//     // }

//     // public String getName() {
//     //     return name;
//     // }

//     // public void setName(String name) {
//     //     this.name = name;
//     // }

//     // public String getCity() {
//     //     return city;
//     // }

//     // public void setCity(String city) {
//     //     this.city = city;
//     // }

//     // public String getStatus() {
//     //     return status;
//     // }

//     // public void setStatus(String status) {
//     //     this.status = status;
//     // }

//     @Override
//     public String toString() {
//         return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", status=" + status + "]";
//     }   
// }
