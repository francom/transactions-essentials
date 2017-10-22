package com.atomikos.icatch.imp;

import com.atomikos.icatch.Participant;
import com.atomikos.icatch.RecoveryCoordinator;

class SubTransactionRecoveryCoordinator implements RecoveryCoordinator {

	private static final long serialVersionUID = 1L;
	
	private String superiorCoordinatorId;
	
	public SubTransactionRecoveryCoordinator(String superiorCoordinatorId) {
		this.superiorCoordinatorId = superiorCoordinatorId;
	}
	
	@Override
	public Boolean replayCompletion(Participant participant)
			throws IllegalStateException {
		return null;
	}

	@Override
	public String getURI() {
		return superiorCoordinatorId;
	}

}
