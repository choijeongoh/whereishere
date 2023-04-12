package twogtwoj.whereishere.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import twogtwoj.whereishere.domain.EventPost;
import twogtwoj.whereishere.service.EventPostService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class EventPostController {
    private final EventPostService eventPostService;

    @GetMapping("/home/eventPost.html")

    @PostConstruct
    public void initMemberAndCompany() {
        eventPostService.saveEventPost(new EventPost("최초가입 10% 할인", "최초 가압하신 분들에게 10%할인 해드립니다.", "이미지", LocalDate.of(1997, 4, 15)));

    }

    @GetMapping("/eventPost/new")
    public String createEventForm(Model model) {
        model.addAttribute("form", new EventPost());
        return "/eventPost/createEventPost";
    }

    @PostMapping("/eventPost/new")
    public String create(EventPost form) {

        EventPost eventPost = new EventPost();
        eventPost.setEventPostTitle(form.getEventPostTitle());
        eventPost.setEventPostContent(form.getEventPostContent());
        eventPost.setEventPostImg(form.getEventPostImg());
        eventPost.setEventPostWriteDate(form.getEventPostWriteDate());
        eventPost.setCompany(form.getCompany());

        eventPostService.saveEventPost(eventPost);
        return "redirect:/";
    }

//    @GetMapping("/items")
//    public String list(Model model) {
//        List<Item> items = itemService.findItems();
//        model.addAttribute("items", items);
//        return "items/itemList";
//    }
//
//    @GetMapping("items/{itemId}/edit")
//    public String updateItemForm(@PathVariable("itemId") Long itemId, Model model) {
//        Book item = (Book) itemService.findOne(itemId);
//
//        BookForm form = new BookForm();
//        form.setId(item.getId());
//        form.setName(item.getName());
//        form.setPrice(item.getPrice());
//        form.setStockQuantity(item.getStockQuantity());
//        form.setAuthor(item.getAuthor());
//        form.setIsbn(item.getIsbn());
//
//        model.addAttribute("form", form);
//        return "items/updateItemForm";
//    }
//
//    @PostMapping("items/{itemId}/edit")
//    public String updateItem(@PathVariable Long itemId, @ModelAttribute("form") BookForm form) {
//
//        itemService.updateItem(itemId, form.getName(), form.getPrice(), form.getStockQuantity());
//
//        return "redirect:/items";
//    }
}
