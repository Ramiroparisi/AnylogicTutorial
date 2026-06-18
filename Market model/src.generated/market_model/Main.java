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

/*INJ:Import*/
 
/*INJ:Import*/
public class Main extends Agent {

private static final long serialVersionUID = 1L;
protected com.anylogic.engine.markup.Level level;
@AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Consumer")
public _consumers_Population consumers;
/**
 * Returns the agent element at the specified position in consumers population.<br>
 * @see com.anylogic.engine.AgentList#get(int)
 */
public Consumer consumers(int index) { throw new UnsupportedOperationException(); }
/**
 * This method removes the given embedded object from the replicated embedded object collection consumers<br>
 * The given object is destroyed, but not immediately in common case.<br>
 * @param object the active object - element of replicated embedded object consumers - which should be removed<br>
 * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to consumers
 */
public boolean remove_consumers(Consumer object) { throw new UnsupportedOperationException(); }
/**
 * This method creates and adds new embedded object in the replicated embedded object collection consumers<br>
 * @return newly created embedded object
 */
public Consumer add_consumers() { throw new UnsupportedOperationException(); }
/**
 * This method creates and adds new embedded object in the replicated embedded object collection consumers<br>
 * This method uses given parameter values to setup created embedded object<br>
 * @param AdEffectiveness<br>
 * @param ContactRate<br>
 * @param AdoptionFraction<br>
 * @param DiscardTime<br>
 * Index of this new embedded object instance can be obtained through calling <code>consumers.size()</code> method <strong>before</strong> this method is called<br>
 * @return newly created embedded object
 */
public Consumer add_consumers(double AdEffectiveness,double ContactRate,double AdoptionFraction,double DiscardTime) { throw new UnsupportedOperationException(); }
public abstract class _consumers_Population extends AgentArrayList<Consumer> {

private static final long serialVersionUID = 1L;
public abstract int NPotential();
public abstract int NUser();
public abstract int NWantToBuy();
_consumers_Population() { super(null); }
}
public LinkToAgentCollection<Agent, Agent> connections;
@AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
public static final Scale scale = null;
protected ShapeGroup group;
protected ReplicatedShape<ShapeEmbeddedObjectPresentation> consumers_presentation;
protected TimeStackChart chart;
/**
 * Constructor
 */
public Main(Engine engine,Agent owner,AgentList<? extends Main> ownerPopulation) { throw new UnsupportedOperationException(); }
/**
 * Simple constructor. Please add created agent to some population by calling goToPopulation() function.
 */
public Main() { throw new UnsupportedOperationException(); }
protected ShapeTopLevelPresentationGroup presentation;
protected ShapeModelElementsGroup icon;
public ViewArea _origin_VA;
/*INJ:Additional Code*/
 
/*INJ:Additional Code*/

/*INJ:COMPLETION_STUB_INJECTION_START*/
//  (DataSequenceExpression) :: Item Value Expression
private double _completion_stub_xjal() {
return
consumers.NWantToBuy()
;
}
}
