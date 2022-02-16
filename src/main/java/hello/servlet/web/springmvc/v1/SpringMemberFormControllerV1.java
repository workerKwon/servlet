package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Component가 있으면 컴포넌트 스캔의 대상이 되서 자동으로 스프링 빈으로 등록된다.
 *
 * @Conrollter의 역할.
 * 1. 스프링이 자동으로 스프링 빈으로 등록한다.(안에 @Component가 있기 때문)
 * 2. 어노테이션 기반의 컨트롤러로 인식한다.
 *
 * RequestMappingHandlerMapping은 스프링 빈 중에서(스프링 빈으로 등록이 되어 있어야 한다.)
 * @Controller 혹은 @RequestMapping이 클래스 레벨에 붙어있으면
 * 핸들러로서 맵핑 정보에 등록할 수 있는 핸들러맵핑의 대상이 된다.
 */
@Controller
public class SpringMemberFormControllerV1 {

    /**
     * @RequestMapping의 URL이 호출되면 메서드가 호출된다. 어노테이션 기반으로 동작하기 때문에 메서드의 이름은 아무렇게나 지으면 된다.
     * @return ModelAndView
     */
    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
