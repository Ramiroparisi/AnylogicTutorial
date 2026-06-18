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

public class Main extends Agent
{
  // Parameters

  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Main.class );

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


  // Events
	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _chart_autoUpdateEvent_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == _chart_autoUpdateEvent_xjal ) return "chart auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == _chart_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == _chart_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    return super.getFirstOccurrenceTime( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( EventTimeout _e ) {
    double _t;
    if( _e == _chart_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == _chart_autoUpdateEvent_xjal ) {
      chart.updateData();
      return;
    }
    super.executeActionOf( _e );
  }


  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Embedded Objects

  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _consumers_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);

  public String getNameOf( Agent ao ) {
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }

  public class _consumers_Population extends AgentArrayList<Consumer> {
    _consumers_Population( Agent owner ) {
      super( owner );
    }


    @AnyLogicInternalCodegenAPI
    public Consumer instantiateAgent( int index ) {
    	return instantiate_consumers_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( Consumer agent, int index, TableInput tableInput ) {
      setupParameters_consumers_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( Consumer agent, int index, TableInput tableInput ) {
      doBeforeCreate_consumers_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return true;
    }


    public int NPotential() {
      return _consumers_NPotential_xjal();
    }

    public int NUser() {
      return _consumers_NUser_xjal();
    }

    public int NWantToBuy() {
      return _consumers_NWantToBuy_xjal();
    }
  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Consumer")
  public _consumers_Population consumers = new _consumers_Population( this );

  public String getNameOf( AgentList<?> aolist ) {
    if( aolist == consumers ) return "consumers";
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    if( aolist == consumers ) return _consumers_animationSettings_xjal;
    return super.getAnimationSettingsOf( aolist );
  }

  /**
   * Returns the agent element at the specified position in consumers
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public Consumer consumers(int index) {
    return consumers.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection consumers<br>
   * @return newly created embedded object
   */
  public Consumer add_consumers() {
    int index = consumers.size();
    Consumer _result_xjal = instantiate_consumers_xjal( index );
    consumers.callSetupParameters( _result_xjal, index );
    consumers.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection consumers<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>consumers.size()</code> method <strong>before</strong> this method is called
   * @param AdEffectiveness
   * @param ContactRate
   * @param AdoptionFraction
   * @param DiscardTime
   * @return newly created embedded object
   */
  public Consumer add_consumers( double AdEffectiveness, double ContactRate, double AdoptionFraction, double DiscardTime ) {
    int index = consumers.size();
    Consumer _result_xjal = instantiate_consumers_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.AdEffectiveness = AdEffectiveness;
    _result_xjal.ContactRate = ContactRate;
    _result_xjal.AdoptionFraction = AdoptionFraction;
    _result_xjal.DiscardTime = DiscardTime;
    // Finish embedded object creation
    consumers.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection consumers<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object consumers - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to consumers
   */
  public boolean remove_consumers( Consumer object ) {
    if( ! consumers._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    object.removeUsdObjects();
    return true;
  }

  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected Consumer instantiate_consumers_xjal( final int index ) {
    Consumer _result_xjal = new Consumer( getEngine(), this, consumers );
    
    consumers._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_consumers_xjal( final Consumer self, final int index, TableInput _t ) {
    self.AdEffectiveness = 
0.01 
;
    self.ContactRate = self._ContactRate_DefaultValue_xjal();
    self.AdoptionFraction = self._AdoptionFraction_DefaultValue_xjal();
    self.DiscardTime = self._DiscardTime_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_consumers_xjal( Consumer self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }

  /**
   * <i>This method should not be called by user</i>
   */
  private int _consumers_NPotential_xjal() {
    int _value = 0;
    for ( Consumer agent : consumers ) {
      Consumer item = agent;
      boolean _t = 
agent.inState(Consumer.PotentialUser) ;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _consumers_NUser_xjal() {
    int _value = 0;
    for ( Consumer agent : consumers ) {
      Consumer item = agent;
      boolean _t = 
agent.inState(Consumer.User) ;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _consumers_NWantToBuy_xjal() {
    int _value = 0;
    for ( Consumer agent : consumers ) {
      Consumer item = agent;
      boolean _t = 
agent.inState(Consumer.WantsToBuy) ;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
private double _datasetUpdateTime_xjal() {
	return time();
}
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __chart_expression0_dataSet_xjal_XValue(  ) {
	return _datasetUpdateTime_xjal();
  }
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __chart_expression0_dataSet_xjal_YValue(  ) {
    return 
consumers.NUser() 
;
  }

  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __chart_expression1_dataSet_xjal_XValue(  ) {
	return _datasetUpdateTime_xjal();
  }
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __chart_expression1_dataSet_xjal_YValue(  ) {
    return 
consumers.NWantToBuy() 
;
  }

  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __chart_expression2_dataSet_xjal_XValue(  ) {
	return _datasetUpdateTime_xjal();
  }
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __chart_expression2_dataSet_xjal_YValue(  ) {
    return 
consumers.NPotential() 
;
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
  protected static final int _consumers_presentation = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _group = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _chart = 3;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 4;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(group, chart);
  }

  protected TimeStackChart chart;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  protected ShapeEmbeddedObjectPresentation _consumers_presentation_createShapeWithStaticProperties_xjal( final Agent _a, final int _index ) {
    ShapeEmbeddedObjectPresentation shape = new ShapeEmbeddedObjectPresentation( Main.this, SHAPE_DRAW_2D3D, true, 0.0, 0.0, 0.0, 0.0,
		false, true, _a );
    return shape;
  }

  protected ShapeAgentPopulationGroup consumers_presentation;
  protected ShapeGroup group;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {
    List<DataSet> _items = new ArrayList<DataSet>( 3 );
    _items.add( new DataSet(365, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( BasicDataSet _d ) {
      if ( _datasetUpdateTime_xjal() == _lastUpdateX ) { return; }
      _d.add( __chart_expression0_dataSet_xjal_XValue(  ), __chart_expression0_dataSet_xjal_YValue(  ) );
      _lastUpdateX = _datasetUpdateTime_xjal();
    }
  } ) ); 
    _items.add( new DataSet(365, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( BasicDataSet _d ) {
      if ( _datasetUpdateTime_xjal() == _lastUpdateX ) { return; }
      _d.add( __chart_expression1_dataSet_xjal_XValue(  ), __chart_expression1_dataSet_xjal_YValue(  ) );
      _lastUpdateX = _datasetUpdateTime_xjal();
    }
  } ) ); 
    _items.add( new DataSet(365, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( BasicDataSet _d ) {
      if ( _datasetUpdateTime_xjal() == _lastUpdateX ) { return; }
      _d.add( __chart_expression2_dataSet_xjal_XValue(  ), __chart_expression2_dataSet_xjal_YValue(  ) );
      _lastUpdateX = _datasetUpdateTime_xjal();
    }
  } ) ); 
    List<String> _titles = new ArrayList<>( 3 );
    _titles.add( "Users" );
    _titles.add( "Want To Buy" );
    _titles.add( "Potential Users" );
    List<Color> _colors = new ArrayList<>( 3 );
    _colors.add( yellowGreen );
    _colors.add( gold );
    _colors.add( lavender );
    chart = new TimeStackChart(
Main.this, true, 220.0, 120.0,
			540.0, 330.0,
            null, null,
            50.0, 30.0,
			460.0, 240.0, white, black, black,
            30.0, Chart.SOUTH,

1 
             * year(), Chart.WINDOW_MOVES_WITH_TIME, Chart.DEFAULT_DATE_PATTERN, Chart.SCALE_FIXED
,
5000 
, Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors );
    }
    consumers_presentation = new ShapeAgentPopulationGroup(this, SHAPE_DRAW_2D3D, true, consumers) {
    
      @Override
      public ShapeEmbeddedObjectPresentation createShapeWithStaticProperties_xjal( final Agent _a, int index ) {
        ShapeEmbeddedObjectPresentation _e = _consumers_presentation_createShapeWithStaticProperties_xjal( _a, index );
        return _e;
      }
    };
    {
    group = new ShapeGroup( Main.this, SHAPE_DRAW_2D3D, true, 780.0, 110.0, 0.0, 0.0
	
	     , consumers_presentation );
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
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
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
  }

  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function.
   */
  public Main() {
  }

  /**
   * Creating embedded object instances
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
    {
      int _cnt = 
5000 
;
      for ( int i = consumers.size(); i < _cnt; i++ ) {
        instantiate_consumers_xjal( i );
      }
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
Map<String, Set<?>> usdMapping = getRootAgent().ext(ExtRootModelAgent.class).getCustomObject(OmniverseHelper.USD_CONTEXT_COLLECTION_KEY,
()-> new LinkedHashMap<String, Set<?>>());
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , level );
    presentation.getConfiguration3D().setBackgroundColor( silver );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Main.this, getElementProperty( "market_model.Main.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
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
    setLayoutType( LAYOUT_RANDOM );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    consumers.setEnvironment( this );
    for ( int i = 0; i < consumers.size(); i++ ) {
      Consumer _a = consumers.get(i);
      setupParameters_consumers_xjal( _a, i, null );
      doBeforeCreate_consumers_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    setupInitialConditions_xjal( Main.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    _chart_autoUpdateEvent_xjal.start();
    applyLayout();
    for (Agent embeddedObject : consumers) {
      embeddedObject.startAsEmbedded();
    }
  }


  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
  }

  // User API -----------------------------------------------------
  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }


  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<>();
    }
    list.add( consumers );
    return list;
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean isLoggingToDB(EventOriginator _e) {
    if ( _e == _chart_autoUpdateEvent_xjal ) return false;
    return super.isLoggingToDB( _e );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    _chart_autoUpdateEvent_xjal.onDestroy();
    for (Agent _item : consumers) {
      _item.onDestroy();
    }
  	for (int _pIdx = 0; _pIdx < chart.getCount(); _pIdx++) {
  		DataSet _ds = chart.get(_pIdx);
  		_ds.destroyUpdater_xjal();
  		String _t = chart.getTitle(_pIdx);
  		if (_t.isEmpty()) {
  			_t = "Value_" + _pIdx;
  		}
  		logToDB( _ds, "chart : " + _t );
  	}
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    for (Agent _item : consumers) {
      _item.doFinish();
    }
  }


}
