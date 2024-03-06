package project.thegiodidong.Models;

import lombok.*;
import org.apache.catalina.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "carts")
public class Cart {
    @Id
    private String cartId;
    private List<LineItem> lineItemList;
    private Integer quantities;
    private Integer totalPrice;
    private User user;
    private Boolean status;

}
