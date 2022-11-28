package atm.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.atminterface.dao.atmconnection;
import org.exception.InvalidAmountException;
import org.junit.Test;

public class balancecheckmodule{


	@Test
	public void testCase1() throws ClassNotFoundException, SQLException, InvalidAmountException
	{
          assertEquals(1000 ,atmconnection.balanceCheck(9905));
	}
}
