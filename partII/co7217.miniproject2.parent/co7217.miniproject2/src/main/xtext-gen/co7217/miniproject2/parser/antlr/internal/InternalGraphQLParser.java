package co7217.miniproject2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co7217.miniproject2.services.GraphQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'query'", "'('", "')'", "'{'", "'}'", "'type'", "':'", "'!'", "'['", "']'", "'scalar'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGraphQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphQLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGraphQL.g"; }



     	private GraphQLGrammarAccess grammarAccess;

        public InternalGraphQLParser(TokenStream input, GraphQLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GraphQL";
       	}

       	@Override
       	protected GraphQLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGraphQL"
    // InternalGraphQL.g:64:1: entryRuleGraphQL returns [EObject current=null] : iv_ruleGraphQL= ruleGraphQL EOF ;
    public final EObject entryRuleGraphQL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphQL = null;


        try {
            // InternalGraphQL.g:64:48: (iv_ruleGraphQL= ruleGraphQL EOF )
            // InternalGraphQL.g:65:2: iv_ruleGraphQL= ruleGraphQL EOF
            {
             newCompositeNode(grammarAccess.getGraphQLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphQL=ruleGraphQL();

            state._fsp--;

             current =iv_ruleGraphQL; 
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
    // $ANTLR end "entryRuleGraphQL"


    // $ANTLR start "ruleGraphQL"
    // InternalGraphQL.g:71:1: ruleGraphQL returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleGraphQL() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalGraphQL.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalGraphQL.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==16||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGraphQL.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalGraphQL.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalGraphQL.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getGraphQLAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getGraphQLRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"co7217.miniproject2.GraphQL.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleGraphQL"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalGraphQL.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalGraphQL.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalGraphQL.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalGraphQL.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_Type_0= ruleType | this_Query_1= ruleQuery ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_Query_1 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:113:2: ( (this_Type_0= ruleType | this_Query_1= ruleQuery ) )
            // InternalGraphQL.g:114:2: (this_Type_0= ruleType | this_Query_1= ruleQuery )
            {
            // InternalGraphQL.g:114:2: (this_Type_0= ruleType | this_Query_1= ruleQuery )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16||LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGraphQL.g:115:3: this_Type_0= ruleType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_0=ruleType();

                    state._fsp--;


                    			current = this_Type_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:124:3: this_Query_1= ruleQuery
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Query_1=ruleQuery();

                    state._fsp--;


                    			current = this_Query_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleQuery"
    // InternalGraphQL.g:136:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalGraphQL.g:136:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalGraphQL.g:137:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalGraphQL.g:143:1: ruleQuery returns [EObject current=null] : (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_queryField_5_0= ruleQueryField ) )+ otherlv_6= '}' ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_queryField_5_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:149:2: ( (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_queryField_5_0= ruleQueryField ) )+ otherlv_6= '}' ) )
            // InternalGraphQL.g:150:2: (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_queryField_5_0= ruleQueryField ) )+ otherlv_6= '}' )
            {
            // InternalGraphQL.g:150:2: (otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_queryField_5_0= ruleQueryField ) )+ otherlv_6= '}' )
            // InternalGraphQL.g:151:3: otherlv_0= 'query' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_queryField_5_0= ruleQueryField ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getQueryKeyword_0());
            		
            // InternalGraphQL.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGraphQL.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGraphQL.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalGraphQL.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getQueryAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalGraphQL.g:185:3: ( (lv_queryField_5_0= ruleQueryField ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGraphQL.g:186:4: (lv_queryField_5_0= ruleQueryField )
            	    {
            	    // InternalGraphQL.g:186:4: (lv_queryField_5_0= ruleQueryField )
            	    // InternalGraphQL.g:187:5: lv_queryField_5_0= ruleQueryField
            	    {

            	    					newCompositeNode(grammarAccess.getQueryAccess().getQueryFieldQueryFieldParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_queryField_5_0=ruleQueryField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"queryField",
            	    						lv_queryField_5_0,
            	    						"co7217.miniproject2.GraphQL.QueryField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleQueryField"
    // InternalGraphQL.g:212:1: entryRuleQueryField returns [EObject current=null] : iv_ruleQueryField= ruleQueryField EOF ;
    public final EObject entryRuleQueryField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryField = null;


        try {
            // InternalGraphQL.g:212:51: (iv_ruleQueryField= ruleQueryField EOF )
            // InternalGraphQL.g:213:2: iv_ruleQueryField= ruleQueryField EOF
            {
             newCompositeNode(grammarAccess.getQueryFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryField=ruleQueryField();

            state._fsp--;

             current =iv_ruleQueryField; 
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
    // $ANTLR end "entryRuleQueryField"


    // $ANTLR start "ruleQueryField"
    // InternalGraphQL.g:219:1: ruleQueryField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_nestedQuery_2_0= ruleQueryField ) )+ otherlv_3= '}' )? ) ;
    public final EObject ruleQueryField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_nestedQuery_2_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:225:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_nestedQuery_2_0= ruleQueryField ) )+ otherlv_3= '}' )? ) )
            // InternalGraphQL.g:226:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_nestedQuery_2_0= ruleQueryField ) )+ otherlv_3= '}' )? )
            {
            // InternalGraphQL.g:226:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_nestedQuery_2_0= ruleQueryField ) )+ otherlv_3= '}' )? )
            // InternalGraphQL.g:227:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_nestedQuery_2_0= ruleQueryField ) )+ otherlv_3= '}' )?
            {
            // InternalGraphQL.g:227:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGraphQL.g:228:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGraphQL.g:228:4: (lv_name_0_0= RULE_ID )
            // InternalGraphQL.g:229:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getQueryFieldAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGraphQL.g:245:3: (otherlv_1= '{' ( (lv_nestedQuery_2_0= ruleQueryField ) )+ otherlv_3= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGraphQL.g:246:4: otherlv_1= '{' ( (lv_nestedQuery_2_0= ruleQueryField ) )+ otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getQueryFieldAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalGraphQL.g:250:4: ( (lv_nestedQuery_2_0= ruleQueryField ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGraphQL.g:251:5: (lv_nestedQuery_2_0= ruleQueryField )
                    	    {
                    	    // InternalGraphQL.g:251:5: (lv_nestedQuery_2_0= ruleQueryField )
                    	    // InternalGraphQL.g:252:6: lv_nestedQuery_2_0= ruleQueryField
                    	    {

                    	    						newCompositeNode(grammarAccess.getQueryFieldAccess().getNestedQueryQueryFieldParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_nestedQuery_2_0=ruleQueryField();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getQueryFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"nestedQuery",
                    	    							lv_nestedQuery_2_0,
                    	    							"co7217.miniproject2.GraphQL.QueryField");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getQueryFieldAccess().getRightCurlyBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleQueryField"


    // $ANTLR start "entryRuleType"
    // InternalGraphQL.g:278:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalGraphQL.g:278:45: (iv_ruleType= ruleType EOF )
            // InternalGraphQL.g:279:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGraphQL.g:285:1: ruleType returns [EObject current=null] : (this_Scalar_0= ruleScalar | this_Typo_1= ruleTypo ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Scalar_0 = null;

        EObject this_Typo_1 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:291:2: ( (this_Scalar_0= ruleScalar | this_Typo_1= ruleTypo ) )
            // InternalGraphQL.g:292:2: (this_Scalar_0= ruleScalar | this_Typo_1= ruleTypo )
            {
            // InternalGraphQL.g:292:2: (this_Scalar_0= ruleScalar | this_Typo_1= ruleTypo )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGraphQL.g:293:3: this_Scalar_0= ruleScalar
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getScalarParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scalar_0=ruleScalar();

                    state._fsp--;


                    			current = this_Scalar_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:302:3: this_Typo_1= ruleTypo
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getTypoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Typo_1=ruleTypo();

                    state._fsp--;


                    			current = this_Typo_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypo"
    // InternalGraphQL.g:314:1: entryRuleTypo returns [EObject current=null] : iv_ruleTypo= ruleTypo EOF ;
    public final EObject entryRuleTypo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypo = null;


        try {
            // InternalGraphQL.g:314:45: (iv_ruleTypo= ruleTypo EOF )
            // InternalGraphQL.g:315:2: iv_ruleTypo= ruleTypo EOF
            {
             newCompositeNode(grammarAccess.getTypoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypo=ruleTypo();

            state._fsp--;

             current =iv_ruleTypo; 
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
    // $ANTLR end "entryRuleTypo"


    // $ANTLR start "ruleTypo"
    // InternalGraphQL.g:321:1: ruleTypo returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}' ) ;
    public final EObject ruleTypo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;



        	enterRule();

        try {
            // InternalGraphQL.g:327:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}' ) )
            // InternalGraphQL.g:328:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}' )
            {
            // InternalGraphQL.g:328:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}' )
            // InternalGraphQL.g:329:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTypoAccess().getTypeKeyword_0());
            		
            // InternalGraphQL.g:333:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGraphQL.g:334:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGraphQL.g:334:4: (lv_name_1_0= RULE_ID )
            // InternalGraphQL.g:335:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTypoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGraphQL.g:355:3: ( (lv_features_3_0= ruleFeature ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGraphQL.g:356:4: (lv_features_3_0= ruleFeature )
            	    {
            	    // InternalGraphQL.g:356:4: (lv_features_3_0= ruleFeature )
            	    // InternalGraphQL.g:357:5: lv_features_3_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getTypoAccess().getFeaturesFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_features_3_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"co7217.miniproject2.GraphQL.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTypoAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTypo"


    // $ANTLR start "entryRuleFeature"
    // InternalGraphQL.g:382:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalGraphQL.g:382:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalGraphQL.g:383:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalGraphQL.g:389:1: ruleFeature returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '!' )? ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '!' )? otherlv_9= ']' (otherlv_10= '!' )? ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalGraphQL.g:395:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '!' )? ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '!' )? otherlv_9= ']' (otherlv_10= '!' )? ) ) )
            // InternalGraphQL.g:396:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '!' )? ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '!' )? otherlv_9= ']' (otherlv_10= '!' )? ) )
            {
            // InternalGraphQL.g:396:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '!' )? ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '!' )? otherlv_9= ']' (otherlv_10= '!' )? ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==17) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==19) ) {
                        alt11=2;
                    }
                    else if ( (LA11_2==RULE_ID) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGraphQL.g:397:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '!' )? )
                    {
                    // InternalGraphQL.g:397:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '!' )? )
                    // InternalGraphQL.g:398:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '!' )?
                    {
                    // InternalGraphQL.g:398:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalGraphQL.g:399:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalGraphQL.g:399:5: (lv_name_0_0= RULE_ID )
                    // InternalGraphQL.g:400:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_0_1());
                    			
                    // InternalGraphQL.g:420:4: ( (otherlv_2= RULE_ID ) )
                    // InternalGraphQL.g:421:5: (otherlv_2= RULE_ID )
                    {
                    // InternalGraphQL.g:421:5: (otherlv_2= RULE_ID )
                    // InternalGraphQL.g:422:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getTypeTypeCrossReference_0_2_0());
                    					

                    }


                    }

                    // InternalGraphQL.g:433:4: (otherlv_3= '!' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==18) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalGraphQL.g:434:5: otherlv_3= '!'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_2); 

                            					newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getExclamationMarkKeyword_0_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:441:3: ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '!' )? otherlv_9= ']' (otherlv_10= '!' )? )
                    {
                    // InternalGraphQL.g:441:3: ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '!' )? otherlv_9= ']' (otherlv_10= '!' )? )
                    // InternalGraphQL.g:442:4: ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '!' )? otherlv_9= ']' (otherlv_10= '!' )?
                    {
                    // InternalGraphQL.g:442:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalGraphQL.g:443:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalGraphQL.g:443:5: (lv_name_4_0= RULE_ID )
                    // InternalGraphQL.g:444:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getColonKeyword_1_1());
                    			
                    otherlv_6=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getFeatureAccess().getLeftSquareBracketKeyword_1_2());
                    			
                    // InternalGraphQL.g:468:4: ( (otherlv_7= RULE_ID ) )
                    // InternalGraphQL.g:469:5: (otherlv_7= RULE_ID )
                    {
                    // InternalGraphQL.g:469:5: (otherlv_7= RULE_ID )
                    // InternalGraphQL.g:470:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_7, grammarAccess.getFeatureAccess().getTypeTypeCrossReference_1_3_0());
                    					

                    }


                    }

                    // InternalGraphQL.g:481:4: (otherlv_8= '!' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==18) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGraphQL.g:482:5: otherlv_8= '!'
                            {
                            otherlv_8=(Token)match(input,18,FOLLOW_14); 

                            					newLeafNode(otherlv_8, grammarAccess.getFeatureAccess().getExclamationMarkKeyword_1_4());
                            				

                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getFeatureAccess().getRightSquareBracketKeyword_1_5());
                    			
                    // InternalGraphQL.g:491:4: (otherlv_10= '!' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==18) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalGraphQL.g:492:5: otherlv_10= '!'
                            {
                            otherlv_10=(Token)match(input,18,FOLLOW_2); 

                            					newLeafNode(otherlv_10, grammarAccess.getFeatureAccess().getExclamationMarkKeyword_1_6());
                            				

                            }
                            break;

                    }


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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleScalar"
    // InternalGraphQL.g:502:1: entryRuleScalar returns [EObject current=null] : iv_ruleScalar= ruleScalar EOF ;
    public final EObject entryRuleScalar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalar = null;


        try {
            // InternalGraphQL.g:502:47: (iv_ruleScalar= ruleScalar EOF )
            // InternalGraphQL.g:503:2: iv_ruleScalar= ruleScalar EOF
            {
             newCompositeNode(grammarAccess.getScalarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalar=ruleScalar();

            state._fsp--;

             current =iv_ruleScalar; 
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
    // $ANTLR end "entryRuleScalar"


    // $ANTLR start "ruleScalar"
    // InternalGraphQL.g:509:1: ruleScalar returns [EObject current=null] : (otherlv_0= 'scalar' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleScalar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGraphQL.g:515:2: ( (otherlv_0= 'scalar' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGraphQL.g:516:2: (otherlv_0= 'scalar' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGraphQL.g:516:2: (otherlv_0= 'scalar' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGraphQL.g:517:3: otherlv_0= 'scalar' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getScalarAccess().getScalarKeyword_0());
            		
            // InternalGraphQL.g:521:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGraphQL.g:522:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGraphQL.g:522:4: (lv_name_1_0= RULE_ID )
            // InternalGraphQL.g:523:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScalarAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScalarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


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
    // $ANTLR end "ruleScalar"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000210802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});

}