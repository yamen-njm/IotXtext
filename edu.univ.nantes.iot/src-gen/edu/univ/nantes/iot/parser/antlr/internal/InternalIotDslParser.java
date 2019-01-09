package edu.univ.nantes.iot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.univ.nantes.iot.services.IotDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIotDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Network'", "'{'", "'name'", "'brokerconf'", "'measure'", "','", "'}'", "'instrument'", "'measurand'", "'device'", "'type'", "'interest'", "'('", "')'", "'binding'", "'server'", "'user'", "'port'", "'password'", "'sslPort'", "'webSocketsPort'", "'connectionLimit'", "'.'", "'features'", "'mode'", "'INPUT'", "'OUTPUT'", "'boolean'", "'String'", "'number'", "'date'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalIotDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIotDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIotDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIotDsl.g"; }



     	private IotDslGrammarAccess grammarAccess;

        public InternalIotDslParser(TokenStream input, IotDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Network";
       	}

       	@Override
       	protected IotDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNetwork"
    // InternalIotDsl.g:65:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalIotDsl.g:65:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalIotDsl.g:66:2: iv_ruleNetwork= ruleNetwork EOF
            {
             newCompositeNode(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;

             current =iv_ruleNetwork; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalIotDsl.g:72:1: ruleNetwork returns [EObject current=null] : (otherlv_0= 'Network' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) )? otherlv_4= 'brokerconf' ( (lv_brokerconf_5_0= ruleBrokerConf ) ) (otherlv_6= 'measure' otherlv_7= '{' ( (lv_measure_8_0= ruleMeasure ) ) (otherlv_9= ',' ( (lv_measure_10_0= ruleMeasure ) ) )* otherlv_11= '}' )? (otherlv_12= 'instrument' otherlv_13= '{' ( (lv_instrument_14_0= ruleInstrument ) ) (otherlv_15= ',' ( (lv_instrument_16_0= ruleInstrument ) ) )* otherlv_17= '}' )? (otherlv_18= 'measurand' otherlv_19= '{' ( (lv_measurand_20_0= ruleMeasurand ) ) (otherlv_21= ',' ( (lv_measurand_22_0= ruleMeasurand ) ) )* otherlv_23= '}' )? (otherlv_24= 'device' otherlv_25= '{' ( (lv_device_26_0= ruleDevice ) ) (otherlv_27= ',' ( (lv_device_28_0= ruleDevice ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        EObject lv_brokerconf_5_0 = null;

        EObject lv_measure_8_0 = null;

        EObject lv_measure_10_0 = null;

        EObject lv_instrument_14_0 = null;

        EObject lv_instrument_16_0 = null;

        EObject lv_measurand_20_0 = null;

        EObject lv_measurand_22_0 = null;

        EObject lv_device_26_0 = null;

        EObject lv_device_28_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:78:2: ( (otherlv_0= 'Network' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) )? otherlv_4= 'brokerconf' ( (lv_brokerconf_5_0= ruleBrokerConf ) ) (otherlv_6= 'measure' otherlv_7= '{' ( (lv_measure_8_0= ruleMeasure ) ) (otherlv_9= ',' ( (lv_measure_10_0= ruleMeasure ) ) )* otherlv_11= '}' )? (otherlv_12= 'instrument' otherlv_13= '{' ( (lv_instrument_14_0= ruleInstrument ) ) (otherlv_15= ',' ( (lv_instrument_16_0= ruleInstrument ) ) )* otherlv_17= '}' )? (otherlv_18= 'measurand' otherlv_19= '{' ( (lv_measurand_20_0= ruleMeasurand ) ) (otherlv_21= ',' ( (lv_measurand_22_0= ruleMeasurand ) ) )* otherlv_23= '}' )? (otherlv_24= 'device' otherlv_25= '{' ( (lv_device_26_0= ruleDevice ) ) (otherlv_27= ',' ( (lv_device_28_0= ruleDevice ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalIotDsl.g:79:2: (otherlv_0= 'Network' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) )? otherlv_4= 'brokerconf' ( (lv_brokerconf_5_0= ruleBrokerConf ) ) (otherlv_6= 'measure' otherlv_7= '{' ( (lv_measure_8_0= ruleMeasure ) ) (otherlv_9= ',' ( (lv_measure_10_0= ruleMeasure ) ) )* otherlv_11= '}' )? (otherlv_12= 'instrument' otherlv_13= '{' ( (lv_instrument_14_0= ruleInstrument ) ) (otherlv_15= ',' ( (lv_instrument_16_0= ruleInstrument ) ) )* otherlv_17= '}' )? (otherlv_18= 'measurand' otherlv_19= '{' ( (lv_measurand_20_0= ruleMeasurand ) ) (otherlv_21= ',' ( (lv_measurand_22_0= ruleMeasurand ) ) )* otherlv_23= '}' )? (otherlv_24= 'device' otherlv_25= '{' ( (lv_device_26_0= ruleDevice ) ) (otherlv_27= ',' ( (lv_device_28_0= ruleDevice ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalIotDsl.g:79:2: (otherlv_0= 'Network' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) )? otherlv_4= 'brokerconf' ( (lv_brokerconf_5_0= ruleBrokerConf ) ) (otherlv_6= 'measure' otherlv_7= '{' ( (lv_measure_8_0= ruleMeasure ) ) (otherlv_9= ',' ( (lv_measure_10_0= ruleMeasure ) ) )* otherlv_11= '}' )? (otherlv_12= 'instrument' otherlv_13= '{' ( (lv_instrument_14_0= ruleInstrument ) ) (otherlv_15= ',' ( (lv_instrument_16_0= ruleInstrument ) ) )* otherlv_17= '}' )? (otherlv_18= 'measurand' otherlv_19= '{' ( (lv_measurand_20_0= ruleMeasurand ) ) (otherlv_21= ',' ( (lv_measurand_22_0= ruleMeasurand ) ) )* otherlv_23= '}' )? (otherlv_24= 'device' otherlv_25= '{' ( (lv_device_26_0= ruleDevice ) ) (otherlv_27= ',' ( (lv_device_28_0= ruleDevice ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalIotDsl.g:80:3: otherlv_0= 'Network' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) )? otherlv_4= 'brokerconf' ( (lv_brokerconf_5_0= ruleBrokerConf ) ) (otherlv_6= 'measure' otherlv_7= '{' ( (lv_measure_8_0= ruleMeasure ) ) (otherlv_9= ',' ( (lv_measure_10_0= ruleMeasure ) ) )* otherlv_11= '}' )? (otherlv_12= 'instrument' otherlv_13= '{' ( (lv_instrument_14_0= ruleInstrument ) ) (otherlv_15= ',' ( (lv_instrument_16_0= ruleInstrument ) ) )* otherlv_17= '}' )? (otherlv_18= 'measurand' otherlv_19= '{' ( (lv_measurand_20_0= ruleMeasurand ) ) (otherlv_21= ',' ( (lv_measurand_22_0= ruleMeasurand ) ) )* otherlv_23= '}' )? (otherlv_24= 'device' otherlv_25= '{' ( (lv_device_26_0= ruleDevice ) ) (otherlv_27= ',' ( (lv_device_28_0= ruleDevice ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkAccess().getNetworkKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalIotDsl.g:88:3: (otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalIotDsl.g:89:4: otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getNameKeyword_2_0());
                    			
                    // InternalIotDsl.g:93:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalIotDsl.g:94:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalIotDsl.g:94:5: (lv_name_3_0= RULE_ID )
                    // InternalIotDsl.g:95:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getNetworkAccess().getNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNetworkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getBrokerconfKeyword_3());
            		
            // InternalIotDsl.g:116:3: ( (lv_brokerconf_5_0= ruleBrokerConf ) )
            // InternalIotDsl.g:117:4: (lv_brokerconf_5_0= ruleBrokerConf )
            {
            // InternalIotDsl.g:117:4: (lv_brokerconf_5_0= ruleBrokerConf )
            // InternalIotDsl.g:118:5: lv_brokerconf_5_0= ruleBrokerConf
            {

            					newCompositeNode(grammarAccess.getNetworkAccess().getBrokerconfBrokerConfParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_brokerconf_5_0=ruleBrokerConf();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkRule());
            					}
            					set(
            						current,
            						"brokerconf",
            						lv_brokerconf_5_0,
            						"edu.univ.nantes.iot.IotDsl.BrokerConf");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:135:3: (otherlv_6= 'measure' otherlv_7= '{' ( (lv_measure_8_0= ruleMeasure ) ) (otherlv_9= ',' ( (lv_measure_10_0= ruleMeasure ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalIotDsl.g:136:4: otherlv_6= 'measure' otherlv_7= '{' ( (lv_measure_8_0= ruleMeasure ) ) (otherlv_9= ',' ( (lv_measure_10_0= ruleMeasure ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getMeasureKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalIotDsl.g:144:4: ( (lv_measure_8_0= ruleMeasure ) )
                    // InternalIotDsl.g:145:5: (lv_measure_8_0= ruleMeasure )
                    {
                    // InternalIotDsl.g:145:5: (lv_measure_8_0= ruleMeasure )
                    // InternalIotDsl.g:146:6: lv_measure_8_0= ruleMeasure
                    {

                    						newCompositeNode(grammarAccess.getNetworkAccess().getMeasureMeasureParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_measure_8_0=ruleMeasure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetworkRule());
                    						}
                    						add(
                    							current,
                    							"measure",
                    							lv_measure_8_0,
                    							"edu.univ.nantes.iot.IotDsl.Measure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIotDsl.g:163:4: (otherlv_9= ',' ( (lv_measure_10_0= ruleMeasure ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalIotDsl.g:164:5: otherlv_9= ',' ( (lv_measure_10_0= ruleMeasure ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getNetworkAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalIotDsl.g:168:5: ( (lv_measure_10_0= ruleMeasure ) )
                    	    // InternalIotDsl.g:169:6: (lv_measure_10_0= ruleMeasure )
                    	    {
                    	    // InternalIotDsl.g:169:6: (lv_measure_10_0= ruleMeasure )
                    	    // InternalIotDsl.g:170:7: lv_measure_10_0= ruleMeasure
                    	    {

                    	    							newCompositeNode(grammarAccess.getNetworkAccess().getMeasureMeasureParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_measure_10_0=ruleMeasure();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"measure",
                    	    								lv_measure_10_0,
                    	    								"edu.univ.nantes.iot.IotDsl.Measure");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalIotDsl.g:193:3: (otherlv_12= 'instrument' otherlv_13= '{' ( (lv_instrument_14_0= ruleInstrument ) ) (otherlv_15= ',' ( (lv_instrument_16_0= ruleInstrument ) ) )* otherlv_17= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIotDsl.g:194:4: otherlv_12= 'instrument' otherlv_13= '{' ( (lv_instrument_14_0= ruleInstrument ) ) (otherlv_15= ',' ( (lv_instrument_16_0= ruleInstrument ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getNetworkAccess().getInstrumentKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalIotDsl.g:202:4: ( (lv_instrument_14_0= ruleInstrument ) )
                    // InternalIotDsl.g:203:5: (lv_instrument_14_0= ruleInstrument )
                    {
                    // InternalIotDsl.g:203:5: (lv_instrument_14_0= ruleInstrument )
                    // InternalIotDsl.g:204:6: lv_instrument_14_0= ruleInstrument
                    {

                    						newCompositeNode(grammarAccess.getNetworkAccess().getInstrumentInstrumentParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_instrument_14_0=ruleInstrument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetworkRule());
                    						}
                    						add(
                    							current,
                    							"instrument",
                    							lv_instrument_14_0,
                    							"edu.univ.nantes.iot.IotDsl.Instrument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIotDsl.g:221:4: (otherlv_15= ',' ( (lv_instrument_16_0= ruleInstrument ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalIotDsl.g:222:5: otherlv_15= ',' ( (lv_instrument_16_0= ruleInstrument ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getNetworkAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalIotDsl.g:226:5: ( (lv_instrument_16_0= ruleInstrument ) )
                    	    // InternalIotDsl.g:227:6: (lv_instrument_16_0= ruleInstrument )
                    	    {
                    	    // InternalIotDsl.g:227:6: (lv_instrument_16_0= ruleInstrument )
                    	    // InternalIotDsl.g:228:7: lv_instrument_16_0= ruleInstrument
                    	    {

                    	    							newCompositeNode(grammarAccess.getNetworkAccess().getInstrumentInstrumentParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_instrument_16_0=ruleInstrument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"instrument",
                    	    								lv_instrument_16_0,
                    	    								"edu.univ.nantes.iot.IotDsl.Instrument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalIotDsl.g:251:3: (otherlv_18= 'measurand' otherlv_19= '{' ( (lv_measurand_20_0= ruleMeasurand ) ) (otherlv_21= ',' ( (lv_measurand_22_0= ruleMeasurand ) ) )* otherlv_23= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalIotDsl.g:252:4: otherlv_18= 'measurand' otherlv_19= '{' ( (lv_measurand_20_0= ruleMeasurand ) ) (otherlv_21= ',' ( (lv_measurand_22_0= ruleMeasurand ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getNetworkAccess().getMeasurandKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalIotDsl.g:260:4: ( (lv_measurand_20_0= ruleMeasurand ) )
                    // InternalIotDsl.g:261:5: (lv_measurand_20_0= ruleMeasurand )
                    {
                    // InternalIotDsl.g:261:5: (lv_measurand_20_0= ruleMeasurand )
                    // InternalIotDsl.g:262:6: lv_measurand_20_0= ruleMeasurand
                    {

                    						newCompositeNode(grammarAccess.getNetworkAccess().getMeasurandMeasurandParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_measurand_20_0=ruleMeasurand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetworkRule());
                    						}
                    						add(
                    							current,
                    							"measurand",
                    							lv_measurand_20_0,
                    							"edu.univ.nantes.iot.IotDsl.Measurand");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIotDsl.g:279:4: (otherlv_21= ',' ( (lv_measurand_22_0= ruleMeasurand ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalIotDsl.g:280:5: otherlv_21= ',' ( (lv_measurand_22_0= ruleMeasurand ) )
                    	    {
                    	    otherlv_21=(Token)match(input,16,FOLLOW_13); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getNetworkAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalIotDsl.g:284:5: ( (lv_measurand_22_0= ruleMeasurand ) )
                    	    // InternalIotDsl.g:285:6: (lv_measurand_22_0= ruleMeasurand )
                    	    {
                    	    // InternalIotDsl.g:285:6: (lv_measurand_22_0= ruleMeasurand )
                    	    // InternalIotDsl.g:286:7: lv_measurand_22_0= ruleMeasurand
                    	    {

                    	    							newCompositeNode(grammarAccess.getNetworkAccess().getMeasurandMeasurandParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_measurand_22_0=ruleMeasurand();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"measurand",
                    	    								lv_measurand_22_0,
                    	    								"edu.univ.nantes.iot.IotDsl.Measurand");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_23, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalIotDsl.g:309:3: (otherlv_24= 'device' otherlv_25= '{' ( (lv_device_26_0= ruleDevice ) ) (otherlv_27= ',' ( (lv_device_28_0= ruleDevice ) ) )* otherlv_29= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIotDsl.g:310:4: otherlv_24= 'device' otherlv_25= '{' ( (lv_device_26_0= ruleDevice ) ) (otherlv_27= ',' ( (lv_device_28_0= ruleDevice ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getNetworkAccess().getDeviceKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_25, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalIotDsl.g:318:4: ( (lv_device_26_0= ruleDevice ) )
                    // InternalIotDsl.g:319:5: (lv_device_26_0= ruleDevice )
                    {
                    // InternalIotDsl.g:319:5: (lv_device_26_0= ruleDevice )
                    // InternalIotDsl.g:320:6: lv_device_26_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getNetworkAccess().getDeviceDeviceParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_device_26_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetworkRule());
                    						}
                    						add(
                    							current,
                    							"device",
                    							lv_device_26_0,
                    							"edu.univ.nantes.iot.IotDsl.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIotDsl.g:337:4: (otherlv_27= ',' ( (lv_device_28_0= ruleDevice ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalIotDsl.g:338:5: otherlv_27= ',' ( (lv_device_28_0= ruleDevice ) )
                    	    {
                    	    otherlv_27=(Token)match(input,16,FOLLOW_15); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getNetworkAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalIotDsl.g:342:5: ( (lv_device_28_0= ruleDevice ) )
                    	    // InternalIotDsl.g:343:6: (lv_device_28_0= ruleDevice )
                    	    {
                    	    // InternalIotDsl.g:343:6: (lv_device_28_0= ruleDevice )
                    	    // InternalIotDsl.g:344:7: lv_device_28_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getNetworkAccess().getDeviceDeviceParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_device_28_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"device",
                    	    								lv_device_28_0,
                    	    								"edu.univ.nantes.iot.IotDsl.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_29, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleMeasure"
    // InternalIotDsl.g:375:1: entryRuleMeasure returns [EObject current=null] : iv_ruleMeasure= ruleMeasure EOF ;
    public final EObject entryRuleMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasure = null;


        try {
            // InternalIotDsl.g:375:48: (iv_ruleMeasure= ruleMeasure EOF )
            // InternalIotDsl.g:376:2: iv_ruleMeasure= ruleMeasure EOF
            {
             newCompositeNode(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasure=ruleMeasure();

            state._fsp--;

             current =iv_ruleMeasure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // InternalIotDsl.g:382:1: ruleMeasure returns [EObject current=null] : ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) )? ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:388:2: ( ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) )? ) )
            // InternalIotDsl.g:389:2: ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) )? )
            {
            // InternalIotDsl.g:389:2: ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) )? )
            // InternalIotDsl.g:390:3: () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) )?
            {
            // InternalIotDsl.g:390:3: ()
            // InternalIotDsl.g:391:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureAccess().getMeasureAction_0(),
            					current);
            			

            }

            // InternalIotDsl.g:397:3: (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIotDsl.g:398:4: otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getMeasureAccess().getNameKeyword_1_0());
                    			
                    // InternalIotDsl.g:402:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalIotDsl.g:403:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalIotDsl.g:403:5: (lv_name_2_0= RULE_ID )
                    // InternalIotDsl.g:404:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getMeasureAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIotDsl.g:421:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalIotDsl.g:422:4: otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureAccess().getTypeKeyword_2_0());
                    			
                    // InternalIotDsl.g:426:4: ( (lv_type_4_0= ruleDataType ) )
                    // InternalIotDsl.g:427:5: (lv_type_4_0= ruleDataType )
                    {
                    // InternalIotDsl.g:427:5: (lv_type_4_0= ruleDataType )
                    // InternalIotDsl.g:428:6: lv_type_4_0= ruleDataType
                    {

                    						newCompositeNode(grammarAccess.getMeasureAccess().getTypeDataTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_4_0=ruleDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"edu.univ.nantes.iot.IotDsl.DataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRuleInstrument"
    // InternalIotDsl.g:450:1: entryRuleInstrument returns [EObject current=null] : iv_ruleInstrument= ruleInstrument EOF ;
    public final EObject entryRuleInstrument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstrument = null;


        try {
            // InternalIotDsl.g:450:51: (iv_ruleInstrument= ruleInstrument EOF )
            // InternalIotDsl.g:451:2: iv_ruleInstrument= ruleInstrument EOF
            {
             newCompositeNode(grammarAccess.getInstrumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstrument=ruleInstrument();

            state._fsp--;

             current =iv_ruleInstrument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstrument"


    // $ANTLR start "ruleInstrument"
    // InternalIotDsl.g:457:1: ruleInstrument returns [EObject current=null] : ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'interest' otherlv_3= '{' ( (lv_interet_4_0= ruleInterest ) ) (otherlv_5= ',' ( (lv_interet_6_0= ruleInterest ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleInstrument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_interet_4_0 = null;

        EObject lv_interet_6_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:463:2: ( ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'interest' otherlv_3= '{' ( (lv_interet_4_0= ruleInterest ) ) (otherlv_5= ',' ( (lv_interet_6_0= ruleInterest ) ) )* otherlv_7= '}' ) )
            // InternalIotDsl.g:464:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'interest' otherlv_3= '{' ( (lv_interet_4_0= ruleInterest ) ) (otherlv_5= ',' ( (lv_interet_6_0= ruleInterest ) ) )* otherlv_7= '}' )
            {
            // InternalIotDsl.g:464:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'interest' otherlv_3= '{' ( (lv_interet_4_0= ruleInterest ) ) (otherlv_5= ',' ( (lv_interet_6_0= ruleInterest ) ) )* otherlv_7= '}' )
            // InternalIotDsl.g:465:3: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'interest' otherlv_3= '{' ( (lv_interet_4_0= ruleInterest ) ) (otherlv_5= ',' ( (lv_interet_6_0= ruleInterest ) ) )* otherlv_7= '}'
            {
            // InternalIotDsl.g:465:3: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalIotDsl.g:466:4: otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getInstrumentAccess().getNameKeyword_0_0());
                    			
                    // InternalIotDsl.g:470:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalIotDsl.g:471:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalIotDsl.g:471:5: (lv_name_1_0= RULE_ID )
                    // InternalIotDsl.g:472:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getInstrumentAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInstrumentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInstrumentAccess().getInterestKeyword_1());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIotDsl.g:497:3: ( (lv_interet_4_0= ruleInterest ) )
            // InternalIotDsl.g:498:4: (lv_interet_4_0= ruleInterest )
            {
            // InternalIotDsl.g:498:4: (lv_interet_4_0= ruleInterest )
            // InternalIotDsl.g:499:5: lv_interet_4_0= ruleInterest
            {

            					newCompositeNode(grammarAccess.getInstrumentAccess().getInteretInterestParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_interet_4_0=ruleInterest();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstrumentRule());
            					}
            					add(
            						current,
            						"interet",
            						lv_interet_4_0,
            						"edu.univ.nantes.iot.IotDsl.Interest");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:516:3: (otherlv_5= ',' ( (lv_interet_6_0= ruleInterest ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIotDsl.g:517:4: otherlv_5= ',' ( (lv_interet_6_0= ruleInterest ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_20); 

            	    				newLeafNode(otherlv_5, grammarAccess.getInstrumentAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalIotDsl.g:521:4: ( (lv_interet_6_0= ruleInterest ) )
            	    // InternalIotDsl.g:522:5: (lv_interet_6_0= ruleInterest )
            	    {
            	    // InternalIotDsl.g:522:5: (lv_interet_6_0= ruleInterest )
            	    // InternalIotDsl.g:523:6: lv_interet_6_0= ruleInterest
            	    {

            	    						newCompositeNode(grammarAccess.getInstrumentAccess().getInteretInterestParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_interet_6_0=ruleInterest();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInstrumentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"interet",
            	    							lv_interet_6_0,
            	    							"edu.univ.nantes.iot.IotDsl.Interest");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstrument"


    // $ANTLR start "entryRuleMeasurand"
    // InternalIotDsl.g:549:1: entryRuleMeasurand returns [EObject current=null] : iv_ruleMeasurand= ruleMeasurand EOF ;
    public final EObject entryRuleMeasurand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurand = null;


        try {
            // InternalIotDsl.g:549:50: (iv_ruleMeasurand= ruleMeasurand EOF )
            // InternalIotDsl.g:550:2: iv_ruleMeasurand= ruleMeasurand EOF
            {
             newCompositeNode(grammarAccess.getMeasurandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasurand=ruleMeasurand();

            state._fsp--;

             current =iv_ruleMeasurand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasurand"


    // $ANTLR start "ruleMeasurand"
    // InternalIotDsl.g:556:1: ruleMeasurand returns [EObject current=null] : ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleMeasurand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalIotDsl.g:562:2: ( ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? ) )
            // InternalIotDsl.g:563:2: ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? )
            {
            // InternalIotDsl.g:563:2: ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? )
            // InternalIotDsl.g:564:3: () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )?
            {
            // InternalIotDsl.g:564:3: ()
            // InternalIotDsl.g:565:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasurandAccess().getMeasurandAction_0(),
            					current);
            			

            }

            // InternalIotDsl.g:571:3: (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIotDsl.g:572:4: otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getMeasurandAccess().getNameKeyword_1_0());
                    			
                    // InternalIotDsl.g:576:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalIotDsl.g:577:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalIotDsl.g:577:5: (lv_name_2_0= RULE_ID )
                    // InternalIotDsl.g:578:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getMeasurandAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeasurandRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasurand"


    // $ANTLR start "entryRuleDevice"
    // InternalIotDsl.g:599:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalIotDsl.g:599:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalIotDsl.g:600:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalIotDsl.g:606:1: ruleDevice returns [EObject current=null] : ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'instrument' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= 'binding' otherlv_9= '{' ( (lv_binding_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_binding_12_0= ruleBinding ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_binding_10_0 = null;

        EObject lv_binding_12_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:612:2: ( ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'instrument' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= 'binding' otherlv_9= '{' ( (lv_binding_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_binding_12_0= ruleBinding ) ) )* otherlv_13= '}' )? ) )
            // InternalIotDsl.g:613:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'instrument' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= 'binding' otherlv_9= '{' ( (lv_binding_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_binding_12_0= ruleBinding ) ) )* otherlv_13= '}' )? )
            {
            // InternalIotDsl.g:613:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'instrument' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= 'binding' otherlv_9= '{' ( (lv_binding_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_binding_12_0= ruleBinding ) ) )* otherlv_13= '}' )? )
            // InternalIotDsl.g:614:3: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'instrument' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= 'binding' otherlv_9= '{' ( (lv_binding_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_binding_12_0= ruleBinding ) ) )* otherlv_13= '}' )?
            {
            // InternalIotDsl.g:614:3: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIotDsl.g:615:4: otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getNameKeyword_0_0());
                    			
                    // InternalIotDsl.g:619:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalIotDsl.g:620:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalIotDsl.g:620:5: (lv_name_1_0= RULE_ID )
                    // InternalIotDsl.g:621:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeviceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getInstrumentKeyword_1());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getLeftParenthesisKeyword_2());
            		
            // InternalIotDsl.g:646:3: ( (otherlv_4= RULE_ID ) )
            // InternalIotDsl.g:647:4: (otherlv_4= RULE_ID )
            {
            // InternalIotDsl.g:647:4: (otherlv_4= RULE_ID )
            // InternalIotDsl.g:648:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getInstrumentInstrumentCrossReference_3_0());
            				

            }


            }

            // InternalIotDsl.g:659:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIotDsl.g:660:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getDeviceAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalIotDsl.g:664:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalIotDsl.g:665:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalIotDsl.g:665:5: (otherlv_6= RULE_ID )
            	    // InternalIotDsl.g:666:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDeviceRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(otherlv_6, grammarAccess.getDeviceAccess().getInstrumentInstrumentCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getDeviceAccess().getRightParenthesisKeyword_5());
            		
            // InternalIotDsl.g:682:3: (otherlv_8= 'binding' otherlv_9= '{' ( (lv_binding_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_binding_12_0= ruleBinding ) ) )* otherlv_13= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIotDsl.g:683:4: otherlv_8= 'binding' otherlv_9= '{' ( (lv_binding_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_binding_12_0= ruleBinding ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getDeviceAccess().getBindingKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalIotDsl.g:691:4: ( (lv_binding_10_0= ruleBinding ) )
                    // InternalIotDsl.g:692:5: (lv_binding_10_0= ruleBinding )
                    {
                    // InternalIotDsl.g:692:5: (lv_binding_10_0= ruleBinding )
                    // InternalIotDsl.g:693:6: lv_binding_10_0= ruleBinding
                    {

                    						newCompositeNode(grammarAccess.getDeviceAccess().getBindingBindingParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_binding_10_0=ruleBinding();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeviceRule());
                    						}
                    						add(
                    							current,
                    							"binding",
                    							lv_binding_10_0,
                    							"edu.univ.nantes.iot.IotDsl.Binding");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIotDsl.g:710:4: (otherlv_11= ',' ( (lv_binding_12_0= ruleBinding ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalIotDsl.g:711:5: otherlv_11= ',' ( (lv_binding_12_0= ruleBinding ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_25); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getDeviceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalIotDsl.g:715:5: ( (lv_binding_12_0= ruleBinding ) )
                    	    // InternalIotDsl.g:716:6: (lv_binding_12_0= ruleBinding )
                    	    {
                    	    // InternalIotDsl.g:716:6: (lv_binding_12_0= ruleBinding )
                    	    // InternalIotDsl.g:717:7: lv_binding_12_0= ruleBinding
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeviceAccess().getBindingBindingParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_binding_12_0=ruleBinding();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeviceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"binding",
                    	    								lv_binding_12_0,
                    	    								"edu.univ.nantes.iot.IotDsl.Binding");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleBrokerConf"
    // InternalIotDsl.g:744:1: entryRuleBrokerConf returns [EObject current=null] : iv_ruleBrokerConf= ruleBrokerConf EOF ;
    public final EObject entryRuleBrokerConf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrokerConf = null;


        try {
            // InternalIotDsl.g:744:51: (iv_ruleBrokerConf= ruleBrokerConf EOF )
            // InternalIotDsl.g:745:2: iv_ruleBrokerConf= ruleBrokerConf EOF
            {
             newCompositeNode(grammarAccess.getBrokerConfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrokerConf=ruleBrokerConf();

            state._fsp--;

             current =iv_ruleBrokerConf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrokerConf"


    // $ANTLR start "ruleBrokerConf"
    // InternalIotDsl.g:751:1: ruleBrokerConf returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) )? (otherlv_4= 'server' ( (lv_server_5_0= ruleQualifiedName ) ) )? (otherlv_6= 'user' ( (lv_user_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'port' ( (lv_port_9_0= ruleInteger ) ) )? (otherlv_10= 'password' ( (lv_password_11_0= ruleQualifiedName ) ) )? (otherlv_12= 'sslPort' ( (lv_sslPort_13_0= ruleInteger ) ) )? (otherlv_14= 'webSocketsPort' ( (lv_webSocketsPort_15_0= ruleInteger ) ) )? (otherlv_16= 'connectionLimit' ( (lv_connectionLimit_17_0= ruleInteger ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleBrokerConf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_server_5_0 = null;

        AntlrDatatypeRuleToken lv_user_7_0 = null;

        AntlrDatatypeRuleToken lv_port_9_0 = null;

        AntlrDatatypeRuleToken lv_password_11_0 = null;

        AntlrDatatypeRuleToken lv_sslPort_13_0 = null;

        AntlrDatatypeRuleToken lv_webSocketsPort_15_0 = null;

        AntlrDatatypeRuleToken lv_connectionLimit_17_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:757:2: ( ( () otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) )? (otherlv_4= 'server' ( (lv_server_5_0= ruleQualifiedName ) ) )? (otherlv_6= 'user' ( (lv_user_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'port' ( (lv_port_9_0= ruleInteger ) ) )? (otherlv_10= 'password' ( (lv_password_11_0= ruleQualifiedName ) ) )? (otherlv_12= 'sslPort' ( (lv_sslPort_13_0= ruleInteger ) ) )? (otherlv_14= 'webSocketsPort' ( (lv_webSocketsPort_15_0= ruleInteger ) ) )? (otherlv_16= 'connectionLimit' ( (lv_connectionLimit_17_0= ruleInteger ) ) )? otherlv_18= '}' ) )
            // InternalIotDsl.g:758:2: ( () otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) )? (otherlv_4= 'server' ( (lv_server_5_0= ruleQualifiedName ) ) )? (otherlv_6= 'user' ( (lv_user_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'port' ( (lv_port_9_0= ruleInteger ) ) )? (otherlv_10= 'password' ( (lv_password_11_0= ruleQualifiedName ) ) )? (otherlv_12= 'sslPort' ( (lv_sslPort_13_0= ruleInteger ) ) )? (otherlv_14= 'webSocketsPort' ( (lv_webSocketsPort_15_0= ruleInteger ) ) )? (otherlv_16= 'connectionLimit' ( (lv_connectionLimit_17_0= ruleInteger ) ) )? otherlv_18= '}' )
            {
            // InternalIotDsl.g:758:2: ( () otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) )? (otherlv_4= 'server' ( (lv_server_5_0= ruleQualifiedName ) ) )? (otherlv_6= 'user' ( (lv_user_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'port' ( (lv_port_9_0= ruleInteger ) ) )? (otherlv_10= 'password' ( (lv_password_11_0= ruleQualifiedName ) ) )? (otherlv_12= 'sslPort' ( (lv_sslPort_13_0= ruleInteger ) ) )? (otherlv_14= 'webSocketsPort' ( (lv_webSocketsPort_15_0= ruleInteger ) ) )? (otherlv_16= 'connectionLimit' ( (lv_connectionLimit_17_0= ruleInteger ) ) )? otherlv_18= '}' )
            // InternalIotDsl.g:759:3: () otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) )? (otherlv_4= 'server' ( (lv_server_5_0= ruleQualifiedName ) ) )? (otherlv_6= 'user' ( (lv_user_7_0= ruleQualifiedName ) ) )? (otherlv_8= 'port' ( (lv_port_9_0= ruleInteger ) ) )? (otherlv_10= 'password' ( (lv_password_11_0= ruleQualifiedName ) ) )? (otherlv_12= 'sslPort' ( (lv_sslPort_13_0= ruleInteger ) ) )? (otherlv_14= 'webSocketsPort' ( (lv_webSocketsPort_15_0= ruleInteger ) ) )? (otherlv_16= 'connectionLimit' ( (lv_connectionLimit_17_0= ruleInteger ) ) )? otherlv_18= '}'
            {
            // InternalIotDsl.g:759:3: ()
            // InternalIotDsl.g:760:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBrokerConfAccess().getBrokerConfAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getBrokerConfAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalIotDsl.g:770:3: (otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIotDsl.g:771:4: otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getBrokerConfAccess().getNameKeyword_2_0());
                    			
                    // InternalIotDsl.g:775:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalIotDsl.g:776:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalIotDsl.g:776:5: (lv_name_3_0= RULE_ID )
                    // InternalIotDsl.g:777:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getBrokerConfAccess().getNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBrokerConfRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIotDsl.g:794:3: (otherlv_4= 'server' ( (lv_server_5_0= ruleQualifiedName ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalIotDsl.g:795:4: otherlv_4= 'server' ( (lv_server_5_0= ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getBrokerConfAccess().getServerKeyword_3_0());
                    			
                    // InternalIotDsl.g:799:4: ( (lv_server_5_0= ruleQualifiedName ) )
                    // InternalIotDsl.g:800:5: (lv_server_5_0= ruleQualifiedName )
                    {
                    // InternalIotDsl.g:800:5: (lv_server_5_0= ruleQualifiedName )
                    // InternalIotDsl.g:801:6: lv_server_5_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getBrokerConfAccess().getServerQualifiedNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_server_5_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrokerConfRule());
                    						}
                    						set(
                    							current,
                    							"server",
                    							lv_server_5_0,
                    							"edu.univ.nantes.iot.IotDsl.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIotDsl.g:819:3: (otherlv_6= 'user' ( (lv_user_7_0= ruleQualifiedName ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalIotDsl.g:820:4: otherlv_6= 'user' ( (lv_user_7_0= ruleQualifiedName ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getBrokerConfAccess().getUserKeyword_4_0());
                    			
                    // InternalIotDsl.g:824:4: ( (lv_user_7_0= ruleQualifiedName ) )
                    // InternalIotDsl.g:825:5: (lv_user_7_0= ruleQualifiedName )
                    {
                    // InternalIotDsl.g:825:5: (lv_user_7_0= ruleQualifiedName )
                    // InternalIotDsl.g:826:6: lv_user_7_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getBrokerConfAccess().getUserQualifiedNameParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_user_7_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrokerConfRule());
                    						}
                    						set(
                    							current,
                    							"user",
                    							lv_user_7_0,
                    							"edu.univ.nantes.iot.IotDsl.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIotDsl.g:844:3: (otherlv_8= 'port' ( (lv_port_9_0= ruleInteger ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalIotDsl.g:845:4: otherlv_8= 'port' ( (lv_port_9_0= ruleInteger ) )
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getBrokerConfAccess().getPortKeyword_5_0());
                    			
                    // InternalIotDsl.g:849:4: ( (lv_port_9_0= ruleInteger ) )
                    // InternalIotDsl.g:850:5: (lv_port_9_0= ruleInteger )
                    {
                    // InternalIotDsl.g:850:5: (lv_port_9_0= ruleInteger )
                    // InternalIotDsl.g:851:6: lv_port_9_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getBrokerConfAccess().getPortIntegerParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_port_9_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrokerConfRule());
                    						}
                    						set(
                    							current,
                    							"port",
                    							lv_port_9_0,
                    							"edu.univ.nantes.iot.IotDsl.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIotDsl.g:869:3: (otherlv_10= 'password' ( (lv_password_11_0= ruleQualifiedName ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalIotDsl.g:870:4: otherlv_10= 'password' ( (lv_password_11_0= ruleQualifiedName ) )
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getBrokerConfAccess().getPasswordKeyword_6_0());
                    			
                    // InternalIotDsl.g:874:4: ( (lv_password_11_0= ruleQualifiedName ) )
                    // InternalIotDsl.g:875:5: (lv_password_11_0= ruleQualifiedName )
                    {
                    // InternalIotDsl.g:875:5: (lv_password_11_0= ruleQualifiedName )
                    // InternalIotDsl.g:876:6: lv_password_11_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getBrokerConfAccess().getPasswordQualifiedNameParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_password_11_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrokerConfRule());
                    						}
                    						set(
                    							current,
                    							"password",
                    							lv_password_11_0,
                    							"edu.univ.nantes.iot.IotDsl.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIotDsl.g:894:3: (otherlv_12= 'sslPort' ( (lv_sslPort_13_0= ruleInteger ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalIotDsl.g:895:4: otherlv_12= 'sslPort' ( (lv_sslPort_13_0= ruleInteger ) )
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_30); 

                    				newLeafNode(otherlv_12, grammarAccess.getBrokerConfAccess().getSslPortKeyword_7_0());
                    			
                    // InternalIotDsl.g:899:4: ( (lv_sslPort_13_0= ruleInteger ) )
                    // InternalIotDsl.g:900:5: (lv_sslPort_13_0= ruleInteger )
                    {
                    // InternalIotDsl.g:900:5: (lv_sslPort_13_0= ruleInteger )
                    // InternalIotDsl.g:901:6: lv_sslPort_13_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getBrokerConfAccess().getSslPortIntegerParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_sslPort_13_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrokerConfRule());
                    						}
                    						set(
                    							current,
                    							"sslPort",
                    							lv_sslPort_13_0,
                    							"edu.univ.nantes.iot.IotDsl.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIotDsl.g:919:3: (otherlv_14= 'webSocketsPort' ( (lv_webSocketsPort_15_0= ruleInteger ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalIotDsl.g:920:4: otherlv_14= 'webSocketsPort' ( (lv_webSocketsPort_15_0= ruleInteger ) )
                    {
                    otherlv_14=(Token)match(input,31,FOLLOW_30); 

                    				newLeafNode(otherlv_14, grammarAccess.getBrokerConfAccess().getWebSocketsPortKeyword_8_0());
                    			
                    // InternalIotDsl.g:924:4: ( (lv_webSocketsPort_15_0= ruleInteger ) )
                    // InternalIotDsl.g:925:5: (lv_webSocketsPort_15_0= ruleInteger )
                    {
                    // InternalIotDsl.g:925:5: (lv_webSocketsPort_15_0= ruleInteger )
                    // InternalIotDsl.g:926:6: lv_webSocketsPort_15_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getBrokerConfAccess().getWebSocketsPortIntegerParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_webSocketsPort_15_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrokerConfRule());
                    						}
                    						set(
                    							current,
                    							"webSocketsPort",
                    							lv_webSocketsPort_15_0,
                    							"edu.univ.nantes.iot.IotDsl.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIotDsl.g:944:3: (otherlv_16= 'connectionLimit' ( (lv_connectionLimit_17_0= ruleInteger ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalIotDsl.g:945:4: otherlv_16= 'connectionLimit' ( (lv_connectionLimit_17_0= ruleInteger ) )
                    {
                    otherlv_16=(Token)match(input,32,FOLLOW_30); 

                    				newLeafNode(otherlv_16, grammarAccess.getBrokerConfAccess().getConnectionLimitKeyword_9_0());
                    			
                    // InternalIotDsl.g:949:4: ( (lv_connectionLimit_17_0= ruleInteger ) )
                    // InternalIotDsl.g:950:5: (lv_connectionLimit_17_0= ruleInteger )
                    {
                    // InternalIotDsl.g:950:5: (lv_connectionLimit_17_0= ruleInteger )
                    // InternalIotDsl.g:951:6: lv_connectionLimit_17_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getBrokerConfAccess().getConnectionLimitIntegerParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_connectionLimit_17_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrokerConfRule());
                    						}
                    						set(
                    							current,
                    							"connectionLimit",
                    							lv_connectionLimit_17_0,
                    							"edu.univ.nantes.iot.IotDsl.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getBrokerConfAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrokerConf"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalIotDsl.g:977:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalIotDsl.g:977:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalIotDsl.g:978:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalIotDsl.g:984:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalIotDsl.g:990:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalIotDsl.g:991:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalIotDsl.g:991:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalIotDsl.g:992:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalIotDsl.g:999:3: (kw= '.' this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalIotDsl.g:1000:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleInterest"
    // InternalIotDsl.g:1017:1: entryRuleInterest returns [EObject current=null] : iv_ruleInterest= ruleInterest EOF ;
    public final EObject entryRuleInterest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterest = null;


        try {
            // InternalIotDsl.g:1017:49: (iv_ruleInterest= ruleInterest EOF )
            // InternalIotDsl.g:1018:2: iv_ruleInterest= ruleInterest EOF
            {
             newCompositeNode(grammarAccess.getInterestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterest=ruleInterest();

            state._fsp--;

             current =iv_ruleInterest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterest"


    // $ANTLR start "ruleInterest"
    // InternalIotDsl.g:1024:1: ruleInterest returns [EObject current=null] : ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'features' otherlv_3= '{' ( (lv_features_4_0= ruleFeatures ) ) (otherlv_5= ',' ( (lv_features_6_0= ruleFeatures ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleInterest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_features_4_0 = null;

        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:1030:2: ( ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'features' otherlv_3= '{' ( (lv_features_4_0= ruleFeatures ) ) (otherlv_5= ',' ( (lv_features_6_0= ruleFeatures ) ) )* otherlv_7= '}' ) )
            // InternalIotDsl.g:1031:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'features' otherlv_3= '{' ( (lv_features_4_0= ruleFeatures ) ) (otherlv_5= ',' ( (lv_features_6_0= ruleFeatures ) ) )* otherlv_7= '}' )
            {
            // InternalIotDsl.g:1031:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'features' otherlv_3= '{' ( (lv_features_4_0= ruleFeatures ) ) (otherlv_5= ',' ( (lv_features_6_0= ruleFeatures ) ) )* otherlv_7= '}' )
            // InternalIotDsl.g:1032:3: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'features' otherlv_3= '{' ( (lv_features_4_0= ruleFeatures ) ) (otherlv_5= ',' ( (lv_features_6_0= ruleFeatures ) ) )* otherlv_7= '}'
            {
            // InternalIotDsl.g:1032:3: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalIotDsl.g:1033:4: otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getInterestAccess().getNameKeyword_0_0());
                    			
                    // InternalIotDsl.g:1037:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalIotDsl.g:1038:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalIotDsl.g:1038:5: (lv_name_1_0= RULE_ID )
                    // InternalIotDsl.g:1039:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getInterestAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterestRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInterestAccess().getFeaturesKeyword_1());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getInterestAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIotDsl.g:1064:3: ( (lv_features_4_0= ruleFeatures ) )
            // InternalIotDsl.g:1065:4: (lv_features_4_0= ruleFeatures )
            {
            // InternalIotDsl.g:1065:4: (lv_features_4_0= ruleFeatures )
            // InternalIotDsl.g:1066:5: lv_features_4_0= ruleFeatures
            {

            					newCompositeNode(grammarAccess.getInterestAccess().getFeaturesFeaturesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_features_4_0=ruleFeatures();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterestRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_4_0,
            						"edu.univ.nantes.iot.IotDsl.Features");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIotDsl.g:1083:3: (otherlv_5= ',' ( (lv_features_6_0= ruleFeatures ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalIotDsl.g:1084:4: otherlv_5= ',' ( (lv_features_6_0= ruleFeatures ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_37); 

            	    				newLeafNode(otherlv_5, grammarAccess.getInterestAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalIotDsl.g:1088:4: ( (lv_features_6_0= ruleFeatures ) )
            	    // InternalIotDsl.g:1089:5: (lv_features_6_0= ruleFeatures )
            	    {
            	    // InternalIotDsl.g:1089:5: (lv_features_6_0= ruleFeatures )
            	    // InternalIotDsl.g:1090:6: lv_features_6_0= ruleFeatures
            	    {

            	    						newCompositeNode(grammarAccess.getInterestAccess().getFeaturesFeaturesParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_features_6_0=ruleFeatures();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInterestRule());
            	    						}
            	    						add(
            	    							current,
            	    							"features",
            	    							lv_features_6_0,
            	    							"edu.univ.nantes.iot.IotDsl.Features");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInterestAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterest"


    // $ANTLR start "entryRuleFeatures"
    // InternalIotDsl.g:1116:1: entryRuleFeatures returns [EObject current=null] : iv_ruleFeatures= ruleFeatures EOF ;
    public final EObject entryRuleFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatures = null;


        try {
            // InternalIotDsl.g:1116:49: (iv_ruleFeatures= ruleFeatures EOF )
            // InternalIotDsl.g:1117:2: iv_ruleFeatures= ruleFeatures EOF
            {
             newCompositeNode(grammarAccess.getFeaturesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatures=ruleFeatures();

            state._fsp--;

             current =iv_ruleFeatures; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatures"


    // $ANTLR start "ruleFeatures"
    // InternalIotDsl.g:1123:1: ruleFeatures returns [EObject current=null] : ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'measure' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'mode' ( (lv_mode_6_0= ruleMode ) ) )? ) ;
    public final EObject ruleFeatures() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_mode_6_0 = null;



        	enterRule();

        try {
            // InternalIotDsl.g:1129:2: ( ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'measure' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'mode' ( (lv_mode_6_0= ruleMode ) ) )? ) )
            // InternalIotDsl.g:1130:2: ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'measure' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'mode' ( (lv_mode_6_0= ruleMode ) ) )? )
            {
            // InternalIotDsl.g:1130:2: ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'measure' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'mode' ( (lv_mode_6_0= ruleMode ) ) )? )
            // InternalIotDsl.g:1131:3: () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'measure' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'mode' ( (lv_mode_6_0= ruleMode ) ) )?
            {
            // InternalIotDsl.g:1131:3: ()
            // InternalIotDsl.g:1132:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeaturesAccess().getFeaturesAction_0(),
            					current);
            			

            }

            // InternalIotDsl.g:1138:3: (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalIotDsl.g:1139:4: otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getFeaturesAccess().getNameKeyword_1_0());
                    			
                    // InternalIotDsl.g:1143:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalIotDsl.g:1144:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalIotDsl.g:1144:5: (lv_name_2_0= RULE_ID )
                    // InternalIotDsl.g:1145:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getFeaturesAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeaturesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIotDsl.g:1162:3: (otherlv_3= 'measure' ( ( ruleQualifiedName ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==15) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalIotDsl.g:1163:4: otherlv_3= 'measure' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getFeaturesAccess().getMeasureKeyword_2_0());
                    			
                    // InternalIotDsl.g:1167:4: ( ( ruleQualifiedName ) )
                    // InternalIotDsl.g:1168:5: ( ruleQualifiedName )
                    {
                    // InternalIotDsl.g:1168:5: ( ruleQualifiedName )
                    // InternalIotDsl.g:1169:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeaturesRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeaturesAccess().getMeasureMeasureCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIotDsl.g:1184:3: (otherlv_5= 'mode' ( (lv_mode_6_0= ruleMode ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalIotDsl.g:1185:4: otherlv_5= 'mode' ( (lv_mode_6_0= ruleMode ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getFeaturesAccess().getModeKeyword_3_0());
                    			
                    // InternalIotDsl.g:1189:4: ( (lv_mode_6_0= ruleMode ) )
                    // InternalIotDsl.g:1190:5: (lv_mode_6_0= ruleMode )
                    {
                    // InternalIotDsl.g:1190:5: (lv_mode_6_0= ruleMode )
                    // InternalIotDsl.g:1191:6: lv_mode_6_0= ruleMode
                    {

                    						newCompositeNode(grammarAccess.getFeaturesAccess().getModeModeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mode_6_0=ruleMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeaturesRule());
                    						}
                    						set(
                    							current,
                    							"mode",
                    							lv_mode_6_0,
                    							"edu.univ.nantes.iot.IotDsl.Mode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatures"


    // $ANTLR start "entryRuleBinding"
    // InternalIotDsl.g:1213:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalIotDsl.g:1213:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalIotDsl.g:1214:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalIotDsl.g:1220:1: ruleBinding returns [EObject current=null] : ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'measurand' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'features' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIotDsl.g:1226:2: ( ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'measurand' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'features' ( ( ruleQualifiedName ) ) )? ) )
            // InternalIotDsl.g:1227:2: ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'measurand' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'features' ( ( ruleQualifiedName ) ) )? )
            {
            // InternalIotDsl.g:1227:2: ( () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'measurand' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'features' ( ( ruleQualifiedName ) ) )? )
            // InternalIotDsl.g:1228:3: () (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )? (otherlv_3= 'measurand' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'features' ( ( ruleQualifiedName ) ) )?
            {
            // InternalIotDsl.g:1228:3: ()
            // InternalIotDsl.g:1229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindingAccess().getBindingAction_0(),
            					current);
            			

            }

            // InternalIotDsl.g:1235:3: (otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==13) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalIotDsl.g:1236:4: otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getNameKeyword_1_0());
                    			
                    // InternalIotDsl.g:1240:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalIotDsl.g:1241:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalIotDsl.g:1241:5: (lv_name_2_0= RULE_ID )
                    // InternalIotDsl.g:1242:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_41); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIotDsl.g:1259:3: (otherlv_3= 'measurand' ( (otherlv_4= RULE_ID ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==19) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalIotDsl.g:1260:4: otherlv_3= 'measurand' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getMeasurandKeyword_2_0());
                    			
                    // InternalIotDsl.g:1264:4: ( (otherlv_4= RULE_ID ) )
                    // InternalIotDsl.g:1265:5: (otherlv_4= RULE_ID )
                    {
                    // InternalIotDsl.g:1265:5: (otherlv_4= RULE_ID )
                    // InternalIotDsl.g:1266:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindingRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_42); 

                    						newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getMeasurandMeasurandCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalIotDsl.g:1278:3: (otherlv_5= 'features' ( ( ruleQualifiedName ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalIotDsl.g:1279:4: otherlv_5= 'features' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getBindingAccess().getFeaturesKeyword_3_0());
                    			
                    // InternalIotDsl.g:1283:4: ( ( ruleQualifiedName ) )
                    // InternalIotDsl.g:1284:5: ( ruleQualifiedName )
                    {
                    // InternalIotDsl.g:1284:5: ( ruleQualifiedName )
                    // InternalIotDsl.g:1285:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindingRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBindingAccess().getFeaturesFeaturesCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleInteger"
    // InternalIotDsl.g:1304:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalIotDsl.g:1304:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalIotDsl.g:1305:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalIotDsl.g:1311:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalIotDsl.g:1317:2: (this_INT_0= RULE_INT )
            // InternalIotDsl.g:1318:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getIntegerAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "ruleMode"
    // InternalIotDsl.g:1328:1: ruleMode returns [Enumerator current=null] : ( (enumLiteral_0= 'INPUT' ) | (enumLiteral_1= 'OUTPUT' ) ) ;
    public final Enumerator ruleMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIotDsl.g:1334:2: ( ( (enumLiteral_0= 'INPUT' ) | (enumLiteral_1= 'OUTPUT' ) ) )
            // InternalIotDsl.g:1335:2: ( (enumLiteral_0= 'INPUT' ) | (enumLiteral_1= 'OUTPUT' ) )
            {
            // InternalIotDsl.g:1335:2: ( (enumLiteral_0= 'INPUT' ) | (enumLiteral_1= 'OUTPUT' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            else if ( (LA36_0==37) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalIotDsl.g:1336:3: (enumLiteral_0= 'INPUT' )
                    {
                    // InternalIotDsl.g:1336:3: (enumLiteral_0= 'INPUT' )
                    // InternalIotDsl.g:1337:4: enumLiteral_0= 'INPUT'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getModeAccess().getINPUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModeAccess().getINPUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:1344:3: (enumLiteral_1= 'OUTPUT' )
                    {
                    // InternalIotDsl.g:1344:3: (enumLiteral_1= 'OUTPUT' )
                    // InternalIotDsl.g:1345:4: enumLiteral_1= 'OUTPUT'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getModeAccess().getOUTPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModeAccess().getOUTPUTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMode"


    // $ANTLR start "ruleDataType"
    // InternalIotDsl.g:1355:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'number' ) | (enumLiteral_3= 'date' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalIotDsl.g:1361:2: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'number' ) | (enumLiteral_3= 'date' ) ) )
            // InternalIotDsl.g:1362:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'number' ) | (enumLiteral_3= 'date' ) )
            {
            // InternalIotDsl.g:1362:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'number' ) | (enumLiteral_3= 'date' ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt37=1;
                }
                break;
            case 39:
                {
                alt37=2;
                }
                break;
            case 40:
                {
                alt37=3;
                }
                break;
            case 41:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalIotDsl.g:1363:3: (enumLiteral_0= 'boolean' )
                    {
                    // InternalIotDsl.g:1363:3: (enumLiteral_0= 'boolean' )
                    // InternalIotDsl.g:1364:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getBooleanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIotDsl.g:1371:3: (enumLiteral_1= 'String' )
                    {
                    // InternalIotDsl.g:1371:3: (enumLiteral_1= 'String' )
                    // InternalIotDsl.g:1372:4: enumLiteral_1= 'String'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getStringEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIotDsl.g:1379:3: (enumLiteral_2= 'number' )
                    {
                    // InternalIotDsl.g:1379:3: (enumLiteral_2= 'number' )
                    // InternalIotDsl.g:1380:4: enumLiteral_2= 'number'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getNumberEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getNumberEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIotDsl.g:1387:3: (enumLiteral_3= 'date' )
                    {
                    // InternalIotDsl.g:1387:3: (enumLiteral_3= 'date' )
                    // InternalIotDsl.g:1388:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001E8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000232000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000004000B2000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000001FC022000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000001FC020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000001F8020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000001F0020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000001E0020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000001C0020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000180020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000080003A000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800008002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000400080002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000400000002L});

}