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
public class Consumer extends Agent {

private static final long serialVersionUID = 1L;
protected com.anylogic.engine.markup.Level level;
public double AdEffectiveness;
protected void onChange_AdEffectiveness() { throw new UnsupportedOperationException(); }
public void set_AdEffectiveness(double _value) { throw new UnsupportedOperationException(); }
public double ContactRate;
protected void onChange_ContactRate() { throw new UnsupportedOperationException(); }
public void set_ContactRate(double _value) { throw new UnsupportedOperationException(); }
public double AdoptionFraction;
protected void onChange_AdoptionFraction() { throw new UnsupportedOperationException(); }
public void set_AdoptionFraction(double _value) { throw new UnsupportedOperationException(); }
@AnyLogicCustomProposalType(AnyLogicCustomProposalType.Label.MONTH)
public double DiscardTime;
protected void onChange_DiscardTime() { throw new UnsupportedOperationException(); }
public void set_DiscardTime(double _value) { throw new UnsupportedOperationException(); }
public void set_DiscardTime(double _value,TimeUnits _units) { throw new UnsupportedOperationException(); }
public double DiscardTime(TimeUnits _units) { throw new UnsupportedOperationException(); }
public LinkToAgentCollection<Agent, Agent> connections;
public final market_model.Main main = null;
public TransitionRate Ad;
public TransitionTimeout Purchase;
public TransitionRate Contact;
public TransitionTimeout Discard;
public TransitionMessage WOM;
@AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
public static final Scale scale = null;
protected ShapeGroup person;
protected ShapeCurve shapeBody;
/**
 * Constructor
 */
public Consumer(Engine engine,Agent owner,AgentList<? extends Consumer> ownerPopulation) { throw new UnsupportedOperationException(); }
/**
 * Simple constructor. Please add created agent to some population by calling goToPopulation() function.
 */
public Consumer() { throw new UnsupportedOperationException(); }
/**
 * Simple constructor. Please add created agent to some population by calling goToPopulation() function.
 */
public Consumer(double AdEffectiveness,double ContactRate,double AdoptionFraction,double DiscardTime) { throw new UnsupportedOperationException(); }
protected ShapeTopLevelPresentationGroup presentation;
protected ShapeModelElementsGroup icon;
public Statechart<statechart_state> statechart;
public enum statechart_state implements IStatechartState<Consumer, statechart_state> {
PotentialUser,WantsToBuy,User;
public Collection<statechart_state> getSimpleStatesDeep() { throw new UnsupportedOperationException(); }
public Set<statechart_state> getStatesInside() { throw new UnsupportedOperationException(); }
public Set<statechart_state> getFullState() { throw new UnsupportedOperationException(); }
public Statechart<statechart_state> getStatechart(Consumer agent) { throw new UnsupportedOperationException(); }
}
@AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
public static final statechart_state PotentialUser = null;
@AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
public static final statechart_state WantsToBuy = null;
@AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
public static final statechart_state User = null;
public Main get_Main() { throw new UnsupportedOperationException(); }
public ViewArea _origin_VA;
/*INJ:Additional Code*/
 
/*INJ:Additional Code*/

}
