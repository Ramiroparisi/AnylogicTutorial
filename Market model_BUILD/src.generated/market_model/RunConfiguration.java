package market_model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.*;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.routing.*;
import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;
import com.anylogic.engine.omniverse_connector.*;

import com.anylogic.libraries.modules.markup_descriptors.*;
import com.anylogic.libraries.processmodeling.*;
import com.anylogic.libraries.processmodeling.*;

import static com.anylogic.engine.Utilities.*;
import java.util.Optional;
import java.io.File;

public class RunConfiguration implements IRunConfiguration<Main> {
	/**
	 * Constructor
	 */
	public RunConfiguration() {
	}

	@Override
	@AnyLogicInternalCodegenAPI
	public void setupEngine(Engine engine) {
    engine.setATOL( 1.0E-5 );
    engine.setRTOL( 1.0E-5 );
    engine.setTTOL( 1.0E-5 );
    engine.setHTOL( 0.001 );
    engine.setSolverODE( Engine.SOLVER_ODE_EULER );
    engine.setSolverNAE( Engine.SOLVER_NAE_MODIFIED_NEWTON );
    engine.setSolverDAE( Engine.SOLVER_DAE_RK45_NEWTON );
    engine.setInspectionWindowColorTheme(InspectionWindowColorTheme.DEFAULT);
    engine.setVMethods( 427029 );

		engine.setSimultaneousEventsSelectionMode(Engine.EVENT_SELECTION_LIFO);

		engine.setStartTime( 0.0 );
		engine.setTimeUnit( DAY );
		engine.setStartDate( toDate( 2026, JUNE, 17, 0, 0, 0 ) );
		engine.setStopTime( 100.0 );
	}

	@Override
    public Main createRootAgent(Engine engine) {
    	return new Main( engine, null, null );
    }
	
	@Override
	@AnyLogicInternalCodegenAPI
	public void setupRootParameters( final Main root, boolean callOnChangeActions,
			IRunValueAccessor parameterSource ) {

		if (callOnChangeActions) {
		} else {
		}
	}
	
	@Override
	@AnyLogicInternalAPI
	public void getOutputValues(Main root, IRunOutputsConsumer outputsConsumer) {
	}

	@Override
	@AnyLogicInternalAPI
	public void setup( IExperimentHost host ) {
		host.setSpeed( 1.0 );
		host.setZoomAndPanningEnabled( true );
		host.setDeveloperPanelEnabled( false );
		host.setDeveloperPanelVisibleOnStart( false );
	}

}
