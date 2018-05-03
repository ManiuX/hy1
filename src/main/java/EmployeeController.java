import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class EmployeeController {

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees(){
        List<Employee> list = new ArrayList<Employee>();
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("小明");
        e1.setAge(20);
        e1.setGender("男");
        Employee e2 = new Employee();
        e2.setId(2);
        e2.setName("小红");
        e2.setAge(19);
        e2.setGender("女");
        Employee e3 = new Employee();
        e3.setId(3);
        e3.setName("小智");
        e3.setAge(15);
        e3.setGender("男");
        Employee e4 = new Employee();
        e4.setId(4);
        e4.setName("小刚");
        e4.setAge(16);
        e4.setGender("男");
        Employee e5 = new Employee();
        e5.setId(5);
        e5.setName("小露");
        e5.setAge(15);
        e5.setGender("女");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        return list;
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeController.class, args);
    }

}
