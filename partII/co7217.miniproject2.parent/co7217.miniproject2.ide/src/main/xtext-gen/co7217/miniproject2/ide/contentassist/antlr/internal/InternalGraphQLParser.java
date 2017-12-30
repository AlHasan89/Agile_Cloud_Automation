package co7217.miniproject2.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import co7217.miniproject2.services.GraphQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphQLParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(GraphQLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGraphQL"
    // InternalGraphQL.g:53:1: entryRuleGraphQL : ruleGraphQL EOF ;
    public final void entryRuleGraphQL() throws RecognitionException {
        try {
            // InternalGraphQL.g:54:1: ( ruleGraphQL EOF )
            // InternalGraphQL.g:55:1: ruleGraphQL EOF
            {
             before(grammarAccess.getGraphQLRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphQL();

            state._fsp--;

             after(grammarAccess.getGraphQLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphQL"


    // $ANTLR start "ruleGraphQL"
    // InternalGraphQL.g:62:1: ruleGraphQL : ( ( rule__GraphQL__ElementsAssignment )* ) ;
    public final void ruleGraphQL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:66:2: ( ( ( rule__GraphQL__ElementsAssignment )* ) )
            // InternalGraphQL.g:67:2: ( ( rule__GraphQL__ElementsAssignment )* )
            {
            // InternalGraphQL.g:67:2: ( ( rule__GraphQL__ElementsAssignment )* )
            // InternalGraphQL.g:68:3: ( rule__GraphQL__ElementsAssignment )*
            {
             before(grammarAccess.getGraphQLAccess().getElementsAssignment()); 
            // InternalGraphQL.g:69:3: ( rule__GraphQL__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==16||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGraphQL.g:69:4: rule__GraphQL__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__GraphQL__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGraphQLAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphQL"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalGraphQL.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalGraphQL.g:79:1: ( ruleAbstractElement EOF )
            // InternalGraphQL.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalGraphQL.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalGraphQL.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalGraphQL.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalGraphQL.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalGraphQL.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalGraphQL.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleQuery"
    // InternalGraphQL.g:103:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalGraphQL.g:104:1: ( ruleQuery EOF )
            // InternalGraphQL.g:105:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalGraphQL.g:112:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:116:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalGraphQL.g:117:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalGraphQL.g:117:2: ( ( rule__Query__Group__0 ) )
            // InternalGraphQL.g:118:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalGraphQL.g:119:3: ( rule__Query__Group__0 )
            // InternalGraphQL.g:119:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleQueryField"
    // InternalGraphQL.g:128:1: entryRuleQueryField : ruleQueryField EOF ;
    public final void entryRuleQueryField() throws RecognitionException {
        try {
            // InternalGraphQL.g:129:1: ( ruleQueryField EOF )
            // InternalGraphQL.g:130:1: ruleQueryField EOF
            {
             before(grammarAccess.getQueryFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryField();

            state._fsp--;

             after(grammarAccess.getQueryFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueryField"


    // $ANTLR start "ruleQueryField"
    // InternalGraphQL.g:137:1: ruleQueryField : ( ( rule__QueryField__Group__0 ) ) ;
    public final void ruleQueryField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:141:2: ( ( ( rule__QueryField__Group__0 ) ) )
            // InternalGraphQL.g:142:2: ( ( rule__QueryField__Group__0 ) )
            {
            // InternalGraphQL.g:142:2: ( ( rule__QueryField__Group__0 ) )
            // InternalGraphQL.g:143:3: ( rule__QueryField__Group__0 )
            {
             before(grammarAccess.getQueryFieldAccess().getGroup()); 
            // InternalGraphQL.g:144:3: ( rule__QueryField__Group__0 )
            // InternalGraphQL.g:144:4: rule__QueryField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryField"


    // $ANTLR start "entryRuleType"
    // InternalGraphQL.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalGraphQL.g:154:1: ( ruleType EOF )
            // InternalGraphQL.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGraphQL.g:162:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:166:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalGraphQL.g:167:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalGraphQL.g:167:2: ( ( rule__Type__Alternatives ) )
            // InternalGraphQL.g:168:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalGraphQL.g:169:3: ( rule__Type__Alternatives )
            // InternalGraphQL.g:169:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypo"
    // InternalGraphQL.g:178:1: entryRuleTypo : ruleTypo EOF ;
    public final void entryRuleTypo() throws RecognitionException {
        try {
            // InternalGraphQL.g:179:1: ( ruleTypo EOF )
            // InternalGraphQL.g:180:1: ruleTypo EOF
            {
             before(grammarAccess.getTypoRule()); 
            pushFollow(FOLLOW_1);
            ruleTypo();

            state._fsp--;

             after(grammarAccess.getTypoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypo"


    // $ANTLR start "ruleTypo"
    // InternalGraphQL.g:187:1: ruleTypo : ( ( rule__Typo__Group__0 ) ) ;
    public final void ruleTypo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:191:2: ( ( ( rule__Typo__Group__0 ) ) )
            // InternalGraphQL.g:192:2: ( ( rule__Typo__Group__0 ) )
            {
            // InternalGraphQL.g:192:2: ( ( rule__Typo__Group__0 ) )
            // InternalGraphQL.g:193:3: ( rule__Typo__Group__0 )
            {
             before(grammarAccess.getTypoAccess().getGroup()); 
            // InternalGraphQL.g:194:3: ( rule__Typo__Group__0 )
            // InternalGraphQL.g:194:4: rule__Typo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Typo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypo"


    // $ANTLR start "entryRuleFeature"
    // InternalGraphQL.g:203:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalGraphQL.g:204:1: ( ruleFeature EOF )
            // InternalGraphQL.g:205:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalGraphQL.g:212:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:216:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalGraphQL.g:217:2: ( ( rule__Feature__Alternatives ) )
            {
            // InternalGraphQL.g:217:2: ( ( rule__Feature__Alternatives ) )
            // InternalGraphQL.g:218:3: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // InternalGraphQL.g:219:3: ( rule__Feature__Alternatives )
            // InternalGraphQL.g:219:4: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleScalar"
    // InternalGraphQL.g:228:1: entryRuleScalar : ruleScalar EOF ;
    public final void entryRuleScalar() throws RecognitionException {
        try {
            // InternalGraphQL.g:229:1: ( ruleScalar EOF )
            // InternalGraphQL.g:230:1: ruleScalar EOF
            {
             before(grammarAccess.getScalarRule()); 
            pushFollow(FOLLOW_1);
            ruleScalar();

            state._fsp--;

             after(grammarAccess.getScalarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScalar"


    // $ANTLR start "ruleScalar"
    // InternalGraphQL.g:237:1: ruleScalar : ( ( rule__Scalar__Group__0 ) ) ;
    public final void ruleScalar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:241:2: ( ( ( rule__Scalar__Group__0 ) ) )
            // InternalGraphQL.g:242:2: ( ( rule__Scalar__Group__0 ) )
            {
            // InternalGraphQL.g:242:2: ( ( rule__Scalar__Group__0 ) )
            // InternalGraphQL.g:243:3: ( rule__Scalar__Group__0 )
            {
             before(grammarAccess.getScalarAccess().getGroup()); 
            // InternalGraphQL.g:244:3: ( rule__Scalar__Group__0 )
            // InternalGraphQL.g:244:4: rule__Scalar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scalar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScalarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScalar"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalGraphQL.g:252:1: rule__AbstractElement__Alternatives : ( ( ruleType ) | ( ruleQuery ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:256:1: ( ( ruleType ) | ( ruleQuery ) )
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
                    // InternalGraphQL.g:257:2: ( ruleType )
                    {
                    // InternalGraphQL.g:257:2: ( ruleType )
                    // InternalGraphQL.g:258:3: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:263:2: ( ruleQuery )
                    {
                    // InternalGraphQL.g:263:2: ( ruleQuery )
                    // InternalGraphQL.g:264:3: ruleQuery
                    {
                     before(grammarAccess.getAbstractElementAccess().getQueryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuery();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getQueryParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalGraphQL.g:273:1: rule__Type__Alternatives : ( ( ruleScalar ) | ( ruleTypo ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:277:1: ( ( ruleScalar ) | ( ruleTypo ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGraphQL.g:278:2: ( ruleScalar )
                    {
                    // InternalGraphQL.g:278:2: ( ruleScalar )
                    // InternalGraphQL.g:279:3: ruleScalar
                    {
                     before(grammarAccess.getTypeAccess().getScalarParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleScalar();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getScalarParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:284:2: ( ruleTypo )
                    {
                    // InternalGraphQL.g:284:2: ( ruleTypo )
                    // InternalGraphQL.g:285:3: ruleTypo
                    {
                     before(grammarAccess.getTypeAccess().getTypoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTypo();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTypoParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Feature__Alternatives"
    // InternalGraphQL.g:294:1: rule__Feature__Alternatives : ( ( ( rule__Feature__Group_0__0 ) ) | ( ( rule__Feature__Group_1__0 ) ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:298:1: ( ( ( rule__Feature__Group_0__0 ) ) | ( ( rule__Feature__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==17) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==19) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==RULE_ID) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraphQL.g:299:2: ( ( rule__Feature__Group_0__0 ) )
                    {
                    // InternalGraphQL.g:299:2: ( ( rule__Feature__Group_0__0 ) )
                    // InternalGraphQL.g:300:3: ( rule__Feature__Group_0__0 )
                    {
                     before(grammarAccess.getFeatureAccess().getGroup_0()); 
                    // InternalGraphQL.g:301:3: ( rule__Feature__Group_0__0 )
                    // InternalGraphQL.g:301:4: rule__Feature__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGraphQL.g:305:2: ( ( rule__Feature__Group_1__0 ) )
                    {
                    // InternalGraphQL.g:305:2: ( ( rule__Feature__Group_1__0 ) )
                    // InternalGraphQL.g:306:3: ( rule__Feature__Group_1__0 )
                    {
                     before(grammarAccess.getFeatureAccess().getGroup_1()); 
                    // InternalGraphQL.g:307:3: ( rule__Feature__Group_1__0 )
                    // InternalGraphQL.g:307:4: rule__Feature__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__Query__Group__0"
    // InternalGraphQL.g:315:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:319:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalGraphQL.g:320:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalGraphQL.g:327:1: rule__Query__Group__0__Impl : ( 'query' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:331:1: ( ( 'query' ) )
            // InternalGraphQL.g:332:1: ( 'query' )
            {
            // InternalGraphQL.g:332:1: ( 'query' )
            // InternalGraphQL.g:333:2: 'query'
            {
             before(grammarAccess.getQueryAccess().getQueryKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getQueryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalGraphQL.g:342:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:346:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalGraphQL.g:347:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalGraphQL.g:354:1: rule__Query__Group__1__Impl : ( ( rule__Query__NameAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:358:1: ( ( ( rule__Query__NameAssignment_1 ) ) )
            // InternalGraphQL.g:359:1: ( ( rule__Query__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:359:1: ( ( rule__Query__NameAssignment_1 ) )
            // InternalGraphQL.g:360:2: ( rule__Query__NameAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:361:2: ( rule__Query__NameAssignment_1 )
            // InternalGraphQL.g:361:3: rule__Query__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Query__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // InternalGraphQL.g:369:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:373:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalGraphQL.g:374:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Query__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // InternalGraphQL.g:381:1: rule__Query__Group__2__Impl : ( '(' ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:385:1: ( ( '(' ) )
            // InternalGraphQL.g:386:1: ( '(' )
            {
            // InternalGraphQL.g:386:1: ( '(' )
            // InternalGraphQL.g:387:2: '('
            {
             before(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // InternalGraphQL.g:396:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:400:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // InternalGraphQL.g:401:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Query__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3"


    // $ANTLR start "rule__Query__Group__3__Impl"
    // InternalGraphQL.g:408:1: rule__Query__Group__3__Impl : ( ')' ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:412:1: ( ( ')' ) )
            // InternalGraphQL.g:413:1: ( ')' )
            {
            // InternalGraphQL.g:413:1: ( ')' )
            // InternalGraphQL.g:414:2: ')'
            {
             before(grammarAccess.getQueryAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group__4"
    // InternalGraphQL.g:423:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:427:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // InternalGraphQL.g:428:2: rule__Query__Group__4__Impl rule__Query__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Query__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4"


    // $ANTLR start "rule__Query__Group__4__Impl"
    // InternalGraphQL.g:435:1: rule__Query__Group__4__Impl : ( '{' ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:439:1: ( ( '{' ) )
            // InternalGraphQL.g:440:1: ( '{' )
            {
            // InternalGraphQL.g:440:1: ( '{' )
            // InternalGraphQL.g:441:2: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__5"
    // InternalGraphQL.g:450:1: rule__Query__Group__5 : rule__Query__Group__5__Impl rule__Query__Group__6 ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:454:1: ( rule__Query__Group__5__Impl rule__Query__Group__6 )
            // InternalGraphQL.g:455:2: rule__Query__Group__5__Impl rule__Query__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Query__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5"


    // $ANTLR start "rule__Query__Group__5__Impl"
    // InternalGraphQL.g:462:1: rule__Query__Group__5__Impl : ( ( ( rule__Query__QueryFieldAssignment_5 ) ) ( ( rule__Query__QueryFieldAssignment_5 )* ) ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:466:1: ( ( ( ( rule__Query__QueryFieldAssignment_5 ) ) ( ( rule__Query__QueryFieldAssignment_5 )* ) ) )
            // InternalGraphQL.g:467:1: ( ( ( rule__Query__QueryFieldAssignment_5 ) ) ( ( rule__Query__QueryFieldAssignment_5 )* ) )
            {
            // InternalGraphQL.g:467:1: ( ( ( rule__Query__QueryFieldAssignment_5 ) ) ( ( rule__Query__QueryFieldAssignment_5 )* ) )
            // InternalGraphQL.g:468:2: ( ( rule__Query__QueryFieldAssignment_5 ) ) ( ( rule__Query__QueryFieldAssignment_5 )* )
            {
            // InternalGraphQL.g:468:2: ( ( rule__Query__QueryFieldAssignment_5 ) )
            // InternalGraphQL.g:469:3: ( rule__Query__QueryFieldAssignment_5 )
            {
             before(grammarAccess.getQueryAccess().getQueryFieldAssignment_5()); 
            // InternalGraphQL.g:470:3: ( rule__Query__QueryFieldAssignment_5 )
            // InternalGraphQL.g:470:4: rule__Query__QueryFieldAssignment_5
            {
            pushFollow(FOLLOW_9);
            rule__Query__QueryFieldAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getQueryFieldAssignment_5()); 

            }

            // InternalGraphQL.g:473:2: ( ( rule__Query__QueryFieldAssignment_5 )* )
            // InternalGraphQL.g:474:3: ( rule__Query__QueryFieldAssignment_5 )*
            {
             before(grammarAccess.getQueryAccess().getQueryFieldAssignment_5()); 
            // InternalGraphQL.g:475:3: ( rule__Query__QueryFieldAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGraphQL.g:475:4: rule__Query__QueryFieldAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Query__QueryFieldAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getQueryFieldAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5__Impl"


    // $ANTLR start "rule__Query__Group__6"
    // InternalGraphQL.g:484:1: rule__Query__Group__6 : rule__Query__Group__6__Impl ;
    public final void rule__Query__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:488:1: ( rule__Query__Group__6__Impl )
            // InternalGraphQL.g:489:2: rule__Query__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__6"


    // $ANTLR start "rule__Query__Group__6__Impl"
    // InternalGraphQL.g:495:1: rule__Query__Group__6__Impl : ( '}' ) ;
    public final void rule__Query__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:499:1: ( ( '}' ) )
            // InternalGraphQL.g:500:1: ( '}' )
            {
            // InternalGraphQL.g:500:1: ( '}' )
            // InternalGraphQL.g:501:2: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__6__Impl"


    // $ANTLR start "rule__QueryField__Group__0"
    // InternalGraphQL.g:511:1: rule__QueryField__Group__0 : rule__QueryField__Group__0__Impl rule__QueryField__Group__1 ;
    public final void rule__QueryField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:515:1: ( rule__QueryField__Group__0__Impl rule__QueryField__Group__1 )
            // InternalGraphQL.g:516:2: rule__QueryField__Group__0__Impl rule__QueryField__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QueryField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryField__Group__0"


    // $ANTLR start "rule__QueryField__Group__0__Impl"
    // InternalGraphQL.g:523:1: rule__QueryField__Group__0__Impl : ( ( rule__QueryField__NameAssignment_0 ) ) ;
    public final void rule__QueryField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:527:1: ( ( ( rule__QueryField__NameAssignment_0 ) ) )
            // InternalGraphQL.g:528:1: ( ( rule__QueryField__NameAssignment_0 ) )
            {
            // InternalGraphQL.g:528:1: ( ( rule__QueryField__NameAssignment_0 ) )
            // InternalGraphQL.g:529:2: ( rule__QueryField__NameAssignment_0 )
            {
             before(grammarAccess.getQueryFieldAccess().getNameAssignment_0()); 
            // InternalGraphQL.g:530:2: ( rule__QueryField__NameAssignment_0 )
            // InternalGraphQL.g:530:3: rule__QueryField__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QueryField__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryField__Group__0__Impl"


    // $ANTLR start "rule__QueryField__Group__1"
    // InternalGraphQL.g:538:1: rule__QueryField__Group__1 : rule__QueryField__Group__1__Impl ;
    public final void rule__QueryField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:542:1: ( rule__QueryField__Group__1__Impl )
            // InternalGraphQL.g:543:2: rule__QueryField__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryField__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryField__Group__1"


    // $ANTLR start "rule__QueryField__Group__1__Impl"
    // InternalGraphQL.g:549:1: rule__QueryField__Group__1__Impl : ( ( rule__QueryField__Group_1__0 )? ) ;
    public final void rule__QueryField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:553:1: ( ( ( rule__QueryField__Group_1__0 )? ) )
            // InternalGraphQL.g:554:1: ( ( rule__QueryField__Group_1__0 )? )
            {
            // InternalGraphQL.g:554:1: ( ( rule__QueryField__Group_1__0 )? )
            // InternalGraphQL.g:555:2: ( rule__QueryField__Group_1__0 )?
            {
             before(grammarAccess.getQueryFieldAccess().getGroup_1()); 
            // InternalGraphQL.g:556:2: ( rule__QueryField__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGraphQL.g:556:3: rule__QueryField__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QueryField__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryFieldAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryField__Group__1__Impl"


    // $ANTLR start "rule__QueryField__Group_1__0"
    // InternalGraphQL.g:565:1: rule__QueryField__Group_1__0 : rule__QueryField__Group_1__0__Impl rule__QueryField__Group_1__1 ;
    public final void rule__QueryField__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:569:1: ( rule__QueryField__Group_1__0__Impl rule__QueryField__Group_1__1 )
            // InternalGraphQL.g:570:2: rule__QueryField__Group_1__0__Impl rule__QueryField__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QueryField__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryField__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryField__Group_1__0"


    // $ANTLR start "rule__QueryField__Group_1__0__Impl"
    // InternalGraphQL.g:577:1: rule__QueryField__Group_1__0__Impl : ( '{' ) ;
    public final void rule__QueryField__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:581:1: ( ( '{' ) )
            // InternalGraphQL.g:582:1: ( '{' )
            {
            // InternalGraphQL.g:582:1: ( '{' )
            // InternalGraphQL.g:583:2: '{'
            {
             before(grammarAccess.getQueryFieldAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQueryFieldAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryField__Group_1__0__Impl"


    // $ANTLR start "rule__QueryField__Group_1__1"
    // InternalGraphQL.g:592:1: rule__QueryField__Group_1__1 : rule__QueryField__Group_1__1__Impl rule__QueryField__Group_1__2 ;
    public final void rule__QueryField__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:596:1: ( rule__QueryField__Group_1__1__Impl rule__QueryField__Group_1__2 )
            // InternalGraphQL.g:597:2: rule__QueryField__Group_1__1__Impl rule__QueryField__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__QueryField__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryField__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryField__Group_1__1"


    // $ANTLR start "rule__QueryField__Group_1__1__Impl"
    // InternalGraphQL.g:604:1: rule__QueryField__Group_1__1__Impl : ( ( ( rule__QueryField__NestedQueryAssignment_1_1 ) ) ( ( rule__QueryField__NestedQueryAssignment_1_1 )* ) ) ;
    public final void rule__QueryField__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:608:1: ( ( ( ( rule__QueryField__NestedQueryAssignment_1_1 ) ) ( ( rule__QueryField__NestedQueryAssignment_1_1 )* ) ) )
            // InternalGraphQL.g:609:1: ( ( ( rule__QueryField__NestedQueryAssignment_1_1 ) ) ( ( rule__QueryField__NestedQueryAssignment_1_1 )* ) )
            {
            // InternalGraphQL.g:609:1: ( ( ( rule__QueryField__NestedQueryAssignment_1_1 ) ) ( ( rule__QueryField__NestedQueryAssignment_1_1 )* ) )
            // InternalGraphQL.g:610:2: ( ( rule__QueryField__NestedQueryAssignment_1_1 ) ) ( ( rule__QueryField__NestedQueryAssignment_1_1 )* )
            {
            // InternalGraphQL.g:610:2: ( ( rule__QueryField__NestedQueryAssignment_1_1 ) )
            // InternalGraphQL.g:611:3: ( rule__QueryField__NestedQueryAssignment_1_1 )
            {
             before(grammarAccess.getQueryFieldAccess().getNestedQueryAssignment_1_1()); 
            // InternalGraphQL.g:612:3: ( rule__QueryField__NestedQueryAssignment_1_1 )
            // InternalGraphQL.g:612:4: rule__QueryField__NestedQueryAssignment_1_1
            {
            pushFollow(FOLLOW_9);
            rule__QueryField__NestedQueryAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryFieldAccess().getNestedQueryAssignment_1_1()); 

            }

            // InternalGraphQL.g:615:2: ( ( rule__QueryField__NestedQueryAssignment_1_1 )* )
            // InternalGraphQL.g:616:3: ( rule__QueryField__NestedQueryAssignment_1_1 )*
            {
             before(grammarAccess.getQueryFieldAccess().getNestedQueryAssignment_1_1()); 
            // InternalGraphQL.g:617:3: ( rule__QueryField__NestedQueryAssignment_1_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGraphQL.g:617:4: rule__QueryField__NestedQueryAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QueryField__NestedQueryAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getQueryFieldAccess().getNestedQueryAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryField__Group_1__1__Impl"


    // $ANTLR start "rule__QueryField__Group_1__2"
    // InternalGraphQL.g:626:1: rule__QueryField__Group_1__2 : rule__QueryField__Group_1__2__Impl ;
    public final void rule__QueryField__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:630:1: ( rule__QueryField__Group_1__2__Impl )
            // InternalGraphQL.g:631:2: rule__QueryField__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryField__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryField__Group_1__2"


    // $ANTLR start "rule__QueryField__Group_1__2__Impl"
    // InternalGraphQL.g:637:1: rule__QueryField__Group_1__2__Impl : ( '}' ) ;
    public final void rule__QueryField__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:641:1: ( ( '}' ) )
            // InternalGraphQL.g:642:1: ( '}' )
            {
            // InternalGraphQL.g:642:1: ( '}' )
            // InternalGraphQL.g:643:2: '}'
            {
             before(grammarAccess.getQueryFieldAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQueryFieldAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryField__Group_1__2__Impl"


    // $ANTLR start "rule__Typo__Group__0"
    // InternalGraphQL.g:653:1: rule__Typo__Group__0 : rule__Typo__Group__0__Impl rule__Typo__Group__1 ;
    public final void rule__Typo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:657:1: ( rule__Typo__Group__0__Impl rule__Typo__Group__1 )
            // InternalGraphQL.g:658:2: rule__Typo__Group__0__Impl rule__Typo__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Typo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Typo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typo__Group__0"


    // $ANTLR start "rule__Typo__Group__0__Impl"
    // InternalGraphQL.g:665:1: rule__Typo__Group__0__Impl : ( 'type' ) ;
    public final void rule__Typo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:669:1: ( ( 'type' ) )
            // InternalGraphQL.g:670:1: ( 'type' )
            {
            // InternalGraphQL.g:670:1: ( 'type' )
            // InternalGraphQL.g:671:2: 'type'
            {
             before(grammarAccess.getTypoAccess().getTypeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypoAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typo__Group__0__Impl"


    // $ANTLR start "rule__Typo__Group__1"
    // InternalGraphQL.g:680:1: rule__Typo__Group__1 : rule__Typo__Group__1__Impl rule__Typo__Group__2 ;
    public final void rule__Typo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:684:1: ( rule__Typo__Group__1__Impl rule__Typo__Group__2 )
            // InternalGraphQL.g:685:2: rule__Typo__Group__1__Impl rule__Typo__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Typo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Typo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typo__Group__1"


    // $ANTLR start "rule__Typo__Group__1__Impl"
    // InternalGraphQL.g:692:1: rule__Typo__Group__1__Impl : ( ( rule__Typo__NameAssignment_1 ) ) ;
    public final void rule__Typo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:696:1: ( ( ( rule__Typo__NameAssignment_1 ) ) )
            // InternalGraphQL.g:697:1: ( ( rule__Typo__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:697:1: ( ( rule__Typo__NameAssignment_1 ) )
            // InternalGraphQL.g:698:2: ( rule__Typo__NameAssignment_1 )
            {
             before(grammarAccess.getTypoAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:699:2: ( rule__Typo__NameAssignment_1 )
            // InternalGraphQL.g:699:3: rule__Typo__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Typo__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typo__Group__1__Impl"


    // $ANTLR start "rule__Typo__Group__2"
    // InternalGraphQL.g:707:1: rule__Typo__Group__2 : rule__Typo__Group__2__Impl rule__Typo__Group__3 ;
    public final void rule__Typo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:711:1: ( rule__Typo__Group__2__Impl rule__Typo__Group__3 )
            // InternalGraphQL.g:712:2: rule__Typo__Group__2__Impl rule__Typo__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Typo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Typo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typo__Group__2"


    // $ANTLR start "rule__Typo__Group__2__Impl"
    // InternalGraphQL.g:719:1: rule__Typo__Group__2__Impl : ( '{' ) ;
    public final void rule__Typo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:723:1: ( ( '{' ) )
            // InternalGraphQL.g:724:1: ( '{' )
            {
            // InternalGraphQL.g:724:1: ( '{' )
            // InternalGraphQL.g:725:2: '{'
            {
             before(grammarAccess.getTypoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTypoAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typo__Group__2__Impl"


    // $ANTLR start "rule__Typo__Group__3"
    // InternalGraphQL.g:734:1: rule__Typo__Group__3 : rule__Typo__Group__3__Impl rule__Typo__Group__4 ;
    public final void rule__Typo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:738:1: ( rule__Typo__Group__3__Impl rule__Typo__Group__4 )
            // InternalGraphQL.g:739:2: rule__Typo__Group__3__Impl rule__Typo__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Typo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Typo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typo__Group__3"


    // $ANTLR start "rule__Typo__Group__3__Impl"
    // InternalGraphQL.g:746:1: rule__Typo__Group__3__Impl : ( ( ( rule__Typo__FeaturesAssignment_3 ) ) ( ( rule__Typo__FeaturesAssignment_3 )* ) ) ;
    public final void rule__Typo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:750:1: ( ( ( ( rule__Typo__FeaturesAssignment_3 ) ) ( ( rule__Typo__FeaturesAssignment_3 )* ) ) )
            // InternalGraphQL.g:751:1: ( ( ( rule__Typo__FeaturesAssignment_3 ) ) ( ( rule__Typo__FeaturesAssignment_3 )* ) )
            {
            // InternalGraphQL.g:751:1: ( ( ( rule__Typo__FeaturesAssignment_3 ) ) ( ( rule__Typo__FeaturesAssignment_3 )* ) )
            // InternalGraphQL.g:752:2: ( ( rule__Typo__FeaturesAssignment_3 ) ) ( ( rule__Typo__FeaturesAssignment_3 )* )
            {
            // InternalGraphQL.g:752:2: ( ( rule__Typo__FeaturesAssignment_3 ) )
            // InternalGraphQL.g:753:3: ( rule__Typo__FeaturesAssignment_3 )
            {
             before(grammarAccess.getTypoAccess().getFeaturesAssignment_3()); 
            // InternalGraphQL.g:754:3: ( rule__Typo__FeaturesAssignment_3 )
            // InternalGraphQL.g:754:4: rule__Typo__FeaturesAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Typo__FeaturesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypoAccess().getFeaturesAssignment_3()); 

            }

            // InternalGraphQL.g:757:2: ( ( rule__Typo__FeaturesAssignment_3 )* )
            // InternalGraphQL.g:758:3: ( rule__Typo__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getTypoAccess().getFeaturesAssignment_3()); 
            // InternalGraphQL.g:759:3: ( rule__Typo__FeaturesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGraphQL.g:759:4: rule__Typo__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Typo__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTypoAccess().getFeaturesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typo__Group__3__Impl"


    // $ANTLR start "rule__Typo__Group__4"
    // InternalGraphQL.g:768:1: rule__Typo__Group__4 : rule__Typo__Group__4__Impl ;
    public final void rule__Typo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:772:1: ( rule__Typo__Group__4__Impl )
            // InternalGraphQL.g:773:2: rule__Typo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Typo__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typo__Group__4"


    // $ANTLR start "rule__Typo__Group__4__Impl"
    // InternalGraphQL.g:779:1: rule__Typo__Group__4__Impl : ( '}' ) ;
    public final void rule__Typo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:783:1: ( ( '}' ) )
            // InternalGraphQL.g:784:1: ( '}' )
            {
            // InternalGraphQL.g:784:1: ( '}' )
            // InternalGraphQL.g:785:2: '}'
            {
             before(grammarAccess.getTypoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypoAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typo__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group_0__0"
    // InternalGraphQL.g:795:1: rule__Feature__Group_0__0 : rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 ;
    public final void rule__Feature__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:799:1: ( rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 )
            // InternalGraphQL.g:800:2: rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Feature__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__0"


    // $ANTLR start "rule__Feature__Group_0__0__Impl"
    // InternalGraphQL.g:807:1: rule__Feature__Group_0__0__Impl : ( ( rule__Feature__NameAssignment_0_0 ) ) ;
    public final void rule__Feature__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:811:1: ( ( ( rule__Feature__NameAssignment_0_0 ) ) )
            // InternalGraphQL.g:812:1: ( ( rule__Feature__NameAssignment_0_0 ) )
            {
            // InternalGraphQL.g:812:1: ( ( rule__Feature__NameAssignment_0_0 ) )
            // InternalGraphQL.g:813:2: ( rule__Feature__NameAssignment_0_0 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_0_0()); 
            // InternalGraphQL.g:814:2: ( rule__Feature__NameAssignment_0_0 )
            // InternalGraphQL.g:814:3: rule__Feature__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__0__Impl"


    // $ANTLR start "rule__Feature__Group_0__1"
    // InternalGraphQL.g:822:1: rule__Feature__Group_0__1 : rule__Feature__Group_0__1__Impl rule__Feature__Group_0__2 ;
    public final void rule__Feature__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:826:1: ( rule__Feature__Group_0__1__Impl rule__Feature__Group_0__2 )
            // InternalGraphQL.g:827:2: rule__Feature__Group_0__1__Impl rule__Feature__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__Feature__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__1"


    // $ANTLR start "rule__Feature__Group_0__1__Impl"
    // InternalGraphQL.g:834:1: rule__Feature__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Feature__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:838:1: ( ( ':' ) )
            // InternalGraphQL.g:839:1: ( ':' )
            {
            // InternalGraphQL.g:839:1: ( ':' )
            // InternalGraphQL.g:840:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__1__Impl"


    // $ANTLR start "rule__Feature__Group_0__2"
    // InternalGraphQL.g:849:1: rule__Feature__Group_0__2 : rule__Feature__Group_0__2__Impl rule__Feature__Group_0__3 ;
    public final void rule__Feature__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:853:1: ( rule__Feature__Group_0__2__Impl rule__Feature__Group_0__3 )
            // InternalGraphQL.g:854:2: rule__Feature__Group_0__2__Impl rule__Feature__Group_0__3
            {
            pushFollow(FOLLOW_11);
            rule__Feature__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__2"


    // $ANTLR start "rule__Feature__Group_0__2__Impl"
    // InternalGraphQL.g:861:1: rule__Feature__Group_0__2__Impl : ( ( rule__Feature__TypeAssignment_0_2 ) ) ;
    public final void rule__Feature__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:865:1: ( ( ( rule__Feature__TypeAssignment_0_2 ) ) )
            // InternalGraphQL.g:866:1: ( ( rule__Feature__TypeAssignment_0_2 ) )
            {
            // InternalGraphQL.g:866:1: ( ( rule__Feature__TypeAssignment_0_2 ) )
            // InternalGraphQL.g:867:2: ( rule__Feature__TypeAssignment_0_2 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_0_2()); 
            // InternalGraphQL.g:868:2: ( rule__Feature__TypeAssignment_0_2 )
            // InternalGraphQL.g:868:3: rule__Feature__TypeAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TypeAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__2__Impl"


    // $ANTLR start "rule__Feature__Group_0__3"
    // InternalGraphQL.g:876:1: rule__Feature__Group_0__3 : rule__Feature__Group_0__3__Impl ;
    public final void rule__Feature__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:880:1: ( rule__Feature__Group_0__3__Impl )
            // InternalGraphQL.g:881:2: rule__Feature__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__3"


    // $ANTLR start "rule__Feature__Group_0__3__Impl"
    // InternalGraphQL.g:887:1: rule__Feature__Group_0__3__Impl : ( ( '!' )? ) ;
    public final void rule__Feature__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:891:1: ( ( ( '!' )? ) )
            // InternalGraphQL.g:892:1: ( ( '!' )? )
            {
            // InternalGraphQL.g:892:1: ( ( '!' )? )
            // InternalGraphQL.g:893:2: ( '!' )?
            {
             before(grammarAccess.getFeatureAccess().getExclamationMarkKeyword_0_3()); 
            // InternalGraphQL.g:894:2: ( '!' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGraphQL.g:894:3: '!'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getExclamationMarkKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__3__Impl"


    // $ANTLR start "rule__Feature__Group_1__0"
    // InternalGraphQL.g:903:1: rule__Feature__Group_1__0 : rule__Feature__Group_1__0__Impl rule__Feature__Group_1__1 ;
    public final void rule__Feature__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:907:1: ( rule__Feature__Group_1__0__Impl rule__Feature__Group_1__1 )
            // InternalGraphQL.g:908:2: rule__Feature__Group_1__0__Impl rule__Feature__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Feature__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__0"


    // $ANTLR start "rule__Feature__Group_1__0__Impl"
    // InternalGraphQL.g:915:1: rule__Feature__Group_1__0__Impl : ( ( rule__Feature__NameAssignment_1_0 ) ) ;
    public final void rule__Feature__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:919:1: ( ( ( rule__Feature__NameAssignment_1_0 ) ) )
            // InternalGraphQL.g:920:1: ( ( rule__Feature__NameAssignment_1_0 ) )
            {
            // InternalGraphQL.g:920:1: ( ( rule__Feature__NameAssignment_1_0 ) )
            // InternalGraphQL.g:921:2: ( rule__Feature__NameAssignment_1_0 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1_0()); 
            // InternalGraphQL.g:922:2: ( rule__Feature__NameAssignment_1_0 )
            // InternalGraphQL.g:922:3: rule__Feature__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__0__Impl"


    // $ANTLR start "rule__Feature__Group_1__1"
    // InternalGraphQL.g:930:1: rule__Feature__Group_1__1 : rule__Feature__Group_1__1__Impl rule__Feature__Group_1__2 ;
    public final void rule__Feature__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:934:1: ( rule__Feature__Group_1__1__Impl rule__Feature__Group_1__2 )
            // InternalGraphQL.g:935:2: rule__Feature__Group_1__1__Impl rule__Feature__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Feature__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__1"


    // $ANTLR start "rule__Feature__Group_1__1__Impl"
    // InternalGraphQL.g:942:1: rule__Feature__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Feature__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:946:1: ( ( ':' ) )
            // InternalGraphQL.g:947:1: ( ':' )
            {
            // InternalGraphQL.g:947:1: ( ':' )
            // InternalGraphQL.g:948:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__1__Impl"


    // $ANTLR start "rule__Feature__Group_1__2"
    // InternalGraphQL.g:957:1: rule__Feature__Group_1__2 : rule__Feature__Group_1__2__Impl rule__Feature__Group_1__3 ;
    public final void rule__Feature__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:961:1: ( rule__Feature__Group_1__2__Impl rule__Feature__Group_1__3 )
            // InternalGraphQL.g:962:2: rule__Feature__Group_1__2__Impl rule__Feature__Group_1__3
            {
            pushFollow(FOLLOW_4);
            rule__Feature__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__2"


    // $ANTLR start "rule__Feature__Group_1__2__Impl"
    // InternalGraphQL.g:969:1: rule__Feature__Group_1__2__Impl : ( '[' ) ;
    public final void rule__Feature__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:973:1: ( ( '[' ) )
            // InternalGraphQL.g:974:1: ( '[' )
            {
            // InternalGraphQL.g:974:1: ( '[' )
            // InternalGraphQL.g:975:2: '['
            {
             before(grammarAccess.getFeatureAccess().getLeftSquareBracketKeyword_1_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getLeftSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__2__Impl"


    // $ANTLR start "rule__Feature__Group_1__3"
    // InternalGraphQL.g:984:1: rule__Feature__Group_1__3 : rule__Feature__Group_1__3__Impl rule__Feature__Group_1__4 ;
    public final void rule__Feature__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:988:1: ( rule__Feature__Group_1__3__Impl rule__Feature__Group_1__4 )
            // InternalGraphQL.g:989:2: rule__Feature__Group_1__3__Impl rule__Feature__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__Feature__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__3"


    // $ANTLR start "rule__Feature__Group_1__3__Impl"
    // InternalGraphQL.g:996:1: rule__Feature__Group_1__3__Impl : ( ( rule__Feature__TypeAssignment_1_3 ) ) ;
    public final void rule__Feature__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1000:1: ( ( ( rule__Feature__TypeAssignment_1_3 ) ) )
            // InternalGraphQL.g:1001:1: ( ( rule__Feature__TypeAssignment_1_3 ) )
            {
            // InternalGraphQL.g:1001:1: ( ( rule__Feature__TypeAssignment_1_3 ) )
            // InternalGraphQL.g:1002:2: ( rule__Feature__TypeAssignment_1_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_1_3()); 
            // InternalGraphQL.g:1003:2: ( rule__Feature__TypeAssignment_1_3 )
            // InternalGraphQL.g:1003:3: rule__Feature__TypeAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TypeAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__3__Impl"


    // $ANTLR start "rule__Feature__Group_1__4"
    // InternalGraphQL.g:1011:1: rule__Feature__Group_1__4 : rule__Feature__Group_1__4__Impl rule__Feature__Group_1__5 ;
    public final void rule__Feature__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1015:1: ( rule__Feature__Group_1__4__Impl rule__Feature__Group_1__5 )
            // InternalGraphQL.g:1016:2: rule__Feature__Group_1__4__Impl rule__Feature__Group_1__5
            {
            pushFollow(FOLLOW_13);
            rule__Feature__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__4"


    // $ANTLR start "rule__Feature__Group_1__4__Impl"
    // InternalGraphQL.g:1023:1: rule__Feature__Group_1__4__Impl : ( ( '!' )? ) ;
    public final void rule__Feature__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1027:1: ( ( ( '!' )? ) )
            // InternalGraphQL.g:1028:1: ( ( '!' )? )
            {
            // InternalGraphQL.g:1028:1: ( ( '!' )? )
            // InternalGraphQL.g:1029:2: ( '!' )?
            {
             before(grammarAccess.getFeatureAccess().getExclamationMarkKeyword_1_4()); 
            // InternalGraphQL.g:1030:2: ( '!' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphQL.g:1030:3: '!'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getExclamationMarkKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__4__Impl"


    // $ANTLR start "rule__Feature__Group_1__5"
    // InternalGraphQL.g:1038:1: rule__Feature__Group_1__5 : rule__Feature__Group_1__5__Impl rule__Feature__Group_1__6 ;
    public final void rule__Feature__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1042:1: ( rule__Feature__Group_1__5__Impl rule__Feature__Group_1__6 )
            // InternalGraphQL.g:1043:2: rule__Feature__Group_1__5__Impl rule__Feature__Group_1__6
            {
            pushFollow(FOLLOW_11);
            rule__Feature__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__5"


    // $ANTLR start "rule__Feature__Group_1__5__Impl"
    // InternalGraphQL.g:1050:1: rule__Feature__Group_1__5__Impl : ( ']' ) ;
    public final void rule__Feature__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1054:1: ( ( ']' ) )
            // InternalGraphQL.g:1055:1: ( ']' )
            {
            // InternalGraphQL.g:1055:1: ( ']' )
            // InternalGraphQL.g:1056:2: ']'
            {
             before(grammarAccess.getFeatureAccess().getRightSquareBracketKeyword_1_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getRightSquareBracketKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__5__Impl"


    // $ANTLR start "rule__Feature__Group_1__6"
    // InternalGraphQL.g:1065:1: rule__Feature__Group_1__6 : rule__Feature__Group_1__6__Impl ;
    public final void rule__Feature__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1069:1: ( rule__Feature__Group_1__6__Impl )
            // InternalGraphQL.g:1070:2: rule__Feature__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__6"


    // $ANTLR start "rule__Feature__Group_1__6__Impl"
    // InternalGraphQL.g:1076:1: rule__Feature__Group_1__6__Impl : ( ( '!' )? ) ;
    public final void rule__Feature__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1080:1: ( ( ( '!' )? ) )
            // InternalGraphQL.g:1081:1: ( ( '!' )? )
            {
            // InternalGraphQL.g:1081:1: ( ( '!' )? )
            // InternalGraphQL.g:1082:2: ( '!' )?
            {
             before(grammarAccess.getFeatureAccess().getExclamationMarkKeyword_1_6()); 
            // InternalGraphQL.g:1083:2: ( '!' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGraphQL.g:1083:3: '!'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getExclamationMarkKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__6__Impl"


    // $ANTLR start "rule__Scalar__Group__0"
    // InternalGraphQL.g:1092:1: rule__Scalar__Group__0 : rule__Scalar__Group__0__Impl rule__Scalar__Group__1 ;
    public final void rule__Scalar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1096:1: ( rule__Scalar__Group__0__Impl rule__Scalar__Group__1 )
            // InternalGraphQL.g:1097:2: rule__Scalar__Group__0__Impl rule__Scalar__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Scalar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scalar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scalar__Group__0"


    // $ANTLR start "rule__Scalar__Group__0__Impl"
    // InternalGraphQL.g:1104:1: rule__Scalar__Group__0__Impl : ( 'scalar' ) ;
    public final void rule__Scalar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1108:1: ( ( 'scalar' ) )
            // InternalGraphQL.g:1109:1: ( 'scalar' )
            {
            // InternalGraphQL.g:1109:1: ( 'scalar' )
            // InternalGraphQL.g:1110:2: 'scalar'
            {
             before(grammarAccess.getScalarAccess().getScalarKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScalarAccess().getScalarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scalar__Group__0__Impl"


    // $ANTLR start "rule__Scalar__Group__1"
    // InternalGraphQL.g:1119:1: rule__Scalar__Group__1 : rule__Scalar__Group__1__Impl ;
    public final void rule__Scalar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1123:1: ( rule__Scalar__Group__1__Impl )
            // InternalGraphQL.g:1124:2: rule__Scalar__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scalar__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scalar__Group__1"


    // $ANTLR start "rule__Scalar__Group__1__Impl"
    // InternalGraphQL.g:1130:1: rule__Scalar__Group__1__Impl : ( ( rule__Scalar__NameAssignment_1 ) ) ;
    public final void rule__Scalar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1134:1: ( ( ( rule__Scalar__NameAssignment_1 ) ) )
            // InternalGraphQL.g:1135:1: ( ( rule__Scalar__NameAssignment_1 ) )
            {
            // InternalGraphQL.g:1135:1: ( ( rule__Scalar__NameAssignment_1 ) )
            // InternalGraphQL.g:1136:2: ( rule__Scalar__NameAssignment_1 )
            {
             before(grammarAccess.getScalarAccess().getNameAssignment_1()); 
            // InternalGraphQL.g:1137:2: ( rule__Scalar__NameAssignment_1 )
            // InternalGraphQL.g:1137:3: rule__Scalar__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Scalar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScalarAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scalar__Group__1__Impl"


    // $ANTLR start "rule__GraphQL__ElementsAssignment"
    // InternalGraphQL.g:1146:1: rule__GraphQL__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__GraphQL__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1150:1: ( ( ruleAbstractElement ) )
            // InternalGraphQL.g:1151:2: ( ruleAbstractElement )
            {
            // InternalGraphQL.g:1151:2: ( ruleAbstractElement )
            // InternalGraphQL.g:1152:3: ruleAbstractElement
            {
             before(grammarAccess.getGraphQLAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getGraphQLAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphQL__ElementsAssignment"


    // $ANTLR start "rule__Query__NameAssignment_1"
    // InternalGraphQL.g:1161:1: rule__Query__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1165:1: ( ( RULE_ID ) )
            // InternalGraphQL.g:1166:2: ( RULE_ID )
            {
            // InternalGraphQL.g:1166:2: ( RULE_ID )
            // InternalGraphQL.g:1167:3: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__NameAssignment_1"


    // $ANTLR start "rule__Query__QueryFieldAssignment_5"
    // InternalGraphQL.g:1176:1: rule__Query__QueryFieldAssignment_5 : ( ruleQueryField ) ;
    public final void rule__Query__QueryFieldAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1180:1: ( ( ruleQueryField ) )
            // InternalGraphQL.g:1181:2: ( ruleQueryField )
            {
            // InternalGraphQL.g:1181:2: ( ruleQueryField )
            // InternalGraphQL.g:1182:3: ruleQueryField
            {
             before(grammarAccess.getQueryAccess().getQueryFieldQueryFieldParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryField();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getQueryFieldQueryFieldParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__QueryFieldAssignment_5"


    // $ANTLR start "rule__QueryField__NameAssignment_0"
    // InternalGraphQL.g:1191:1: rule__QueryField__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__QueryField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1195:1: ( ( RULE_ID ) )
            // InternalGraphQL.g:1196:2: ( RULE_ID )
            {
            // InternalGraphQL.g:1196:2: ( RULE_ID )
            // InternalGraphQL.g:1197:3: RULE_ID
            {
             before(grammarAccess.getQueryFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryField__NameAssignment_0"


    // $ANTLR start "rule__QueryField__NestedQueryAssignment_1_1"
    // InternalGraphQL.g:1206:1: rule__QueryField__NestedQueryAssignment_1_1 : ( ruleQueryField ) ;
    public final void rule__QueryField__NestedQueryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1210:1: ( ( ruleQueryField ) )
            // InternalGraphQL.g:1211:2: ( ruleQueryField )
            {
            // InternalGraphQL.g:1211:2: ( ruleQueryField )
            // InternalGraphQL.g:1212:3: ruleQueryField
            {
             before(grammarAccess.getQueryFieldAccess().getNestedQueryQueryFieldParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryField();

            state._fsp--;

             after(grammarAccess.getQueryFieldAccess().getNestedQueryQueryFieldParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryField__NestedQueryAssignment_1_1"


    // $ANTLR start "rule__Typo__NameAssignment_1"
    // InternalGraphQL.g:1221:1: rule__Typo__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Typo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1225:1: ( ( RULE_ID ) )
            // InternalGraphQL.g:1226:2: ( RULE_ID )
            {
            // InternalGraphQL.g:1226:2: ( RULE_ID )
            // InternalGraphQL.g:1227:3: RULE_ID
            {
             before(grammarAccess.getTypoAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypoAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typo__NameAssignment_1"


    // $ANTLR start "rule__Typo__FeaturesAssignment_3"
    // InternalGraphQL.g:1236:1: rule__Typo__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Typo__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1240:1: ( ( ruleFeature ) )
            // InternalGraphQL.g:1241:2: ( ruleFeature )
            {
            // InternalGraphQL.g:1241:2: ( ruleFeature )
            // InternalGraphQL.g:1242:3: ruleFeature
            {
             before(grammarAccess.getTypoAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getTypoAccess().getFeaturesFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typo__FeaturesAssignment_3"


    // $ANTLR start "rule__Feature__NameAssignment_0_0"
    // InternalGraphQL.g:1251:1: rule__Feature__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1255:1: ( ( RULE_ID ) )
            // InternalGraphQL.g:1256:2: ( RULE_ID )
            {
            // InternalGraphQL.g:1256:2: ( RULE_ID )
            // InternalGraphQL.g:1257:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_0_0"


    // $ANTLR start "rule__Feature__TypeAssignment_0_2"
    // InternalGraphQL.g:1266:1: rule__Feature__TypeAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1270:1: ( ( ( RULE_ID ) ) )
            // InternalGraphQL.g:1271:2: ( ( RULE_ID ) )
            {
            // InternalGraphQL.g:1271:2: ( ( RULE_ID ) )
            // InternalGraphQL.g:1272:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_0_2_0()); 
            // InternalGraphQL.g:1273:3: ( RULE_ID )
            // InternalGraphQL.g:1274:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_0_2"


    // $ANTLR start "rule__Feature__NameAssignment_1_0"
    // InternalGraphQL.g:1285:1: rule__Feature__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1289:1: ( ( RULE_ID ) )
            // InternalGraphQL.g:1290:2: ( RULE_ID )
            {
            // InternalGraphQL.g:1290:2: ( RULE_ID )
            // InternalGraphQL.g:1291:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_1_0"


    // $ANTLR start "rule__Feature__TypeAssignment_1_3"
    // InternalGraphQL.g:1300:1: rule__Feature__TypeAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1304:1: ( ( ( RULE_ID ) ) )
            // InternalGraphQL.g:1305:2: ( ( RULE_ID ) )
            {
            // InternalGraphQL.g:1305:2: ( ( RULE_ID ) )
            // InternalGraphQL.g:1306:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_1_3_0()); 
            // InternalGraphQL.g:1307:3: ( RULE_ID )
            // InternalGraphQL.g:1308:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_1_3"


    // $ANTLR start "rule__Scalar__NameAssignment_1"
    // InternalGraphQL.g:1319:1: rule__Scalar__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scalar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGraphQL.g:1323:1: ( ( RULE_ID ) )
            // InternalGraphQL.g:1324:2: ( RULE_ID )
            {
            // InternalGraphQL.g:1324:2: ( RULE_ID )
            // InternalGraphQL.g:1325:3: RULE_ID
            {
             before(grammarAccess.getScalarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScalarAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scalar__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000210802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000140000L});

}