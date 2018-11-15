import com.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Consumer
 *
 * @author DingwenDeng
 * @summary Consumer
 * @since 2018-11-14 15:40
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        System.out.println(context.getDisplayName()+"客户端准备启动");
        context.start();
        System.out.println("客户端已启动");
        DemoService service = context.getBean(DemoService.class);
        System.out.println(service.getServiceName(1L));
    }

}