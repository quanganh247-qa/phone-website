package project.thegiodidong.Models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")
public class Product {
    @Id
    private String productId ;
    private String productName;
    private String images;
    private double price;
    private String quantities;
    private String types;
    private String suppliers;
    private double weight;
    private String desciption;
    private Date date;

}
