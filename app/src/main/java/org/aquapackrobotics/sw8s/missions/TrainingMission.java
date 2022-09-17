package org.aquapackrobotics.sw8s.missions;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import org.aquapackrobotics.sw8s.states.State;
import org.aquapackrobotics.sw8s.states.StateOne;
import org.aquapackrobotics.sw8s.trainingsim.SimWindow;

/**
 * Competition mission, fully autonomous.
 */
public class TrainingMission extends Mission {
     SimWindow sim;

    public TrainingMission(ScheduledThreadPoolExecutor pool) {
        super(pool);
        sim = new SimWindow();
    }

    // TODO: implement
    @Override
    protected State initialState() {	
        return new StateOne(pool, sim);
    }

    // TODO: implement
    @Override
    protected void executeState(State state) {
    	while (state.onPeriodic()) {}
    	
    	state.onExit();
    }

    // TODO: implement
    @Override
    protected State nextState(State state) {
        return state.nextState();
    }
}
