package org.mifosplatform.dataimport.domain.populator;

import java.io.IOException;

//import org.mifosplatform.dataimport.services.http.MifosRestClient;
import org.mifosplatform.dataimport.domain.populator.client.ClientWorkbookPopulator;
//import org.mifosplatform.dataimport.domain.populator.client.GroupWorkbookPopulator;
//import org.mifosplatform.dataimport.domain.populator.loan.LoanProductSheetPopulator;
//import org.mifosplatform.dataimport.domain.populator.loan.LoanRepaymentWorkbookPopulator;
//import org.mifosplatform.dataimport.domain.populator.loan.LoanWorkbookPopulator;
//import org.mifosplatform.dataimport.domain.populator.savings.SavingsProductSheetPopulator;
//import org.mifosplatform.dataimport.domain.populator.savings.SavingsTransactionWorkbookPopulator;
//import org.mifosplatform.dataimport.domain.populator.savings.SavingsWorkbookPopulator;
import org.mifosplatform.organisation.office.service.OfficeReadPlatformService;
//import org.mifosplatform.organisation.office.service.OfficeReadPlatformServiceImpl;
import org.mifosplatform.organisation.staff.service.StaffReadPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class WorkbookPopulatorFactory {

	
	//private static OfficeSheetPopulator officeSheetPopulator;

	private final OfficeReadPlatformService officeReadPlatformService;
	private final StaffReadPlatformService staffReadPlatformService;

	@Autowired
	public WorkbookPopulatorFactory(
			final OfficeReadPlatformService officeReadPlatformService,
			final StaffReadPlatformService staffReadPlatformService) {

		this.officeReadPlatformService = officeReadPlatformService;
		this.staffReadPlatformService = staffReadPlatformService;
	}
	
	public WorkbookPopulator createWorkbookPopulator(
			String parameter, String template) throws IOException {
		// MifosRestClient restClient = new MifosRestClient();

		/*if (template.trim().equals("client")) // auto-wiring
												// OfficereadPlatformService
			return new ClientWorkbookPopulator(
					parameter,
					new OfficeSheetPopulator(officeReadPlatformService),
					new PersonnelSheetPopulator(Boolean.FALSE, officeReadPlatformService, staffReadPlatformService));*/
	        /*else if(template.trim().equals("groups"))
	        	 return new GroupWorkbookPopulator(new OfficeSheetPopulator(restClient), new PersonnelSheetPopulator(Boolean.FALSE, restClient),
	        			 new ClientSheetPopulator(restClient));
	        else if(template.trim().equals("loan"))
	        	 return new LoanWorkbookPopulator(new OfficeSheetPopulator(restClient), new ClientSheetPopulator(restClient), new GroupSheetPopulator(restClient),
	        			 new PersonnelSheetPopulator(Boolean.TRUE, restClient), new LoanProductSheetPopulator(restClient), new ExtrasSheetPopulator(restClient));
	        else if(template.trim().equals("loanRepaymentHistory"))
	        	 return new LoanRepaymentWorkbookPopulator(restClient, new OfficeSheetPopulator(restClient), new ClientSheetPopulator(restClient), new ExtrasSheetPopulator(restClient));
	        else if(template.trim().equals("savings"))
	        	 return new SavingsWorkbookPopulator(new OfficeSheetPopulator(restClient), new ClientSheetPopulator(restClient), new GroupSheetPopulator(restClient),
	        			 new PersonnelSheetPopulator(Boolean.TRUE, restClient), new SavingsProductSheetPopulator(restClient));
	        else if(template.trim().equals("savingsTransactionHistory"))
	        	 return new SavingsTransactionWorkbookPopulator(restClient, new OfficeSheetPopulator(restClient), new ClientSheetPopulator(restClient), new ExtrasSheetPopulator(restClient));*/
		throw new IllegalArgumentException("Can't find populator.");
	}
}
