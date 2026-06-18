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

import java.awt.geom.Arc2D;

public class Consumer extends Agent
{
  // Parameters

  public 
double  AdEffectiveness;

  /**
   * Returns default value for parameter <code>AdEffectiveness</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _AdEffectiveness_DefaultValue_xjal() {
    final Consumer self = this;
    return 0.0;
  }

  public void set_AdEffectiveness( double value ) {
    if (value == this.AdEffectiveness) {
      return;
    }
    double _oldValue_xjal = this.AdEffectiveness;
    this.AdEffectiveness = value;
    onChange_AdEffectiveness_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter AdEffectiveness.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_AdEffectiveness()</code> method instead.
   */
  protected void onChange_AdEffectiveness() {
    onChange_AdEffectiveness_xjal( AdEffectiveness );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_AdEffectiveness_xjal( double oldValue ) {  
  }


  public 
double  ContactRate;

  /**
   * Returns default value for parameter <code>ContactRate</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _ContactRate_DefaultValue_xjal() {
    final Consumer self = this;
    return 
1 
;
  }

  public void set_ContactRate( double value ) {
    if (value == this.ContactRate) {
      return;
    }
    double _oldValue_xjal = this.ContactRate;
    this.ContactRate = value;
    onChange_ContactRate_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter ContactRate.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_ContactRate()</code> method instead.
   */
  protected void onChange_ContactRate() {
    onChange_ContactRate_xjal( ContactRate );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_ContactRate_xjal( double oldValue ) {  
  }


  public 
double  AdoptionFraction;

  /**
   * Returns default value for parameter <code>AdoptionFraction</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _AdoptionFraction_DefaultValue_xjal() {
    final Consumer self = this;
    return 
0.01 
;
  }

  public void set_AdoptionFraction( double value ) {
    if (value == this.AdoptionFraction) {
      return;
    }
    double _oldValue_xjal = this.AdoptionFraction;
    this.AdoptionFraction = value;
    onChange_AdoptionFraction_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter AdoptionFraction.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_AdoptionFraction()</code> method instead.
   */
  protected void onChange_AdoptionFraction() {
    onChange_AdoptionFraction_xjal( AdoptionFraction );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_AdoptionFraction_xjal( double oldValue ) {  
  }


  @AnyLogicCustomProposalType(AnyLogicCustomProposalType.Label.MONTH)
  public 
double  DiscardTime;

  /**
   * Returns default value for parameter <code>DiscardTime</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _DiscardTime_DefaultValue_xjal() {
    final Consumer self = this;
    return 
6 
;
  }

  public double DiscardTime( TimeUnits units ) {
    return MONTH.convertTo( this.DiscardTime, units );
  }

  public void set_DiscardTime( double value, TimeUnits units ) {
    set_DiscardTime( units.convertTo( value, MONTH ) );
  }

  public void set_DiscardTime( double value ) {
    if (value == this.DiscardTime) {
      return;
    }
    double _oldValue_xjal = this.DiscardTime;
    this.DiscardTime = value;
    onChange_DiscardTime_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter DiscardTime.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_DiscardTime()</code> method instead.
   */
  protected void onChange_DiscardTime() {
    onChange_DiscardTime_xjal( DiscardTime );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_DiscardTime_xjal( double oldValue ) {  
  }

  
  /**
   * Internal method. Returns the units used in design-time for setting the code of this parameter (these units may be e.g. used for adaptation of dynamic parameter arguments)
   */
  @AnyLogicInternalCodegenAPI
  public TimeUnits getUnitsForCodeOf_DiscardTime() {
    return MONTH;
  }
  
  /**
   * Internal method. Returns the units of this parameter.
   */
  @AnyLogicInternalCodegenAPI
  public TimeUnits getUnitsOf_DiscardTime() {
    return MONTH;
  }

  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    AdEffectiveness = _AdEffectiveness_DefaultValue_xjal();
    ContactRate = _ContactRate_DefaultValue_xjal();
    AdoptionFraction = _AdoptionFraction_DefaultValue_xjal();
    DiscardTime = _DiscardTime_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "AdEffectiveness":
      if ( _callOnChange_xjal ) {
        set_AdEffectiveness( ((Number) _value_xjal).doubleValue() );
      } else {
        AdEffectiveness = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "ContactRate":
      if ( _callOnChange_xjal ) {
        set_ContactRate( ((Number) _value_xjal).doubleValue() );
      } else {
        ContactRate = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "AdoptionFraction":
      if ( _callOnChange_xjal ) {
        set_AdoptionFraction( ((Number) _value_xjal).doubleValue() );
      } else {
        AdoptionFraction = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "DiscardTime":
      if ( _callOnChange_xjal ) {
        set_DiscardTime( ((Number) _value_xjal).doubleValue() );
      } else {
        DiscardTime = ((Number) _value_xjal).doubleValue();
      }
      return true;
    default:
      return super.setParameter( _name_xjal, _value_xjal, _callOnChange_xjal );
    }
  }

  @Override
  public <T> T getParameter(String _name_xjal) {
    Object _result_xjal;
    switch ( _name_xjal ) {
    case "AdEffectiveness": _result_xjal = AdEffectiveness; break;
    case "ContactRate": _result_xjal = ContactRate; break;
    case "AdoptionFraction": _result_xjal = AdoptionFraction; break;
    case "DiscardTime": _result_xjal = DiscardTime; break;
    default: _result_xjal = super.getParameter( _name_xjal ); break;
    }
    return (T) _result_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private static String[] _parameterNames_xjal;

  @Override
  public String[] getParameterNames() {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList<>( Arrays.asList( super.getParameterNames() ) );
      list.add( "AdEffectiveness" );
      list.add( "ContactRate" );
      list.add( "AdoptionFraction" );
      list.add( "DiscardTime" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }

  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Consumer.class );

  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }




  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 1;


  // Statecharts
  public Statechart<statechart_state> statechart = new Statechart<>( this, (short)2 );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( Statechart _s ) {
    if(_s == this.statechart) return "statechart";
    return super.getNameOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getIdOf( Statechart _s ) {
    if(_s == this.statechart) return 0;
    return super.getIdOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( Statechart _s ) {
    if( _s == this.statechart ) {
      enterState( PotentialUser, true );
      return;
    }
    super.executeActionOf( _s );
  }

   // States of all statecharts
   
  public enum statechart_state implements IStatechartState<Consumer, statechart_state> {
    PotentialUser,
    WantsToBuy,
    User;

    @AnyLogicInternalCodegenAPI
    private Collection<statechart_state> _simpleStatesDeep_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart_state> _fullState_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart_state> _statesInside_xjal;

    @Override
    @AnyLogicInternalCodegenAPI
    public Collection<statechart_state> getSimpleStatesDeep() {
      Collection<statechart_state> result = _simpleStatesDeep_xjal;
      if (result == null) {
        _simpleStatesDeep_xjal = result = calculateAllSimpleStatesDeep();
      }
      return result;
    }
    
    @Override
    public Set<statechart_state> getFullState() {
      Set<statechart_state> result = _fullState_xjal;
      if (result == null) {
        _fullState_xjal = result = calculateFullState();
      }
      return result;
    }
    
    @Override
    @AnyLogicInternalCodegenAPI
    public Set<statechart_state> getStatesInside() {
      Set<statechart_state> result = _statesInside_xjal;
      if (result == null) {
        _statesInside_xjal = result = calculateStatesInside();
      }
      return result;
    }

    @Override
    @AnyLogicInternalCodegenAPI
    public Statechart<statechart_state> getStatechart( Consumer _a ) {
      return _a.statechart;
    }
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state PotentialUser = statechart_state.PotentialUser;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state WantsToBuy = statechart_state.WantsToBuy;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state User = statechart_state.User;


  @AnyLogicInternalCodegenAPI
  private void enterState( statechart_state self, boolean _destination ) {
    switch( self ) {
      case PotentialUser:
  	    logToDBEnterState(statechart, self);
        // (Simple state (not composite))
        statechart.setActiveState_xjal( PotentialUser );
        {
shapeBody.setFillColor(lavender) 
;}
        Ad.start();
        WOM.start();
        return;
      case WantsToBuy:
  	    logToDBEnterState(statechart, self);
        // (Simple state (not composite))
        statechart.setActiveState_xjal( WantsToBuy );
        {
shapeBody.setFillColor( gold ); 
;}
        Purchase.start();
        return;
      case User:
  	    logToDBEnterState(statechart, self);
        // (Simple state (not composite))
        statechart.setActiveState_xjal( User );
        {
shapeBody.setFillColor( yellowGreen ); 
;}
        Contact.start();
        Discard.start();
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitState( statechart_state self, Transition _t, boolean _source ) {
    switch( self ) {
      case PotentialUser: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != Ad) Ad.cancel();
        if ( !_source || _t != WOM) WOM.cancel();
        return;
      case WantsToBuy: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != Purchase) Purchase.cancel();
        return;
      case User: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != Contact) Contact.cancel();
        if ( !_source || _t != Discard) Discard.cancel();
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitInnerStates( statechart_state _destination ) {
    statechart_state _state = statechart.getActiveSimpleState();
    while( _state != _destination ) {
			exitState( _state, null, false );
			_state = _state.getContainerState();
		}
	}
  
  public TransitionTimeout Purchase = new TransitionTimeout( this );
  public TransitionTimeout Discard = new TransitionTimeout( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionTimeout _t ) {
    if ( _t == Purchase ) return "Purchase";
    if ( _t == Discard ) return "Discard";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionTimeout _t ) { 
    if ( _t == Purchase ) return statechart;
    if ( _t == Discard ) return statechart;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionTimeout self ) {
    if ( self == Purchase ) {
      exitState( WantsToBuy, self, true );
          enterState( User, true );
      return;
    }
    if ( self == Discard ) {
      exitState( User, self, true );
          enterState( WantsToBuy, true );
      return;
    }
    super.executeActionOf( self );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( TransitionTimeout _t ) {
    double _value;
    if ( _t == Purchase ) {
      _value = 
2 
;
      _value = toModelTime( _value, DAY );
      return _value;
    }
    if ( _t == Discard ) {
      _value = 
DiscardTime 
;
      _value = toModelTime( _value, MONTH );
      return _value;
    }
    return super.evaluateTimeoutOf( _t );
  }


  public TransitionRate Ad = new TransitionRate( this );
  public TransitionRate Contact = new TransitionRate( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionRate _t ) {
    if ( _t == Ad ) return "Ad";
    if ( _t == Contact ) return "Contact";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionRate _t ) { 
    if ( _t == Ad ) return statechart;
    if ( _t == Contact ) return statechart;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionRate self ) {
    if ( self == Ad ) {
      exitState( PotentialUser, self, true );
          enterState( WantsToBuy, true );
      return;
    }
    if ( self == Contact ) {
      {
sendToRandom( "Buy" ) 
;}
      Contact.start();
      return;
    }
    super.executeActionOf( self );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateRateOf( TransitionRate _t ) {
    double _value;
    if ( _t == Ad ) {
      _value = 
AdEffectiveness 
;
      _value = toModelRate( _value, PER_DAY );
      return _value;
    }
    if ( _t == Contact ) {
      _value = 
ContactRate 
;
      _value = toModelRate( _value, PER_DAY );
      return _value;
    }
    return super.evaluateRateOf( _t );
  }

  public TransitionMessage WOM = new TransitionMessage( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionMessage _t ) {
    if ( _t == WOM ) return "WOM";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionMessage _t ) { 
    if ( _t == WOM ) return statechart;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testGuardOf( TransitionMessage _t ) {
    if ( _t == WOM ) return 
randomTrue(AdoptionFraction) 
;
    return super.testGuardOf(  _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionMessage self, Object _msg ) {
    if ( self == WOM ) {
      exitState( PotentialUser, self, true );
          enterState( WantsToBuy, true );
      return;
    }
    super.executeActionOf( self, _msg );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testMessageOf( TransitionMessage _t, Object _msg ) {
    if ( _t == WOM ) {
      if ( !(_msg instanceof String) )
        return false;
      
String 
msg = (String) _msg;
      Object _g = 
"Buy" 
;
      return msg.equals( _g );
    }
    return super.testMessageOf( _t, _msg );
  }
private double _datasetUpdateTime_xjal() {
	return time();
}
  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, 1000.0, 600.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final int _shapeBody = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _person = 2;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 3;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 3.0, -1.0, -2.0, -2.0, -2.0, 0.0, -1.0, 0.0, 1.0, 3.0, 4.0, 5.0, 4.0, 6.0, 6.0, 6.0, 5.0, 1.0, 4.0, 4.0, 4.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDY_xjal() {
    return new double[] { 0.0, 4.0, 2.0, 3.0, 3.0, 10.0, 11.0, 11.0, 9.0, 17.0, 17.0, 17.0, 17.0, 9.0, 11.0, 11.0, 10.0, 3.0, 3.0, 2.0, 4.0, 0.0, -3.0, -3.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(person);
  }

  protected ShapeCurve shapeBody;
  protected ShapeGroup person;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    shapeBody = new ShapeCurve(
true,-2.0, -7.0,
      null, black,
      24, true, _shapeBody_pointsDX_xjal(), _shapeBody_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID );
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {
    person = new ShapeGroup( Consumer.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , shapeBody );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }



  // Static initialization of persistent elements
  private void instantiatePersistentElements_xjal() {
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    _createPersistentElementsBP0_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape() {
    return presentation;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape() {
    return icon;
  }

	


  /**
   * Constructor
   */
  public Consumer( Engine engine, Agent owner, AgentList<? extends Consumer> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
    main = get_Main();
  }

  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function.
   */
  public Consumer() {
  }

  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function.
   */
  public Consumer( double AdEffectiveness, double ContactRate, double AdoptionFraction, double DiscardTime ) {
    markParametersAreSet();
    this.AdEffectiveness = AdEffectiveness;
    this.ContactRate = ContactRate;
    this.AdoptionFraction = AdoptionFraction;
    this.DiscardTime = DiscardTime;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Consumer_xjal();
Map<String, Set<?>> usdMapping = getRootAgent().ext(ExtRootModelAgent.class).getCustomObject(OmniverseHelper.USD_CONTEXT_COLLECTION_KEY,
()-> new LinkedHashMap<String, Set<?>>());
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Consumer.this, true, 0, 0, 0, 0 , level );
    presentation.getConfiguration3D().setBackgroundColor( silver );
    icon = new ShapeModelElementsGroup( Consumer.this, getElementProperty( "market_model.Consumer.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );


    // Space setup
    {
      double _x_xjal = 
500 
;
      double _y_xjal = 
500 
;
      double _z_xjal = 
0 
;
      setupSpace( _x_xjal, _y_xjal, _z_xjal );
    }
    disableSteps();
    setNetworkUserDefined();
    setLayoutType( LAYOUT_USER_DEFINED );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Consumer.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    statechart.start();
  }


  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Consumer_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Consumer_xjal() {
  }

  // User API -----------------------------------------------------
  public Main get_Main() {
    {
      Agent owner = getOwner();
      if ( owner instanceof Main ) return (Main) owner;
    }
    return null;
  }

  /**
   * Read-only variable. <em>Shouldn't be modified by user.</em>
   */
  @AnyLogicCustomSerialization(AnyLogicCustomSerializationMode.REFERENCE)
  public transient market_model.Main main;

  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    statechart.fireEvent( _msg_xjal );
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Consumer> getPopulation() {
    return (AgentList<? extends Consumer>) super.getPopulation();
  }

  public List<? extends Consumer> agentsInRange( double distance ) {
    return (List<? extends Consumer>) super.agentsInRange( distance );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    statechart.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    statechart.onDestroy();
    super.onDestroy();
  }


}
