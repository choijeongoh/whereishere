package twogtwoj.whereishere.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import twogtwoj.whereishere.domain.Category;
import twogtwoj.whereishere.domain.Company;
import twogtwoj.whereishere.domain.EventPost;
import twogtwoj.whereishere.domain.Member;
import twogtwoj.whereishere.repository.EventPostRepository;
import twogtwoj.whereishere.service.CompanyService;
import twogtwoj.whereishere.service.EventPostService;
import twogtwoj.whereishere.service.MemberService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class BasicController {

    private final MemberService memberService;
    private final CompanyService companyService;

    @GetMapping("/home")
    public String enterHome() {return "/home/home";}


    @PostConstruct
    public void initMemberAndCompany() {
        memberService.save(new Member("Jonggak","123123","임종각",LocalDate.of(1993,6,16)));

        memberService.save(new Member("afternoon","321321","최정오",LocalDate.of(1997,4,15)));

        memberService.save(new Member("Gagyeong","154689","박가경",LocalDate.of(1988,12,7)));

        memberService.save(new Member("Gzero","181818","김지영",LocalDate.of(1996,7,6)));


        companyService.save(new Company("hospital","vlqnrhk123",92037401829L,
                "하얀나라피부과의원","피부과.jpg","당신의 피부를 깔끔하게 만들어 드립니다.",Category.HOSPITAL.getDescription()
        ,"강원 속초시 동해대로 4215"));

        companyService.save(new Company("fitness","harder12",2201293294L,
                "핏앤피트니스","피트니스.jpg","저희 헬스장은 렉이 8개 입니다.",Category.HEALTH.getDescription()
                ,"강원 원주시 능라동길 47"));

        companyService.save(new Company("won","1234",9589039470L,
                "바로그의원","의원.jpg","허리진료를 잘합니다.",Category.HOSPITAL.getDescription()
                ,"강원 강릉시 경강로 2090-1 "));

        companyService.save(new Company("gang","gang123",8493027308L,
                "강냉이소쿠리","강냉이.jpg","저희는 아이스크림이 맛있어요",Category.CAFFE.getDescription()
                ,"강원 강릉시 주문진읍 학교담길 32-8"));

        companyService.save(new Company("mandong","man1234",2382967489L,
                "만동제과","제과.jpg","저희는 빵이 맛있습니다.",Category.CAFFE.getDescription()
                ,"강원 강릉시 금성로 6"));

        companyService.save(new Company("coffee12","co9876",1029384753L,
                "테라로사 커피공장 강릉본점","커피공장.jpg","쉽게 커피 즐기기, 커피상식, 커피문화 공유합니다.",Category.CAFFE.getDescription()
                ,"강원 강릉시 구정면 현천길 25"));

        companyService.save(new Company("car12","coo1248",584930273L,
                "강릉자동차극장","자동차극장.jpg","분위기 좋은 자동차 극장입니다.",Category.THEATER.getDescription()
                ,"강원 강릉시 구정면 칠성로 13-8"));

        companyService.save(new Company("movie21","mo1249",948593827L,
                "롯데시네마 동해","롯데시네마.jpg","롯데컬처웍스는 고객에게 특별한 감동을 전해 드리기 위해 영화관\n" +
                "입지선정부터 다양한 서비스까지 인간사랑, 자연/환경사랑,\n" +
                "영화사랑을 신조로 영화관을 운영하고 있습니다.",Category.THEATER.getDescription()
                ,"강원 동해시 한섬로 111-7"));

        companyService.save(new Company("green12","gr380",3802983740L,
                "그린횟집","횟집.jpg","그린횟집은 횟감으로 쓰이는 모든 어종과 기타 해산물은 전국 최고의 청정해역인 동해안에서 갓잡아 올린 신선한 횟감을 주문진, 남애항과 근처 항구에서 직접 입찰 구매하여 공급하고 있습니다.",Category.RESTAURANT.getDescription()
                ,"강원 강릉시 사천면 진리해변길 123"));

        companyService.save(new Company("koreanfood12","ko19209",1920994838L,
                "강릉한정식 하서주미역","강릉한정식.jpg","기쁜날, 좋은날 함께하고 싶은 사람과 먹기 좋은 음식.\n" +
                "내 가족에게 대접하듯 정성들여 준비하겠습니다.",Category.RESTAURANT.getDescription()
                ,"강원 강릉시 난설헌로 73"));


    }
}
