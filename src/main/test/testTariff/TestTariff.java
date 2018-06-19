package testTariff;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wys.work.beans.Pager;
import com.wys.work.beans.TariffBean;
import com.wys.work.tariffmag.handleservice.ITariffHandleService;
import com.wys.work.tariffmag.queryservice.ITariffQueryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestTariff {

	@Resource
	private ITariffHandleService tariffHandleServiceImpl;
	
	@Resource
	private ITariffQueryService tariffQueryServiceImpl;
	
	@Test
	public void addTariff() {
		TariffBean tariff = new TariffBean();
		tariff.setTariffName("abb");
		tariffHandleServiceImpl.saveTariffBean(tariff);
	}
	
	@Test
	public void findTariff() {
		Pager pager = new Pager();
		pager.setRows(5);
		pager.setPage(1);
		pager.setIndex(0);
		tariffQueryServiceImpl.findTariffBean2Pager(pager);
	}
	
	
	
}
