package org.aquapackrobotics.sw8s.states;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import org.aquapackrobotics.sw8s.trainingsim.SimWindow;

public class StateOne extends SimState{

	public StateOne(ScheduledThreadPoolExecutor pool, SimWindow window) {
		super(pool, window);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onEnter() {
		//Nothing
		
	}

	@Override
	public boolean onPeriodic() {
		
		window.setRobotSpeed(1, 0, 0);
		
		if (window.getXPos() < 400) {
			return true;
		}
		return false;
	}

	@Override
	public void onExit() {
		window.setRobotSpeed(0, 0, 0);
	}

	@Override
	public State nextState() {
		return new StateTwo(pool, window);
	}

}
