package atm.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.atminterface.dao.atmconnection;
import org.exception.InvalidAmountException;
import org.junit.Test;

public class withdrawmodule {

	@Test
	public void testCase1() throws ClassNotFoundException, SQLException, InvalidAmountException
	{

		assertEquals(4500, atmconnection.withdraw(9905,19500));
	}

}
