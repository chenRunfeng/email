package email;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner; 

import com.alibaba.fastjson.JSON;

import dao.ApplicantMapper;
import model.Applicant;
import service.ApplicantService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:mybatis-spring.xml"}) 
public class applicantTest {

	  private static Logger logger = Logger.getLogger(applicantTest.class);  
	//  private ApplicationContext ac = null;  
	    @Resource  
	    private ApplicantMapper applicantmapper=null; 
	  
	//  @Before  
	//  public void before() {  
//	      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//	      userService = (IUserService) ac.getBean("userService");  
	//  }  
	  
	    @Test  
	    public void test1() {  
	       Applicant user = applicantmapper.selectByPrimaryKey("zh104151");  
	        // System.out.println(user.getUserName());  
	        // logger.info("值："+user.getUserName());  
	        logger.info(JSON.toJSONString(user));  
	        logger.info("321");
	        System.out.println(JSON.toJSONString(user));
	    }  
	    @Test  
	    public void test2() {  
	      List<Applicant>  user = applicantmapper.selectbyfield("a_status", "0");  
	        // System.out.println(user.getUserName());  
	        // logger.info("值："+user.getUserName()); 
	      for (Applicant applicant : user) {
		        logger.info(JSON.toJSONString(applicant));
		}  
	    } 
	}  

	
