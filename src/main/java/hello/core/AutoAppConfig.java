package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration //기본적으로 @Component 어노테이션이 붙어있음
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) //@Component 어노테이션이 붙은 클래스들을 찾아서 자동으로 스프링 빈 등록
public class AutoAppConfig {
//
//    @Autowired MemberRepository memberRepository;
//    @Autowired
//    DiscountPolicy discountPolicy;
//
//    @Bean
//    OrderService orderService(){
//        return new OrderServiceImpl(memberRepository, discountPolicy);
//    }
//
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }
}
