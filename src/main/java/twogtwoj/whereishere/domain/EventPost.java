package twogtwoj.whereishere.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import twogtwoj.whereishere.repository.CommentRepository;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Getter @Setter
public class EventPost { // 이벤트 게시판

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventPostId;
    @ManyToOne
    @JoinColumn(name ="COMPANY_ID")
    private Company company;

    private String eventPostTitle;

    private String eventPostContent;

    private String eventPostImg;

    private LocalDate eventPostWriteDate;

    public EventPost(String eventPostTitle, String eventPostContent, String eventPostImg, LocalDate eventPostWriteDate) {
        this.eventPostTitle = eventPostTitle;
        this.eventPostContent = eventPostContent;
        this.eventPostImg = eventPostImg;
        this.eventPostWriteDate = eventPostWriteDate;
    }
    public EventPost(){}

//    public void addEventPost(EventPost eventPost) {
//        eventPost.
//        orderItem.setOrder(this);
//    }
//
//    //==생성 메서드==//
//    public static EventPost createEventPost(EventPost eventPost, Company company) {
//        EventPost post = new EventPost();
//        post.setEventPostContent();
//        post.setEventPostImg();
//        post.setEventPostTitle();
//
//        order.setMember(member);
//        order.setDelivery(delivery);
//        for (OrderItem orderItem : orderItems) {
//            order.addOrderItem(orderItem);
//        }
//        order.setStatus(OrderStatus.ORDER);
//        order.setOrderDate(LocalDateTime.now());
//        return order;
//    }
//
//    //==생성 메서드==//
//    public static OrderItem createOrderItem(Item item, int orderPrice, int count) {
//        OrderItem orderItem = new OrderItem();
//        orderItem.setItem(item);
//        orderItem.setOrderPrice(orderPrice);
//        orderItem.setCount(count);
//
//        item.removeStock(count);
//        return orderItem;
//    }
}
