// $ANTLR 3.4 CPPGrammar.g 2022-04-30 18:22:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class CPPGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHA_NUMERIC", "ARGUMENT", "ARGUMENT_LIST", "BASE_CLASSES", "CALLEE", "CALL_TEMPLATE_LIST", "CLASS_CONTENT", "CLASS_DEF", "CLASS_NAME", "COMMENT", "CONDITION", "CPPCOMMENT", "CTOR_EXPR", "CTOR_INITIALIZER", "CTOR_LIST", "DESTINATION", "DIGITS", "DOT", "FOR_EXPR", "FOR_INIT", "FUNCTION_CALL", "FUNCTION_DEF", "FUNCTION_NAME", "INCLUDE_DIRECTIVE", "INITIALIZER_ID", "INIT_DECL_LIST", "INIT_DECL_NAME", "ITERATION", "JUMP_STATEMENT", "KEYWORD", "LABEL", "NAMESPACE_DEF", "OTHER", "PARAMETER_DECL", "PARAMETER_LIST", "PARAMETER_NAME", "PARAMETER_TYPE", "PREPROC", "Q_MARK", "RETURN_TYPE", "SELECTION", "SIMPLE_DECL", "SIZEOF", "SOURCE_FILE", "STATEMENTS", "STRING", "SW", "SWITCH", "TEMPLATE_DECL_SPECIFIER", "TYPE_DEF", "TYPE_SPECIFIER", "USING_DIRECTIVE", "WHITESPACE", "'!'", "'!='", "'\"'", "'#include'", "'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'->'", "'->*'", "'/'", "'/='", "':'", "'::'", "';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'>>='", "'['", "']'", "'^'", "'^='", "'auto'", "'break'", "'case'", "'catch'", "'class'", "'const'", "'continue'", "'delete'", "'do'", "'else'", "'enum'", "'explicit'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'namespace'", "'new'", "'operator'", "'private'", "'protected'", "'public'", "'register'", "'return'", "'signed'", "'static'", "'struct'", "'switch'", "'template'", "'throw'", "'try'", "'typedef'", "'union'", "'unsigned'", "'using'", "'virtual'", "'volatile'", "'while'", "'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__136=136;
    public static final int T__137=137;
    public static final int T__138=138;
    public static final int T__139=139;
    public static final int T__140=140;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int ALPHA_NUMERIC=4;
    public static final int ARGUMENT=5;
    public static final int ARGUMENT_LIST=6;
    public static final int BASE_CLASSES=7;
    public static final int CALLEE=8;
    public static final int CALL_TEMPLATE_LIST=9;
    public static final int CLASS_CONTENT=10;
    public static final int CLASS_DEF=11;
    public static final int CLASS_NAME=12;
    public static final int COMMENT=13;
    public static final int CONDITION=14;
    public static final int CPPCOMMENT=15;
    public static final int CTOR_EXPR=16;
    public static final int CTOR_INITIALIZER=17;
    public static final int CTOR_LIST=18;
    public static final int DESTINATION=19;
    public static final int DIGITS=20;
    public static final int DOT=21;
    public static final int FOR_EXPR=22;
    public static final int FOR_INIT=23;
    public static final int FUNCTION_CALL=24;
    public static final int FUNCTION_DEF=25;
    public static final int FUNCTION_NAME=26;
    public static final int INCLUDE_DIRECTIVE=27;
    public static final int INITIALIZER_ID=28;
    public static final int INIT_DECL_LIST=29;
    public static final int INIT_DECL_NAME=30;
    public static final int ITERATION=31;
    public static final int JUMP_STATEMENT=32;
    public static final int KEYWORD=33;
    public static final int LABEL=34;
    public static final int NAMESPACE_DEF=35;
    public static final int OTHER=36;
    public static final int PARAMETER_DECL=37;
    public static final int PARAMETER_LIST=38;
    public static final int PARAMETER_NAME=39;
    public static final int PARAMETER_TYPE=40;
    public static final int PREPROC=41;
    public static final int Q_MARK=42;
    public static final int RETURN_TYPE=43;
    public static final int SELECTION=44;
    public static final int SIMPLE_DECL=45;
    public static final int SIZEOF=46;
    public static final int SOURCE_FILE=47;
    public static final int STATEMENTS=48;
    public static final int STRING=49;
    public static final int SW=50;
    public static final int SWITCH=51;
    public static final int TEMPLATE_DECL_SPECIFIER=52;
    public static final int TYPE_DEF=53;
    public static final int TYPE_SPECIFIER=54;
    public static final int USING_DIRECTIVE=55;
    public static final int WHITESPACE=56;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public CPPGrammarParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CPPGrammarParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return CPPGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "CPPGrammar.g"; }


    public static class code_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "code"
    // CPPGrammar.g:49:1: code : ( part )* -> ^( SOURCE_FILE ( part )* ) ;
    public final CPPGrammarParser.code_return code() throws RecognitionException {
        CPPGrammarParser.code_return retval = new CPPGrammarParser.code_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.part_return part1 =null;


        RewriteRuleSubtreeStream stream_part=new RewriteRuleSubtreeStream(adaptor,"rule part");
        try {
            // CPPGrammar.g:49:7: ( ( part )* -> ^( SOURCE_FILE ( part )* ) )
            // CPPGrammar.g:49:9: ( part )*
            {
            // CPPGrammar.g:49:9: ( part )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ALPHA_NUMERIC && LA1_0 <= NAMESPACE_DEF)||(LA1_0 >= PARAMETER_DECL && LA1_0 <= 142)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // CPPGrammar.g:49:9: part
            	    {
            	    pushFollow(FOLLOW_part_in_code218);
            	    part1=part();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_part.add(part1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: part
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 49:15: -> ^( SOURCE_FILE ( part )* )
            {
                // CPPGrammar.g:49:18: ^( SOURCE_FILE ( part )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SOURCE_FILE, "SOURCE_FILE")
                , root_1);

                // CPPGrammar.g:49:32: ( part )*
                while ( stream_part.hasNext() ) {
                    adaptor.addChild(root_1, stream_part.nextTree());

                }
                stream_part.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "code"


    public static class part_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "part"
    // CPPGrammar.g:51:1: part : ( ( declaration )=> declaration | water !);
    public final CPPGrammarParser.part_return part() throws RecognitionException {
        CPPGrammarParser.part_return retval = new CPPGrammarParser.part_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.declaration_return declaration2 =null;

        CPPGrammarParser.water_return water3 =null;



        try {
            // CPPGrammar.g:51:5: ( ( declaration )=> declaration | water !)
            int alt2=2;
            switch ( input.LA(1) ) {
            case 130:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case 127:
                {
                int LA2_2 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case 103:
            case 135:
                {
                int LA2_3 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }
                }
                break;
            case 102:
            case 108:
            case 125:
            case 131:
                {
                int LA2_4 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;

                }
                }
                break;
            case 123:
            case 132:
                {
                int LA2_5 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA2_6 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 6, input);

                    throw nvae;

                }
                }
                break;
            case 109:
            case 111:
            case 114:
            case 124:
            case 134:
                {
                int LA2_7 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 7, input);

                    throw nvae;

                }
                }
                break;
            case 64:
            case 68:
                {
                int LA2_8 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 8, input);

                    throw nvae;

                }
                }
                break;
            case 66:
                {
                int LA2_9 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 9, input);

                    throw nvae;

                }
                }
                break;
            case 117:
                {
                int LA2_10 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 10, input);

                    throw nvae;

                }
                }
                break;
            case 115:
                {
                int LA2_11 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 11, input);

                    throw nvae;

                }
                }
                break;
            case 133:
                {
                int LA2_12 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 12, input);

                    throw nvae;

                }
                }
                break;
            case 60:
                {
                int LA2_13 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 13, input);

                    throw nvae;

                }
                }
                break;
            case ARGUMENT:
            case ARGUMENT_LIST:
            case BASE_CLASSES:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COMMENT:
            case CONDITION:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case DESTINATION:
            case DIGITS:
            case DOT:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case INCLUDE_DIRECTIVE:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case INIT_DECL_NAME:
            case ITERATION:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case NAMESPACE_DEF:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case PARAMETER_NAME:
            case PARAMETER_TYPE:
            case PREPROC:
            case Q_MARK:
            case RETURN_TYPE:
            case SELECTION:
            case SIMPLE_DECL:
            case SIZEOF:
            case SOURCE_FILE:
            case STATEMENTS:
            case STRING:
            case SW:
            case SWITCH:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE_DEF:
            case TYPE_SPECIFIER:
            case USING_DIRECTIVE:
            case WHITESPACE:
            case 57:
            case 58:
            case 59:
            case 61:
            case 62:
            case 63:
            case 65:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 104:
            case 105:
            case 106:
            case 107:
            case 110:
            case 112:
            case 113:
            case 116:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 126:
            case 128:
            case 129:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
                {
                alt2=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // CPPGrammar.g:51:7: ( declaration )=> declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_part240);
                    declaration2=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration2.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:52:8: water !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_water_in_part249);
                    water3=water();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "part"


    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // CPPGrammar.g:55:1: declaration : ( ( simple_decl )=> simple_decl | function_def | namespace_def | using_directive | include_directive );
    public final CPPGrammarParser.declaration_return declaration() throws RecognitionException {
        CPPGrammarParser.declaration_return retval = new CPPGrammarParser.declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.simple_decl_return simple_decl4 =null;

        CPPGrammarParser.function_def_return function_def5 =null;

        CPPGrammarParser.namespace_def_return namespace_def6 =null;

        CPPGrammarParser.using_directive_return using_directive7 =null;

        CPPGrammarParser.include_directive_return include_directive8 =null;



        try {
            // CPPGrammar.g:55:12: ( ( simple_decl )=> simple_decl | function_def | namespace_def | using_directive | include_directive )
            int alt3=5;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==130) && (synpred2_CPPGrammar())) {
                alt3=1;
            }
            else if ( (LA3_0==127) ) {
                int LA3_2 = input.LA(2);

                if ( (synpred2_CPPGrammar()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==103||LA3_0==135) ) {
                int LA3_3 = input.LA(2);

                if ( (synpred2_CPPGrammar()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==102||LA3_0==108||LA3_0==125||LA3_0==131) ) {
                int LA3_4 = input.LA(2);

                if ( (synpred2_CPPGrammar()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==123||LA3_0==132) ) {
                int LA3_5 = input.LA(2);

                if ( (synpred2_CPPGrammar()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==ALPHA_NUMERIC) ) {
                int LA3_6 = input.LA(2);

                if ( (synpred2_CPPGrammar()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 6, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==64||LA3_0==66||LA3_0==68||LA3_0==109||LA3_0==111||LA3_0==114||LA3_0==117||LA3_0==124||LA3_0==134) ) {
                alt3=2;
            }
            else if ( (LA3_0==115) ) {
                alt3=3;
            }
            else if ( (LA3_0==133) ) {
                alt3=4;
            }
            else if ( (LA3_0==60) ) {
                alt3=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // CPPGrammar.g:55:14: ( simple_decl )=> simple_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simple_decl_in_declaration269);
                    simple_decl4=simple_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_decl4.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:56:7: function_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_def_in_declaration277);
                    function_def5=function_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_def5.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:57:7: namespace_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_namespace_def_in_declaration285);
                    namespace_def6=namespace_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_def6.getTree());

                    }
                    break;
                case 4 :
                    // CPPGrammar.g:58:7: using_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_using_directive_in_declaration293);
                    using_directive7=using_directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, using_directive7.getTree());

                    }
                    break;
                case 5 :
                    // CPPGrammar.g:59:7: include_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_include_directive_in_declaration301);
                    include_directive8=include_directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, include_directive8.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class using_directive__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "using_directive_"
    // CPPGrammar.g:62:1: using_directive_ : 'using' 'namespace' identifier ';' ;
    public final CPPGrammarParser.using_directive__return using_directive_() throws RecognitionException {
        CPPGrammarParser.using_directive__return retval = new CPPGrammarParser.using_directive__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal9=null;
        Token string_literal10=null;
        Token char_literal12=null;
        CPPGrammarParser.identifier_return identifier11 =null;


        CommonTree string_literal9_tree=null;
        CommonTree string_literal10_tree=null;
        CommonTree char_literal12_tree=null;

        try {
            // CPPGrammar.g:62:17: ( 'using' 'namespace' identifier ';' )
            // CPPGrammar.g:62:19: 'using' 'namespace' identifier ';'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal9=(Token)match(input,133,FOLLOW_133_in_using_directive_311); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal9_tree = 
            (CommonTree)adaptor.create(string_literal9)
            ;
            adaptor.addChild(root_0, string_literal9_tree);
            }

            string_literal10=(Token)match(input,115,FOLLOW_115_in_using_directive_313); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal10_tree = 
            (CommonTree)adaptor.create(string_literal10)
            ;
            adaptor.addChild(root_0, string_literal10_tree);
            }

            pushFollow(FOLLOW_identifier_in_using_directive_315);
            identifier11=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier11.getTree());

            char_literal12=(Token)match(input,83,FOLLOW_83_in_using_directive_317); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal12_tree = 
            (CommonTree)adaptor.create(char_literal12)
            ;
            adaptor.addChild(root_0, char_literal12_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "using_directive_"


    public static class include_directive__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "include_directive_"
    // CPPGrammar.g:63:1: include_directive_ : '#include' ( '\"' ( ALPHA_NUMERIC | '.' )+ '\"' | '<' ( ALPHA_NUMERIC | '.' )+ '>' ) ;
    public final CPPGrammarParser.include_directive__return include_directive_() throws RecognitionException {
        CPPGrammarParser.include_directive__return retval = new CPPGrammarParser.include_directive__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal13=null;
        Token char_literal14=null;
        Token set15=null;
        Token char_literal16=null;
        Token char_literal17=null;
        Token set18=null;
        Token char_literal19=null;

        CommonTree string_literal13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree set15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree set18_tree=null;
        CommonTree char_literal19_tree=null;

        try {
            // CPPGrammar.g:63:19: ( '#include' ( '\"' ( ALPHA_NUMERIC | '.' )+ '\"' | '<' ( ALPHA_NUMERIC | '.' )+ '>' ) )
            // CPPGrammar.g:63:21: '#include' ( '\"' ( ALPHA_NUMERIC | '.' )+ '\"' | '<' ( ALPHA_NUMERIC | '.' )+ '>' )
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal13=(Token)match(input,60,FOLLOW_60_in_include_directive_323); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal13_tree = 
            (CommonTree)adaptor.create(string_literal13)
            ;
            adaptor.addChild(root_0, string_literal13_tree);
            }

            // CPPGrammar.g:63:32: ( '\"' ( ALPHA_NUMERIC | '.' )+ '\"' | '<' ( ALPHA_NUMERIC | '.' )+ '>' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==59) ) {
                alt6=1;
            }
            else if ( (LA6_0==84) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // CPPGrammar.g:63:33: '\"' ( ALPHA_NUMERIC | '.' )+ '\"'
                    {
                    char_literal14=(Token)match(input,59,FOLLOW_59_in_include_directive_326); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal14_tree = 
                    (CommonTree)adaptor.create(char_literal14)
                    ;
                    adaptor.addChild(root_0, char_literal14_tree);
                    }

                    // CPPGrammar.g:63:37: ( ALPHA_NUMERIC | '.' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==ALPHA_NUMERIC||LA4_0==DOT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // CPPGrammar.g:
                    	    {
                    	    set15=(Token)input.LT(1);

                    	    if ( input.LA(1)==ALPHA_NUMERIC||input.LA(1)==DOT ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                    	        (CommonTree)adaptor.create(set15)
                    	        );
                    	        state.errorRecovery=false;
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    char_literal16=(Token)match(input,59,FOLLOW_59_in_include_directive_338); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal16_tree = 
                    (CommonTree)adaptor.create(char_literal16)
                    ;
                    adaptor.addChild(root_0, char_literal16_tree);
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:63:67: '<' ( ALPHA_NUMERIC | '.' )+ '>'
                    {
                    char_literal17=(Token)match(input,84,FOLLOW_84_in_include_directive_342); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal17_tree = 
                    (CommonTree)adaptor.create(char_literal17)
                    ;
                    adaptor.addChild(root_0, char_literal17_tree);
                    }

                    // CPPGrammar.g:63:71: ( ALPHA_NUMERIC | '.' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==ALPHA_NUMERIC||LA5_0==DOT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // CPPGrammar.g:
                    	    {
                    	    set18=(Token)input.LT(1);

                    	    if ( input.LA(1)==ALPHA_NUMERIC||input.LA(1)==DOT ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                    	        (CommonTree)adaptor.create(set18)
                    	        );
                    	        state.errorRecovery=false;
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    char_literal19=(Token)match(input,90,FOLLOW_90_in_include_directive_353); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal19_tree = 
                    (CommonTree)adaptor.create(char_literal19)
                    ;
                    adaptor.addChild(root_0, char_literal19_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "include_directive_"


    public static class simple_decl__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_decl_"
    // CPPGrammar.g:67:1: simple_decl_ : (t= 'typedef' )? ( template_declaration_start )? ( type_specifier init_declarator_list | class_def ( init_declarator_list )? ) c= ';' -> ^( TYPE_DEF ( $t)? ) ^( TEMPLATE_DECL_SPECIFIER ( template_declaration_start )? ) ^( TYPE_SPECIFIER ( type_specifier )? ) ^( CLASS_DEF ( class_def )? ) ^( INIT_DECL_LIST ( init_declarator_list )? ) $c;
    public final CPPGrammarParser.simple_decl__return simple_decl_() throws RecognitionException {
        CPPGrammarParser.simple_decl__return retval = new CPPGrammarParser.simple_decl__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token t=null;
        Token c=null;
        CPPGrammarParser.template_declaration_start_return template_declaration_start20 =null;

        CPPGrammarParser.type_specifier_return type_specifier21 =null;

        CPPGrammarParser.init_declarator_list_return init_declarator_list22 =null;

        CPPGrammarParser.class_def_return class_def23 =null;

        CPPGrammarParser.init_declarator_list_return init_declarator_list24 =null;


        CommonTree t_tree=null;
        CommonTree c_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
        RewriteRuleSubtreeStream stream_template_declaration_start=new RewriteRuleSubtreeStream(adaptor,"rule template_declaration_start");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        RewriteRuleSubtreeStream stream_class_def=new RewriteRuleSubtreeStream(adaptor,"rule class_def");
        try {
            // CPPGrammar.g:67:13: ( (t= 'typedef' )? ( template_declaration_start )? ( type_specifier init_declarator_list | class_def ( init_declarator_list )? ) c= ';' -> ^( TYPE_DEF ( $t)? ) ^( TEMPLATE_DECL_SPECIFIER ( template_declaration_start )? ) ^( TYPE_SPECIFIER ( type_specifier )? ) ^( CLASS_DEF ( class_def )? ) ^( INIT_DECL_LIST ( init_declarator_list )? ) $c)
            // CPPGrammar.g:67:16: (t= 'typedef' )? ( template_declaration_start )? ( type_specifier init_declarator_list | class_def ( init_declarator_list )? ) c= ';'
            {
            // CPPGrammar.g:67:17: (t= 'typedef' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==130) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // CPPGrammar.g:67:17: t= 'typedef'
                    {
                    t=(Token)match(input,130,FOLLOW_130_in_simple_decl_366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_130.add(t);


                    }
                    break;

            }


            // CPPGrammar.g:67:29: ( template_declaration_start )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==127) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // CPPGrammar.g:67:29: template_declaration_start
                    {
                    pushFollow(FOLLOW_template_declaration_start_in_simple_decl_369);
                    template_declaration_start20=template_declaration_start();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_template_declaration_start.add(template_declaration_start20.getTree());

                    }
                    break;

            }


            // CPPGrammar.g:68:16: ( type_specifier init_declarator_list | class_def ( init_declarator_list )? )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // CPPGrammar.g:68:19: type_specifier init_declarator_list
                    {
                    pushFollow(FOLLOW_type_specifier_in_simple_decl_390);
                    type_specifier21=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier21.getTree());

                    pushFollow(FOLLOW_init_declarator_list_in_simple_decl_392);
                    init_declarator_list22=init_declarator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list22.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:68:57: class_def ( init_declarator_list )?
                    {
                    pushFollow(FOLLOW_class_def_in_simple_decl_396);
                    class_def23=class_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_class_def.add(class_def23.getTree());

                    // CPPGrammar.g:68:67: ( init_declarator_list )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ALPHA_NUMERIC||LA9_0==64||LA9_0==68) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // CPPGrammar.g:68:67: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_simple_decl_398);
                            init_declarator_list24=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list24.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            c=(Token)match(input,83,FOLLOW_83_in_simple_decl_406); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(c);


            // AST REWRITE
            // elements: type_specifier, c, template_declaration_start, class_def, t, init_declarator_list
            // token labels: c, t
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
            RewriteRuleTokenStream stream_t=new RewriteRuleTokenStream(adaptor,"token t",t);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 69:17: -> ^( TYPE_DEF ( $t)? ) ^( TEMPLATE_DECL_SPECIFIER ( template_declaration_start )? ) ^( TYPE_SPECIFIER ( type_specifier )? ) ^( CLASS_DEF ( class_def )? ) ^( INIT_DECL_LIST ( init_declarator_list )? ) $c
            {
                // CPPGrammar.g:69:20: ^( TYPE_DEF ( $t)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TYPE_DEF, "TYPE_DEF")
                , root_1);

                // CPPGrammar.g:69:32: ( $t)?
                if ( stream_t.hasNext() ) {
                    adaptor.addChild(root_1, stream_t.nextNode());

                }
                stream_t.reset();

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:69:36: ^( TEMPLATE_DECL_SPECIFIER ( template_declaration_start )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TEMPLATE_DECL_SPECIFIER, "TEMPLATE_DECL_SPECIFIER")
                , root_1);

                // CPPGrammar.g:69:62: ( template_declaration_start )?
                if ( stream_template_declaration_start.hasNext() ) {
                    adaptor.addChild(root_1, stream_template_declaration_start.nextTree());

                }
                stream_template_declaration_start.reset();

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:70:21: ^( TYPE_SPECIFIER ( type_specifier )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TYPE_SPECIFIER, "TYPE_SPECIFIER")
                , root_1);

                // CPPGrammar.g:70:39: ( type_specifier )?
                if ( stream_type_specifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_type_specifier.nextTree());

                }
                stream_type_specifier.reset();

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:70:57: ^( CLASS_DEF ( class_def )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CLASS_DEF, "CLASS_DEF")
                , root_1);

                // CPPGrammar.g:70:69: ( class_def )?
                if ( stream_class_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_def.nextTree());

                }
                stream_class_def.reset();

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:71:21: ^( INIT_DECL_LIST ( init_declarator_list )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INIT_DECL_LIST, "INIT_DECL_LIST")
                , root_1);

                // CPPGrammar.g:71:38: ( init_declarator_list )?
                if ( stream_init_declarator_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_init_declarator_list.nextTree());

                }
                stream_init_declarator_list.reset();

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_c.nextNode());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple_decl_"


    public static class template_declaration_start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template_declaration_start"
    // CPPGrammar.g:73:1: template_declaration_start : 'template' '<' template_param_list '>' ;
    public final CPPGrammarParser.template_declaration_start_return template_declaration_start() throws RecognitionException {
        CPPGrammarParser.template_declaration_start_return retval = new CPPGrammarParser.template_declaration_start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal25=null;
        Token char_literal26=null;
        Token char_literal28=null;
        CPPGrammarParser.template_param_list_return template_param_list27 =null;


        CommonTree string_literal25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal28_tree=null;

        try {
            // CPPGrammar.g:73:27: ( 'template' '<' template_param_list '>' )
            // CPPGrammar.g:73:29: 'template' '<' template_param_list '>'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal25=(Token)match(input,127,FOLLOW_127_in_template_declaration_start513); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal25_tree = 
            (CommonTree)adaptor.create(string_literal25)
            ;
            adaptor.addChild(root_0, string_literal25_tree);
            }

            char_literal26=(Token)match(input,84,FOLLOW_84_in_template_declaration_start515); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal26_tree = 
            (CommonTree)adaptor.create(char_literal26)
            ;
            adaptor.addChild(root_0, char_literal26_tree);
            }

            pushFollow(FOLLOW_template_param_list_in_template_declaration_start517);
            template_param_list27=template_param_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list27.getTree());

            char_literal28=(Token)match(input,90,FOLLOW_90_in_template_declaration_start519); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal28_tree = 
            (CommonTree)adaptor.create(char_literal28)
            ;
            adaptor.addChild(root_0, char_literal28_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template_declaration_start"


    public static class class_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_def"
    // CPPGrammar.g:75:1: class_def : class_key class_name base_classes '{' class_content '}' ;
    public final CPPGrammarParser.class_def_return class_def() throws RecognitionException {
        CPPGrammarParser.class_def_return retval = new CPPGrammarParser.class_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal32=null;
        Token char_literal34=null;
        CPPGrammarParser.class_key_return class_key29 =null;

        CPPGrammarParser.class_name_return class_name30 =null;

        CPPGrammarParser.base_classes_return base_classes31 =null;

        CPPGrammarParser.class_content_return class_content33 =null;


        CommonTree char_literal32_tree=null;
        CommonTree char_literal34_tree=null;

        try {
            // CPPGrammar.g:75:10: ( class_key class_name base_classes '{' class_content '}' )
            // CPPGrammar.g:75:12: class_key class_name base_classes '{' class_content '}'
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_class_key_in_class_def527);
            class_key29=class_key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, class_key29.getTree());

            pushFollow(FOLLOW_class_name_in_class_def529);
            class_name30=class_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, class_name30.getTree());

            pushFollow(FOLLOW_base_classes_in_class_def531);
            base_classes31=base_classes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, base_classes31.getTree());

            char_literal32=(Token)match(input,137,FOLLOW_137_in_class_def533); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal32_tree = 
            (CommonTree)adaptor.create(char_literal32)
            ;
            adaptor.addChild(root_0, char_literal32_tree);
            }

            pushFollow(FOLLOW_class_content_in_class_def535);
            class_content33=class_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, class_content33.getTree());

            char_literal34=(Token)match(input,141,FOLLOW_141_in_class_def537); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal34_tree = 
            (CommonTree)adaptor.create(char_literal34)
            ;
            adaptor.addChild(root_0, char_literal34_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_def"


    public static class class_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_name"
    // CPPGrammar.g:76:1: class_name : ( identifier )? -> ^( CLASS_NAME ( identifier )? ) ;
    public final CPPGrammarParser.class_name_return class_name() throws RecognitionException {
        CPPGrammarParser.class_name_return retval = new CPPGrammarParser.class_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.identifier_return identifier35 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // CPPGrammar.g:76:11: ( ( identifier )? -> ^( CLASS_NAME ( identifier )? ) )
            // CPPGrammar.g:76:13: ( identifier )?
            {
            // CPPGrammar.g:76:13: ( identifier )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ALPHA_NUMERIC) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // CPPGrammar.g:76:13: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_class_name543);
                    identifier35=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier35.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 76:25: -> ^( CLASS_NAME ( identifier )? )
            {
                // CPPGrammar.g:76:28: ^( CLASS_NAME ( identifier )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CLASS_NAME, "CLASS_NAME")
                , root_1);

                // CPPGrammar.g:76:41: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_name"


    public static class class_content_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_content"
    // CPPGrammar.g:78:1: class_content : class_content_ -> ^( CLASS_CONTENT ( class_content_ )? ) ;
    public final CPPGrammarParser.class_content_return class_content() throws RecognitionException {
        CPPGrammarParser.class_content_return retval = new CPPGrammarParser.class_content_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.class_content__return class_content_36 =null;


        RewriteRuleSubtreeStream stream_class_content_=new RewriteRuleSubtreeStream(adaptor,"rule class_content_");
        try {
            // CPPGrammar.g:78:14: ( class_content_ -> ^( CLASS_CONTENT ( class_content_ )? ) )
            // CPPGrammar.g:78:16: class_content_
            {
            pushFollow(FOLLOW_class_content__in_class_content560);
            class_content_36=class_content_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_class_content_.add(class_content_36.getTree());

            // AST REWRITE
            // elements: class_content_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 78:31: -> ^( CLASS_CONTENT ( class_content_ )? )
            {
                // CPPGrammar.g:78:34: ^( CLASS_CONTENT ( class_content_ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CLASS_CONTENT, "CLASS_CONTENT")
                , root_1);

                // CPPGrammar.g:78:50: ( class_content_ )?
                if ( stream_class_content_.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_content_.nextTree());

                }
                stream_class_content_.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_content"


    public static class class_content__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_content_"
    // CPPGrammar.g:79:1: class_content_ : ( class_content_elem )* ;
    public final CPPGrammarParser.class_content__return class_content_() throws RecognitionException {
        CPPGrammarParser.class_content__return retval = new CPPGrammarParser.class_content__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.class_content_elem_return class_content_elem37 =null;



        try {
            // CPPGrammar.g:79:15: ( ( class_content_elem )* )
            // CPPGrammar.g:79:17: ( class_content_elem )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:79:17: ( class_content_elem )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= ALPHA_NUMERIC && LA12_0 <= 140)||LA12_0==142) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // CPPGrammar.g:79:17: class_content_elem
            	    {
            	    pushFollow(FOLLOW_class_content_elem_in_class_content_575);
            	    class_content_elem37=class_content_elem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_content_elem37.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_content_"


    public static class class_content_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_content_elem"
    // CPPGrammar.g:81:1: class_content_elem : ( ( simple_decl )=> simple_decl | ( function_def )=> function_def | ( label )=> label | '{' class_content_ '}' | no_curlies );
    public final CPPGrammarParser.class_content_elem_return class_content_elem() throws RecognitionException {
        CPPGrammarParser.class_content_elem_return retval = new CPPGrammarParser.class_content_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal41=null;
        Token char_literal43=null;
        CPPGrammarParser.simple_decl_return simple_decl38 =null;

        CPPGrammarParser.function_def_return function_def39 =null;

        CPPGrammarParser.label_return label40 =null;

        CPPGrammarParser.class_content__return class_content_42 =null;

        CPPGrammarParser.no_curlies_return no_curlies44 =null;


        CommonTree char_literal41_tree=null;
        CommonTree char_literal43_tree=null;

        try {
            // CPPGrammar.g:81:19: ( ( simple_decl )=> simple_decl | ( function_def )=> function_def | ( label )=> label | '{' class_content_ '}' | no_curlies )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 130:
                {
                int LA13_1 = input.LA(2);

                if ( (synpred3_CPPGrammar()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
                }
                break;
            case 127:
                {
                int LA13_2 = input.LA(2);

                if ( (synpred3_CPPGrammar()) ) {
                    alt13=1;
                }
                else if ( (synpred4_CPPGrammar()) ) {
                    alt13=2;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;

                }
                }
                break;
            case 103:
            case 135:
                {
                int LA13_3 = input.LA(2);

                if ( (synpred3_CPPGrammar()) ) {
                    alt13=1;
                }
                else if ( (synpred4_CPPGrammar()) ) {
                    alt13=2;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;

                }
                }
                break;
            case 102:
            case 108:
            case 125:
            case 131:
                {
                int LA13_4 = input.LA(2);

                if ( (synpred3_CPPGrammar()) ) {
                    alt13=1;
                }
                else if ( (synpred4_CPPGrammar()) ) {
                    alt13=2;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;

                }
                }
                break;
            case 123:
            case 132:
                {
                int LA13_5 = input.LA(2);

                if ( (synpred3_CPPGrammar()) ) {
                    alt13=1;
                }
                else if ( (synpred4_CPPGrammar()) ) {
                    alt13=2;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 5, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA13_6 = input.LA(2);

                if ( (synpred3_CPPGrammar()) ) {
                    alt13=1;
                }
                else if ( (synpred4_CPPGrammar()) ) {
                    alt13=2;
                }
                else if ( (synpred5_CPPGrammar()) ) {
                    alt13=3;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 6, input);

                    throw nvae;

                }
                }
                break;
            case 109:
            case 111:
            case 114:
            case 124:
            case 134:
                {
                int LA13_7 = input.LA(2);

                if ( (synpred4_CPPGrammar()) ) {
                    alt13=2;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 7, input);

                    throw nvae;

                }
                }
                break;
            case 64:
            case 68:
                {
                int LA13_8 = input.LA(2);

                if ( (synpred4_CPPGrammar()) ) {
                    alt13=2;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 8, input);

                    throw nvae;

                }
                }
                break;
            case 66:
                {
                int LA13_9 = input.LA(2);

                if ( (synpred4_CPPGrammar()) ) {
                    alt13=2;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 9, input);

                    throw nvae;

                }
                }
                break;
            case 117:
                {
                int LA13_10 = input.LA(2);

                if ( (synpred4_CPPGrammar()) ) {
                    alt13=2;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 10, input);

                    throw nvae;

                }
                }
                break;
            case 100:
                {
                int LA13_11 = input.LA(2);

                if ( (synpred5_CPPGrammar()) ) {
                    alt13=3;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 11, input);

                    throw nvae;

                }
                }
                break;
            case DIGITS:
            case 82:
                {
                int LA13_12 = input.LA(2);

                if ( (synpred5_CPPGrammar()) ) {
                    alt13=3;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 12, input);

                    throw nvae;

                }
                }
                break;
            case 118:
            case 119:
            case 120:
                {
                int LA13_13 = input.LA(2);

                if ( (synpred5_CPPGrammar()) ) {
                    alt13=3;
                }
                else if ( (true) ) {
                    alt13=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 13, input);

                    throw nvae;

                }
                }
                break;
            case 137:
                {
                alt13=4;
                }
                break;
            case ARGUMENT:
            case ARGUMENT_LIST:
            case BASE_CLASSES:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COMMENT:
            case CONDITION:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case DESTINATION:
            case DOT:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case INCLUDE_DIRECTIVE:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case INIT_DECL_NAME:
            case ITERATION:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case NAMESPACE_DEF:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case PARAMETER_NAME:
            case PARAMETER_TYPE:
            case PREPROC:
            case Q_MARK:
            case RETURN_TYPE:
            case SELECTION:
            case SIMPLE_DECL:
            case SIZEOF:
            case SOURCE_FILE:
            case STATEMENTS:
            case STRING:
            case SW:
            case SWITCH:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE_DEF:
            case TYPE_SPECIFIER:
            case USING_DIRECTIVE:
            case WHITESPACE:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 65:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 101:
            case 104:
            case 105:
            case 106:
            case 107:
            case 110:
            case 112:
            case 113:
            case 115:
            case 116:
            case 121:
            case 122:
            case 126:
            case 128:
            case 129:
            case 133:
            case 136:
            case 138:
            case 139:
            case 140:
            case 142:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // CPPGrammar.g:81:22: ( simple_decl )=> simple_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simple_decl_in_class_content_elem590);
                    simple_decl38=simple_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_decl38.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:82:5: ( function_def )=> function_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_def_in_class_content_elem602);
                    function_def39=function_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_def39.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:83:5: ( label )=> label
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_label_in_class_content_elem614);
                    label40=label();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, label40.getTree());

                    }
                    break;
                case 4 :
                    // CPPGrammar.g:84:5: '{' class_content_ '}'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal41=(Token)match(input,137,FOLLOW_137_in_class_content_elem620); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal41_tree = 
                    (CommonTree)adaptor.create(char_literal41)
                    ;
                    adaptor.addChild(root_0, char_literal41_tree);
                    }

                    pushFollow(FOLLOW_class_content__in_class_content_elem622);
                    class_content_42=class_content_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_content_42.getTree());

                    char_literal43=(Token)match(input,141,FOLLOW_141_in_class_content_elem624); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal43_tree = 
                    (CommonTree)adaptor.create(char_literal43)
                    ;
                    adaptor.addChild(root_0, char_literal43_tree);
                    }

                    }
                    break;
                case 5 :
                    // CPPGrammar.g:85:5: no_curlies
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_no_curlies_in_class_content_elem630);
                    no_curlies44=no_curlies();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, no_curlies44.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_content_elem"


    public static class base_classes_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base_classes"
    // CPPGrammar.g:88:1: base_classes : ( base_classes_ )? -> ^( BASE_CLASSES ( base_classes_ )? ) ;
    public final CPPGrammarParser.base_classes_return base_classes() throws RecognitionException {
        CPPGrammarParser.base_classes_return retval = new CPPGrammarParser.base_classes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.base_classes__return base_classes_45 =null;


        RewriteRuleSubtreeStream stream_base_classes_=new RewriteRuleSubtreeStream(adaptor,"rule base_classes_");
        try {
            // CPPGrammar.g:88:13: ( ( base_classes_ )? -> ^( BASE_CLASSES ( base_classes_ )? ) )
            // CPPGrammar.g:88:15: ( base_classes_ )?
            {
            // CPPGrammar.g:88:15: ( base_classes_ )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==81) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // CPPGrammar.g:88:15: base_classes_
                    {
                    pushFollow(FOLLOW_base_classes__in_base_classes640);
                    base_classes_45=base_classes_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base_classes_.add(base_classes_45.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: base_classes_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 88:30: -> ^( BASE_CLASSES ( base_classes_ )? )
            {
                // CPPGrammar.g:88:33: ^( BASE_CLASSES ( base_classes_ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BASE_CLASSES, "BASE_CLASSES")
                , root_1);

                // CPPGrammar.g:88:48: ( base_classes_ )?
                if ( stream_base_classes_.hasNext() ) {
                    adaptor.addChild(root_1, stream_base_classes_.nextTree());

                }
                stream_base_classes_.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "base_classes"


    public static class base_classes__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base_classes_"
    // CPPGrammar.g:89:1: base_classes_ : ':' base_class ( ',' base_class )* ;
    public final CPPGrammarParser.base_classes__return base_classes_() throws RecognitionException {
        CPPGrammarParser.base_classes__return retval = new CPPGrammarParser.base_classes__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal46=null;
        Token char_literal48=null;
        CPPGrammarParser.base_class_return base_class47 =null;

        CPPGrammarParser.base_class_return base_class49 =null;


        CommonTree char_literal46_tree=null;
        CommonTree char_literal48_tree=null;

        try {
            // CPPGrammar.g:89:14: ( ':' base_class ( ',' base_class )* )
            // CPPGrammar.g:89:16: ':' base_class ( ',' base_class )*
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal46=(Token)match(input,81,FOLLOW_81_in_base_classes_657); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal46_tree = 
            (CommonTree)adaptor.create(char_literal46)
            ;
            adaptor.addChild(root_0, char_literal46_tree);
            }

            pushFollow(FOLLOW_base_class_in_base_classes_659);
            base_class47=base_class();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, base_class47.getTree());

            // CPPGrammar.g:89:31: ( ',' base_class )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==73) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // CPPGrammar.g:89:32: ',' base_class
            	    {
            	    char_literal48=(Token)match(input,73,FOLLOW_73_in_base_classes_662); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal48_tree = 
            	    (CommonTree)adaptor.create(char_literal48)
            	    ;
            	    adaptor.addChild(root_0, char_literal48_tree);
            	    }

            	    pushFollow(FOLLOW_base_class_in_base_classes_664);
            	    base_class49=base_class();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, base_class49.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "base_classes_"


    public static class base_class_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base_class"
    // CPPGrammar.g:90:1: base_class : ( 'virtual' )? ( access_specifier )? identifier ;
    public final CPPGrammarParser.base_class_return base_class() throws RecognitionException {
        CPPGrammarParser.base_class_return retval = new CPPGrammarParser.base_class_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal50=null;
        CPPGrammarParser.access_specifier_return access_specifier51 =null;

        CPPGrammarParser.identifier_return identifier52 =null;


        CommonTree string_literal50_tree=null;

        try {
            // CPPGrammar.g:90:11: ( ( 'virtual' )? ( access_specifier )? identifier )
            // CPPGrammar.g:90:13: ( 'virtual' )? ( access_specifier )? identifier
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:90:13: ( 'virtual' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==134) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // CPPGrammar.g:90:13: 'virtual'
                    {
                    string_literal50=(Token)match(input,134,FOLLOW_134_in_base_class672); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal50_tree = 
                    (CommonTree)adaptor.create(string_literal50)
                    ;
                    adaptor.addChild(root_0, string_literal50_tree);
                    }

                    }
                    break;

            }


            // CPPGrammar.g:90:24: ( access_specifier )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0 >= 118 && LA17_0 <= 120)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // CPPGrammar.g:90:24: access_specifier
                    {
                    pushFollow(FOLLOW_access_specifier_in_base_class675);
                    access_specifier51=access_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, access_specifier51.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_base_class678);
            identifier52=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier52.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "base_class"


    public static class init_declarator_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declarator_list"
    // CPPGrammar.g:92:1: init_declarator_list : init_declarator ( ',' init_declarator )* ;
    public final CPPGrammarParser.init_declarator_list_return init_declarator_list() throws RecognitionException {
        CPPGrammarParser.init_declarator_list_return retval = new CPPGrammarParser.init_declarator_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal54=null;
        CPPGrammarParser.init_declarator_return init_declarator53 =null;

        CPPGrammarParser.init_declarator_return init_declarator55 =null;


        CommonTree char_literal54_tree=null;

        try {
            // CPPGrammar.g:92:21: ( init_declarator ( ',' init_declarator )* )
            // CPPGrammar.g:92:23: init_declarator ( ',' init_declarator )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_init_declarator_in_init_declarator_list685);
            init_declarator53=init_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, init_declarator53.getTree());

            // CPPGrammar.g:92:39: ( ',' init_declarator )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==73) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // CPPGrammar.g:92:40: ',' init_declarator
            	    {
            	    char_literal54=(Token)match(input,73,FOLLOW_73_in_init_declarator_list688); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal54_tree = 
            	    (CommonTree)adaptor.create(char_literal54)
            	    ;
            	    adaptor.addChild(root_0, char_literal54_tree);
            	    }

            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list690);
            	    init_declarator55=init_declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, init_declarator55.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "init_declarator_list"


    public static class init_declarator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declarator"
    // CPPGrammar.g:93:1: init_declarator : init_decl_name ( initializer )? ;
    public final CPPGrammarParser.init_declarator_return init_declarator() throws RecognitionException {
        CPPGrammarParser.init_declarator_return retval = new CPPGrammarParser.init_declarator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.init_decl_name_return init_decl_name56 =null;

        CPPGrammarParser.initializer_return initializer57 =null;



        try {
            // CPPGrammar.g:93:16: ( init_decl_name ( initializer )? )
            // CPPGrammar.g:93:18: init_decl_name ( initializer )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_init_decl_name_in_init_declarator698);
            init_decl_name56=init_decl_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, init_decl_name56.getTree());

            // CPPGrammar.g:93:33: ( initializer )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==66||LA19_0==88) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // CPPGrammar.g:93:33: initializer
                    {
                    pushFollow(FOLLOW_initializer_in_init_declarator700);
                    initializer57=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer57.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "init_declarator"


    public static class init_decl_name__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_decl_name_"
    // CPPGrammar.g:94:1: init_decl_name_ : ( ( ptr_operator )* identifier ) ( '[' constant_expr ']' )? ;
    public final CPPGrammarParser.init_decl_name__return init_decl_name_() throws RecognitionException {
        CPPGrammarParser.init_decl_name__return retval = new CPPGrammarParser.init_decl_name__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal60=null;
        Token char_literal62=null;
        CPPGrammarParser.ptr_operator_return ptr_operator58 =null;

        CPPGrammarParser.identifier_return identifier59 =null;

        CPPGrammarParser.constant_expr_return constant_expr61 =null;


        CommonTree char_literal60_tree=null;
        CommonTree char_literal62_tree=null;

        try {
            // CPPGrammar.g:94:16: ( ( ( ptr_operator )* identifier ) ( '[' constant_expr ']' )? )
            // CPPGrammar.g:94:18: ( ( ptr_operator )* identifier ) ( '[' constant_expr ']' )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:94:18: ( ( ptr_operator )* identifier )
            // CPPGrammar.g:94:20: ( ptr_operator )* identifier
            {
            // CPPGrammar.g:94:20: ( ptr_operator )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==64||LA20_0==68) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // CPPGrammar.g:94:20: ptr_operator
            	    {
            	    pushFollow(FOLLOW_ptr_operator_in_init_decl_name_709);
            	    ptr_operator58=ptr_operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ptr_operator58.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            pushFollow(FOLLOW_identifier_in_init_decl_name_712);
            identifier59=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier59.getTree());

            }


            // CPPGrammar.g:94:46: ( '[' constant_expr ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==94) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // CPPGrammar.g:94:47: '[' constant_expr ']'
                    {
                    char_literal60=(Token)match(input,94,FOLLOW_94_in_init_decl_name_716); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal60_tree = 
                    (CommonTree)adaptor.create(char_literal60)
                    ;
                    adaptor.addChild(root_0, char_literal60_tree);
                    }

                    pushFollow(FOLLOW_constant_expr_in_init_decl_name_718);
                    constant_expr61=constant_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expr61.getTree());

                    char_literal62=(Token)match(input,95,FOLLOW_95_in_init_decl_name_720); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal62_tree = 
                    (CommonTree)adaptor.create(char_literal62)
                    ;
                    adaptor.addChild(root_0, char_literal62_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "init_decl_name_"


    public static class initializer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer"
    // CPPGrammar.g:95:1: initializer : ( ( '(' ( expr )? ')' ) | '=' assignment_expr );
    public final CPPGrammarParser.initializer_return initializer() throws RecognitionException {
        CPPGrammarParser.initializer_return retval = new CPPGrammarParser.initializer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal63=null;
        Token char_literal65=null;
        Token char_literal66=null;
        CPPGrammarParser.expr_return expr64 =null;

        CPPGrammarParser.assignment_expr_return assignment_expr67 =null;


        CommonTree char_literal63_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree char_literal66_tree=null;

        try {
            // CPPGrammar.g:95:12: ( ( '(' ( expr )? ')' ) | '=' assignment_expr )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==66) ) {
                alt23=1;
            }
            else if ( (LA23_0==88) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // CPPGrammar.g:95:14: ( '(' ( expr )? ')' )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:95:14: ( '(' ( expr )? ')' )
                    // CPPGrammar.g:95:15: '(' ( expr )? ')'
                    {
                    char_literal63=(Token)match(input,66,FOLLOW_66_in_initializer729); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal63_tree = 
                    (CommonTree)adaptor.create(char_literal63)
                    ;
                    adaptor.addChild(root_0, char_literal63_tree);
                    }

                    // CPPGrammar.g:95:19: ( expr )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0 >= ALPHA_NUMERIC && LA22_0 <= 66)||(LA22_0 >= 68 && LA22_0 <= 82)||(LA22_0 >= 84 && LA22_0 <= 142)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // CPPGrammar.g:95:19: expr
                            {
                            pushFollow(FOLLOW_expr_in_initializer731);
                            expr64=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr64.getTree());

                            }
                            break;

                    }


                    char_literal65=(Token)match(input,67,FOLLOW_67_in_initializer734); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal65_tree = 
                    (CommonTree)adaptor.create(char_literal65)
                    ;
                    adaptor.addChild(root_0, char_literal65_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:95:32: '=' assignment_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal66=(Token)match(input,88,FOLLOW_88_in_initializer739); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal66_tree = 
                    (CommonTree)adaptor.create(char_literal66)
                    ;
                    adaptor.addChild(root_0, char_literal66_tree);
                    }

                    pushFollow(FOLLOW_assignment_expr_in_initializer741);
                    assignment_expr67=assignment_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expr67.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "initializer"


    public static class function_def__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_def_"
    // CPPGrammar.g:99:1: function_def_ : function_start function_param_list ( ctor_list )? compound_statement -> function_start function_param_list ^( CTOR_LIST ( ctor_list )? ) compound_statement ;
    public final CPPGrammarParser.function_def__return function_def_() throws RecognitionException {
        CPPGrammarParser.function_def__return retval = new CPPGrammarParser.function_def__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.function_start_return function_start68 =null;

        CPPGrammarParser.function_param_list_return function_param_list69 =null;

        CPPGrammarParser.ctor_list_return ctor_list70 =null;

        CPPGrammarParser.compound_statement_return compound_statement71 =null;


        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        RewriteRuleSubtreeStream stream_ctor_list=new RewriteRuleSubtreeStream(adaptor,"rule ctor_list");
        RewriteRuleSubtreeStream stream_function_param_list=new RewriteRuleSubtreeStream(adaptor,"rule function_param_list");
        RewriteRuleSubtreeStream stream_function_start=new RewriteRuleSubtreeStream(adaptor,"rule function_start");
        try {
            // CPPGrammar.g:99:15: ( function_start function_param_list ( ctor_list )? compound_statement -> function_start function_param_list ^( CTOR_LIST ( ctor_list )? ) compound_statement )
            // CPPGrammar.g:99:18: function_start function_param_list ( ctor_list )? compound_statement
            {
            pushFollow(FOLLOW_function_start_in_function_def_757);
            function_start68=function_start();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_start.add(function_start68.getTree());

            pushFollow(FOLLOW_function_param_list_in_function_def_759);
            function_param_list69=function_param_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_param_list.add(function_param_list69.getTree());

            // CPPGrammar.g:99:53: ( ctor_list )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==81) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // CPPGrammar.g:99:53: ctor_list
                    {
                    pushFollow(FOLLOW_ctor_list_in_function_def_761);
                    ctor_list70=ctor_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ctor_list.add(ctor_list70.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_compound_statement_in_function_def_764);
            compound_statement71=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement71.getTree());

            // AST REWRITE
            // elements: function_start, compound_statement, ctor_list, function_param_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 99:83: -> function_start function_param_list ^( CTOR_LIST ( ctor_list )? ) compound_statement
            {
                adaptor.addChild(root_0, stream_function_start.nextTree());

                adaptor.addChild(root_0, stream_function_param_list.nextTree());

                // CPPGrammar.g:100:53: ^( CTOR_LIST ( ctor_list )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CTOR_LIST, "CTOR_LIST")
                , root_1);

                // CPPGrammar.g:100:65: ( ctor_list )?
                if ( stream_ctor_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_ctor_list.nextTree());

                }
                stream_ctor_list.reset();

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_compound_statement.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_def_"


    public static class function_start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_start"
    // CPPGrammar.g:102:1: function_start : ( template_declaration_start )? return_type function_name -> ^( TEMPLATE_DECL_SPECIFIER ( template_declaration_start )? ) return_type function_name ;
    public final CPPGrammarParser.function_start_return function_start() throws RecognitionException {
        CPPGrammarParser.function_start_return retval = new CPPGrammarParser.function_start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.template_declaration_start_return template_declaration_start72 =null;

        CPPGrammarParser.return_type_return return_type73 =null;

        CPPGrammarParser.function_name_return function_name74 =null;


        RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
        RewriteRuleSubtreeStream stream_function_name=new RewriteRuleSubtreeStream(adaptor,"rule function_name");
        RewriteRuleSubtreeStream stream_template_declaration_start=new RewriteRuleSubtreeStream(adaptor,"rule template_declaration_start");
        try {
            // CPPGrammar.g:102:15: ( ( template_declaration_start )? return_type function_name -> ^( TEMPLATE_DECL_SPECIFIER ( template_declaration_start )? ) return_type function_name )
            // CPPGrammar.g:102:17: ( template_declaration_start )? return_type function_name
            {
            // CPPGrammar.g:102:17: ( template_declaration_start )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==127) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // CPPGrammar.g:102:17: template_declaration_start
                    {
                    pushFollow(FOLLOW_template_declaration_start_in_function_start803);
                    template_declaration_start72=template_declaration_start();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_template_declaration_start.add(template_declaration_start72.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_return_type_in_function_start806);
            return_type73=return_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_return_type.add(return_type73.getTree());

            pushFollow(FOLLOW_function_name_in_function_start808);
            function_name74=function_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_name.add(function_name74.getTree());

            // AST REWRITE
            // elements: function_name, template_declaration_start, return_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 102:71: -> ^( TEMPLATE_DECL_SPECIFIER ( template_declaration_start )? ) return_type function_name
            {
                // CPPGrammar.g:103:17: ^( TEMPLATE_DECL_SPECIFIER ( template_declaration_start )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TEMPLATE_DECL_SPECIFIER, "TEMPLATE_DECL_SPECIFIER")
                , root_1);

                // CPPGrammar.g:103:43: ( template_declaration_start )?
                if ( stream_template_declaration_start.hasNext() ) {
                    adaptor.addChild(root_1, stream_template_declaration_start.nextTree());

                }
                stream_template_declaration_start.reset();

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_return_type.nextTree());

                adaptor.addChild(root_0, stream_function_name.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_start"


    public static class return_type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_type"
    // CPPGrammar.g:105:1: return_type : return_type_ -> ^( RETURN_TYPE ( return_type_ )? ) ;
    public final CPPGrammarParser.return_type_return return_type() throws RecognitionException {
        CPPGrammarParser.return_type_return retval = new CPPGrammarParser.return_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.return_type__return return_type_75 =null;


        RewriteRuleSubtreeStream stream_return_type_=new RewriteRuleSubtreeStream(adaptor,"rule return_type_");
        try {
            // CPPGrammar.g:105:12: ( return_type_ -> ^( RETURN_TYPE ( return_type_ )? ) )
            // CPPGrammar.g:105:14: return_type_
            {
            pushFollow(FOLLOW_return_type__in_return_type844);
            return_type_75=return_type_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_return_type_.add(return_type_75.getTree());

            // AST REWRITE
            // elements: return_type_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 105:27: -> ^( RETURN_TYPE ( return_type_ )? )
            {
                // CPPGrammar.g:105:30: ^( RETURN_TYPE ( return_type_ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RETURN_TYPE, "RETURN_TYPE")
                , root_1);

                // CPPGrammar.g:105:44: ( return_type_ )?
                if ( stream_return_type_.hasNext() ) {
                    adaptor.addChild(root_1, stream_return_type_.nextTree());

                }
                stream_return_type_.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_type"


    public static class return_type__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_type_"
    // CPPGrammar.g:106:1: return_type_ : ( ( function_decl_specifiers )* type_specifier )? ( function_decl_specifiers )* ( ptr_operator )* ;
    public final CPPGrammarParser.return_type__return return_type_() throws RecognitionException {
        CPPGrammarParser.return_type__return retval = new CPPGrammarParser.return_type__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.function_decl_specifiers_return function_decl_specifiers76 =null;

        CPPGrammarParser.type_specifier_return type_specifier77 =null;

        CPPGrammarParser.function_decl_specifiers_return function_decl_specifiers78 =null;

        CPPGrammarParser.ptr_operator_return ptr_operator79 =null;



        try {
            // CPPGrammar.g:106:13: ( ( ( function_decl_specifiers )* type_specifier )? ( function_decl_specifiers )* ( ptr_operator )* )
            // CPPGrammar.g:106:15: ( ( function_decl_specifiers )* type_specifier )? ( function_decl_specifiers )* ( ptr_operator )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:106:15: ( ( function_decl_specifiers )* type_specifier )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // CPPGrammar.g:106:16: ( function_decl_specifiers )* type_specifier
                    {
                    // CPPGrammar.g:106:16: ( function_decl_specifiers )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==109||LA26_0==111||LA26_0==114||LA26_0==124||LA26_0==134) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // CPPGrammar.g:106:16: function_decl_specifiers
                    	    {
                    	    pushFollow(FOLLOW_function_decl_specifiers_in_return_type_860);
                    	    function_decl_specifiers76=function_decl_specifiers();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_decl_specifiers76.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    pushFollow(FOLLOW_type_specifier_in_return_type_863);
                    type_specifier77=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier77.getTree());

                    }
                    break;

            }


            // CPPGrammar.g:106:59: ( function_decl_specifiers )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==109||LA28_0==111||LA28_0==114||LA28_0==124||LA28_0==134) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // CPPGrammar.g:106:59: function_decl_specifiers
            	    {
            	    pushFollow(FOLLOW_function_decl_specifiers_in_return_type_867);
            	    function_decl_specifiers78=function_decl_specifiers();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_decl_specifiers78.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // CPPGrammar.g:106:85: ( ptr_operator )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==64||LA29_0==68) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // CPPGrammar.g:106:85: ptr_operator
            	    {
            	    pushFollow(FOLLOW_ptr_operator_in_return_type_870);
            	    ptr_operator79=ptr_operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ptr_operator79.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_type_"


    public static class function_name__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_name_"
    // CPPGrammar.g:108:1: function_name_ : ( '(' function_name_ ')' | identifier | operator_function_id );
    public final CPPGrammarParser.function_name__return function_name_() throws RecognitionException {
        CPPGrammarParser.function_name__return retval = new CPPGrammarParser.function_name__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal80=null;
        Token char_literal82=null;
        CPPGrammarParser.function_name__return function_name_81 =null;

        CPPGrammarParser.identifier_return identifier83 =null;

        CPPGrammarParser.operator_function_id_return operator_function_id84 =null;


        CommonTree char_literal80_tree=null;
        CommonTree char_literal82_tree=null;

        try {
            // CPPGrammar.g:108:15: ( '(' function_name_ ')' | identifier | operator_function_id )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt30=1;
                }
                break;
            case ALPHA_NUMERIC:
                {
                alt30=2;
                }
                break;
            case 117:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // CPPGrammar.g:108:17: '(' function_name_ ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal80=(Token)match(input,66,FOLLOW_66_in_function_name_878); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal80_tree = 
                    (CommonTree)adaptor.create(char_literal80)
                    ;
                    adaptor.addChild(root_0, char_literal80_tree);
                    }

                    pushFollow(FOLLOW_function_name__in_function_name_880);
                    function_name_81=function_name_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name_81.getTree());

                    char_literal82=(Token)match(input,67,FOLLOW_67_in_function_name_882); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal82_tree = 
                    (CommonTree)adaptor.create(char_literal82)
                    ;
                    adaptor.addChild(root_0, char_literal82_tree);
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:108:42: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_function_name_886);
                    identifier83=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier83.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:108:55: operator_function_id
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_operator_function_id_in_function_name_890);
                    operator_function_id84=operator_function_id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_function_id84.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_name_"


    public static class function_param_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_param_list"
    // CPPGrammar.g:109:1: function_param_list : o= '(' ( parameter_declaration_clause )? c= ')' ( cv_qualifier )* ( exception_specification )? -> ^( PARAMETER_LIST $o ( parameter_declaration_clause )? $c) ;
    public final CPPGrammarParser.function_param_list_return function_param_list() throws RecognitionException {
        CPPGrammarParser.function_param_list_return retval = new CPPGrammarParser.function_param_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token o=null;
        Token c=null;
        CPPGrammarParser.parameter_declaration_clause_return parameter_declaration_clause85 =null;

        CPPGrammarParser.cv_qualifier_return cv_qualifier86 =null;

        CPPGrammarParser.exception_specification_return exception_specification87 =null;


        CommonTree o_tree=null;
        CommonTree c_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleSubtreeStream stream_cv_qualifier=new RewriteRuleSubtreeStream(adaptor,"rule cv_qualifier");
        RewriteRuleSubtreeStream stream_exception_specification=new RewriteRuleSubtreeStream(adaptor,"rule exception_specification");
        RewriteRuleSubtreeStream stream_parameter_declaration_clause=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration_clause");
        try {
            // CPPGrammar.g:109:21: (o= '(' ( parameter_declaration_clause )? c= ')' ( cv_qualifier )* ( exception_specification )? -> ^( PARAMETER_LIST $o ( parameter_declaration_clause )? $c) )
            // CPPGrammar.g:109:23: o= '(' ( parameter_declaration_clause )? c= ')' ( cv_qualifier )* ( exception_specification )?
            {
            o=(Token)match(input,66,FOLLOW_66_in_function_param_list899); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(o);


            // CPPGrammar.g:109:29: ( parameter_declaration_clause )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ALPHA_NUMERIC||LA31_0==98||(LA31_0 >= 102 && LA31_0 <= 103)||LA31_0==108||LA31_0==121||LA31_0==123||LA31_0==125||(LA31_0 >= 131 && LA31_0 <= 132)||LA31_0==135) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // CPPGrammar.g:109:29: parameter_declaration_clause
                    {
                    pushFollow(FOLLOW_parameter_declaration_clause_in_function_param_list901);
                    parameter_declaration_clause85=parameter_declaration_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declaration_clause.add(parameter_declaration_clause85.getTree());

                    }
                    break;

            }


            c=(Token)match(input,67,FOLLOW_67_in_function_param_list906); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(c);


            // CPPGrammar.g:109:65: ( cv_qualifier )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==103||LA32_0==135) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // CPPGrammar.g:109:65: cv_qualifier
            	    {
            	    pushFollow(FOLLOW_cv_qualifier_in_function_param_list908);
            	    cv_qualifier86=cv_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_cv_qualifier.add(cv_qualifier86.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            // CPPGrammar.g:109:79: ( exception_specification )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==128) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // CPPGrammar.g:109:79: exception_specification
                    {
                    pushFollow(FOLLOW_exception_specification_in_function_param_list911);
                    exception_specification87=exception_specification();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exception_specification.add(exception_specification87.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: c, o, parameter_declaration_clause
            // token labels: c, o
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
            RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 109:104: -> ^( PARAMETER_LIST $o ( parameter_declaration_clause )? $c)
            {
                // CPPGrammar.g:110:21: ^( PARAMETER_LIST $o ( parameter_declaration_clause )? $c)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAMETER_LIST, "PARAMETER_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_o.nextNode());

                // CPPGrammar.g:110:42: ( parameter_declaration_clause )?
                if ( stream_parameter_declaration_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_declaration_clause.nextTree());

                }
                stream_parameter_declaration_clause.reset();

                adaptor.addChild(root_1, stream_c.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_param_list"


    public static class exception_specification_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exception_specification"
    // CPPGrammar.g:112:1: exception_specification : 'throw' '(' type_id_list ')' ;
    public final CPPGrammarParser.exception_specification_return exception_specification() throws RecognitionException {
        CPPGrammarParser.exception_specification_return retval = new CPPGrammarParser.exception_specification_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal88=null;
        Token char_literal89=null;
        Token char_literal91=null;
        CPPGrammarParser.type_id_list_return type_id_list90 =null;


        CommonTree string_literal88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree char_literal91_tree=null;

        try {
            // CPPGrammar.g:112:25: ( 'throw' '(' type_id_list ')' )
            // CPPGrammar.g:112:27: 'throw' '(' type_id_list ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal88=(Token)match(input,128,FOLLOW_128_in_exception_specification956); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal88_tree = 
            (CommonTree)adaptor.create(string_literal88)
            ;
            adaptor.addChild(root_0, string_literal88_tree);
            }

            char_literal89=(Token)match(input,66,FOLLOW_66_in_exception_specification958); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal89_tree = 
            (CommonTree)adaptor.create(char_literal89)
            ;
            adaptor.addChild(root_0, char_literal89_tree);
            }

            pushFollow(FOLLOW_type_id_list_in_exception_specification960);
            type_id_list90=type_id_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_id_list90.getTree());

            char_literal91=(Token)match(input,67,FOLLOW_67_in_exception_specification962); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal91_tree = 
            (CommonTree)adaptor.create(char_literal91)
            ;
            adaptor.addChild(root_0, char_literal91_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exception_specification"


    public static class ctor_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ctor_list"
    // CPPGrammar.g:114:1: ctor_list : ':' ctor_initializer ( ',' ctor_initializer )* -> ( ctor_initializer )+ ;
    public final CPPGrammarParser.ctor_list_return ctor_list() throws RecognitionException {
        CPPGrammarParser.ctor_list_return retval = new CPPGrammarParser.ctor_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal92=null;
        Token char_literal94=null;
        CPPGrammarParser.ctor_initializer_return ctor_initializer93 =null;

        CPPGrammarParser.ctor_initializer_return ctor_initializer95 =null;


        CommonTree char_literal92_tree=null;
        CommonTree char_literal94_tree=null;
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_ctor_initializer=new RewriteRuleSubtreeStream(adaptor,"rule ctor_initializer");
        try {
            // CPPGrammar.g:114:10: ( ':' ctor_initializer ( ',' ctor_initializer )* -> ( ctor_initializer )+ )
            // CPPGrammar.g:114:12: ':' ctor_initializer ( ',' ctor_initializer )*
            {
            char_literal92=(Token)match(input,81,FOLLOW_81_in_ctor_list969); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(char_literal92);


            pushFollow(FOLLOW_ctor_initializer_in_ctor_list972);
            ctor_initializer93=ctor_initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ctor_initializer.add(ctor_initializer93.getTree());

            // CPPGrammar.g:114:34: ( ',' ctor_initializer )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==73) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // CPPGrammar.g:114:35: ',' ctor_initializer
            	    {
            	    char_literal94=(Token)match(input,73,FOLLOW_73_in_ctor_list975); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_73.add(char_literal94);


            	    pushFollow(FOLLOW_ctor_initializer_in_ctor_list977);
            	    ctor_initializer95=ctor_initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ctor_initializer.add(ctor_initializer95.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            // AST REWRITE
            // elements: ctor_initializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 114:58: -> ( ctor_initializer )+
            {
                if ( !(stream_ctor_initializer.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ctor_initializer.hasNext() ) {
                    adaptor.addChild(root_0, stream_ctor_initializer.nextTree());

                }
                stream_ctor_initializer.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ctor_list"


    public static class ctor_initializer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ctor_initializer"
    // CPPGrammar.g:115:1: ctor_initializer : ( '::' )? identifier '(' ( expr )? ')' -> ^( CTOR_INITIALIZER ^( INITIALIZER_ID ( '::' )? identifier ) ^( CTOR_EXPR ( expr )? ) ) ;
    public final CPPGrammarParser.ctor_initializer_return ctor_initializer() throws RecognitionException {
        CPPGrammarParser.ctor_initializer_return retval = new CPPGrammarParser.ctor_initializer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal96=null;
        Token char_literal98=null;
        Token char_literal100=null;
        CPPGrammarParser.identifier_return identifier97 =null;

        CPPGrammarParser.expr_return expr99 =null;


        CommonTree string_literal96_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree char_literal100_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // CPPGrammar.g:115:17: ( ( '::' )? identifier '(' ( expr )? ')' -> ^( CTOR_INITIALIZER ^( INITIALIZER_ID ( '::' )? identifier ) ^( CTOR_EXPR ( expr )? ) ) )
            // CPPGrammar.g:115:20: ( '::' )? identifier '(' ( expr )? ')'
            {
            // CPPGrammar.g:115:20: ( '::' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==82) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // CPPGrammar.g:115:20: '::'
                    {
                    string_literal96=(Token)match(input,82,FOLLOW_82_in_ctor_initializer991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_82.add(string_literal96);


                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_ctor_initializer994);
            identifier97=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier97.getTree());

            char_literal98=(Token)match(input,66,FOLLOW_66_in_ctor_initializer996); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal98);


            // CPPGrammar.g:115:41: ( expr )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0 >= ALPHA_NUMERIC && LA36_0 <= 66)||(LA36_0 >= 68 && LA36_0 <= 82)||(LA36_0 >= 84 && LA36_0 <= 142)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // CPPGrammar.g:115:41: expr
                    {
                    pushFollow(FOLLOW_expr_in_ctor_initializer998);
                    expr99=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr99.getTree());

                    }
                    break;

            }


            char_literal100=(Token)match(input,67,FOLLOW_67_in_ctor_initializer1001); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal100);


            // AST REWRITE
            // elements: 82, expr, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 115:51: -> ^( CTOR_INITIALIZER ^( INITIALIZER_ID ( '::' )? identifier ) ^( CTOR_EXPR ( expr )? ) )
            {
                // CPPGrammar.g:115:54: ^( CTOR_INITIALIZER ^( INITIALIZER_ID ( '::' )? identifier ) ^( CTOR_EXPR ( expr )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CTOR_INITIALIZER, "CTOR_INITIALIZER")
                , root_1);

                // CPPGrammar.g:115:73: ^( INITIALIZER_ID ( '::' )? identifier )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INITIALIZER_ID, "INITIALIZER_ID")
                , root_2);

                // CPPGrammar.g:115:90: ( '::' )?
                if ( stream_82.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_82.nextNode()
                    );

                }
                stream_82.reset();

                adaptor.addChild(root_2, stream_identifier.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // CPPGrammar.g:115:108: ^( CTOR_EXPR ( expr )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CTOR_EXPR, "CTOR_EXPR")
                , root_2);

                // CPPGrammar.g:115:120: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ctor_initializer"


    public static class parameter_declaration_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_declaration_clause"
    // CPPGrammar.g:117:1: parameter_declaration_clause : parameter_decl ( ',' parameter_decl )* ;
    public final CPPGrammarParser.parameter_declaration_clause_return parameter_declaration_clause() throws RecognitionException {
        CPPGrammarParser.parameter_declaration_clause_return retval = new CPPGrammarParser.parameter_declaration_clause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal102=null;
        CPPGrammarParser.parameter_decl_return parameter_decl101 =null;

        CPPGrammarParser.parameter_decl_return parameter_decl103 =null;


        CommonTree char_literal102_tree=null;

        try {
            // CPPGrammar.g:117:29: ( parameter_decl ( ',' parameter_decl )* )
            // CPPGrammar.g:117:31: parameter_decl ( ',' parameter_decl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_parameter_decl_in_parameter_declaration_clause1031);
            parameter_decl101=parameter_decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_decl101.getTree());

            // CPPGrammar.g:117:46: ( ',' parameter_decl )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==73) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // CPPGrammar.g:117:47: ',' parameter_decl
            	    {
            	    char_literal102=(Token)match(input,73,FOLLOW_73_in_parameter_declaration_clause1034); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal102_tree = 
            	    (CommonTree)adaptor.create(char_literal102)
            	    ;
            	    adaptor.addChild(root_0, char_literal102_tree);
            	    }

            	    pushFollow(FOLLOW_parameter_decl_in_parameter_declaration_clause1036);
            	    parameter_decl103=parameter_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_decl103.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_declaration_clause"


    public static class parameter_decl__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_decl_"
    // CPPGrammar.g:118:1: parameter_decl_ : ( param_decl_specifiers ( ptr_operator )* parameter_name -> ^( PARAMETER_TYPE param_decl_specifiers ( ptr_operator )* ) parameter_name | identifier -> ^( SW identifier ) );
    public final CPPGrammarParser.parameter_decl__return parameter_decl_() throws RecognitionException {
        CPPGrammarParser.parameter_decl__return retval = new CPPGrammarParser.parameter_decl__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.param_decl_specifiers_return param_decl_specifiers104 =null;

        CPPGrammarParser.ptr_operator_return ptr_operator105 =null;

        CPPGrammarParser.parameter_name_return parameter_name106 =null;

        CPPGrammarParser.identifier_return identifier107 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_ptr_operator=new RewriteRuleSubtreeStream(adaptor,"rule ptr_operator");
        RewriteRuleSubtreeStream stream_param_decl_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule param_decl_specifiers");
        RewriteRuleSubtreeStream stream_parameter_name=new RewriteRuleSubtreeStream(adaptor,"rule parameter_name");
        try {
            // CPPGrammar.g:118:16: ( param_decl_specifiers ( ptr_operator )* parameter_name -> ^( PARAMETER_TYPE param_decl_specifiers ( ptr_operator )* ) parameter_name | identifier -> ^( SW identifier ) )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // CPPGrammar.g:118:18: param_decl_specifiers ( ptr_operator )* parameter_name
                    {
                    pushFollow(FOLLOW_param_decl_specifiers_in_parameter_decl_1044);
                    param_decl_specifiers104=param_decl_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param_decl_specifiers.add(param_decl_specifiers104.getTree());

                    // CPPGrammar.g:118:40: ( ptr_operator )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==64||LA38_0==68) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // CPPGrammar.g:118:40: ptr_operator
                    	    {
                    	    pushFollow(FOLLOW_ptr_operator_in_parameter_decl_1046);
                    	    ptr_operator105=ptr_operator();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ptr_operator.add(ptr_operator105.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    pushFollow(FOLLOW_parameter_name_in_parameter_decl_1049);
                    parameter_name106=parameter_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_name.add(parameter_name106.getTree());

                    // AST REWRITE
                    // elements: ptr_operator, param_decl_specifiers, parameter_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 118:69: -> ^( PARAMETER_TYPE param_decl_specifiers ( ptr_operator )* ) parameter_name
                    {
                        // CPPGrammar.g:118:72: ^( PARAMETER_TYPE param_decl_specifiers ( ptr_operator )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PARAMETER_TYPE, "PARAMETER_TYPE")
                        , root_1);

                        adaptor.addChild(root_1, stream_param_decl_specifiers.nextTree());

                        // CPPGrammar.g:118:111: ( ptr_operator )*
                        while ( stream_ptr_operator.hasNext() ) {
                            adaptor.addChild(root_1, stream_ptr_operator.nextTree());

                        }
                        stream_ptr_operator.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                        adaptor.addChild(root_0, stream_parameter_name.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:119:5: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_parameter_decl_1068);
                    identifier107=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier107.getTree());

                    // AST REWRITE
                    // elements: identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 119:16: -> ^( SW identifier )
                    {
                        // CPPGrammar.g:119:19: ^( SW identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SW, "SW")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_decl_"


    public static class parameter_name__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_name_"
    // CPPGrammar.g:121:1: parameter_name_ : ( '(' parameter_name_ ')' | identifier ) ( '[' constant_expr ']' )? ;
    public final CPPGrammarParser.parameter_name__return parameter_name_() throws RecognitionException {
        CPPGrammarParser.parameter_name__return retval = new CPPGrammarParser.parameter_name__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal108=null;
        Token char_literal110=null;
        Token char_literal112=null;
        Token char_literal114=null;
        CPPGrammarParser.parameter_name__return parameter_name_109 =null;

        CPPGrammarParser.identifier_return identifier111 =null;

        CPPGrammarParser.constant_expr_return constant_expr113 =null;


        CommonTree char_literal108_tree=null;
        CommonTree char_literal110_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree char_literal114_tree=null;

        try {
            // CPPGrammar.g:121:16: ( ( '(' parameter_name_ ')' | identifier ) ( '[' constant_expr ']' )? )
            // CPPGrammar.g:121:18: ( '(' parameter_name_ ')' | identifier ) ( '[' constant_expr ']' )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:121:18: ( '(' parameter_name_ ')' | identifier )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==66) ) {
                alt40=1;
            }
            else if ( (LA40_0==ALPHA_NUMERIC) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // CPPGrammar.g:121:19: '(' parameter_name_ ')'
                    {
                    char_literal108=(Token)match(input,66,FOLLOW_66_in_parameter_name_1085); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal108_tree = 
                    (CommonTree)adaptor.create(char_literal108)
                    ;
                    adaptor.addChild(root_0, char_literal108_tree);
                    }

                    pushFollow(FOLLOW_parameter_name__in_parameter_name_1087);
                    parameter_name_109=parameter_name_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_name_109.getTree());

                    char_literal110=(Token)match(input,67,FOLLOW_67_in_parameter_name_1089); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal110_tree = 
                    (CommonTree)adaptor.create(char_literal110)
                    ;
                    adaptor.addChild(root_0, char_literal110_tree);
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:121:45: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_parameter_name_1093);
                    identifier111=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier111.getTree());

                    }
                    break;

            }


            // CPPGrammar.g:121:57: ( '[' constant_expr ']' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==94) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // CPPGrammar.g:121:58: '[' constant_expr ']'
                    {
                    char_literal112=(Token)match(input,94,FOLLOW_94_in_parameter_name_1097); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal112_tree = 
                    (CommonTree)adaptor.create(char_literal112)
                    ;
                    adaptor.addChild(root_0, char_literal112_tree);
                    }

                    pushFollow(FOLLOW_constant_expr_in_parameter_name_1099);
                    constant_expr113=constant_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expr113.getTree());

                    char_literal114=(Token)match(input,95,FOLLOW_95_in_parameter_name_1101); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal114_tree = 
                    (CommonTree)adaptor.create(char_literal114)
                    ;
                    adaptor.addChild(root_0, char_literal114_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_name_"


    public static class param_decl_specifiers_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_decl_specifiers"
    // CPPGrammar.g:122:1: param_decl_specifiers : ( 'auto' | 'register' )? type_specifier ;
    public final CPPGrammarParser.param_decl_specifiers_return param_decl_specifiers() throws RecognitionException {
        CPPGrammarParser.param_decl_specifiers_return retval = new CPPGrammarParser.param_decl_specifiers_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set115=null;
        CPPGrammarParser.type_specifier_return type_specifier116 =null;


        CommonTree set115_tree=null;

        try {
            // CPPGrammar.g:122:22: ( ( 'auto' | 'register' )? type_specifier )
            // CPPGrammar.g:122:24: ( 'auto' | 'register' )? type_specifier
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:122:24: ( 'auto' | 'register' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==98||LA42_0==121) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // CPPGrammar.g:
                    {
                    set115=(Token)input.LT(1);

                    if ( input.LA(1)==98||input.LA(1)==121 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set115)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_type_specifier_in_param_decl_specifiers1118);
            type_specifier116=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier116.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param_decl_specifiers"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // CPPGrammar.g:126:1: statement : ( compound_statement | non_compound_statement );
    public final CPPGrammarParser.statement_return statement() throws RecognitionException {
        CPPGrammarParser.statement_return retval = new CPPGrammarParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.compound_statement_return compound_statement117 =null;

        CPPGrammarParser.non_compound_statement_return non_compound_statement118 =null;



        try {
            // CPPGrammar.g:126:10: ( compound_statement | non_compound_statement )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==137) ) {
                alt43=1;
            }
            else if ( ((LA43_0 >= ALPHA_NUMERIC && LA43_0 <= 136)||(LA43_0 >= 138 && LA43_0 <= 140)||LA43_0==142) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // CPPGrammar.g:126:12: compound_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_compound_statement_in_statement1127);
                    compound_statement117=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement117.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:127:12: non_compound_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_non_compound_statement_in_statement1140);
                    non_compound_statement118=non_compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, non_compound_statement118.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class compound_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compound_statement"
    // CPPGrammar.g:130:1: compound_statement : '{' ( statement )* '}' -> '{' ^( STATEMENTS ( statement )* ) '}' ;
    public final CPPGrammarParser.compound_statement_return compound_statement() throws RecognitionException {
        CPPGrammarParser.compound_statement_return retval = new CPPGrammarParser.compound_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal119=null;
        Token char_literal121=null;
        CPPGrammarParser.statement_return statement120 =null;


        CommonTree char_literal119_tree=null;
        CommonTree char_literal121_tree=null;
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // CPPGrammar.g:130:19: ( '{' ( statement )* '}' -> '{' ^( STATEMENTS ( statement )* ) '}' )
            // CPPGrammar.g:130:21: '{' ( statement )* '}'
            {
            char_literal119=(Token)match(input,137,FOLLOW_137_in_compound_statement1148); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_137.add(char_literal119);


            // CPPGrammar.g:130:25: ( statement )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0 >= ALPHA_NUMERIC && LA44_0 <= 140)||LA44_0==142) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // CPPGrammar.g:130:25: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compound_statement1150);
            	    statement120=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement120.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            char_literal121=(Token)match(input,141,FOLLOW_141_in_compound_statement1153); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_141.add(char_literal121);


            // AST REWRITE
            // elements: statement, 137, 141
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 130:40: -> '{' ^( STATEMENTS ( statement )* ) '}'
            {
                adaptor.addChild(root_0, 
                stream_137.nextNode()
                );

                // CPPGrammar.g:130:47: ^( STATEMENTS ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:130:60: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, 
                stream_141.nextNode()
                );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compound_statement"


    public static class non_compound_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "non_compound_statement"
    // CPPGrammar.g:132:1: non_compound_statement : ( ( non_expr_statement )=> non_expr_statement | ( expr_statement )=> expr_statement | statement_water );
    public final CPPGrammarParser.non_compound_statement_return non_compound_statement() throws RecognitionException {
        CPPGrammarParser.non_compound_statement_return retval = new CPPGrammarParser.non_compound_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.non_expr_statement_return non_expr_statement122 =null;

        CPPGrammarParser.expr_statement_return expr_statement123 =null;

        CPPGrammarParser.statement_water_return statement_water124 =null;



        try {
            // CPPGrammar.g:132:23: ( ( non_expr_statement )=> non_expr_statement | ( expr_statement )=> expr_statement | statement_water )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 113:
                {
                int LA45_1 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;

                }
                }
                break;
            case 107:
                {
                int LA45_2 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;

                }
                }
                break;
            case 126:
                {
                int LA45_3 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 3, input);

                    throw nvae;

                }
                }
                break;
            case 110:
                {
                int LA45_4 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 4, input);

                    throw nvae;

                }
                }
                break;
            case 136:
                {
                int LA45_5 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 5, input);

                    throw nvae;

                }
                }
                break;
            case 106:
                {
                int LA45_6 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 6, input);

                    throw nvae;

                }
                }
                break;
            case 99:
                {
                int LA45_7 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 7, input);

                    throw nvae;

                }
                }
                break;
            case 104:
                {
                int LA45_8 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 8, input);

                    throw nvae;

                }
                }
                break;
            case 122:
                {
                int LA45_9 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 9, input);

                    throw nvae;

                }
                }
                break;
            case 112:
                {
                int LA45_10 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 10, input);

                    throw nvae;

                }
                }
                break;
            case 129:
                {
                int LA45_11 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 11, input);

                    throw nvae;

                }
                }
                break;
            case 101:
                {
                int LA45_12 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 12, input);

                    throw nvae;

                }
                }
                break;
            case 130:
                {
                int LA45_13 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 13, input);

                    throw nvae;

                }
                }
                break;
            case 127:
                {
                int LA45_14 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 14, input);

                    throw nvae;

                }
                }
                break;
            case 103:
            case 135:
                {
                int LA45_15 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 15, input);

                    throw nvae;

                }
                }
                break;
            case 102:
            case 108:
            case 125:
            case 131:
                {
                int LA45_16 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 16, input);

                    throw nvae;

                }
                }
                break;
            case 123:
            case 132:
                {
                int LA45_17 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 17, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA45_18 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 18, input);

                    throw nvae;

                }
                }
                break;
            case 100:
                {
                int LA45_19 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 19, input);

                    throw nvae;

                }
                }
                break;
            case DIGITS:
            case 82:
                {
                int LA45_20 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 20, input);

                    throw nvae;

                }
                }
                break;
            case 118:
            case 119:
            case 120:
                {
                int LA45_21 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 21, input);

                    throw nvae;

                }
                }
                break;
            case 66:
                {
                int LA45_22 = input.LA(2);

                if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 22, input);

                    throw nvae;

                }
                }
                break;
            case 64:
            case 68:
                {
                int LA45_23 = input.LA(2);

                if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 23, input);

                    throw nvae;

                }
                }
                break;
            case ARGUMENT:
            case ARGUMENT_LIST:
            case BASE_CLASSES:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COMMENT:
            case CONDITION:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case DESTINATION:
            case DOT:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case INCLUDE_DIRECTIVE:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case INIT_DECL_NAME:
            case ITERATION:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case NAMESPACE_DEF:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case PARAMETER_NAME:
            case PARAMETER_TYPE:
            case PREPROC:
            case Q_MARK:
            case RETURN_TYPE:
            case SELECTION:
            case SIMPLE_DECL:
            case SIZEOF:
            case SOURCE_FILE:
            case STATEMENTS:
            case STRING:
            case SW:
            case SWITCH:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE_DEF:
            case TYPE_SPECIFIER:
            case USING_DIRECTIVE:
            case WHITESPACE:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 65:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 105:
            case 109:
            case 111:
            case 114:
            case 115:
            case 116:
            case 117:
            case 121:
            case 124:
            case 128:
            case 133:
            case 134:
            case 138:
            case 139:
            case 140:
            case 142:
                {
                int LA45_24 = input.LA(2);

                if ( (synpred7_CPPGrammar()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 24, input);

                    throw nvae;

                }
                }
                break;
            case 83:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // CPPGrammar.g:132:26: ( non_expr_statement )=> non_expr_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_non_expr_statement_in_non_compound_statement1180);
                    non_expr_statement122=non_expr_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, non_expr_statement122.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:133:7: ( expr_statement )=> expr_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_statement_in_non_compound_statement1194);
                    expr_statement123=expr_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_statement123.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:134:7: statement_water
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_statement_water_in_non_compound_statement1202);
                    statement_water124=statement_water();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_water124.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "non_compound_statement"


    public static class non_expr_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "non_expr_statement"
    // CPPGrammar.g:137:1: non_expr_statement : ( selection_statement | iteration_statement | jump_statement | try_block | catch_block | simple_decl | label );
    public final CPPGrammarParser.non_expr_statement_return non_expr_statement() throws RecognitionException {
        CPPGrammarParser.non_expr_statement_return retval = new CPPGrammarParser.non_expr_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.selection_statement_return selection_statement125 =null;

        CPPGrammarParser.iteration_statement_return iteration_statement126 =null;

        CPPGrammarParser.jump_statement_return jump_statement127 =null;

        CPPGrammarParser.try_block_return try_block128 =null;

        CPPGrammarParser.catch_block_return catch_block129 =null;

        CPPGrammarParser.simple_decl_return simple_decl130 =null;

        CPPGrammarParser.label_return label131 =null;



        try {
            // CPPGrammar.g:137:19: ( selection_statement | iteration_statement | jump_statement | try_block | catch_block | simple_decl | label )
            int alt46=7;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // CPPGrammar.g:137:21: selection_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_selection_statement_in_non_expr_statement1210);
                    selection_statement125=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement125.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:137:43: iteration_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_iteration_statement_in_non_expr_statement1214);
                    iteration_statement126=iteration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement126.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:138:7: jump_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_jump_statement_in_non_expr_statement1222);
                    jump_statement127=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement127.getTree());

                    }
                    break;
                case 4 :
                    // CPPGrammar.g:138:24: try_block
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_try_block_in_non_expr_statement1226);
                    try_block128=try_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_block128.getTree());

                    }
                    break;
                case 5 :
                    // CPPGrammar.g:138:36: catch_block
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_catch_block_in_non_expr_statement1230);
                    catch_block129=catch_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catch_block129.getTree());

                    }
                    break;
                case 6 :
                    // CPPGrammar.g:138:50: simple_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simple_decl_in_non_expr_statement1234);
                    simple_decl130=simple_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_decl130.getTree());

                    }
                    break;
                case 7 :
                    // CPPGrammar.g:138:64: label
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_label_in_non_expr_statement1238);
                    label131=label();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, label131.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "non_expr_statement"


    public static class statement_water_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement_water"
    // CPPGrammar.g:142:1: statement_water : no_curlies -> ^( SW no_curlies ) ;
    public final CPPGrammarParser.statement_water_return statement_water() throws RecognitionException {
        CPPGrammarParser.statement_water_return retval = new CPPGrammarParser.statement_water_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.no_curlies_return no_curlies132 =null;


        RewriteRuleSubtreeStream stream_no_curlies=new RewriteRuleSubtreeStream(adaptor,"rule no_curlies");
        try {
            // CPPGrammar.g:142:16: ( no_curlies -> ^( SW no_curlies ) )
            // CPPGrammar.g:142:18: no_curlies
            {
            pushFollow(FOLLOW_no_curlies_in_statement_water1247);
            no_curlies132=no_curlies();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_no_curlies.add(no_curlies132.getTree());

            // AST REWRITE
            // elements: no_curlies
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 142:29: -> ^( SW no_curlies )
            {
                // CPPGrammar.g:142:31: ^( SW no_curlies )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SW, "SW")
                , root_1);

                adaptor.addChild(root_1, stream_no_curlies.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement_water"


    public static class expr_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_statement"
    // CPPGrammar.g:144:1: expr_statement : expr_statement_start ( expr_statement_elem )* ';' ;
    public final CPPGrammarParser.expr_statement_return expr_statement() throws RecognitionException {
        CPPGrammarParser.expr_statement_return retval = new CPPGrammarParser.expr_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal135=null;
        CPPGrammarParser.expr_statement_start_return expr_statement_start133 =null;

        CPPGrammarParser.expr_statement_elem_return expr_statement_elem134 =null;


        CommonTree char_literal135_tree=null;

        try {
            // CPPGrammar.g:144:15: ( expr_statement_start ( expr_statement_elem )* ';' )
            // CPPGrammar.g:144:17: expr_statement_start ( expr_statement_elem )* ';'
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_statement_start_in_expr_statement1261);
            expr_statement_start133=expr_statement_start();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_statement_start133.getTree());

            // CPPGrammar.g:144:38: ( expr_statement_elem )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0 >= ALPHA_NUMERIC && LA47_0 <= 82)||(LA47_0 >= 84 && LA47_0 <= 140)||LA47_0==142) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // CPPGrammar.g:144:38: expr_statement_elem
            	    {
            	    pushFollow(FOLLOW_expr_statement_elem_in_expr_statement1263);
            	    expr_statement_elem134=expr_statement_elem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_statement_elem134.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            char_literal135=(Token)match(input,83,FOLLOW_83_in_expr_statement1266); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal135_tree = 
            (CommonTree)adaptor.create(char_literal135)
            ;
            adaptor.addChild(root_0, char_literal135_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_statement"


    public static class expr_statement_start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_statement_start"
    // CPPGrammar.g:146:1: expr_statement_start : ( ( recognized_expr )=> recognized_expr | expr_statement_water );
    public final CPPGrammarParser.expr_statement_start_return expr_statement_start() throws RecognitionException {
        CPPGrammarParser.expr_statement_start_return retval = new CPPGrammarParser.expr_statement_start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.recognized_expr_return recognized_expr136 =null;

        CPPGrammarParser.expr_statement_water_return expr_statement_water137 =null;



        try {
            // CPPGrammar.g:146:21: ( ( recognized_expr )=> recognized_expr | expr_statement_water )
            int alt48=2;
            switch ( input.LA(1) ) {
            case 66:
                {
                int LA48_1 = input.LA(2);

                if ( (synpred8_CPPGrammar()) ) {
                    alt48=1;
                }
                else if ( (true) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;

                }
                }
                break;
            case 64:
            case 68:
                {
                int LA48_2 = input.LA(2);

                if ( (synpred8_CPPGrammar()) ) {
                    alt48=1;
                }
                else if ( (true) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA48_3 = input.LA(2);

                if ( (synpred8_CPPGrammar()) ) {
                    alt48=1;
                }
                else if ( (true) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 3, input);

                    throw nvae;

                }
                }
                break;
            case ARGUMENT:
            case ARGUMENT_LIST:
            case BASE_CLASSES:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COMMENT:
            case CONDITION:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case DESTINATION:
            case DIGITS:
            case DOT:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case INCLUDE_DIRECTIVE:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case INIT_DECL_NAME:
            case ITERATION:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case NAMESPACE_DEF:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case PARAMETER_NAME:
            case PARAMETER_TYPE:
            case PREPROC:
            case Q_MARK:
            case RETURN_TYPE:
            case SELECTION:
            case SIMPLE_DECL:
            case SIZEOF:
            case SOURCE_FILE:
            case STATEMENTS:
            case STRING:
            case SW:
            case SWITCH:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE_DEF:
            case TYPE_SPECIFIER:
            case USING_DIRECTIVE:
            case WHITESPACE:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 65:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 138:
            case 139:
            case 140:
            case 142:
                {
                alt48=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // CPPGrammar.g:146:23: ( recognized_expr )=> recognized_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_recognized_expr_in_expr_statement_start1279);
                    recognized_expr136=recognized_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recognized_expr136.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:147:7: expr_statement_water
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_statement_water_in_expr_statement_start1287);
                    expr_statement_water137=expr_statement_water();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_statement_water137.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_statement_start"


    public static class expr_statement_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_statement_elem"
    // CPPGrammar.g:149:1: expr_statement_elem : ( ( recognized_expr )=> recognized_expr | '{' expr_statement_l2 '}' | expr_statement_water );
    public final CPPGrammarParser.expr_statement_elem_return expr_statement_elem() throws RecognitionException {
        CPPGrammarParser.expr_statement_elem_return retval = new CPPGrammarParser.expr_statement_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal139=null;
        Token char_literal141=null;
        CPPGrammarParser.recognized_expr_return recognized_expr138 =null;

        CPPGrammarParser.expr_statement_l2_return expr_statement_l2140 =null;

        CPPGrammarParser.expr_statement_water_return expr_statement_water142 =null;


        CommonTree char_literal139_tree=null;
        CommonTree char_literal141_tree=null;

        try {
            // CPPGrammar.g:149:20: ( ( recognized_expr )=> recognized_expr | '{' expr_statement_l2 '}' | expr_statement_water )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                int LA49_1 = input.LA(2);

                if ( (synpred9_CPPGrammar()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;

                }
                }
                break;
            case 64:
            case 68:
                {
                int LA49_2 = input.LA(2);

                if ( (synpred9_CPPGrammar()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 2, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA49_3 = input.LA(2);

                if ( (synpred9_CPPGrammar()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 3, input);

                    throw nvae;

                }
                }
                break;
            case 137:
                {
                alt49=2;
                }
                break;
            case ARGUMENT:
            case ARGUMENT_LIST:
            case BASE_CLASSES:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COMMENT:
            case CONDITION:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case DESTINATION:
            case DIGITS:
            case DOT:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case INCLUDE_DIRECTIVE:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case INIT_DECL_NAME:
            case ITERATION:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case NAMESPACE_DEF:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case PARAMETER_NAME:
            case PARAMETER_TYPE:
            case PREPROC:
            case Q_MARK:
            case RETURN_TYPE:
            case SELECTION:
            case SIMPLE_DECL:
            case SIZEOF:
            case SOURCE_FILE:
            case STATEMENTS:
            case STRING:
            case SW:
            case SWITCH:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE_DEF:
            case TYPE_SPECIFIER:
            case USING_DIRECTIVE:
            case WHITESPACE:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 65:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 138:
            case 139:
            case 140:
            case 142:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // CPPGrammar.g:149:23: ( recognized_expr )=> recognized_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_recognized_expr_in_expr_statement_elem1301);
                    recognized_expr138=recognized_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recognized_expr138.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:150:7: '{' expr_statement_l2 '}'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal139=(Token)match(input,137,FOLLOW_137_in_expr_statement_elem1309); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal139_tree = 
                    (CommonTree)adaptor.create(char_literal139)
                    ;
                    adaptor.addChild(root_0, char_literal139_tree);
                    }

                    pushFollow(FOLLOW_expr_statement_l2_in_expr_statement_elem1311);
                    expr_statement_l2140=expr_statement_l2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_statement_l2140.getTree());

                    char_literal141=(Token)match(input,141,FOLLOW_141_in_expr_statement_elem1313); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal141_tree = 
                    (CommonTree)adaptor.create(char_literal141)
                    ;
                    adaptor.addChild(root_0, char_literal141_tree);
                    }

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:151:7: expr_statement_water
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_statement_water_in_expr_statement_elem1340);
                    expr_statement_water142=expr_statement_water();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_statement_water142.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_statement_elem"


    public static class expr_statement_l2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_statement_l2"
    // CPPGrammar.g:154:1: expr_statement_l2 : ( expr_statement_l2_elem )* ;
    public final CPPGrammarParser.expr_statement_l2_return expr_statement_l2() throws RecognitionException {
        CPPGrammarParser.expr_statement_l2_return retval = new CPPGrammarParser.expr_statement_l2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.expr_statement_l2_elem_return expr_statement_l2_elem143 =null;



        try {
            // CPPGrammar.g:154:18: ( ( expr_statement_l2_elem )* )
            // CPPGrammar.g:154:20: ( expr_statement_l2_elem )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:154:20: ( expr_statement_l2_elem )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0 >= ALPHA_NUMERIC && LA50_0 <= 140)||LA50_0==142) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // CPPGrammar.g:154:20: expr_statement_l2_elem
            	    {
            	    pushFollow(FOLLOW_expr_statement_l2_elem_in_expr_statement_l21348);
            	    expr_statement_l2_elem143=expr_statement_l2_elem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_statement_l2_elem143.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_statement_l2"


    public static class expr_statement_l2_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_statement_l2_elem"
    // CPPGrammar.g:156:1: expr_statement_l2_elem : ( ( recognized_expr )=> recognized_expr | '{' expr_statement_l2 '}' | expr_statement_l2_water );
    public final CPPGrammarParser.expr_statement_l2_elem_return expr_statement_l2_elem() throws RecognitionException {
        CPPGrammarParser.expr_statement_l2_elem_return retval = new CPPGrammarParser.expr_statement_l2_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal145=null;
        Token char_literal147=null;
        CPPGrammarParser.recognized_expr_return recognized_expr144 =null;

        CPPGrammarParser.expr_statement_l2_return expr_statement_l2146 =null;

        CPPGrammarParser.expr_statement_l2_water_return expr_statement_l2_water148 =null;


        CommonTree char_literal145_tree=null;
        CommonTree char_literal147_tree=null;

        try {
            // CPPGrammar.g:156:23: ( ( recognized_expr )=> recognized_expr | '{' expr_statement_l2 '}' | expr_statement_l2_water )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                int LA51_1 = input.LA(2);

                if ( (synpred10_CPPGrammar()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;

                }
                }
                break;
            case 64:
            case 68:
                {
                int LA51_2 = input.LA(2);

                if ( (synpred10_CPPGrammar()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA51_3 = input.LA(2);

                if ( (synpred10_CPPGrammar()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 3, input);

                    throw nvae;

                }
                }
                break;
            case 137:
                {
                alt51=2;
                }
                break;
            case ARGUMENT:
            case ARGUMENT_LIST:
            case BASE_CLASSES:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COMMENT:
            case CONDITION:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case DESTINATION:
            case DIGITS:
            case DOT:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case INCLUDE_DIRECTIVE:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case INIT_DECL_NAME:
            case ITERATION:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case NAMESPACE_DEF:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case PARAMETER_NAME:
            case PARAMETER_TYPE:
            case PREPROC:
            case Q_MARK:
            case RETURN_TYPE:
            case SELECTION:
            case SIMPLE_DECL:
            case SIZEOF:
            case SOURCE_FILE:
            case STATEMENTS:
            case STRING:
            case SW:
            case SWITCH:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE_DEF:
            case TYPE_SPECIFIER:
            case USING_DIRECTIVE:
            case WHITESPACE:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 65:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 138:
            case 139:
            case 140:
            case 142:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // CPPGrammar.g:156:25: ( recognized_expr )=> recognized_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_recognized_expr_in_expr_statement_l2_elem1362);
                    recognized_expr144=recognized_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recognized_expr144.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:157:2: '{' expr_statement_l2 '}'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal145=(Token)match(input,137,FOLLOW_137_in_expr_statement_l2_elem1365); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal145_tree = 
                    (CommonTree)adaptor.create(char_literal145)
                    ;
                    adaptor.addChild(root_0, char_literal145_tree);
                    }

                    pushFollow(FOLLOW_expr_statement_l2_in_expr_statement_l2_elem1367);
                    expr_statement_l2146=expr_statement_l2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_statement_l2146.getTree());

                    char_literal147=(Token)match(input,141,FOLLOW_141_in_expr_statement_l2_elem1369); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal147_tree = 
                    (CommonTree)adaptor.create(char_literal147)
                    ;
                    adaptor.addChild(root_0, char_literal147_tree);
                    }

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:158:3: expr_statement_l2_water
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_statement_l2_water_in_expr_statement_l2_elem1373);
                    expr_statement_l2_water148=expr_statement_l2_water();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_statement_l2_water148.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_statement_l2_elem"


    public static class expr_statement_water_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_statement_water"
    // CPPGrammar.g:161:1: expr_statement_water : expr_statement_water_ -> ^( SW expr_statement_water_ ) ;
    public final CPPGrammarParser.expr_statement_water_return expr_statement_water() throws RecognitionException {
        CPPGrammarParser.expr_statement_water_return retval = new CPPGrammarParser.expr_statement_water_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.expr_statement_water__return expr_statement_water_149 =null;


        RewriteRuleSubtreeStream stream_expr_statement_water_=new RewriteRuleSubtreeStream(adaptor,"rule expr_statement_water_");
        try {
            // CPPGrammar.g:161:21: ( expr_statement_water_ -> ^( SW expr_statement_water_ ) )
            // CPPGrammar.g:161:23: expr_statement_water_
            {
            pushFollow(FOLLOW_expr_statement_water__in_expr_statement_water1400);
            expr_statement_water_149=expr_statement_water_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr_statement_water_.add(expr_statement_water_149.getTree());

            // AST REWRITE
            // elements: expr_statement_water_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 161:45: -> ^( SW expr_statement_water_ )
            {
                // CPPGrammar.g:161:47: ^( SW expr_statement_water_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SW, "SW")
                , root_1);

                adaptor.addChild(root_1, stream_expr_statement_water_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_statement_water"


    public static class expr_statement_l2_water_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_statement_l2_water"
    // CPPGrammar.g:162:1: expr_statement_l2_water : expr_statement_l2_water_ -> ^( SW expr_statement_l2_water_ ) ;
    public final CPPGrammarParser.expr_statement_l2_water_return expr_statement_l2_water() throws RecognitionException {
        CPPGrammarParser.expr_statement_l2_water_return retval = new CPPGrammarParser.expr_statement_l2_water_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.expr_statement_l2_water__return expr_statement_l2_water_150 =null;


        RewriteRuleSubtreeStream stream_expr_statement_l2_water_=new RewriteRuleSubtreeStream(adaptor,"rule expr_statement_l2_water_");
        try {
            // CPPGrammar.g:162:24: ( expr_statement_l2_water_ -> ^( SW expr_statement_l2_water_ ) )
            // CPPGrammar.g:162:26: expr_statement_l2_water_
            {
            pushFollow(FOLLOW_expr_statement_l2_water__in_expr_statement_l2_water1413);
            expr_statement_l2_water_150=expr_statement_l2_water_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr_statement_l2_water_.add(expr_statement_l2_water_150.getTree());

            // AST REWRITE
            // elements: expr_statement_l2_water_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 162:51: -> ^( SW expr_statement_l2_water_ )
            {
                // CPPGrammar.g:162:53: ^( SW expr_statement_l2_water_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SW, "SW")
                , root_1);

                adaptor.addChild(root_1, stream_expr_statement_l2_water_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_statement_l2_water"


    public static class expr_statement_water__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_statement_water_"
    // CPPGrammar.g:164:1: expr_statement_water_ : ~ ( '{' | '}' | ';' ) ;
    public final CPPGrammarParser.expr_statement_water__return expr_statement_water_() throws RecognitionException {
        CPPGrammarParser.expr_statement_water__return retval = new CPPGrammarParser.expr_statement_water__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set151=null;

        CommonTree set151_tree=null;

        try {
            // CPPGrammar.g:164:22: (~ ( '{' | '}' | ';' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set151=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 82)||(input.LA(1) >= 84 && input.LA(1) <= 136)||(input.LA(1) >= 138 && input.LA(1) <= 140)||input.LA(1)==142 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set151)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_statement_water_"


    public static class expr_statement_l2_water__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_statement_l2_water_"
    // CPPGrammar.g:165:1: expr_statement_l2_water_ : no_curlies ;
    public final CPPGrammarParser.expr_statement_l2_water__return expr_statement_l2_water_() throws RecognitionException {
        CPPGrammarParser.expr_statement_l2_water__return retval = new CPPGrammarParser.expr_statement_l2_water__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.no_curlies_return no_curlies152 =null;



        try {
            // CPPGrammar.g:165:25: ( no_curlies )
            // CPPGrammar.g:165:27: no_curlies
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_no_curlies_in_expr_statement_l2_water_1444);
            no_curlies152=no_curlies();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, no_curlies152.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_statement_l2_water_"


    public static class selection_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_statement"
    // CPPGrammar.g:167:1: selection_statement : selection_statement_ -> ^( SELECTION selection_statement_ ) ;
    public final CPPGrammarParser.selection_statement_return selection_statement() throws RecognitionException {
        CPPGrammarParser.selection_statement_return retval = new CPPGrammarParser.selection_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.selection_statement__return selection_statement_153 =null;


        RewriteRuleSubtreeStream stream_selection_statement_=new RewriteRuleSubtreeStream(adaptor,"rule selection_statement_");
        try {
            // CPPGrammar.g:167:20: ( selection_statement_ -> ^( SELECTION selection_statement_ ) )
            // CPPGrammar.g:167:22: selection_statement_
            {
            pushFollow(FOLLOW_selection_statement__in_selection_statement1451);
            selection_statement_153=selection_statement_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selection_statement_.add(selection_statement_153.getTree());

            // AST REWRITE
            // elements: selection_statement_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 167:43: -> ^( SELECTION selection_statement_ )
            {
                // CPPGrammar.g:167:46: ^( SELECTION selection_statement_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SELECTION, "SELECTION")
                , root_1);

                adaptor.addChild(root_1, stream_selection_statement_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selection_statement"


    public static class selection_statement__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_statement_"
    // CPPGrammar.g:168:1: selection_statement_ : ( if_statement | else_statement | switch_statement );
    public final CPPGrammarParser.selection_statement__return selection_statement_() throws RecognitionException {
        CPPGrammarParser.selection_statement__return retval = new CPPGrammarParser.selection_statement__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.if_statement_return if_statement154 =null;

        CPPGrammarParser.else_statement_return else_statement155 =null;

        CPPGrammarParser.switch_statement_return switch_statement156 =null;



        try {
            // CPPGrammar.g:168:21: ( if_statement | else_statement | switch_statement )
            int alt52=3;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt52=1;
                }
                break;
            case 107:
                {
                alt52=2;
                }
                break;
            case 126:
                {
                alt52=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // CPPGrammar.g:168:23: if_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_if_statement_in_selection_statement_1465);
                    if_statement154=if_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_statement154.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:168:38: else_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_else_statement_in_selection_statement_1469);
                    else_statement155=else_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, else_statement155.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:168:55: switch_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_switch_statement_in_selection_statement_1473);
                    switch_statement156=switch_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switch_statement156.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selection_statement_"


    public static class iteration_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_statement"
    // CPPGrammar.g:170:1: iteration_statement : iteration_statement_ -> ^( ITERATION iteration_statement_ ) ;
    public final CPPGrammarParser.iteration_statement_return iteration_statement() throws RecognitionException {
        CPPGrammarParser.iteration_statement_return retval = new CPPGrammarParser.iteration_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.iteration_statement__return iteration_statement_157 =null;


        RewriteRuleSubtreeStream stream_iteration_statement_=new RewriteRuleSubtreeStream(adaptor,"rule iteration_statement_");
        try {
            // CPPGrammar.g:170:20: ( iteration_statement_ -> ^( ITERATION iteration_statement_ ) )
            // CPPGrammar.g:170:22: iteration_statement_
            {
            pushFollow(FOLLOW_iteration_statement__in_iteration_statement1480);
            iteration_statement_157=iteration_statement_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_iteration_statement_.add(iteration_statement_157.getTree());

            // AST REWRITE
            // elements: iteration_statement_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 170:43: -> ^( ITERATION iteration_statement_ )
            {
                // CPPGrammar.g:170:46: ^( ITERATION iteration_statement_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ITERATION, "ITERATION")
                , root_1);

                adaptor.addChild(root_1, stream_iteration_statement_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iteration_statement"


    public static class iteration_statement__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_statement_"
    // CPPGrammar.g:171:1: iteration_statement_ : ( for_statement | while_statement | do_statement );
    public final CPPGrammarParser.iteration_statement__return iteration_statement_() throws RecognitionException {
        CPPGrammarParser.iteration_statement__return retval = new CPPGrammarParser.iteration_statement__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.for_statement_return for_statement158 =null;

        CPPGrammarParser.while_statement_return while_statement159 =null;

        CPPGrammarParser.do_statement_return do_statement160 =null;



        try {
            // CPPGrammar.g:171:21: ( for_statement | while_statement | do_statement )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt53=1;
                }
                break;
            case 136:
                {
                alt53=2;
                }
                break;
            case 106:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }

            switch (alt53) {
                case 1 :
                    // CPPGrammar.g:171:23: for_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_for_statement_in_iteration_statement_1494);
                    for_statement158=for_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_statement158.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:171:39: while_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_while_statement_in_iteration_statement_1498);
                    while_statement159=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_statement159.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:171:57: do_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_do_statement_in_iteration_statement_1502);
                    do_statement160=do_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, do_statement160.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iteration_statement_"


    public static class jump_statement__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump_statement_"
    // CPPGrammar.g:173:1: jump_statement_ : ( break_or_continue | return_statement | goto_statement ) ';' ;
    public final CPPGrammarParser.jump_statement__return jump_statement_() throws RecognitionException {
        CPPGrammarParser.jump_statement__return retval = new CPPGrammarParser.jump_statement__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal164=null;
        CPPGrammarParser.break_or_continue_return break_or_continue161 =null;

        CPPGrammarParser.return_statement_return return_statement162 =null;

        CPPGrammarParser.goto_statement_return goto_statement163 =null;


        CommonTree char_literal164_tree=null;

        try {
            // CPPGrammar.g:173:16: ( ( break_or_continue | return_statement | goto_statement ) ';' )
            // CPPGrammar.g:173:18: ( break_or_continue | return_statement | goto_statement ) ';'
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:173:18: ( break_or_continue | return_statement | goto_statement )
            int alt54=3;
            switch ( input.LA(1) ) {
            case 99:
            case 104:
                {
                alt54=1;
                }
                break;
            case 122:
                {
                alt54=2;
                }
                break;
            case 112:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }

            switch (alt54) {
                case 1 :
                    // CPPGrammar.g:173:20: break_or_continue
                    {
                    pushFollow(FOLLOW_break_or_continue_in_jump_statement_1511);
                    break_or_continue161=break_or_continue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, break_or_continue161.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:173:40: return_statement
                    {
                    pushFollow(FOLLOW_return_statement_in_jump_statement_1515);
                    return_statement162=return_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, return_statement162.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:173:58: goto_statement
                    {
                    pushFollow(FOLLOW_goto_statement_in_jump_statement_1518);
                    goto_statement163=goto_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goto_statement163.getTree());

                    }
                    break;

            }


            char_literal164=(Token)match(input,83,FOLLOW_83_in_jump_statement_1522); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal164_tree = 
            (CommonTree)adaptor.create(char_literal164)
            ;
            adaptor.addChild(root_0, char_literal164_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "jump_statement_"


    public static class break_or_continue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "break_or_continue"
    // CPPGrammar.g:174:1: break_or_continue : (k= 'break' |k= 'continue' ) -> ^( KEYWORD $k) ^( DESTINATION ) ;
    public final CPPGrammarParser.break_or_continue_return break_or_continue() throws RecognitionException {
        CPPGrammarParser.break_or_continue_return retval = new CPPGrammarParser.break_or_continue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;

        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");

        try {
            // CPPGrammar.g:174:18: ( (k= 'break' |k= 'continue' ) -> ^( KEYWORD $k) ^( DESTINATION ) )
            // CPPGrammar.g:174:20: (k= 'break' |k= 'continue' )
            {
            // CPPGrammar.g:174:20: (k= 'break' |k= 'continue' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==99) ) {
                alt55=1;
            }
            else if ( (LA55_0==104) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }
            switch (alt55) {
                case 1 :
                    // CPPGrammar.g:174:21: k= 'break'
                    {
                    k=(Token)match(input,99,FOLLOW_99_in_break_or_continue1531); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(k);


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:174:33: k= 'continue'
                    {
                    k=(Token)match(input,104,FOLLOW_104_in_break_or_continue1537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_104.add(k);


                    }
                    break;

            }


            // AST REWRITE
            // elements: k
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 174:47: -> ^( KEYWORD $k) ^( DESTINATION )
            {
                // CPPGrammar.g:174:50: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:174:64: ^( DESTINATION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DESTINATION, "DESTINATION")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "break_or_continue"


    public static class return_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_statement"
    // CPPGrammar.g:175:1: return_statement : k= 'return' ( expr )? -> ^( KEYWORD $k) ^( DESTINATION ( expr )? ) ;
    public final CPPGrammarParser.return_statement_return return_statement() throws RecognitionException {
        CPPGrammarParser.return_statement_return retval = new CPPGrammarParser.return_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        CPPGrammarParser.expr_return expr165 =null;


        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // CPPGrammar.g:175:17: (k= 'return' ( expr )? -> ^( KEYWORD $k) ^( DESTINATION ( expr )? ) )
            // CPPGrammar.g:175:19: k= 'return' ( expr )?
            {
            k=(Token)match(input,122,FOLLOW_122_in_return_statement1559); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(k);


            // CPPGrammar.g:175:30: ( expr )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0 >= ALPHA_NUMERIC && LA56_0 <= 66)||(LA56_0 >= 68 && LA56_0 <= 82)||(LA56_0 >= 84 && LA56_0 <= 142)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // CPPGrammar.g:175:30: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_statement1561);
                    expr165=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr165.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: expr, k
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 175:36: -> ^( KEYWORD $k) ^( DESTINATION ( expr )? )
            {
                // CPPGrammar.g:175:39: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:175:53: ^( DESTINATION ( expr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DESTINATION, "DESTINATION")
                , root_1);

                // CPPGrammar.g:175:67: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_statement"


    public static class goto_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "goto_statement"
    // CPPGrammar.g:176:1: goto_statement : k= 'goto' (d= ALPHA_NUMERIC |d= DIGITS ) -> ^( KEYWORD $k) ^( DESTINATION ( $d)? ) ;
    public final CPPGrammarParser.goto_statement_return goto_statement() throws RecognitionException {
        CPPGrammarParser.goto_statement_return retval = new CPPGrammarParser.goto_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        Token d=null;

        CommonTree k_tree=null;
        CommonTree d_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_DIGITS=new RewriteRuleTokenStream(adaptor,"token DIGITS");
        RewriteRuleTokenStream stream_ALPHA_NUMERIC=new RewriteRuleTokenStream(adaptor,"token ALPHA_NUMERIC");

        try {
            // CPPGrammar.g:176:15: (k= 'goto' (d= ALPHA_NUMERIC |d= DIGITS ) -> ^( KEYWORD $k) ^( DESTINATION ( $d)? ) )
            // CPPGrammar.g:176:18: k= 'goto' (d= ALPHA_NUMERIC |d= DIGITS )
            {
            k=(Token)match(input,112,FOLLOW_112_in_goto_statement1587); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_112.add(k);


            // CPPGrammar.g:176:27: (d= ALPHA_NUMERIC |d= DIGITS )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ALPHA_NUMERIC) ) {
                alt57=1;
            }
            else if ( (LA57_0==DIGITS) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }
            switch (alt57) {
                case 1 :
                    // CPPGrammar.g:176:29: d= ALPHA_NUMERIC
                    {
                    d=(Token)match(input,ALPHA_NUMERIC,FOLLOW_ALPHA_NUMERIC_in_goto_statement1593); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ALPHA_NUMERIC.add(d);


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:176:47: d= DIGITS
                    {
                    d=(Token)match(input,DIGITS,FOLLOW_DIGITS_in_goto_statement1599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DIGITS.add(d);


                    }
                    break;

            }


            // AST REWRITE
            // elements: d, k
            // token labels: d, k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 176:57: -> ^( KEYWORD $k) ^( DESTINATION ( $d)? )
            {
                // CPPGrammar.g:176:60: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:176:74: ^( DESTINATION ( $d)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DESTINATION, "DESTINATION")
                , root_1);

                // CPPGrammar.g:176:89: ( $d)?
                if ( stream_d.hasNext() ) {
                    adaptor.addChild(root_1, stream_d.nextNode());

                }
                stream_d.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "goto_statement"


    public static class try_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "try_block"
    // CPPGrammar.g:178:1: try_block : 'try' compound_statement ;
    public final CPPGrammarParser.try_block_return try_block() throws RecognitionException {
        CPPGrammarParser.try_block_return retval = new CPPGrammarParser.try_block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal166=null;
        CPPGrammarParser.compound_statement_return compound_statement167 =null;


        CommonTree string_literal166_tree=null;

        try {
            // CPPGrammar.g:178:10: ( 'try' compound_statement )
            // CPPGrammar.g:178:12: 'try' compound_statement
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal166=(Token)match(input,129,FOLLOW_129_in_try_block1624); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal166_tree = 
            (CommonTree)adaptor.create(string_literal166)
            ;
            adaptor.addChild(root_0, string_literal166_tree);
            }

            pushFollow(FOLLOW_compound_statement_in_try_block1626);
            compound_statement167=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement167.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "try_block"


    public static class catch_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "catch_block"
    // CPPGrammar.g:179:1: catch_block : 'catch' '(' param_decl_specifiers ( parameter_name )? ')' compound_statement ;
    public final CPPGrammarParser.catch_block_return catch_block() throws RecognitionException {
        CPPGrammarParser.catch_block_return retval = new CPPGrammarParser.catch_block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal168=null;
        Token char_literal169=null;
        Token char_literal172=null;
        CPPGrammarParser.param_decl_specifiers_return param_decl_specifiers170 =null;

        CPPGrammarParser.parameter_name_return parameter_name171 =null;

        CPPGrammarParser.compound_statement_return compound_statement173 =null;


        CommonTree string_literal168_tree=null;
        CommonTree char_literal169_tree=null;
        CommonTree char_literal172_tree=null;

        try {
            // CPPGrammar.g:179:12: ( 'catch' '(' param_decl_specifiers ( parameter_name )? ')' compound_statement )
            // CPPGrammar.g:179:14: 'catch' '(' param_decl_specifiers ( parameter_name )? ')' compound_statement
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal168=(Token)match(input,101,FOLLOW_101_in_catch_block1632); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal168_tree = 
            (CommonTree)adaptor.create(string_literal168)
            ;
            adaptor.addChild(root_0, string_literal168_tree);
            }

            char_literal169=(Token)match(input,66,FOLLOW_66_in_catch_block1634); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal169_tree = 
            (CommonTree)adaptor.create(char_literal169)
            ;
            adaptor.addChild(root_0, char_literal169_tree);
            }

            pushFollow(FOLLOW_param_decl_specifiers_in_catch_block1635);
            param_decl_specifiers170=param_decl_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param_decl_specifiers170.getTree());

            // CPPGrammar.g:179:47: ( parameter_name )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==ALPHA_NUMERIC||LA58_0==66) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // CPPGrammar.g:179:47: parameter_name
                    {
                    pushFollow(FOLLOW_parameter_name_in_catch_block1637);
                    parameter_name171=parameter_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_name171.getTree());

                    }
                    break;

            }


            char_literal172=(Token)match(input,67,FOLLOW_67_in_catch_block1640); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal172_tree = 
            (CommonTree)adaptor.create(char_literal172)
            ;
            adaptor.addChild(root_0, char_literal172_tree);
            }

            pushFollow(FOLLOW_compound_statement_in_catch_block1642);
            compound_statement173=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement173.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "catch_block"


    public static class if_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_statement"
    // CPPGrammar.g:181:1: if_statement : k= 'if' '(' condition ')' statement -> ^( KEYWORD $k) condition ^( STATEMENTS ( statement )? ) ;
    public final CPPGrammarParser.if_statement_return if_statement() throws RecognitionException {
        CPPGrammarParser.if_statement_return retval = new CPPGrammarParser.if_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        Token char_literal174=null;
        Token char_literal176=null;
        CPPGrammarParser.condition_return condition175 =null;

        CPPGrammarParser.statement_return statement177 =null;


        CommonTree k_tree=null;
        CommonTree char_literal174_tree=null;
        CommonTree char_literal176_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // CPPGrammar.g:181:13: (k= 'if' '(' condition ')' statement -> ^( KEYWORD $k) condition ^( STATEMENTS ( statement )? ) )
            // CPPGrammar.g:181:15: k= 'if' '(' condition ')' statement
            {
            k=(Token)match(input,113,FOLLOW_113_in_if_statement1651); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_113.add(k);


            char_literal174=(Token)match(input,66,FOLLOW_66_in_if_statement1653); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal174);


            pushFollow(FOLLOW_condition_in_if_statement1655);
            condition175=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition175.getTree());

            char_literal176=(Token)match(input,67,FOLLOW_67_in_if_statement1657); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal176);


            pushFollow(FOLLOW_statement_in_if_statement1660);
            statement177=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement177.getTree());

            // AST REWRITE
            // elements: condition, statement, k
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 181:51: -> ^( KEYWORD $k) condition ^( STATEMENTS ( statement )? )
            {
                // CPPGrammar.g:181:54: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_condition.nextTree());

                // CPPGrammar.g:181:78: ^( STATEMENTS ( statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:181:91: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_statement"


    public static class else_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_statement"
    // CPPGrammar.g:182:1: else_statement : k= 'else' statement -> ^( KEYWORD $k) ^( STATEMENTS ( statement )? ) ;
    public final CPPGrammarParser.else_statement_return else_statement() throws RecognitionException {
        CPPGrammarParser.else_statement_return retval = new CPPGrammarParser.else_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        CPPGrammarParser.statement_return statement178 =null;


        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // CPPGrammar.g:182:15: (k= 'else' statement -> ^( KEYWORD $k) ^( STATEMENTS ( statement )? ) )
            // CPPGrammar.g:182:17: k= 'else' statement
            {
            k=(Token)match(input,107,FOLLOW_107_in_else_statement1687); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(k);


            pushFollow(FOLLOW_statement_in_else_statement1689);
            statement178=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement178.getTree());

            // AST REWRITE
            // elements: statement, k
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 182:36: -> ^( KEYWORD $k) ^( STATEMENTS ( statement )? )
            {
                // CPPGrammar.g:182:39: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:182:53: ^( STATEMENTS ( statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:182:66: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_statement"


    public static class switch_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switch_statement"
    // CPPGrammar.g:183:1: switch_statement : k= 'switch' '(' condition ')' statement -> ^( KEYWORD $k) condition ^( STATEMENTS ( statement )? ) ;
    public final CPPGrammarParser.switch_statement_return switch_statement() throws RecognitionException {
        CPPGrammarParser.switch_statement_return retval = new CPPGrammarParser.switch_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        Token char_literal179=null;
        Token char_literal181=null;
        CPPGrammarParser.condition_return condition180 =null;

        CPPGrammarParser.statement_return statement182 =null;


        CommonTree k_tree=null;
        CommonTree char_literal179_tree=null;
        CommonTree char_literal181_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // CPPGrammar.g:183:17: (k= 'switch' '(' condition ')' statement -> ^( KEYWORD $k) condition ^( STATEMENTS ( statement )? ) )
            // CPPGrammar.g:183:19: k= 'switch' '(' condition ')' statement
            {
            k=(Token)match(input,126,FOLLOW_126_in_switch_statement1713); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(k);


            char_literal179=(Token)match(input,66,FOLLOW_66_in_switch_statement1715); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal179);


            pushFollow(FOLLOW_condition_in_switch_statement1717);
            condition180=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition180.getTree());

            char_literal181=(Token)match(input,67,FOLLOW_67_in_switch_statement1719); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal181);


            pushFollow(FOLLOW_statement_in_switch_statement1721);
            statement182=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement182.getTree());

            // AST REWRITE
            // elements: statement, condition, k
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 183:58: -> ^( KEYWORD $k) condition ^( STATEMENTS ( statement )? )
            {
                // CPPGrammar.g:183:61: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_condition.nextTree());

                // CPPGrammar.g:183:86: ^( STATEMENTS ( statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:183:99: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "switch_statement"


    public static class for_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_statement"
    // CPPGrammar.g:185:1: for_statement : k= 'for' '(' for_init_statement condition ';' ( expr )? ')' statement -> ^( KEYWORD $k) ^( FOR_INIT ( for_init_statement )? ) condition ';' ^( FOR_EXPR ( expr )? ) ^( STATEMENTS ( statement )? ) ;
    public final CPPGrammarParser.for_statement_return for_statement() throws RecognitionException {
        CPPGrammarParser.for_statement_return retval = new CPPGrammarParser.for_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        Token char_literal183=null;
        Token char_literal186=null;
        Token char_literal188=null;
        CPPGrammarParser.for_init_statement_return for_init_statement184 =null;

        CPPGrammarParser.condition_return condition185 =null;

        CPPGrammarParser.expr_return expr187 =null;

        CPPGrammarParser.statement_return statement189 =null;


        CommonTree k_tree=null;
        CommonTree char_literal183_tree=null;
        CommonTree char_literal186_tree=null;
        CommonTree char_literal188_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_for_init_statement=new RewriteRuleSubtreeStream(adaptor,"rule for_init_statement");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // CPPGrammar.g:185:14: (k= 'for' '(' for_init_statement condition ';' ( expr )? ')' statement -> ^( KEYWORD $k) ^( FOR_INIT ( for_init_statement )? ) condition ';' ^( FOR_EXPR ( expr )? ) ^( STATEMENTS ( statement )? ) )
            // CPPGrammar.g:185:16: k= 'for' '(' for_init_statement condition ';' ( expr )? ')' statement
            {
            k=(Token)match(input,110,FOLLOW_110_in_for_statement1749); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_110.add(k);


            char_literal183=(Token)match(input,66,FOLLOW_66_in_for_statement1751); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal183);


            pushFollow(FOLLOW_for_init_statement_in_for_statement1753);
            for_init_statement184=for_init_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_for_init_statement.add(for_init_statement184.getTree());

            pushFollow(FOLLOW_condition_in_for_statement1755);
            condition185=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition185.getTree());

            char_literal186=(Token)match(input,83,FOLLOW_83_in_for_statement1757); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(char_literal186);


            // CPPGrammar.g:185:62: ( expr )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0 >= ALPHA_NUMERIC && LA59_0 <= 66)||(LA59_0 >= 68 && LA59_0 <= 82)||(LA59_0 >= 84 && LA59_0 <= 142)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // CPPGrammar.g:185:62: expr
                    {
                    pushFollow(FOLLOW_expr_in_for_statement1760);
                    expr187=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr187.getTree());

                    }
                    break;

            }


            char_literal188=(Token)match(input,67,FOLLOW_67_in_for_statement1763); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal188);


            pushFollow(FOLLOW_statement_in_for_statement1765);
            statement189=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement189.getTree());

            // AST REWRITE
            // elements: for_init_statement, condition, 83, k, statement, expr
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 186:13: -> ^( KEYWORD $k) ^( FOR_INIT ( for_init_statement )? ) condition ';' ^( FOR_EXPR ( expr )? ) ^( STATEMENTS ( statement )? )
            {
                // CPPGrammar.g:186:16: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:186:30: ^( FOR_INIT ( for_init_statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOR_INIT, "FOR_INIT")
                , root_1);

                // CPPGrammar.g:186:41: ( for_init_statement )?
                if ( stream_for_init_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_for_init_statement.nextTree());

                }
                stream_for_init_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_condition.nextTree());

                adaptor.addChild(root_0, 
                stream_83.nextNode()
                );

                // CPPGrammar.g:186:76: ^( FOR_EXPR ( expr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOR_EXPR, "FOR_EXPR")
                , root_1);

                // CPPGrammar.g:186:87: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:186:94: ^( STATEMENTS ( statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:186:107: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_statement"


    public static class while_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_statement"
    // CPPGrammar.g:187:1: while_statement : k= 'while' '(' condition ')' statement -> ^( KEYWORD $k) condition ^( STATEMENTS ( statement )? ) ;
    public final CPPGrammarParser.while_statement_return while_statement() throws RecognitionException {
        CPPGrammarParser.while_statement_return retval = new CPPGrammarParser.while_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        Token char_literal190=null;
        Token char_literal192=null;
        CPPGrammarParser.condition_return condition191 =null;

        CPPGrammarParser.statement_return statement193 =null;


        CommonTree k_tree=null;
        CommonTree char_literal190_tree=null;
        CommonTree char_literal192_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // CPPGrammar.g:187:16: (k= 'while' '(' condition ')' statement -> ^( KEYWORD $k) condition ^( STATEMENTS ( statement )? ) )
            // CPPGrammar.g:187:18: k= 'while' '(' condition ')' statement
            {
            k=(Token)match(input,136,FOLLOW_136_in_while_statement1819); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_136.add(k);


            char_literal190=(Token)match(input,66,FOLLOW_66_in_while_statement1821); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal190);


            pushFollow(FOLLOW_condition_in_while_statement1823);
            condition191=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition191.getTree());

            char_literal192=(Token)match(input,67,FOLLOW_67_in_while_statement1825); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal192);


            pushFollow(FOLLOW_statement_in_while_statement1827);
            statement193=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement193.getTree());

            // AST REWRITE
            // elements: statement, k, condition
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 187:56: -> ^( KEYWORD $k) condition ^( STATEMENTS ( statement )? )
            {
                // CPPGrammar.g:187:59: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_condition.nextTree());

                // CPPGrammar.g:187:83: ^( STATEMENTS ( statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:187:96: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_statement"


    public static class do_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "do_statement"
    // CPPGrammar.g:188:1: do_statement : k= 'do' statement 'while' '(' expr ')' -> ^( KEYWORD $k) ^( CONDITION expr ) ^( STATEMENTS ( statement )? ) ;
    public final CPPGrammarParser.do_statement_return do_statement() throws RecognitionException {
        CPPGrammarParser.do_statement_return retval = new CPPGrammarParser.do_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        Token string_literal195=null;
        Token char_literal196=null;
        Token char_literal198=null;
        CPPGrammarParser.statement_return statement194 =null;

        CPPGrammarParser.expr_return expr197 =null;


        CommonTree k_tree=null;
        CommonTree string_literal195_tree=null;
        CommonTree char_literal196_tree=null;
        CommonTree char_literal198_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // CPPGrammar.g:188:13: (k= 'do' statement 'while' '(' expr ')' -> ^( KEYWORD $k) ^( CONDITION expr ) ^( STATEMENTS ( statement )? ) )
            // CPPGrammar.g:188:15: k= 'do' statement 'while' '(' expr ')'
            {
            k=(Token)match(input,106,FOLLOW_106_in_do_statement1853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(k);


            pushFollow(FOLLOW_statement_in_do_statement1855);
            statement194=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement194.getTree());

            string_literal195=(Token)match(input,136,FOLLOW_136_in_do_statement1857); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_136.add(string_literal195);


            char_literal196=(Token)match(input,66,FOLLOW_66_in_do_statement1859); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal196);


            pushFollow(FOLLOW_expr_in_do_statement1861);
            expr197=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr197.getTree());

            char_literal198=(Token)match(input,67,FOLLOW_67_in_do_statement1863); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal198);


            // AST REWRITE
            // elements: statement, k, expr
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 188:53: -> ^( KEYWORD $k) ^( CONDITION expr ) ^( STATEMENTS ( statement )? )
            {
                // CPPGrammar.g:188:56: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:188:70: ^( CONDITION expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONDITION, "CONDITION")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:188:88: ^( STATEMENTS ( statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:188:101: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "do_statement"


    public static class condition__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_"
    // CPPGrammar.g:190:1: condition_ : expr ;
    public final CPPGrammarParser.condition__return condition_() throws RecognitionException {
        CPPGrammarParser.condition__return retval = new CPPGrammarParser.condition__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.expr_return expr199 =null;



        try {
            // CPPGrammar.g:190:11: ( expr )
            // CPPGrammar.g:190:13: expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_condition_1893);
            expr199=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr199.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition_"


    public static class for_init_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_init_statement"
    // CPPGrammar.g:191:1: for_init_statement : ( ( simple_decl )=> simple_decl | ( expr )? ';' );
    public final CPPGrammarParser.for_init_statement_return for_init_statement() throws RecognitionException {
        CPPGrammarParser.for_init_statement_return retval = new CPPGrammarParser.for_init_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal202=null;
        CPPGrammarParser.simple_decl_return simple_decl200 =null;

        CPPGrammarParser.expr_return expr201 =null;


        CommonTree char_literal202_tree=null;

        try {
            // CPPGrammar.g:191:20: ( ( simple_decl )=> simple_decl | ( expr )? ';' )
            int alt61=2;
            switch ( input.LA(1) ) {
            case 130:
                {
                int LA61_1 = input.LA(2);

                if ( (synpred11_CPPGrammar()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;

                }
                }
                break;
            case 127:
                {
                int LA61_2 = input.LA(2);

                if ( (synpred11_CPPGrammar()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 2, input);

                    throw nvae;

                }
                }
                break;
            case 103:
            case 135:
                {
                int LA61_3 = input.LA(2);

                if ( (synpred11_CPPGrammar()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 3, input);

                    throw nvae;

                }
                }
                break;
            case 102:
            case 108:
            case 125:
            case 131:
                {
                int LA61_4 = input.LA(2);

                if ( (synpred11_CPPGrammar()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 4, input);

                    throw nvae;

                }
                }
                break;
            case 123:
            case 132:
                {
                int LA61_5 = input.LA(2);

                if ( (synpred11_CPPGrammar()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 5, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA61_6 = input.LA(2);

                if ( (synpred11_CPPGrammar()) ) {
                    alt61=1;
                }
                else if ( (true) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 6, input);

                    throw nvae;

                }
                }
                break;
            case ARGUMENT:
            case ARGUMENT_LIST:
            case BASE_CLASSES:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COMMENT:
            case CONDITION:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case DESTINATION:
            case DIGITS:
            case DOT:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case INCLUDE_DIRECTIVE:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case INIT_DECL_NAME:
            case ITERATION:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case NAMESPACE_DEF:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case PARAMETER_NAME:
            case PARAMETER_TYPE:
            case PREPROC:
            case Q_MARK:
            case RETURN_TYPE:
            case SELECTION:
            case SIMPLE_DECL:
            case SIZEOF:
            case SOURCE_FILE:
            case STATEMENTS:
            case STRING:
            case SW:
            case SWITCH:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE_DEF:
            case TYPE_SPECIFIER:
            case USING_DIRECTIVE:
            case WHITESPACE:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 104:
            case 105:
            case 106:
            case 107:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 124:
            case 126:
            case 128:
            case 129:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
                {
                alt61=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // CPPGrammar.g:191:22: ( simple_decl )=> simple_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simple_decl_in_for_init_statement1906);
                    simple_decl200=simple_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_decl200.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:191:53: ( expr )? ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:191:53: ( expr )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0 >= ALPHA_NUMERIC && LA60_0 <= 66)||(LA60_0 >= 68 && LA60_0 <= 82)||(LA60_0 >= 84 && LA60_0 <= 142)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // CPPGrammar.g:191:53: expr
                            {
                            pushFollow(FOLLOW_expr_in_for_init_statement1910);
                            expr201=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr201.getTree());

                            }
                            break;

                    }


                    char_literal202=(Token)match(input,83,FOLLOW_83_in_for_init_statement1913); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal202_tree = 
                    (CommonTree)adaptor.create(char_literal202)
                    ;
                    adaptor.addChild(root_0, char_literal202_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_init_statement"


    public static class label__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "label_"
    // CPPGrammar.g:193:1: label_ : ( ( ( 'case' )? ( ALPHA_NUMERIC | DIGITS | '::' )+ ) | access_specifier ) ':' ;
    public final CPPGrammarParser.label__return label_() throws RecognitionException {
        CPPGrammarParser.label__return retval = new CPPGrammarParser.label__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal203=null;
        Token set204=null;
        Token char_literal206=null;
        CPPGrammarParser.access_specifier_return access_specifier205 =null;


        CommonTree string_literal203_tree=null;
        CommonTree set204_tree=null;
        CommonTree char_literal206_tree=null;

        try {
            // CPPGrammar.g:193:7: ( ( ( ( 'case' )? ( ALPHA_NUMERIC | DIGITS | '::' )+ ) | access_specifier ) ':' )
            // CPPGrammar.g:193:9: ( ( ( 'case' )? ( ALPHA_NUMERIC | DIGITS | '::' )+ ) | access_specifier ) ':'
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:193:9: ( ( ( 'case' )? ( ALPHA_NUMERIC | DIGITS | '::' )+ ) | access_specifier )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ALPHA_NUMERIC||LA64_0==DIGITS||LA64_0==82||LA64_0==100) ) {
                alt64=1;
            }
            else if ( ((LA64_0 >= 118 && LA64_0 <= 120)) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // CPPGrammar.g:193:10: ( ( 'case' )? ( ALPHA_NUMERIC | DIGITS | '::' )+ )
                    {
                    // CPPGrammar.g:193:10: ( ( 'case' )? ( ALPHA_NUMERIC | DIGITS | '::' )+ )
                    // CPPGrammar.g:193:11: ( 'case' )? ( ALPHA_NUMERIC | DIGITS | '::' )+
                    {
                    // CPPGrammar.g:193:11: ( 'case' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==100) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // CPPGrammar.g:193:11: 'case'
                            {
                            string_literal203=(Token)match(input,100,FOLLOW_100_in_label_1922); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal203_tree = 
                            (CommonTree)adaptor.create(string_literal203)
                            ;
                            adaptor.addChild(root_0, string_literal203_tree);
                            }

                            }
                            break;

                    }


                    // CPPGrammar.g:193:19: ( ALPHA_NUMERIC | DIGITS | '::' )+
                    int cnt63=0;
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==ALPHA_NUMERIC||LA63_0==DIGITS||LA63_0==82) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // CPPGrammar.g:
                    	    {
                    	    set204=(Token)input.LT(1);

                    	    if ( input.LA(1)==ALPHA_NUMERIC||input.LA(1)==DIGITS||input.LA(1)==82 ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                    	        (CommonTree)adaptor.create(set204)
                    	        );
                    	        state.errorRecovery=false;
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt63 >= 1 ) break loop63;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(63, input);
                                throw eee;
                        }
                        cnt63++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:193:56: access_specifier
                    {
                    pushFollow(FOLLOW_access_specifier_in_label_1942);
                    access_specifier205=access_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, access_specifier205.getTree());

                    }
                    break;

            }


            char_literal206=(Token)match(input,81,FOLLOW_81_in_label_1945); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal206_tree = 
            (CommonTree)adaptor.create(char_literal206)
            ;
            adaptor.addChild(root_0, char_literal206_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "label_"


    public static class type_id_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_id_list"
    // CPPGrammar.g:195:1: type_id_list : ( no_brackets )* ( '(' type_id_list ')' ( no_brackets )* )* ;
    public final CPPGrammarParser.type_id_list_return type_id_list() throws RecognitionException {
        CPPGrammarParser.type_id_list_return retval = new CPPGrammarParser.type_id_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal208=null;
        Token char_literal210=null;
        CPPGrammarParser.no_brackets_return no_brackets207 =null;

        CPPGrammarParser.type_id_list_return type_id_list209 =null;

        CPPGrammarParser.no_brackets_return no_brackets211 =null;


        CommonTree char_literal208_tree=null;
        CommonTree char_literal210_tree=null;

        try {
            // CPPGrammar.g:195:13: ( ( no_brackets )* ( '(' type_id_list ')' ( no_brackets )* )* )
            // CPPGrammar.g:195:15: ( no_brackets )* ( '(' type_id_list ')' ( no_brackets )* )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:195:15: ( no_brackets )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0 >= ALPHA_NUMERIC && LA65_0 <= 65)||(LA65_0 >= 68 && LA65_0 <= 142)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // CPPGrammar.g:195:15: no_brackets
            	    {
            	    pushFollow(FOLLOW_no_brackets_in_type_id_list1953);
            	    no_brackets207=no_brackets();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, no_brackets207.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            // CPPGrammar.g:195:28: ( '(' type_id_list ')' ( no_brackets )* )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==66) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // CPPGrammar.g:195:29: '(' type_id_list ')' ( no_brackets )*
            	    {
            	    char_literal208=(Token)match(input,66,FOLLOW_66_in_type_id_list1957); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal208_tree = 
            	    (CommonTree)adaptor.create(char_literal208)
            	    ;
            	    adaptor.addChild(root_0, char_literal208_tree);
            	    }

            	    pushFollow(FOLLOW_type_id_list_in_type_id_list1959);
            	    type_id_list209=type_id_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_id_list209.getTree());

            	    char_literal210=(Token)match(input,67,FOLLOW_67_in_type_id_list1961); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal210_tree = 
            	    (CommonTree)adaptor.create(char_literal210)
            	    ;
            	    adaptor.addChild(root_0, char_literal210_tree);
            	    }

            	    // CPPGrammar.g:195:50: ( no_brackets )*
            	    loop66:
            	    do {
            	        int alt66=2;
            	        int LA66_0 = input.LA(1);

            	        if ( ((LA66_0 >= ALPHA_NUMERIC && LA66_0 <= 65)||(LA66_0 >= 68 && LA66_0 <= 142)) ) {
            	            alt66=1;
            	        }


            	        switch (alt66) {
            	    	case 1 :
            	    	    // CPPGrammar.g:195:50: no_brackets
            	    	    {
            	    	    pushFollow(FOLLOW_no_brackets_in_type_id_list1963);
            	    	    no_brackets211=no_brackets();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, no_brackets211.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop66;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_id_list"


    public static class namespace_def__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namespace_def_"
    // CPPGrammar.g:196:1: namespace_def_ : 'namespace' ( identifier )? '{' namespace_content '}' ;
    public final CPPGrammarParser.namespace_def__return namespace_def_() throws RecognitionException {
        CPPGrammarParser.namespace_def__return retval = new CPPGrammarParser.namespace_def__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal212=null;
        Token char_literal214=null;
        Token char_literal216=null;
        CPPGrammarParser.identifier_return identifier213 =null;

        CPPGrammarParser.namespace_content_return namespace_content215 =null;


        CommonTree string_literal212_tree=null;
        CommonTree char_literal214_tree=null;
        CommonTree char_literal216_tree=null;

        try {
            // CPPGrammar.g:196:15: ( 'namespace' ( identifier )? '{' namespace_content '}' )
            // CPPGrammar.g:196:17: 'namespace' ( identifier )? '{' namespace_content '}'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal212=(Token)match(input,115,FOLLOW_115_in_namespace_def_1972); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal212_tree = 
            (CommonTree)adaptor.create(string_literal212)
            ;
            adaptor.addChild(root_0, string_literal212_tree);
            }

            // CPPGrammar.g:196:29: ( identifier )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==ALPHA_NUMERIC) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // CPPGrammar.g:196:29: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_namespace_def_1974);
                    identifier213=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier213.getTree());

                    }
                    break;

            }


            char_literal214=(Token)match(input,137,FOLLOW_137_in_namespace_def_1977); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal214_tree = 
            (CommonTree)adaptor.create(char_literal214)
            ;
            adaptor.addChild(root_0, char_literal214_tree);
            }

            pushFollow(FOLLOW_namespace_content_in_namespace_def_1979);
            namespace_content215=namespace_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_content215.getTree());

            char_literal216=(Token)match(input,141,FOLLOW_141_in_namespace_def_1981); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal216_tree = 
            (CommonTree)adaptor.create(char_literal216)
            ;
            adaptor.addChild(root_0, char_literal216_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namespace_def_"


    public static class namespace_content_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namespace_content"
    // CPPGrammar.g:197:1: namespace_content : ( namespace_content_elem )* ( '{' namespace_content '}' ( namespace_content_elem )* )* ;
    public final CPPGrammarParser.namespace_content_return namespace_content() throws RecognitionException {
        CPPGrammarParser.namespace_content_return retval = new CPPGrammarParser.namespace_content_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal218=null;
        Token char_literal220=null;
        CPPGrammarParser.namespace_content_elem_return namespace_content_elem217 =null;

        CPPGrammarParser.namespace_content_return namespace_content219 =null;

        CPPGrammarParser.namespace_content_elem_return namespace_content_elem221 =null;


        CommonTree char_literal218_tree=null;
        CommonTree char_literal220_tree=null;

        try {
            // CPPGrammar.g:197:18: ( ( namespace_content_elem )* ( '{' namespace_content '}' ( namespace_content_elem )* )* )
            // CPPGrammar.g:197:20: ( namespace_content_elem )* ( '{' namespace_content '}' ( namespace_content_elem )* )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:197:20: ( namespace_content_elem )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0 >= ALPHA_NUMERIC && LA69_0 <= 136)||(LA69_0 >= 138 && LA69_0 <= 140)||LA69_0==142) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // CPPGrammar.g:197:20: namespace_content_elem
            	    {
            	    pushFollow(FOLLOW_namespace_content_elem_in_namespace_content1987);
            	    namespace_content_elem217=namespace_content_elem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_content_elem217.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            // CPPGrammar.g:197:44: ( '{' namespace_content '}' ( namespace_content_elem )* )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==137) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // CPPGrammar.g:197:45: '{' namespace_content '}' ( namespace_content_elem )*
            	    {
            	    char_literal218=(Token)match(input,137,FOLLOW_137_in_namespace_content1991); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal218_tree = 
            	    (CommonTree)adaptor.create(char_literal218)
            	    ;
            	    adaptor.addChild(root_0, char_literal218_tree);
            	    }

            	    pushFollow(FOLLOW_namespace_content_in_namespace_content1993);
            	    namespace_content219=namespace_content();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_content219.getTree());

            	    char_literal220=(Token)match(input,141,FOLLOW_141_in_namespace_content1995); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal220_tree = 
            	    (CommonTree)adaptor.create(char_literal220)
            	    ;
            	    adaptor.addChild(root_0, char_literal220_tree);
            	    }

            	    // CPPGrammar.g:197:71: ( namespace_content_elem )*
            	    loop70:
            	    do {
            	        int alt70=2;
            	        int LA70_0 = input.LA(1);

            	        if ( ((LA70_0 >= ALPHA_NUMERIC && LA70_0 <= 136)||(LA70_0 >= 138 && LA70_0 <= 140)||LA70_0==142) ) {
            	            alt70=1;
            	        }


            	        switch (alt70) {
            	    	case 1 :
            	    	    // CPPGrammar.g:197:71: namespace_content_elem
            	    	    {
            	    	    pushFollow(FOLLOW_namespace_content_elem_in_namespace_content1997);
            	    	    namespace_content_elem221=namespace_content_elem();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_content_elem221.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop70;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namespace_content"


    public static class namespace_content_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namespace_content_elem"
    // CPPGrammar.g:198:1: namespace_content_elem : ( ( simple_decl )=> simple_decl | ( function_def )=> function_def | no_curlies );
    public final CPPGrammarParser.namespace_content_elem_return namespace_content_elem() throws RecognitionException {
        CPPGrammarParser.namespace_content_elem_return retval = new CPPGrammarParser.namespace_content_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.simple_decl_return simple_decl222 =null;

        CPPGrammarParser.function_def_return function_def223 =null;

        CPPGrammarParser.no_curlies_return no_curlies224 =null;



        try {
            // CPPGrammar.g:198:23: ( ( simple_decl )=> simple_decl | ( function_def )=> function_def | no_curlies )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 130:
                {
                int LA72_1 = input.LA(2);

                if ( (synpred12_CPPGrammar()) ) {
                    alt72=1;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;

                }
                }
                break;
            case 127:
                {
                int LA72_2 = input.LA(2);

                if ( (synpred12_CPPGrammar()) ) {
                    alt72=1;
                }
                else if ( (synpred13_CPPGrammar()) ) {
                    alt72=2;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 2, input);

                    throw nvae;

                }
                }
                break;
            case 103:
            case 135:
                {
                int LA72_3 = input.LA(2);

                if ( (synpred12_CPPGrammar()) ) {
                    alt72=1;
                }
                else if ( (synpred13_CPPGrammar()) ) {
                    alt72=2;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 3, input);

                    throw nvae;

                }
                }
                break;
            case 102:
            case 108:
            case 125:
            case 131:
                {
                int LA72_4 = input.LA(2);

                if ( (synpred12_CPPGrammar()) ) {
                    alt72=1;
                }
                else if ( (synpred13_CPPGrammar()) ) {
                    alt72=2;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 4, input);

                    throw nvae;

                }
                }
                break;
            case 123:
            case 132:
                {
                int LA72_5 = input.LA(2);

                if ( (synpred12_CPPGrammar()) ) {
                    alt72=1;
                }
                else if ( (synpred13_CPPGrammar()) ) {
                    alt72=2;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 5, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA72_6 = input.LA(2);

                if ( (synpred12_CPPGrammar()) ) {
                    alt72=1;
                }
                else if ( (synpred13_CPPGrammar()) ) {
                    alt72=2;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 6, input);

                    throw nvae;

                }
                }
                break;
            case 109:
            case 111:
            case 114:
            case 124:
            case 134:
                {
                int LA72_7 = input.LA(2);

                if ( (synpred13_CPPGrammar()) ) {
                    alt72=2;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 7, input);

                    throw nvae;

                }
                }
                break;
            case 64:
            case 68:
                {
                int LA72_8 = input.LA(2);

                if ( (synpred13_CPPGrammar()) ) {
                    alt72=2;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 8, input);

                    throw nvae;

                }
                }
                break;
            case 66:
                {
                int LA72_9 = input.LA(2);

                if ( (synpred13_CPPGrammar()) ) {
                    alt72=2;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 9, input);

                    throw nvae;

                }
                }
                break;
            case 117:
                {
                int LA72_10 = input.LA(2);

                if ( (synpred13_CPPGrammar()) ) {
                    alt72=2;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 10, input);

                    throw nvae;

                }
                }
                break;
            case ARGUMENT:
            case ARGUMENT_LIST:
            case BASE_CLASSES:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COMMENT:
            case CONDITION:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case DESTINATION:
            case DIGITS:
            case DOT:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case INCLUDE_DIRECTIVE:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case INIT_DECL_NAME:
            case ITERATION:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case NAMESPACE_DEF:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case PARAMETER_NAME:
            case PARAMETER_TYPE:
            case PREPROC:
            case Q_MARK:
            case RETURN_TYPE:
            case SELECTION:
            case SIMPLE_DECL:
            case SIZEOF:
            case SOURCE_FILE:
            case STATEMENTS:
            case STRING:
            case SW:
            case SWITCH:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE_DEF:
            case TYPE_SPECIFIER:
            case USING_DIRECTIVE:
            case WHITESPACE:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 65:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 104:
            case 105:
            case 106:
            case 107:
            case 110:
            case 112:
            case 113:
            case 115:
            case 116:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 126:
            case 128:
            case 129:
            case 133:
            case 136:
            case 138:
            case 139:
            case 140:
            case 142:
                {
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }

            switch (alt72) {
                case 1 :
                    // CPPGrammar.g:198:25: ( simple_decl )=> simple_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simple_decl_in_namespace_content_elem2012);
                    simple_decl222=simple_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_decl222.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:199:5: ( function_def )=> function_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_def_in_namespace_content_elem2024);
                    function_def223=function_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_def223.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:200:5: no_curlies
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_no_curlies_in_namespace_content_elem2030);
                    no_curlies224=no_curlies();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, no_curlies224.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namespace_content_elem"


    public static class type_specifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_specifier"
    // CPPGrammar.g:202:1: type_specifier : ( cv_qualifier )* ( class_key )? ( 'unsigned' | 'signed' )? ALPHA_NUMERIC ( '<' template_param_list '>' )? ( '::' ALPHA_NUMERIC ( '<' template_param_list '>' )? )* ;
    public final CPPGrammarParser.type_specifier_return type_specifier() throws RecognitionException {
        CPPGrammarParser.type_specifier_return retval = new CPPGrammarParser.type_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set227=null;
        Token ALPHA_NUMERIC228=null;
        Token char_literal229=null;
        Token char_literal231=null;
        Token string_literal232=null;
        Token ALPHA_NUMERIC233=null;
        Token char_literal234=null;
        Token char_literal236=null;
        CPPGrammarParser.cv_qualifier_return cv_qualifier225 =null;

        CPPGrammarParser.class_key_return class_key226 =null;

        CPPGrammarParser.template_param_list_return template_param_list230 =null;

        CPPGrammarParser.template_param_list_return template_param_list235 =null;


        CommonTree set227_tree=null;
        CommonTree ALPHA_NUMERIC228_tree=null;
        CommonTree char_literal229_tree=null;
        CommonTree char_literal231_tree=null;
        CommonTree string_literal232_tree=null;
        CommonTree ALPHA_NUMERIC233_tree=null;
        CommonTree char_literal234_tree=null;
        CommonTree char_literal236_tree=null;

        try {
            // CPPGrammar.g:202:15: ( ( cv_qualifier )* ( class_key )? ( 'unsigned' | 'signed' )? ALPHA_NUMERIC ( '<' template_param_list '>' )? ( '::' ALPHA_NUMERIC ( '<' template_param_list '>' )? )* )
            // CPPGrammar.g:202:17: ( cv_qualifier )* ( class_key )? ( 'unsigned' | 'signed' )? ALPHA_NUMERIC ( '<' template_param_list '>' )? ( '::' ALPHA_NUMERIC ( '<' template_param_list '>' )? )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:202:17: ( cv_qualifier )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==103||LA73_0==135) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // CPPGrammar.g:202:17: cv_qualifier
            	    {
            	    pushFollow(FOLLOW_cv_qualifier_in_type_specifier2039);
            	    cv_qualifier225=cv_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cv_qualifier225.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            // CPPGrammar.g:202:31: ( class_key )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==102||LA74_0==108||LA74_0==125||LA74_0==131) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // CPPGrammar.g:202:31: class_key
                    {
                    pushFollow(FOLLOW_class_key_in_type_specifier2042);
                    class_key226=class_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_key226.getTree());

                    }
                    break;

            }


            // CPPGrammar.g:202:42: ( 'unsigned' | 'signed' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==123||LA75_0==132) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // CPPGrammar.g:
                    {
                    set227=(Token)input.LT(1);

                    if ( input.LA(1)==123||input.LA(1)==132 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set227)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            ALPHA_NUMERIC228=(Token)match(input,ALPHA_NUMERIC,FOLLOW_ALPHA_NUMERIC_in_type_specifier2054); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALPHA_NUMERIC228_tree = 
            (CommonTree)adaptor.create(ALPHA_NUMERIC228)
            ;
            adaptor.addChild(root_0, ALPHA_NUMERIC228_tree);
            }

            // CPPGrammar.g:202:81: ( '<' template_param_list '>' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==84) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // CPPGrammar.g:202:82: '<' template_param_list '>'
                    {
                    char_literal229=(Token)match(input,84,FOLLOW_84_in_type_specifier2057); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal229_tree = 
                    (CommonTree)adaptor.create(char_literal229)
                    ;
                    adaptor.addChild(root_0, char_literal229_tree);
                    }

                    pushFollow(FOLLOW_template_param_list_in_type_specifier2059);
                    template_param_list230=template_param_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list230.getTree());

                    char_literal231=(Token)match(input,90,FOLLOW_90_in_type_specifier2061); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal231_tree = 
                    (CommonTree)adaptor.create(char_literal231)
                    ;
                    adaptor.addChild(root_0, char_literal231_tree);
                    }

                    }
                    break;

            }


            // CPPGrammar.g:202:113: ( '::' ALPHA_NUMERIC ( '<' template_param_list '>' )? )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==82) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // CPPGrammar.g:202:114: '::' ALPHA_NUMERIC ( '<' template_param_list '>' )?
            	    {
            	    string_literal232=(Token)match(input,82,FOLLOW_82_in_type_specifier2067); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal232_tree = 
            	    (CommonTree)adaptor.create(string_literal232)
            	    ;
            	    adaptor.addChild(root_0, string_literal232_tree);
            	    }

            	    ALPHA_NUMERIC233=(Token)match(input,ALPHA_NUMERIC,FOLLOW_ALPHA_NUMERIC_in_type_specifier2069); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ALPHA_NUMERIC233_tree = 
            	    (CommonTree)adaptor.create(ALPHA_NUMERIC233)
            	    ;
            	    adaptor.addChild(root_0, ALPHA_NUMERIC233_tree);
            	    }

            	    // CPPGrammar.g:202:133: ( '<' template_param_list '>' )?
            	    int alt77=2;
            	    int LA77_0 = input.LA(1);

            	    if ( (LA77_0==84) ) {
            	        alt77=1;
            	    }
            	    switch (alt77) {
            	        case 1 :
            	            // CPPGrammar.g:202:134: '<' template_param_list '>'
            	            {
            	            char_literal234=(Token)match(input,84,FOLLOW_84_in_type_specifier2072); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal234_tree = 
            	            (CommonTree)adaptor.create(char_literal234)
            	            ;
            	            adaptor.addChild(root_0, char_literal234_tree);
            	            }

            	            pushFollow(FOLLOW_template_param_list_in_type_specifier2074);
            	            template_param_list235=template_param_list();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list235.getTree());

            	            char_literal236=(Token)match(input,90,FOLLOW_90_in_type_specifier2076); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal236_tree = 
            	            (CommonTree)adaptor.create(char_literal236)
            	            ;
            	            adaptor.addChild(root_0, char_literal236_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_specifier"


    public static class template_param_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template_param_list"
    // CPPGrammar.g:203:1: template_param_list : ( template_param_list_elem )* ;
    public final CPPGrammarParser.template_param_list_return template_param_list() throws RecognitionException {
        CPPGrammarParser.template_param_list_return retval = new CPPGrammarParser.template_param_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.template_param_list_elem_return template_param_list_elem237 =null;



        try {
            // CPPGrammar.g:203:21: ( ( template_param_list_elem )* )
            // CPPGrammar.g:203:23: ( template_param_list_elem )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:203:23: ( template_param_list_elem )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0 >= ALPHA_NUMERIC && LA79_0 <= 66)||(LA79_0 >= 68 && LA79_0 <= 89)||(LA79_0 >= 91 && LA79_0 <= 142)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // CPPGrammar.g:203:23: template_param_list_elem
            	    {
            	    pushFollow(FOLLOW_template_param_list_elem_in_template_param_list2089);
            	    template_param_list_elem237=template_param_list_elem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list_elem237.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template_param_list"


    public static class template_param_list_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template_param_list_elem"
    // CPPGrammar.g:204:1: template_param_list_elem : ( ( '<' template_param_list '>' ) | ( '(' template_param_list ')' ) | no_angle_brackets_or_brackets );
    public final CPPGrammarParser.template_param_list_elem_return template_param_list_elem() throws RecognitionException {
        CPPGrammarParser.template_param_list_elem_return retval = new CPPGrammarParser.template_param_list_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal238=null;
        Token char_literal240=null;
        Token char_literal241=null;
        Token char_literal243=null;
        CPPGrammarParser.template_param_list_return template_param_list239 =null;

        CPPGrammarParser.template_param_list_return template_param_list242 =null;

        CPPGrammarParser.no_angle_brackets_or_brackets_return no_angle_brackets_or_brackets244 =null;


        CommonTree char_literal238_tree=null;
        CommonTree char_literal240_tree=null;
        CommonTree char_literal241_tree=null;
        CommonTree char_literal243_tree=null;

        try {
            // CPPGrammar.g:204:25: ( ( '<' template_param_list '>' ) | ( '(' template_param_list ')' ) | no_angle_brackets_or_brackets )
            int alt80=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt80=1;
                }
                break;
            case 66:
                {
                alt80=2;
                }
                break;
            case ALPHA_NUMERIC:
            case ARGUMENT:
            case ARGUMENT_LIST:
            case BASE_CLASSES:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COMMENT:
            case CONDITION:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case DESTINATION:
            case DIGITS:
            case DOT:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case INCLUDE_DIRECTIVE:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case INIT_DECL_NAME:
            case ITERATION:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case NAMESPACE_DEF:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case PARAMETER_NAME:
            case PARAMETER_TYPE:
            case PREPROC:
            case Q_MARK:
            case RETURN_TYPE:
            case SELECTION:
            case SIMPLE_DECL:
            case SIZEOF:
            case SOURCE_FILE:
            case STATEMENTS:
            case STRING:
            case SW:
            case SWITCH:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE_DEF:
            case TYPE_SPECIFIER:
            case USING_DIRECTIVE:
            case WHITESPACE:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
                {
                alt80=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }

            switch (alt80) {
                case 1 :
                    // CPPGrammar.g:204:28: ( '<' template_param_list '>' )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:204:28: ( '<' template_param_list '>' )
                    // CPPGrammar.g:204:29: '<' template_param_list '>'
                    {
                    char_literal238=(Token)match(input,84,FOLLOW_84_in_template_param_list_elem2098); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal238_tree = 
                    (CommonTree)adaptor.create(char_literal238)
                    ;
                    adaptor.addChild(root_0, char_literal238_tree);
                    }

                    pushFollow(FOLLOW_template_param_list_in_template_param_list_elem2100);
                    template_param_list239=template_param_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list239.getTree());

                    char_literal240=(Token)match(input,90,FOLLOW_90_in_template_param_list_elem2102); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal240_tree = 
                    (CommonTree)adaptor.create(char_literal240)
                    ;
                    adaptor.addChild(root_0, char_literal240_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:205:12: ( '(' template_param_list ')' )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:205:12: ( '(' template_param_list ')' )
                    // CPPGrammar.g:205:13: '(' template_param_list ')'
                    {
                    char_literal241=(Token)match(input,66,FOLLOW_66_in_template_param_list_elem2117); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal241_tree = 
                    (CommonTree)adaptor.create(char_literal241)
                    ;
                    adaptor.addChild(root_0, char_literal241_tree);
                    }

                    pushFollow(FOLLOW_template_param_list_in_template_param_list_elem2119);
                    template_param_list242=template_param_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list242.getTree());

                    char_literal243=(Token)match(input,67,FOLLOW_67_in_template_param_list_elem2121); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal243_tree = 
                    (CommonTree)adaptor.create(char_literal243)
                    ;
                    adaptor.addChild(root_0, char_literal243_tree);
                    }

                    }


                    }
                    break;
                case 3 :
                    // CPPGrammar.g:206:12: no_angle_brackets_or_brackets
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_no_angle_brackets_or_brackets_in_template_param_list_elem2135);
                    no_angle_brackets_or_brackets244=no_angle_brackets_or_brackets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, no_angle_brackets_or_brackets244.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template_param_list_elem"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // CPPGrammar.g:211:1: expr : ( expr_elem )+ ;
    public final CPPGrammarParser.expr_return expr() throws RecognitionException {
        CPPGrammarParser.expr_return retval = new CPPGrammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.expr_elem_return expr_elem245 =null;



        try {
            // CPPGrammar.g:211:5: ( ( expr_elem )+ )
            // CPPGrammar.g:211:8: ( expr_elem )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:211:8: ( expr_elem )+
            int cnt81=0;
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( ((LA81_0 >= ALPHA_NUMERIC && LA81_0 <= 66)||(LA81_0 >= 68 && LA81_0 <= 82)||(LA81_0 >= 84 && LA81_0 <= 142)) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // CPPGrammar.g:211:8: expr_elem
            	    {
            	    pushFollow(FOLLOW_expr_elem_in_expr2146);
            	    expr_elem245=expr_elem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_elem245.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt81 >= 1 ) break loop81;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(81, input);
                        throw eee;
                }
                cnt81++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class expr_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_elem"
    // CPPGrammar.g:212:1: expr_elem : ( ( recognized_expr )=> recognized_expr | '(' expr ')' | no_brackets_or_semicolon );
    public final CPPGrammarParser.expr_elem_return expr_elem() throws RecognitionException {
        CPPGrammarParser.expr_elem_return retval = new CPPGrammarParser.expr_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal247=null;
        Token char_literal249=null;
        CPPGrammarParser.recognized_expr_return recognized_expr246 =null;

        CPPGrammarParser.expr_return expr248 =null;

        CPPGrammarParser.no_brackets_or_semicolon_return no_brackets_or_semicolon250 =null;


        CommonTree char_literal247_tree=null;
        CommonTree char_literal249_tree=null;

        try {
            // CPPGrammar.g:212:10: ( ( recognized_expr )=> recognized_expr | '(' expr ')' | no_brackets_or_semicolon )
            int alt82=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                int LA82_1 = input.LA(2);

                if ( (synpred14_CPPGrammar()) ) {
                    alt82=1;
                }
                else if ( (true) ) {
                    alt82=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;

                }
                }
                break;
            case 64:
            case 68:
                {
                int LA82_2 = input.LA(2);

                if ( (synpred14_CPPGrammar()) ) {
                    alt82=1;
                }
                else if ( (true) ) {
                    alt82=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 2, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA82_3 = input.LA(2);

                if ( (synpred14_CPPGrammar()) ) {
                    alt82=1;
                }
                else if ( (true) ) {
                    alt82=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 3, input);

                    throw nvae;

                }
                }
                break;
            case ARGUMENT:
            case ARGUMENT_LIST:
            case BASE_CLASSES:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COMMENT:
            case CONDITION:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case DESTINATION:
            case DIGITS:
            case DOT:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case INCLUDE_DIRECTIVE:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case INIT_DECL_NAME:
            case ITERATION:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case NAMESPACE_DEF:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case PARAMETER_NAME:
            case PARAMETER_TYPE:
            case PREPROC:
            case Q_MARK:
            case RETURN_TYPE:
            case SELECTION:
            case SIMPLE_DECL:
            case SIZEOF:
            case SOURCE_FILE:
            case STATEMENTS:
            case STRING:
            case SW:
            case SWITCH:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE_DEF:
            case TYPE_SPECIFIER:
            case USING_DIRECTIVE:
            case WHITESPACE:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 65:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
                {
                alt82=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }

            switch (alt82) {
                case 1 :
                    // CPPGrammar.g:212:13: ( recognized_expr )=> recognized_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_recognized_expr_in_expr_elem2160);
                    recognized_expr246=recognized_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recognized_expr246.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:213:19: '(' expr ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal247=(Token)match(input,66,FOLLOW_66_in_expr_elem2180); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal247_tree = 
                    (CommonTree)adaptor.create(char_literal247)
                    ;
                    adaptor.addChild(root_0, char_literal247_tree);
                    }

                    pushFollow(FOLLOW_expr_in_expr_elem2182);
                    expr248=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr248.getTree());

                    char_literal249=(Token)match(input,67,FOLLOW_67_in_expr_elem2184); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal249_tree = 
                    (CommonTree)adaptor.create(char_literal249)
                    ;
                    adaptor.addChild(root_0, char_literal249_tree);
                    }

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:214:19: no_brackets_or_semicolon
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_no_brackets_or_semicolon_in_expr_elem2204);
                    no_brackets_or_semicolon250=no_brackets_or_semicolon();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, no_brackets_or_semicolon250.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_elem"


    public static class recognized_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "recognized_expr"
    // CPPGrammar.g:216:1: recognized_expr : function_call ;
    public final CPPGrammarParser.recognized_expr_return recognized_expr() throws RecognitionException {
        CPPGrammarParser.recognized_expr_return retval = new CPPGrammarParser.recognized_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.function_call_return function_call251 =null;



        try {
            // CPPGrammar.g:216:16: ( function_call )
            // CPPGrammar.g:216:18: function_call
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_function_call_in_recognized_expr2211);
            function_call251=function_call();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, function_call251.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "recognized_expr"


    public static class function_call__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call_"
    // CPPGrammar.g:217:1: function_call_ : called_function call_template_list function_argument_list -> called_function ^( CALL_TEMPLATE_LIST ( call_template_list )? ) function_argument_list ;
    public final CPPGrammarParser.function_call__return function_call_() throws RecognitionException {
        CPPGrammarParser.function_call__return retval = new CPPGrammarParser.function_call__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.called_function_return called_function252 =null;

        CPPGrammarParser.call_template_list_return call_template_list253 =null;

        CPPGrammarParser.function_argument_list_return function_argument_list254 =null;


        RewriteRuleSubtreeStream stream_called_function=new RewriteRuleSubtreeStream(adaptor,"rule called_function");
        RewriteRuleSubtreeStream stream_call_template_list=new RewriteRuleSubtreeStream(adaptor,"rule call_template_list");
        RewriteRuleSubtreeStream stream_function_argument_list=new RewriteRuleSubtreeStream(adaptor,"rule function_argument_list");
        try {
            // CPPGrammar.g:217:15: ( called_function call_template_list function_argument_list -> called_function ^( CALL_TEMPLATE_LIST ( call_template_list )? ) function_argument_list )
            // CPPGrammar.g:217:18: called_function call_template_list function_argument_list
            {
            pushFollow(FOLLOW_called_function_in_function_call_2218);
            called_function252=called_function();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_called_function.add(called_function252.getTree());

            pushFollow(FOLLOW_call_template_list_in_function_call_2220);
            call_template_list253=call_template_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_call_template_list.add(call_template_list253.getTree());

            pushFollow(FOLLOW_function_argument_list_in_function_call_2222);
            function_argument_list254=function_argument_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_argument_list.add(function_argument_list254.getTree());

            // AST REWRITE
            // elements: call_template_list, function_argument_list, called_function
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 218:15: -> called_function ^( CALL_TEMPLATE_LIST ( call_template_list )? ) function_argument_list
            {
                adaptor.addChild(root_0, stream_called_function.nextTree());

                // CPPGrammar.g:218:34: ^( CALL_TEMPLATE_LIST ( call_template_list )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALL_TEMPLATE_LIST, "CALL_TEMPLATE_LIST")
                , root_1);

                // CPPGrammar.g:218:55: ( call_template_list )?
                if ( stream_call_template_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_call_template_list.nextTree());

                }
                stream_call_template_list.reset();

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_function_argument_list.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_call_"


    public static class call_template_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call_template_list"
    // CPPGrammar.g:219:1: call_template_list : ( '<' template_param_list '>' )? ;
    public final CPPGrammarParser.call_template_list_return call_template_list() throws RecognitionException {
        CPPGrammarParser.call_template_list_return retval = new CPPGrammarParser.call_template_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal255=null;
        Token char_literal257=null;
        CPPGrammarParser.template_param_list_return template_param_list256 =null;


        CommonTree char_literal255_tree=null;
        CommonTree char_literal257_tree=null;

        try {
            // CPPGrammar.g:219:19: ( ( '<' template_param_list '>' )? )
            // CPPGrammar.g:219:21: ( '<' template_param_list '>' )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:219:21: ( '<' template_param_list '>' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==84) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // CPPGrammar.g:219:22: '<' template_param_list '>'
                    {
                    char_literal255=(Token)match(input,84,FOLLOW_84_in_call_template_list2256); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal255_tree = 
                    (CommonTree)adaptor.create(char_literal255)
                    ;
                    adaptor.addChild(root_0, char_literal255_tree);
                    }

                    pushFollow(FOLLOW_template_param_list_in_call_template_list2258);
                    template_param_list256=template_param_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list256.getTree());

                    char_literal257=(Token)match(input,90,FOLLOW_90_in_call_template_list2260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal257_tree = 
                    (CommonTree)adaptor.create(char_literal257)
                    ;
                    adaptor.addChild(root_0, char_literal257_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "call_template_list"


    public static class function_argument_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_argument_list"
    // CPPGrammar.g:220:1: function_argument_list : function_argument_list_ -> ^( ARGUMENT_LIST ( function_argument_list_ )? ) ;
    public final CPPGrammarParser.function_argument_list_return function_argument_list() throws RecognitionException {
        CPPGrammarParser.function_argument_list_return retval = new CPPGrammarParser.function_argument_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.function_argument_list__return function_argument_list_258 =null;


        RewriteRuleSubtreeStream stream_function_argument_list_=new RewriteRuleSubtreeStream(adaptor,"rule function_argument_list_");
        try {
            // CPPGrammar.g:220:23: ( function_argument_list_ -> ^( ARGUMENT_LIST ( function_argument_list_ )? ) )
            // CPPGrammar.g:220:25: function_argument_list_
            {
            pushFollow(FOLLOW_function_argument_list__in_function_argument_list2269);
            function_argument_list_258=function_argument_list_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_argument_list_.add(function_argument_list_258.getTree());

            // AST REWRITE
            // elements: function_argument_list_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 220:49: -> ^( ARGUMENT_LIST ( function_argument_list_ )? )
            {
                // CPPGrammar.g:220:52: ^( ARGUMENT_LIST ( function_argument_list_ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST")
                , root_1);

                // CPPGrammar.g:220:68: ( function_argument_list_ )?
                if ( stream_function_argument_list_.hasNext() ) {
                    adaptor.addChild(root_1, stream_function_argument_list_.nextTree());

                }
                stream_function_argument_list_.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_argument_list"


    public static class function_argument_list__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_argument_list_"
    // CPPGrammar.g:221:1: function_argument_list_ : '(' ( function_argument ( ',' function_argument )* )? ')' ;
    public final CPPGrammarParser.function_argument_list__return function_argument_list_() throws RecognitionException {
        CPPGrammarParser.function_argument_list__return retval = new CPPGrammarParser.function_argument_list__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal259=null;
        Token char_literal261=null;
        Token char_literal263=null;
        CPPGrammarParser.function_argument_return function_argument260 =null;

        CPPGrammarParser.function_argument_return function_argument262 =null;


        CommonTree char_literal259_tree=null;
        CommonTree char_literal261_tree=null;
        CommonTree char_literal263_tree=null;

        try {
            // CPPGrammar.g:221:24: ( '(' ( function_argument ( ',' function_argument )* )? ')' )
            // CPPGrammar.g:221:26: '(' ( function_argument ( ',' function_argument )* )? ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal259=(Token)match(input,66,FOLLOW_66_in_function_argument_list_2284); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal259_tree = 
            (CommonTree)adaptor.create(char_literal259)
            ;
            adaptor.addChild(root_0, char_literal259_tree);
            }

            // CPPGrammar.g:221:30: ( function_argument ( ',' function_argument )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0 >= ALPHA_NUMERIC && LA85_0 <= 66)||(LA85_0 >= 68 && LA85_0 <= 72)||(LA85_0 >= 74 && LA85_0 <= 82)||(LA85_0 >= 84 && LA85_0 <= 94)||(LA85_0 >= 96 && LA85_0 <= 140)||LA85_0==142) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // CPPGrammar.g:221:32: function_argument ( ',' function_argument )*
                    {
                    pushFollow(FOLLOW_function_argument_in_function_argument_list_2288);
                    function_argument260=function_argument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_argument260.getTree());

                    // CPPGrammar.g:221:50: ( ',' function_argument )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==73) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // CPPGrammar.g:221:51: ',' function_argument
                    	    {
                    	    char_literal261=(Token)match(input,73,FOLLOW_73_in_function_argument_list_2291); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal261_tree = 
                    	    (CommonTree)adaptor.create(char_literal261)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal261_tree);
                    	    }

                    	    pushFollow(FOLLOW_function_argument_in_function_argument_list_2293);
                    	    function_argument262=function_argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_argument262.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal263=(Token)match(input,67,FOLLOW_67_in_function_argument_list_2300); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal263_tree = 
            (CommonTree)adaptor.create(char_literal263)
            ;
            adaptor.addChild(root_0, char_literal263_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_argument_list_"


    public static class function_argument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_argument"
    // CPPGrammar.g:222:1: function_argument : assignment_expr -> ^( ARGUMENT assignment_expr ) ;
    public final CPPGrammarParser.function_argument_return function_argument() throws RecognitionException {
        CPPGrammarParser.function_argument_return retval = new CPPGrammarParser.function_argument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.assignment_expr_return assignment_expr264 =null;


        RewriteRuleSubtreeStream stream_assignment_expr=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expr");
        try {
            // CPPGrammar.g:222:18: ( assignment_expr -> ^( ARGUMENT assignment_expr ) )
            // CPPGrammar.g:222:20: assignment_expr
            {
            pushFollow(FOLLOW_assignment_expr_in_function_argument2306);
            assignment_expr264=assignment_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment_expr.add(assignment_expr264.getTree());

            // AST REWRITE
            // elements: assignment_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 222:36: -> ^( ARGUMENT assignment_expr )
            {
                // CPPGrammar.g:222:39: ^( ARGUMENT assignment_expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARGUMENT, "ARGUMENT")
                , root_1);

                adaptor.addChild(root_1, stream_assignment_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_argument"


    public static class called_function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "called_function"
    // CPPGrammar.g:223:1: called_function : called_function_ -> ^( CALLEE called_function_ ) ;
    public final CPPGrammarParser.called_function_return called_function() throws RecognitionException {
        CPPGrammarParser.called_function_return retval = new CPPGrammarParser.called_function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.called_function__return called_function_265 =null;


        RewriteRuleSubtreeStream stream_called_function_=new RewriteRuleSubtreeStream(adaptor,"rule called_function_");
        try {
            // CPPGrammar.g:223:16: ( called_function_ -> ^( CALLEE called_function_ ) )
            // CPPGrammar.g:223:18: called_function_
            {
            pushFollow(FOLLOW_called_function__in_called_function2320);
            called_function_265=called_function_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_called_function_.add(called_function_265.getTree());

            // AST REWRITE
            // elements: called_function_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 223:35: -> ^( CALLEE called_function_ )
            {
                // CPPGrammar.g:223:38: ^( CALLEE called_function_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALLEE, "CALLEE")
                , root_1);

                adaptor.addChild(root_1, stream_called_function_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "called_function"


    public static class called_function__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "called_function_"
    // CPPGrammar.g:224:1: called_function_ : ( ( '(' expr ')' )=> '(' expr ')' | b_ident );
    public final CPPGrammarParser.called_function__return called_function_() throws RecognitionException {
        CPPGrammarParser.called_function__return retval = new CPPGrammarParser.called_function__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal266=null;
        Token char_literal268=null;
        CPPGrammarParser.expr_return expr267 =null;

        CPPGrammarParser.b_ident_return b_ident269 =null;


        CommonTree char_literal266_tree=null;
        CommonTree char_literal268_tree=null;

        try {
            // CPPGrammar.g:224:17: ( ( '(' expr ')' )=> '(' expr ')' | b_ident )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==66) ) {
                int LA86_1 = input.LA(2);

                if ( (synpred15_CPPGrammar()) ) {
                    alt86=1;
                }
                else if ( (true) ) {
                    alt86=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA86_0==ALPHA_NUMERIC||LA86_0==64||LA86_0==68) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }
            switch (alt86) {
                case 1 :
                    // CPPGrammar.g:224:20: ( '(' expr ')' )=> '(' expr ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal266=(Token)match(input,66,FOLLOW_66_in_called_function_2346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal266_tree = 
                    (CommonTree)adaptor.create(char_literal266)
                    ;
                    adaptor.addChild(root_0, char_literal266_tree);
                    }

                    pushFollow(FOLLOW_expr_in_called_function_2348);
                    expr267=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr267.getTree());

                    char_literal268=(Token)match(input,67,FOLLOW_67_in_called_function_2350); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal268_tree = 
                    (CommonTree)adaptor.create(char_literal268)
                    ;
                    adaptor.addChild(root_0, char_literal268_tree);
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:224:54: b_ident
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_b_ident_in_called_function_2354);
                    b_ident269=b_ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, b_ident269.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "called_function_"


    public static class b_ident_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "b_ident"
    // CPPGrammar.g:225:1: b_ident : ( ptr_operator )* ( '(' ( b_ident )+ ')' | identifier ) ( ( '.' | '->' ) b_ident )? ;
    public final CPPGrammarParser.b_ident_return b_ident() throws RecognitionException {
        CPPGrammarParser.b_ident_return retval = new CPPGrammarParser.b_ident_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal271=null;
        Token char_literal273=null;
        Token set275=null;
        CPPGrammarParser.ptr_operator_return ptr_operator270 =null;

        CPPGrammarParser.b_ident_return b_ident272 =null;

        CPPGrammarParser.identifier_return identifier274 =null;

        CPPGrammarParser.b_ident_return b_ident276 =null;


        CommonTree char_literal271_tree=null;
        CommonTree char_literal273_tree=null;
        CommonTree set275_tree=null;

        try {
            // CPPGrammar.g:225:8: ( ( ptr_operator )* ( '(' ( b_ident )+ ')' | identifier ) ( ( '.' | '->' ) b_ident )? )
            // CPPGrammar.g:225:11: ( ptr_operator )* ( '(' ( b_ident )+ ')' | identifier ) ( ( '.' | '->' ) b_ident )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:225:11: ( ptr_operator )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==64||LA87_0==68) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // CPPGrammar.g:225:11: ptr_operator
            	    {
            	    pushFollow(FOLLOW_ptr_operator_in_b_ident2361);
            	    ptr_operator270=ptr_operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ptr_operator270.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            // CPPGrammar.g:225:25: ( '(' ( b_ident )+ ')' | identifier )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==66) ) {
                alt89=1;
            }
            else if ( (LA89_0==ALPHA_NUMERIC) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }
            switch (alt89) {
                case 1 :
                    // CPPGrammar.g:225:26: '(' ( b_ident )+ ')'
                    {
                    char_literal271=(Token)match(input,66,FOLLOW_66_in_b_ident2365); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal271_tree = 
                    (CommonTree)adaptor.create(char_literal271)
                    ;
                    adaptor.addChild(root_0, char_literal271_tree);
                    }

                    // CPPGrammar.g:225:31: ( b_ident )+
                    int cnt88=0;
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==ALPHA_NUMERIC||LA88_0==64||LA88_0==66||LA88_0==68) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // CPPGrammar.g:225:31: b_ident
                    	    {
                    	    pushFollow(FOLLOW_b_ident_in_b_ident2368);
                    	    b_ident272=b_ident();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, b_ident272.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt88 >= 1 ) break loop88;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(88, input);
                                throw eee;
                        }
                        cnt88++;
                    } while (true);


                    char_literal273=(Token)match(input,67,FOLLOW_67_in_b_ident2371); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal273_tree = 
                    (CommonTree)adaptor.create(char_literal273)
                    ;
                    adaptor.addChild(root_0, char_literal273_tree);
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:225:47: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_b_ident2376);
                    identifier274=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier274.getTree());

                    }
                    break;

            }


            // CPPGrammar.g:225:59: ( ( '.' | '->' ) b_ident )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==DOT||LA90_0==77) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // CPPGrammar.g:225:60: ( '.' | '->' ) b_ident
                    {
                    set275=(Token)input.LT(1);

                    if ( input.LA(1)==DOT||input.LA(1)==77 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set275)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_b_ident_in_b_ident2388);
                    b_ident276=b_ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, b_ident276.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "b_ident"


    public static class constant_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant_expr"
    // CPPGrammar.g:227:1: constant_expr : ( constant_expr_elem )* ;
    public final CPPGrammarParser.constant_expr_return constant_expr() throws RecognitionException {
        CPPGrammarParser.constant_expr_return retval = new CPPGrammarParser.constant_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.constant_expr_elem_return constant_expr_elem277 =null;



        try {
            // CPPGrammar.g:227:14: ( ( constant_expr_elem )* )
            // CPPGrammar.g:227:16: ( constant_expr_elem )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:227:16: ( constant_expr_elem )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0 >= ALPHA_NUMERIC && LA91_0 <= 82)||(LA91_0 >= 84 && LA91_0 <= 94)||(LA91_0 >= 96 && LA91_0 <= 142)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // CPPGrammar.g:227:16: constant_expr_elem
            	    {
            	    pushFollow(FOLLOW_constant_expr_elem_in_constant_expr2397);
            	    constant_expr_elem277=constant_expr_elem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expr_elem277.getTree());

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constant_expr"


    public static class constant_expr_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant_expr_elem"
    // CPPGrammar.g:229:1: constant_expr_elem : ( '[' constant_expr ']' | no_squares_or_semicolon );
    public final CPPGrammarParser.constant_expr_elem_return constant_expr_elem() throws RecognitionException {
        CPPGrammarParser.constant_expr_elem_return retval = new CPPGrammarParser.constant_expr_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal278=null;
        Token char_literal280=null;
        CPPGrammarParser.constant_expr_return constant_expr279 =null;

        CPPGrammarParser.no_squares_or_semicolon_return no_squares_or_semicolon281 =null;


        CommonTree char_literal278_tree=null;
        CommonTree char_literal280_tree=null;

        try {
            // CPPGrammar.g:229:19: ( '[' constant_expr ']' | no_squares_or_semicolon )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==94) ) {
                alt92=1;
            }
            else if ( ((LA92_0 >= ALPHA_NUMERIC && LA92_0 <= 82)||(LA92_0 >= 84 && LA92_0 <= 93)||(LA92_0 >= 96 && LA92_0 <= 142)) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;

            }
            switch (alt92) {
                case 1 :
                    // CPPGrammar.g:229:21: '[' constant_expr ']'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal278=(Token)match(input,94,FOLLOW_94_in_constant_expr_elem2405); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal278_tree = 
                    (CommonTree)adaptor.create(char_literal278)
                    ;
                    adaptor.addChild(root_0, char_literal278_tree);
                    }

                    pushFollow(FOLLOW_constant_expr_in_constant_expr_elem2407);
                    constant_expr279=constant_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expr279.getTree());

                    char_literal280=(Token)match(input,95,FOLLOW_95_in_constant_expr_elem2409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal280_tree = 
                    (CommonTree)adaptor.create(char_literal280)
                    ;
                    adaptor.addChild(root_0, char_literal280_tree);
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:230:23: no_squares_or_semicolon
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_no_squares_or_semicolon_in_constant_expr_elem2433);
                    no_squares_or_semicolon281=no_squares_or_semicolon();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, no_squares_or_semicolon281.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constant_expr_elem"


    public static class assignment_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_expr"
    // CPPGrammar.g:232:1: assignment_expr : ( assignment_expr_elem )+ ;
    public final CPPGrammarParser.assignment_expr_return assignment_expr() throws RecognitionException {
        CPPGrammarParser.assignment_expr_return retval = new CPPGrammarParser.assignment_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.assignment_expr_elem_return assignment_expr_elem282 =null;



        try {
            // CPPGrammar.g:232:16: ( ( assignment_expr_elem )+ )
            // CPPGrammar.g:232:18: ( assignment_expr_elem )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:232:18: ( assignment_expr_elem )+
            int cnt93=0;
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( ((LA93_0 >= ALPHA_NUMERIC && LA93_0 <= 66)||(LA93_0 >= 68 && LA93_0 <= 72)||(LA93_0 >= 74 && LA93_0 <= 82)||(LA93_0 >= 84 && LA93_0 <= 94)||(LA93_0 >= 96 && LA93_0 <= 140)||LA93_0==142) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // CPPGrammar.g:232:18: assignment_expr_elem
            	    {
            	    pushFollow(FOLLOW_assignment_expr_elem_in_assignment_expr2440);
            	    assignment_expr_elem282=assignment_expr_elem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expr_elem282.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt93 >= 1 ) break loop93;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(93, input);
                        throw eee;
                }
                cnt93++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_expr"


    public static class assignment_expr_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_expr_elem"
    // CPPGrammar.g:234:1: assignment_expr_elem : ( ( recognized_expr )=> recognized_expr | ( '(' assignment_expr_l2 ')' | ( '{' assignment_expr_l2 '}' ) | ( '[' assignment_expr_l2 ']' ) ) |~ ( ',' | ';' | '(' | ')' | '{' | '}' | '[' | ']' ) );
    public final CPPGrammarParser.assignment_expr_elem_return assignment_expr_elem() throws RecognitionException {
        CPPGrammarParser.assignment_expr_elem_return retval = new CPPGrammarParser.assignment_expr_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal284=null;
        Token char_literal286=null;
        Token char_literal287=null;
        Token char_literal289=null;
        Token char_literal290=null;
        Token char_literal292=null;
        Token set293=null;
        CPPGrammarParser.recognized_expr_return recognized_expr283 =null;

        CPPGrammarParser.assignment_expr_l2_return assignment_expr_l2285 =null;

        CPPGrammarParser.assignment_expr_l2_return assignment_expr_l2288 =null;

        CPPGrammarParser.assignment_expr_l2_return assignment_expr_l2291 =null;


        CommonTree char_literal284_tree=null;
        CommonTree char_literal286_tree=null;
        CommonTree char_literal287_tree=null;
        CommonTree char_literal289_tree=null;
        CommonTree char_literal290_tree=null;
        CommonTree char_literal292_tree=null;
        CommonTree set293_tree=null;

        try {
            // CPPGrammar.g:234:21: ( ( recognized_expr )=> recognized_expr | ( '(' assignment_expr_l2 ')' | ( '{' assignment_expr_l2 '}' ) | ( '[' assignment_expr_l2 ']' ) ) |~ ( ',' | ';' | '(' | ')' | '{' | '}' | '[' | ']' ) )
            int alt95=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                int LA95_1 = input.LA(2);

                if ( (synpred16_CPPGrammar()) ) {
                    alt95=1;
                }
                else if ( (true) ) {
                    alt95=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 1, input);

                    throw nvae;

                }
                }
                break;
            case 64:
            case 68:
                {
                int LA95_2 = input.LA(2);

                if ( (synpred16_CPPGrammar()) ) {
                    alt95=1;
                }
                else if ( (true) ) {
                    alt95=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 2, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA95_3 = input.LA(2);

                if ( (synpred16_CPPGrammar()) ) {
                    alt95=1;
                }
                else if ( (true) ) {
                    alt95=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 3, input);

                    throw nvae;

                }
                }
                break;
            case 94:
            case 137:
                {
                alt95=2;
                }
                break;
            case ARGUMENT:
            case ARGUMENT_LIST:
            case BASE_CLASSES:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COMMENT:
            case CONDITION:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case DESTINATION:
            case DIGITS:
            case DOT:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case INCLUDE_DIRECTIVE:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case INIT_DECL_NAME:
            case ITERATION:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case NAMESPACE_DEF:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case PARAMETER_NAME:
            case PARAMETER_TYPE:
            case PREPROC:
            case Q_MARK:
            case RETURN_TYPE:
            case SELECTION:
            case SIMPLE_DECL:
            case SIZEOF:
            case SOURCE_FILE:
            case STATEMENTS:
            case STRING:
            case SW:
            case SWITCH:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE_DEF:
            case TYPE_SPECIFIER:
            case USING_DIRECTIVE:
            case WHITESPACE:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 65:
            case 69:
            case 70:
            case 71:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 138:
            case 139:
            case 140:
            case 142:
                {
                alt95=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;

            }

            switch (alt95) {
                case 1 :
                    // CPPGrammar.g:234:23: ( recognized_expr )=> recognized_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_recognized_expr_in_assignment_expr_elem2454);
                    recognized_expr283=recognized_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recognized_expr283.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:235:6: ( '(' assignment_expr_l2 ')' | ( '{' assignment_expr_l2 '}' ) | ( '[' assignment_expr_l2 ']' ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:235:6: ( '(' assignment_expr_l2 ')' | ( '{' assignment_expr_l2 '}' ) | ( '[' assignment_expr_l2 ']' ) )
                    int alt94=3;
                    switch ( input.LA(1) ) {
                    case 66:
                        {
                        alt94=1;
                        }
                        break;
                    case 137:
                        {
                        alt94=2;
                        }
                        break;
                    case 94:
                        {
                        alt94=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;

                    }

                    switch (alt94) {
                        case 1 :
                            // CPPGrammar.g:235:8: '(' assignment_expr_l2 ')'
                            {
                            char_literal284=(Token)match(input,66,FOLLOW_66_in_assignment_expr_elem2463); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal284_tree = 
                            (CommonTree)adaptor.create(char_literal284)
                            ;
                            adaptor.addChild(root_0, char_literal284_tree);
                            }

                            pushFollow(FOLLOW_assignment_expr_l2_in_assignment_expr_elem2465);
                            assignment_expr_l2285=assignment_expr_l2();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expr_l2285.getTree());

                            char_literal286=(Token)match(input,67,FOLLOW_67_in_assignment_expr_elem2467); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal286_tree = 
                            (CommonTree)adaptor.create(char_literal286)
                            ;
                            adaptor.addChild(root_0, char_literal286_tree);
                            }

                            }
                            break;
                        case 2 :
                            // CPPGrammar.g:236:6: ( '{' assignment_expr_l2 '}' )
                            {
                            // CPPGrammar.g:236:6: ( '{' assignment_expr_l2 '}' )
                            // CPPGrammar.g:236:7: '{' assignment_expr_l2 '}'
                            {
                            char_literal287=(Token)match(input,137,FOLLOW_137_in_assignment_expr_elem2475); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal287_tree = 
                            (CommonTree)adaptor.create(char_literal287)
                            ;
                            adaptor.addChild(root_0, char_literal287_tree);
                            }

                            pushFollow(FOLLOW_assignment_expr_l2_in_assignment_expr_elem2477);
                            assignment_expr_l2288=assignment_expr_l2();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expr_l2288.getTree());

                            char_literal289=(Token)match(input,141,FOLLOW_141_in_assignment_expr_elem2479); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal289_tree = 
                            (CommonTree)adaptor.create(char_literal289)
                            ;
                            adaptor.addChild(root_0, char_literal289_tree);
                            }

                            }


                            }
                            break;
                        case 3 :
                            // CPPGrammar.g:237:6: ( '[' assignment_expr_l2 ']' )
                            {
                            // CPPGrammar.g:237:6: ( '[' assignment_expr_l2 ']' )
                            // CPPGrammar.g:237:7: '[' assignment_expr_l2 ']'
                            {
                            char_literal290=(Token)match(input,94,FOLLOW_94_in_assignment_expr_elem2488); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal290_tree = 
                            (CommonTree)adaptor.create(char_literal290)
                            ;
                            adaptor.addChild(root_0, char_literal290_tree);
                            }

                            pushFollow(FOLLOW_assignment_expr_l2_in_assignment_expr_elem2490);
                            assignment_expr_l2291=assignment_expr_l2();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expr_l2291.getTree());

                            char_literal292=(Token)match(input,95,FOLLOW_95_in_assignment_expr_elem2492); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal292_tree = 
                            (CommonTree)adaptor.create(char_literal292)
                            ;
                            adaptor.addChild(root_0, char_literal292_tree);
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // CPPGrammar.g:238:6: ~ ( ',' | ';' | '(' | ')' | '{' | '}' | '[' | ']' )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    set293=(Token)input.LT(1);

                    if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 65)||(input.LA(1) >= 68 && input.LA(1) <= 72)||(input.LA(1) >= 74 && input.LA(1) <= 82)||(input.LA(1) >= 84 && input.LA(1) <= 93)||(input.LA(1) >= 96 && input.LA(1) <= 136)||(input.LA(1) >= 138 && input.LA(1) <= 140)||input.LA(1)==142 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set293)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_expr_elem"


    public static class assignment_expr_l2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_expr_l2"
    // CPPGrammar.g:240:1: assignment_expr_l2 : ( assignment_expr_l2_elem )* ;
    public final CPPGrammarParser.assignment_expr_l2_return assignment_expr_l2() throws RecognitionException {
        CPPGrammarParser.assignment_expr_l2_return retval = new CPPGrammarParser.assignment_expr_l2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.assignment_expr_l2_elem_return assignment_expr_l2_elem294 =null;



        try {
            // CPPGrammar.g:240:19: ( ( assignment_expr_l2_elem )* )
            // CPPGrammar.g:240:21: ( assignment_expr_l2_elem )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:240:21: ( assignment_expr_l2_elem )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( ((LA96_0 >= ALPHA_NUMERIC && LA96_0 <= 66)||(LA96_0 >= 68 && LA96_0 <= 94)||(LA96_0 >= 96 && LA96_0 <= 140)||LA96_0==142) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // CPPGrammar.g:240:21: assignment_expr_l2_elem
            	    {
            	    pushFollow(FOLLOW_assignment_expr_l2_elem_in_assignment_expr_l22543);
            	    assignment_expr_l2_elem294=assignment_expr_l2_elem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expr_l2_elem294.getTree());

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_expr_l2"


    public static class assignment_expr_l2_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_expr_l2_elem"
    // CPPGrammar.g:242:1: assignment_expr_l2_elem : ( ( recognized_expr )=> recognized_expr | ( '(' assignment_expr_l2 ')' | '{' assignment_expr_l2 '}' | ( '[' assignment_expr_l2 ']' ) ) | no_brackets_curlies_or_squares );
    public final CPPGrammarParser.assignment_expr_l2_elem_return assignment_expr_l2_elem() throws RecognitionException {
        CPPGrammarParser.assignment_expr_l2_elem_return retval = new CPPGrammarParser.assignment_expr_l2_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal296=null;
        Token char_literal298=null;
        Token char_literal299=null;
        Token char_literal301=null;
        Token char_literal302=null;
        Token char_literal304=null;
        CPPGrammarParser.recognized_expr_return recognized_expr295 =null;

        CPPGrammarParser.assignment_expr_l2_return assignment_expr_l2297 =null;

        CPPGrammarParser.assignment_expr_l2_return assignment_expr_l2300 =null;

        CPPGrammarParser.assignment_expr_l2_return assignment_expr_l2303 =null;

        CPPGrammarParser.no_brackets_curlies_or_squares_return no_brackets_curlies_or_squares305 =null;


        CommonTree char_literal296_tree=null;
        CommonTree char_literal298_tree=null;
        CommonTree char_literal299_tree=null;
        CommonTree char_literal301_tree=null;
        CommonTree char_literal302_tree=null;
        CommonTree char_literal304_tree=null;

        try {
            // CPPGrammar.g:242:24: ( ( recognized_expr )=> recognized_expr | ( '(' assignment_expr_l2 ')' | '{' assignment_expr_l2 '}' | ( '[' assignment_expr_l2 ']' ) ) | no_brackets_curlies_or_squares )
            int alt98=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                int LA98_1 = input.LA(2);

                if ( (synpred17_CPPGrammar()) ) {
                    alt98=1;
                }
                else if ( (true) ) {
                    alt98=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;

                }
                }
                break;
            case 64:
            case 68:
                {
                int LA98_2 = input.LA(2);

                if ( (synpred17_CPPGrammar()) ) {
                    alt98=1;
                }
                else if ( (true) ) {
                    alt98=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 2, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA98_3 = input.LA(2);

                if ( (synpred17_CPPGrammar()) ) {
                    alt98=1;
                }
                else if ( (true) ) {
                    alt98=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 3, input);

                    throw nvae;

                }
                }
                break;
            case 94:
            case 137:
                {
                alt98=2;
                }
                break;
            case ARGUMENT:
            case ARGUMENT_LIST:
            case BASE_CLASSES:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COMMENT:
            case CONDITION:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case DESTINATION:
            case DIGITS:
            case DOT:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case INCLUDE_DIRECTIVE:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case INIT_DECL_NAME:
            case ITERATION:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case NAMESPACE_DEF:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case PARAMETER_NAME:
            case PARAMETER_TYPE:
            case PREPROC:
            case Q_MARK:
            case RETURN_TYPE:
            case SELECTION:
            case SIMPLE_DECL:
            case SIZEOF:
            case SOURCE_FILE:
            case STATEMENTS:
            case STRING:
            case SW:
            case SWITCH:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE_DEF:
            case TYPE_SPECIFIER:
            case USING_DIRECTIVE:
            case WHITESPACE:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 65:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 138:
            case 139:
            case 140:
            case 142:
                {
                alt98=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }

            switch (alt98) {
                case 1 :
                    // CPPGrammar.g:242:26: ( recognized_expr )=> recognized_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_recognized_expr_in_assignment_expr_l2_elem2557);
                    recognized_expr295=recognized_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recognized_expr295.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:243:5: ( '(' assignment_expr_l2 ')' | '{' assignment_expr_l2 '}' | ( '[' assignment_expr_l2 ']' ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:243:5: ( '(' assignment_expr_l2 ')' | '{' assignment_expr_l2 '}' | ( '[' assignment_expr_l2 ']' ) )
                    int alt97=3;
                    switch ( input.LA(1) ) {
                    case 66:
                        {
                        alt97=1;
                        }
                        break;
                    case 137:
                        {
                        alt97=2;
                        }
                        break;
                    case 94:
                        {
                        alt97=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 0, input);

                        throw nvae;

                    }

                    switch (alt97) {
                        case 1 :
                            // CPPGrammar.g:243:6: '(' assignment_expr_l2 ')'
                            {
                            char_literal296=(Token)match(input,66,FOLLOW_66_in_assignment_expr_l2_elem2564); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal296_tree = 
                            (CommonTree)adaptor.create(char_literal296)
                            ;
                            adaptor.addChild(root_0, char_literal296_tree);
                            }

                            pushFollow(FOLLOW_assignment_expr_l2_in_assignment_expr_l2_elem2566);
                            assignment_expr_l2297=assignment_expr_l2();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expr_l2297.getTree());

                            char_literal298=(Token)match(input,67,FOLLOW_67_in_assignment_expr_l2_elem2568); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal298_tree = 
                            (CommonTree)adaptor.create(char_literal298)
                            ;
                            adaptor.addChild(root_0, char_literal298_tree);
                            }

                            }
                            break;
                        case 2 :
                            // CPPGrammar.g:243:35: '{' assignment_expr_l2 '}'
                            {
                            char_literal299=(Token)match(input,137,FOLLOW_137_in_assignment_expr_l2_elem2572); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal299_tree = 
                            (CommonTree)adaptor.create(char_literal299)
                            ;
                            adaptor.addChild(root_0, char_literal299_tree);
                            }

                            pushFollow(FOLLOW_assignment_expr_l2_in_assignment_expr_l2_elem2574);
                            assignment_expr_l2300=assignment_expr_l2();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expr_l2300.getTree());

                            char_literal301=(Token)match(input,141,FOLLOW_141_in_assignment_expr_l2_elem2576); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal301_tree = 
                            (CommonTree)adaptor.create(char_literal301)
                            ;
                            adaptor.addChild(root_0, char_literal301_tree);
                            }

                            }
                            break;
                        case 3 :
                            // CPPGrammar.g:243:64: ( '[' assignment_expr_l2 ']' )
                            {
                            // CPPGrammar.g:243:64: ( '[' assignment_expr_l2 ']' )
                            // CPPGrammar.g:243:65: '[' assignment_expr_l2 ']'
                            {
                            char_literal302=(Token)match(input,94,FOLLOW_94_in_assignment_expr_l2_elem2581); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal302_tree = 
                            (CommonTree)adaptor.create(char_literal302)
                            ;
                            adaptor.addChild(root_0, char_literal302_tree);
                            }

                            pushFollow(FOLLOW_assignment_expr_l2_in_assignment_expr_l2_elem2583);
                            assignment_expr_l2303=assignment_expr_l2();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expr_l2303.getTree());

                            char_literal304=(Token)match(input,95,FOLLOW_95_in_assignment_expr_l2_elem2585); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal304_tree = 
                            (CommonTree)adaptor.create(char_literal304)
                            ;
                            adaptor.addChild(root_0, char_literal304_tree);
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // CPPGrammar.g:244:5: no_brackets_curlies_or_squares
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_no_brackets_curlies_or_squares_in_assignment_expr_l2_elem2593);
                    no_brackets_curlies_or_squares305=no_brackets_curlies_or_squares();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, no_brackets_curlies_or_squares305.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_expr_l2_elem"


    public static class no_brackets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "no_brackets"
    // CPPGrammar.g:248:1: no_brackets : ~ ( '(' | ')' ) ;
    public final CPPGrammarParser.no_brackets_return no_brackets() throws RecognitionException {
        CPPGrammarParser.no_brackets_return retval = new CPPGrammarParser.no_brackets_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set306=null;

        CommonTree set306_tree=null;

        try {
            // CPPGrammar.g:248:12: (~ ( '(' | ')' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set306=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 65)||(input.LA(1) >= 68 && input.LA(1) <= 142) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set306)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "no_brackets"


    public static class no_brackets_curlies_or_squares_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "no_brackets_curlies_or_squares"
    // CPPGrammar.g:249:1: no_brackets_curlies_or_squares : ~ ( '(' | ')' | '{' | '}' | '[' | ']' ) ;
    public final CPPGrammarParser.no_brackets_curlies_or_squares_return no_brackets_curlies_or_squares() throws RecognitionException {
        CPPGrammarParser.no_brackets_curlies_or_squares_return retval = new CPPGrammarParser.no_brackets_curlies_or_squares_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set307=null;

        CommonTree set307_tree=null;

        try {
            // CPPGrammar.g:249:31: (~ ( '(' | ')' | '{' | '}' | '[' | ']' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set307=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 65)||(input.LA(1) >= 68 && input.LA(1) <= 93)||(input.LA(1) >= 96 && input.LA(1) <= 136)||(input.LA(1) >= 138 && input.LA(1) <= 140)||input.LA(1)==142 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set307)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "no_brackets_curlies_or_squares"


    public static class no_brackets_or_semicolon_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "no_brackets_or_semicolon"
    // CPPGrammar.g:250:1: no_brackets_or_semicolon : ~ ( '(' | ')' | ';' ) ;
    public final CPPGrammarParser.no_brackets_or_semicolon_return no_brackets_or_semicolon() throws RecognitionException {
        CPPGrammarParser.no_brackets_or_semicolon_return retval = new CPPGrammarParser.no_brackets_or_semicolon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set308=null;

        CommonTree set308_tree=null;

        try {
            // CPPGrammar.g:250:25: (~ ( '(' | ')' | ';' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set308=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 65)||(input.LA(1) >= 68 && input.LA(1) <= 82)||(input.LA(1) >= 84 && input.LA(1) <= 142) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set308)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "no_brackets_or_semicolon"


    public static class no_angle_brackets_or_brackets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "no_angle_brackets_or_brackets"
    // CPPGrammar.g:251:1: no_angle_brackets_or_brackets : ~ ( '<' | '>' | '(' | ')' ) ;
    public final CPPGrammarParser.no_angle_brackets_or_brackets_return no_angle_brackets_or_brackets() throws RecognitionException {
        CPPGrammarParser.no_angle_brackets_or_brackets_return retval = new CPPGrammarParser.no_angle_brackets_or_brackets_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set309=null;

        CommonTree set309_tree=null;

        try {
            // CPPGrammar.g:251:31: (~ ( '<' | '>' | '(' | ')' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set309=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 65)||(input.LA(1) >= 68 && input.LA(1) <= 83)||(input.LA(1) >= 85 && input.LA(1) <= 89)||(input.LA(1) >= 91 && input.LA(1) <= 142) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set309)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "no_angle_brackets_or_brackets"


    public static class no_curlies_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "no_curlies"
    // CPPGrammar.g:252:1: no_curlies : ~ ( '{' | '}' ) ;
    public final CPPGrammarParser.no_curlies_return no_curlies() throws RecognitionException {
        CPPGrammarParser.no_curlies_return retval = new CPPGrammarParser.no_curlies_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set310=null;

        CommonTree set310_tree=null;

        try {
            // CPPGrammar.g:252:11: (~ ( '{' | '}' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set310=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 136)||(input.LA(1) >= 138 && input.LA(1) <= 140)||input.LA(1)==142 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set310)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "no_curlies"


    public static class no_squares_or_semicolon_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "no_squares_or_semicolon"
    // CPPGrammar.g:253:1: no_squares_or_semicolon : ~ ( '[' | ']' | ';' ) ;
    public final CPPGrammarParser.no_squares_or_semicolon_return no_squares_or_semicolon() throws RecognitionException {
        CPPGrammarParser.no_squares_or_semicolon_return retval = new CPPGrammarParser.no_squares_or_semicolon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set311=null;

        CommonTree set311_tree=null;

        try {
            // CPPGrammar.g:253:24: (~ ( '[' | ']' | ';' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set311=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 82)||(input.LA(1) >= 84 && input.LA(1) <= 93)||(input.LA(1) >= 96 && input.LA(1) <= 142) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set311)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "no_squares_or_semicolon"


    public static class cv_qualifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cv_qualifier"
    // CPPGrammar.g:257:1: cv_qualifier : ( 'const' | 'volatile' );
    public final CPPGrammarParser.cv_qualifier_return cv_qualifier() throws RecognitionException {
        CPPGrammarParser.cv_qualifier_return retval = new CPPGrammarParser.cv_qualifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set312=null;

        CommonTree set312_tree=null;

        try {
            // CPPGrammar.g:257:14: ( 'const' | 'volatile' )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set312=(Token)input.LT(1);

            if ( input.LA(1)==103||input.LA(1)==135 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set312)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cv_qualifier"


    public static class function_decl_specifiers_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_decl_specifiers"
    // CPPGrammar.g:258:1: function_decl_specifiers : ( 'inline' | 'virtual' | 'explicit' | 'friend' | 'static' ) ;
    public final CPPGrammarParser.function_decl_specifiers_return function_decl_specifiers() throws RecognitionException {
        CPPGrammarParser.function_decl_specifiers_return retval = new CPPGrammarParser.function_decl_specifiers_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set313=null;

        CommonTree set313_tree=null;

        try {
            // CPPGrammar.g:258:25: ( ( 'inline' | 'virtual' | 'explicit' | 'friend' | 'static' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set313=(Token)input.LT(1);

            if ( input.LA(1)==109||input.LA(1)==111||input.LA(1)==114||input.LA(1)==124||input.LA(1)==134 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set313)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_decl_specifiers"


    public static class class_key_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_key"
    // CPPGrammar.g:259:1: class_key : ( 'struct' | 'class' | 'union' | 'enum' ) ;
    public final CPPGrammarParser.class_key_return class_key() throws RecognitionException {
        CPPGrammarParser.class_key_return retval = new CPPGrammarParser.class_key_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set314=null;

        CommonTree set314_tree=null;

        try {
            // CPPGrammar.g:259:10: ( ( 'struct' | 'class' | 'union' | 'enum' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set314=(Token)input.LT(1);

            if ( input.LA(1)==102||input.LA(1)==108||input.LA(1)==125||input.LA(1)==131 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set314)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_key"


    public static class ptr_operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ptr_operator"
    // CPPGrammar.g:260:1: ptr_operator : ( '*' | '&' ) ;
    public final CPPGrammarParser.ptr_operator_return ptr_operator() throws RecognitionException {
        CPPGrammarParser.ptr_operator_return retval = new CPPGrammarParser.ptr_operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set315=null;

        CommonTree set315_tree=null;

        try {
            // CPPGrammar.g:260:13: ( ( '*' | '&' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set315=(Token)input.LT(1);

            if ( input.LA(1)==64||input.LA(1)==68 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set315)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ptr_operator"


    public static class access_specifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "access_specifier"
    // CPPGrammar.g:262:1: access_specifier : ( 'public' | 'private' | 'protected' ) ;
    public final CPPGrammarParser.access_specifier_return access_specifier() throws RecognitionException {
        CPPGrammarParser.access_specifier_return retval = new CPPGrammarParser.access_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set316=null;

        CommonTree set316_tree=null;

        try {
            // CPPGrammar.g:262:17: ( ( 'public' | 'private' | 'protected' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set316=(Token)input.LT(1);

            if ( (input.LA(1) >= 118 && input.LA(1) <= 120) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set316)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "access_specifier"


    public static class operator_function_id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operator_function_id"
    // CPPGrammar.g:263:1: operator_function_id : 'operator' operator ;
    public final CPPGrammarParser.operator_function_id_return operator_function_id() throws RecognitionException {
        CPPGrammarParser.operator_function_id_return retval = new CPPGrammarParser.operator_function_id_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal317=null;
        CPPGrammarParser.operator_return operator318 =null;


        CommonTree string_literal317_tree=null;

        try {
            // CPPGrammar.g:263:21: ( 'operator' operator )
            // CPPGrammar.g:263:23: 'operator' operator
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal317=(Token)match(input,117,FOLLOW_117_in_operator_function_id2801); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal317_tree = 
            (CommonTree)adaptor.create(string_literal317)
            ;
            adaptor.addChild(root_0, string_literal317_tree);
            }

            pushFollow(FOLLOW_operator_in_operator_function_id2803);
            operator318=operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator318.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operator_function_id"


    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operator"
    // CPPGrammar.g:265:1: operator : ( ( ( 'new' | 'delete' ) ( '[' ']' )? ) | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '>>' | '<<' | '>>=' | '<<=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | '(' ')' | '[' ']' );
    public final CPPGrammarParser.operator_return operator() throws RecognitionException {
        CPPGrammarParser.operator_return retval = new CPPGrammarParser.operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set319=null;
        Token char_literal320=null;
        Token char_literal321=null;
        Token char_literal322=null;
        Token char_literal323=null;
        Token char_literal324=null;
        Token char_literal325=null;
        Token char_literal326=null;
        Token char_literal327=null;
        Token char_literal328=null;
        Token char_literal329=null;
        Token char_literal330=null;
        Token char_literal331=null;
        Token char_literal332=null;
        Token char_literal333=null;
        Token char_literal334=null;
        Token string_literal335=null;
        Token string_literal336=null;
        Token string_literal337=null;
        Token string_literal338=null;
        Token string_literal339=null;
        Token string_literal340=null;
        Token string_literal341=null;
        Token string_literal342=null;
        Token string_literal343=null;
        Token string_literal344=null;
        Token string_literal345=null;
        Token string_literal346=null;
        Token string_literal347=null;
        Token string_literal348=null;
        Token string_literal349=null;
        Token string_literal350=null;
        Token string_literal351=null;
        Token string_literal352=null;
        Token string_literal353=null;
        Token string_literal354=null;
        Token char_literal355=null;
        Token string_literal356=null;
        Token string_literal357=null;
        Token char_literal358=null;
        Token char_literal359=null;
        Token char_literal360=null;
        Token char_literal361=null;

        CommonTree set319_tree=null;
        CommonTree char_literal320_tree=null;
        CommonTree char_literal321_tree=null;
        CommonTree char_literal322_tree=null;
        CommonTree char_literal323_tree=null;
        CommonTree char_literal324_tree=null;
        CommonTree char_literal325_tree=null;
        CommonTree char_literal326_tree=null;
        CommonTree char_literal327_tree=null;
        CommonTree char_literal328_tree=null;
        CommonTree char_literal329_tree=null;
        CommonTree char_literal330_tree=null;
        CommonTree char_literal331_tree=null;
        CommonTree char_literal332_tree=null;
        CommonTree char_literal333_tree=null;
        CommonTree char_literal334_tree=null;
        CommonTree string_literal335_tree=null;
        CommonTree string_literal336_tree=null;
        CommonTree string_literal337_tree=null;
        CommonTree string_literal338_tree=null;
        CommonTree string_literal339_tree=null;
        CommonTree string_literal340_tree=null;
        CommonTree string_literal341_tree=null;
        CommonTree string_literal342_tree=null;
        CommonTree string_literal343_tree=null;
        CommonTree string_literal344_tree=null;
        CommonTree string_literal345_tree=null;
        CommonTree string_literal346_tree=null;
        CommonTree string_literal347_tree=null;
        CommonTree string_literal348_tree=null;
        CommonTree string_literal349_tree=null;
        CommonTree string_literal350_tree=null;
        CommonTree string_literal351_tree=null;
        CommonTree string_literal352_tree=null;
        CommonTree string_literal353_tree=null;
        CommonTree string_literal354_tree=null;
        CommonTree char_literal355_tree=null;
        CommonTree string_literal356_tree=null;
        CommonTree string_literal357_tree=null;
        CommonTree char_literal358_tree=null;
        CommonTree char_literal359_tree=null;
        CommonTree char_literal360_tree=null;
        CommonTree char_literal361_tree=null;

        try {
            // CPPGrammar.g:265:9: ( ( ( 'new' | 'delete' ) ( '[' ']' )? ) | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '>>' | '<<' | '>>=' | '<<=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | '(' ')' | '[' ']' )
            int alt100=39;
            switch ( input.LA(1) ) {
            case 105:
            case 116:
                {
                alt100=1;
                }
                break;
            case 70:
                {
                alt100=2;
                }
                break;
            case 74:
                {
                alt100=3;
                }
                break;
            case 68:
                {
                alt100=4;
                }
                break;
            case 79:
                {
                alt100=5;
                }
                break;
            case 61:
                {
                alt100=6;
                }
                break;
            case 96:
                {
                alt100=7;
                }
                break;
            case 64:
                {
                alt100=8;
                }
                break;
            case 138:
                {
                alt100=9;
                }
                break;
            case 142:
                {
                alt100=10;
                }
                break;
            case 57:
                {
                alt100=11;
                }
                break;
            case 88:
                {
                alt100=12;
                }
                break;
            case 84:
                {
                alt100=13;
                }
                break;
            case 90:
                {
                alt100=14;
                }
                break;
            case 72:
                {
                alt100=15;
                }
                break;
            case 76:
                {
                alt100=16;
                }
                break;
            case 69:
                {
                alt100=17;
                }
                break;
            case 80:
                {
                alt100=18;
                }
                break;
            case 62:
                {
                alt100=19;
                }
                break;
            case 97:
                {
                alt100=20;
                }
                break;
            case 65:
                {
                alt100=21;
                }
                break;
            case 139:
                {
                alt100=22;
                }
                break;
            case 92:
                {
                alt100=23;
                }
                break;
            case 85:
                {
                alt100=24;
                }
                break;
            case 93:
                {
                alt100=25;
                }
                break;
            case 86:
                {
                alt100=26;
                }
                break;
            case 89:
                {
                alt100=27;
                }
                break;
            case 58:
                {
                alt100=28;
                }
                break;
            case 87:
                {
                alt100=29;
                }
                break;
            case 91:
                {
                alt100=30;
                }
                break;
            case 63:
                {
                alt100=31;
                }
                break;
            case 140:
                {
                alt100=32;
                }
                break;
            case 71:
                {
                alt100=33;
                }
                break;
            case 75:
                {
                alt100=34;
                }
                break;
            case 73:
                {
                alt100=35;
                }
                break;
            case 78:
                {
                alt100=36;
                }
                break;
            case 77:
                {
                alt100=37;
                }
                break;
            case 66:
                {
                alt100=38;
                }
                break;
            case 94:
                {
                alt100=39;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;

            }

            switch (alt100) {
                case 1 :
                    // CPPGrammar.g:265:11: ( ( 'new' | 'delete' ) ( '[' ']' )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:265:11: ( ( 'new' | 'delete' ) ( '[' ']' )? )
                    // CPPGrammar.g:265:12: ( 'new' | 'delete' ) ( '[' ']' )?
                    {
                    set319=(Token)input.LT(1);

                    if ( input.LA(1)==105||input.LA(1)==116 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set319)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // CPPGrammar.g:265:32: ( '[' ']' )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==94) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // CPPGrammar.g:265:33: '[' ']'
                            {
                            char_literal320=(Token)match(input,94,FOLLOW_94_in_operator2821); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal320_tree = 
                            (CommonTree)adaptor.create(char_literal320)
                            ;
                            adaptor.addChild(root_0, char_literal320_tree);
                            }

                            char_literal321=(Token)match(input,95,FOLLOW_95_in_operator2823); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal321_tree = 
                            (CommonTree)adaptor.create(char_literal321)
                            ;
                            adaptor.addChild(root_0, char_literal321_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:266:5: '+'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal322=(Token)match(input,70,FOLLOW_70_in_operator2832); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal322_tree = 
                    (CommonTree)adaptor.create(char_literal322)
                    ;
                    adaptor.addChild(root_0, char_literal322_tree);
                    }

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:266:11: '-'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal323=(Token)match(input,74,FOLLOW_74_in_operator2836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal323_tree = 
                    (CommonTree)adaptor.create(char_literal323)
                    ;
                    adaptor.addChild(root_0, char_literal323_tree);
                    }

                    }
                    break;
                case 4 :
                    // CPPGrammar.g:266:17: '*'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal324=(Token)match(input,68,FOLLOW_68_in_operator2840); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal324_tree = 
                    (CommonTree)adaptor.create(char_literal324)
                    ;
                    adaptor.addChild(root_0, char_literal324_tree);
                    }

                    }
                    break;
                case 5 :
                    // CPPGrammar.g:266:23: '/'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal325=(Token)match(input,79,FOLLOW_79_in_operator2844); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal325_tree = 
                    (CommonTree)adaptor.create(char_literal325)
                    ;
                    adaptor.addChild(root_0, char_literal325_tree);
                    }

                    }
                    break;
                case 6 :
                    // CPPGrammar.g:266:29: '%'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal326=(Token)match(input,61,FOLLOW_61_in_operator2848); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal326_tree = 
                    (CommonTree)adaptor.create(char_literal326)
                    ;
                    adaptor.addChild(root_0, char_literal326_tree);
                    }

                    }
                    break;
                case 7 :
                    // CPPGrammar.g:266:34: '^'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal327=(Token)match(input,96,FOLLOW_96_in_operator2851); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal327_tree = 
                    (CommonTree)adaptor.create(char_literal327)
                    ;
                    adaptor.addChild(root_0, char_literal327_tree);
                    }

                    }
                    break;
                case 8 :
                    // CPPGrammar.g:266:40: '&'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal328=(Token)match(input,64,FOLLOW_64_in_operator2855); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal328_tree = 
                    (CommonTree)adaptor.create(char_literal328)
                    ;
                    adaptor.addChild(root_0, char_literal328_tree);
                    }

                    }
                    break;
                case 9 :
                    // CPPGrammar.g:266:46: '|'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal329=(Token)match(input,138,FOLLOW_138_in_operator2859); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal329_tree = 
                    (CommonTree)adaptor.create(char_literal329)
                    ;
                    adaptor.addChild(root_0, char_literal329_tree);
                    }

                    }
                    break;
                case 10 :
                    // CPPGrammar.g:266:52: '~'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal330=(Token)match(input,142,FOLLOW_142_in_operator2863); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal330_tree = 
                    (CommonTree)adaptor.create(char_literal330)
                    ;
                    adaptor.addChild(root_0, char_literal330_tree);
                    }

                    }
                    break;
                case 11 :
                    // CPPGrammar.g:267:5: '!'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal331=(Token)match(input,57,FOLLOW_57_in_operator2869); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal331_tree = 
                    (CommonTree)adaptor.create(char_literal331)
                    ;
                    adaptor.addChild(root_0, char_literal331_tree);
                    }

                    }
                    break;
                case 12 :
                    // CPPGrammar.g:267:11: '='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal332=(Token)match(input,88,FOLLOW_88_in_operator2873); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal332_tree = 
                    (CommonTree)adaptor.create(char_literal332)
                    ;
                    adaptor.addChild(root_0, char_literal332_tree);
                    }

                    }
                    break;
                case 13 :
                    // CPPGrammar.g:267:17: '<'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal333=(Token)match(input,84,FOLLOW_84_in_operator2877); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal333_tree = 
                    (CommonTree)adaptor.create(char_literal333)
                    ;
                    adaptor.addChild(root_0, char_literal333_tree);
                    }

                    }
                    break;
                case 14 :
                    // CPPGrammar.g:267:23: '>'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal334=(Token)match(input,90,FOLLOW_90_in_operator2881); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal334_tree = 
                    (CommonTree)adaptor.create(char_literal334)
                    ;
                    adaptor.addChild(root_0, char_literal334_tree);
                    }

                    }
                    break;
                case 15 :
                    // CPPGrammar.g:267:29: '+='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal335=(Token)match(input,72,FOLLOW_72_in_operator2885); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal335_tree = 
                    (CommonTree)adaptor.create(string_literal335)
                    ;
                    adaptor.addChild(root_0, string_literal335_tree);
                    }

                    }
                    break;
                case 16 :
                    // CPPGrammar.g:267:36: '-='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal336=(Token)match(input,76,FOLLOW_76_in_operator2889); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal336_tree = 
                    (CommonTree)adaptor.create(string_literal336)
                    ;
                    adaptor.addChild(root_0, string_literal336_tree);
                    }

                    }
                    break;
                case 17 :
                    // CPPGrammar.g:267:43: '*='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal337=(Token)match(input,69,FOLLOW_69_in_operator2893); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal337_tree = 
                    (CommonTree)adaptor.create(string_literal337)
                    ;
                    adaptor.addChild(root_0, string_literal337_tree);
                    }

                    }
                    break;
                case 18 :
                    // CPPGrammar.g:268:5: '/='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal338=(Token)match(input,80,FOLLOW_80_in_operator2899); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal338_tree = 
                    (CommonTree)adaptor.create(string_literal338)
                    ;
                    adaptor.addChild(root_0, string_literal338_tree);
                    }

                    }
                    break;
                case 19 :
                    // CPPGrammar.g:268:12: '%='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal339=(Token)match(input,62,FOLLOW_62_in_operator2903); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal339_tree = 
                    (CommonTree)adaptor.create(string_literal339)
                    ;
                    adaptor.addChild(root_0, string_literal339_tree);
                    }

                    }
                    break;
                case 20 :
                    // CPPGrammar.g:268:19: '^='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal340=(Token)match(input,97,FOLLOW_97_in_operator2907); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal340_tree = 
                    (CommonTree)adaptor.create(string_literal340)
                    ;
                    adaptor.addChild(root_0, string_literal340_tree);
                    }

                    }
                    break;
                case 21 :
                    // CPPGrammar.g:268:26: '&='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal341=(Token)match(input,65,FOLLOW_65_in_operator2911); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal341_tree = 
                    (CommonTree)adaptor.create(string_literal341)
                    ;
                    adaptor.addChild(root_0, string_literal341_tree);
                    }

                    }
                    break;
                case 22 :
                    // CPPGrammar.g:268:33: '|='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal342=(Token)match(input,139,FOLLOW_139_in_operator2915); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal342_tree = 
                    (CommonTree)adaptor.create(string_literal342)
                    ;
                    adaptor.addChild(root_0, string_literal342_tree);
                    }

                    }
                    break;
                case 23 :
                    // CPPGrammar.g:268:40: '>>'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal343=(Token)match(input,92,FOLLOW_92_in_operator2919); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal343_tree = 
                    (CommonTree)adaptor.create(string_literal343)
                    ;
                    adaptor.addChild(root_0, string_literal343_tree);
                    }

                    }
                    break;
                case 24 :
                    // CPPGrammar.g:269:4: '<<'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal344=(Token)match(input,85,FOLLOW_85_in_operator2924); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal344_tree = 
                    (CommonTree)adaptor.create(string_literal344)
                    ;
                    adaptor.addChild(root_0, string_literal344_tree);
                    }

                    }
                    break;
                case 25 :
                    // CPPGrammar.g:269:10: '>>='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal345=(Token)match(input,93,FOLLOW_93_in_operator2927); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal345_tree = 
                    (CommonTree)adaptor.create(string_literal345)
                    ;
                    adaptor.addChild(root_0, string_literal345_tree);
                    }

                    }
                    break;
                case 26 :
                    // CPPGrammar.g:269:18: '<<='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal346=(Token)match(input,86,FOLLOW_86_in_operator2931); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal346_tree = 
                    (CommonTree)adaptor.create(string_literal346)
                    ;
                    adaptor.addChild(root_0, string_literal346_tree);
                    }

                    }
                    break;
                case 27 :
                    // CPPGrammar.g:269:26: '=='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal347=(Token)match(input,89,FOLLOW_89_in_operator2935); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal347_tree = 
                    (CommonTree)adaptor.create(string_literal347)
                    ;
                    adaptor.addChild(root_0, string_literal347_tree);
                    }

                    }
                    break;
                case 28 :
                    // CPPGrammar.g:269:33: '!='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal348=(Token)match(input,58,FOLLOW_58_in_operator2939); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal348_tree = 
                    (CommonTree)adaptor.create(string_literal348)
                    ;
                    adaptor.addChild(root_0, string_literal348_tree);
                    }

                    }
                    break;
                case 29 :
                    // CPPGrammar.g:270:5: '<='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal349=(Token)match(input,87,FOLLOW_87_in_operator2946); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal349_tree = 
                    (CommonTree)adaptor.create(string_literal349)
                    ;
                    adaptor.addChild(root_0, string_literal349_tree);
                    }

                    }
                    break;
                case 30 :
                    // CPPGrammar.g:270:12: '>='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal350=(Token)match(input,91,FOLLOW_91_in_operator2950); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal350_tree = 
                    (CommonTree)adaptor.create(string_literal350)
                    ;
                    adaptor.addChild(root_0, string_literal350_tree);
                    }

                    }
                    break;
                case 31 :
                    // CPPGrammar.g:270:19: '&&'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal351=(Token)match(input,63,FOLLOW_63_in_operator2954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal351_tree = 
                    (CommonTree)adaptor.create(string_literal351)
                    ;
                    adaptor.addChild(root_0, string_literal351_tree);
                    }

                    }
                    break;
                case 32 :
                    // CPPGrammar.g:270:26: '||'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal352=(Token)match(input,140,FOLLOW_140_in_operator2958); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal352_tree = 
                    (CommonTree)adaptor.create(string_literal352)
                    ;
                    adaptor.addChild(root_0, string_literal352_tree);
                    }

                    }
                    break;
                case 33 :
                    // CPPGrammar.g:270:33: '++'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal353=(Token)match(input,71,FOLLOW_71_in_operator2962); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal353_tree = 
                    (CommonTree)adaptor.create(string_literal353)
                    ;
                    adaptor.addChild(root_0, string_literal353_tree);
                    }

                    }
                    break;
                case 34 :
                    // CPPGrammar.g:270:40: '--'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal354=(Token)match(input,75,FOLLOW_75_in_operator2966); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal354_tree = 
                    (CommonTree)adaptor.create(string_literal354)
                    ;
                    adaptor.addChild(root_0, string_literal354_tree);
                    }

                    }
                    break;
                case 35 :
                    // CPPGrammar.g:271:5: ','
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal355=(Token)match(input,73,FOLLOW_73_in_operator2972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal355_tree = 
                    (CommonTree)adaptor.create(char_literal355)
                    ;
                    adaptor.addChild(root_0, char_literal355_tree);
                    }

                    }
                    break;
                case 36 :
                    // CPPGrammar.g:271:11: '->*'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal356=(Token)match(input,78,FOLLOW_78_in_operator2976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal356_tree = 
                    (CommonTree)adaptor.create(string_literal356)
                    ;
                    adaptor.addChild(root_0, string_literal356_tree);
                    }

                    }
                    break;
                case 37 :
                    // CPPGrammar.g:271:19: '->'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal357=(Token)match(input,77,FOLLOW_77_in_operator2980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal357_tree = 
                    (CommonTree)adaptor.create(string_literal357)
                    ;
                    adaptor.addChild(root_0, string_literal357_tree);
                    }

                    }
                    break;
                case 38 :
                    // CPPGrammar.g:271:26: '(' ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal358=(Token)match(input,66,FOLLOW_66_in_operator2984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal358_tree = 
                    (CommonTree)adaptor.create(char_literal358)
                    ;
                    adaptor.addChild(root_0, char_literal358_tree);
                    }

                    char_literal359=(Token)match(input,67,FOLLOW_67_in_operator2986); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal359_tree = 
                    (CommonTree)adaptor.create(char_literal359)
                    ;
                    adaptor.addChild(root_0, char_literal359_tree);
                    }

                    }
                    break;
                case 39 :
                    // CPPGrammar.g:271:36: '[' ']'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal360=(Token)match(input,94,FOLLOW_94_in_operator2990); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal360_tree = 
                    (CommonTree)adaptor.create(char_literal360)
                    ;
                    adaptor.addChild(root_0, char_literal360_tree);
                    }

                    char_literal361=(Token)match(input,95,FOLLOW_95_in_operator2992); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal361_tree = 
                    (CommonTree)adaptor.create(char_literal361)
                    ;
                    adaptor.addChild(root_0, char_literal361_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operator"


    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // CPPGrammar.g:274:1: identifier : ALPHA_NUMERIC ( '::' ALPHA_NUMERIC )* ;
    public final CPPGrammarParser.identifier_return identifier() throws RecognitionException {
        CPPGrammarParser.identifier_return retval = new CPPGrammarParser.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ALPHA_NUMERIC362=null;
        Token string_literal363=null;
        Token ALPHA_NUMERIC364=null;

        CommonTree ALPHA_NUMERIC362_tree=null;
        CommonTree string_literal363_tree=null;
        CommonTree ALPHA_NUMERIC364_tree=null;

        try {
            // CPPGrammar.g:274:13: ( ALPHA_NUMERIC ( '::' ALPHA_NUMERIC )* )
            // CPPGrammar.g:274:15: ALPHA_NUMERIC ( '::' ALPHA_NUMERIC )*
            {
            root_0 = (CommonTree)adaptor.nil();


            ALPHA_NUMERIC362=(Token)match(input,ALPHA_NUMERIC,FOLLOW_ALPHA_NUMERIC_in_identifier3004); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALPHA_NUMERIC362_tree = 
            (CommonTree)adaptor.create(ALPHA_NUMERIC362)
            ;
            adaptor.addChild(root_0, ALPHA_NUMERIC362_tree);
            }

            // CPPGrammar.g:274:29: ( '::' ALPHA_NUMERIC )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==82) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // CPPGrammar.g:274:30: '::' ALPHA_NUMERIC
            	    {
            	    string_literal363=(Token)match(input,82,FOLLOW_82_in_identifier3007); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal363_tree = 
            	    (CommonTree)adaptor.create(string_literal363)
            	    ;
            	    adaptor.addChild(root_0, string_literal363_tree);
            	    }

            	    ALPHA_NUMERIC364=(Token)match(input,ALPHA_NUMERIC,FOLLOW_ALPHA_NUMERIC_in_identifier3009); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ALPHA_NUMERIC364_tree = 
            	    (CommonTree)adaptor.create(ALPHA_NUMERIC364)
            	    ;
            	    adaptor.addChild(root_0, ALPHA_NUMERIC364_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class water_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "water"
    // CPPGrammar.g:275:1: water : ~ OTHER ;
    public final CPPGrammarParser.water_return water() throws RecognitionException {
        CPPGrammarParser.water_return retval = new CPPGrammarParser.water_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set365=null;

        CommonTree set365_tree=null;

        try {
            // CPPGrammar.g:275:7: (~ OTHER )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set365=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= NAMESPACE_DEF)||(input.LA(1) >= PARAMETER_DECL && input.LA(1) <= 142) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set365)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "water"


    public static class function_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_def"
    // CPPGrammar.g:278:1: function_def : function_def_ -> ^( FUNCTION_DEF function_def_ ) ;
    public final CPPGrammarParser.function_def_return function_def() throws RecognitionException {
        CPPGrammarParser.function_def_return retval = new CPPGrammarParser.function_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.function_def__return function_def_366 =null;


        RewriteRuleSubtreeStream stream_function_def_=new RewriteRuleSubtreeStream(adaptor,"rule function_def_");
        try {
            // CPPGrammar.g:278:13: ( function_def_ -> ^( FUNCTION_DEF function_def_ ) )
            // CPPGrammar.g:278:15: function_def_
            {
            pushFollow(FOLLOW_function_def__in_function_def3027);
            function_def_366=function_def_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_def_.add(function_def_366.getTree());

            // AST REWRITE
            // elements: function_def_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 278:29: -> ^( FUNCTION_DEF function_def_ )
            {
                // CPPGrammar.g:278:32: ^( FUNCTION_DEF function_def_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNCTION_DEF, "FUNCTION_DEF")
                , root_1);

                adaptor.addChild(root_1, stream_function_def_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_def"


    public static class function_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_name"
    // CPPGrammar.g:279:1: function_name : function_name_ -> ^( FUNCTION_NAME function_name_ ) ;
    public final CPPGrammarParser.function_name_return function_name() throws RecognitionException {
        CPPGrammarParser.function_name_return retval = new CPPGrammarParser.function_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.function_name__return function_name_367 =null;


        RewriteRuleSubtreeStream stream_function_name_=new RewriteRuleSubtreeStream(adaptor,"rule function_name_");
        try {
            // CPPGrammar.g:279:14: ( function_name_ -> ^( FUNCTION_NAME function_name_ ) )
            // CPPGrammar.g:279:16: function_name_
            {
            pushFollow(FOLLOW_function_name__in_function_name3041);
            function_name_367=function_name_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_name_.add(function_name_367.getTree());

            // AST REWRITE
            // elements: function_name_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 279:31: -> ^( FUNCTION_NAME function_name_ )
            {
                // CPPGrammar.g:279:34: ^( FUNCTION_NAME function_name_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNCTION_NAME, "FUNCTION_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_function_name_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_name"


    public static class parameter_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_decl"
    // CPPGrammar.g:280:1: parameter_decl : parameter_decl_ -> ^( PARAMETER_DECL parameter_decl_ ) ;
    public final CPPGrammarParser.parameter_decl_return parameter_decl() throws RecognitionException {
        CPPGrammarParser.parameter_decl_return retval = new CPPGrammarParser.parameter_decl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.parameter_decl__return parameter_decl_368 =null;


        RewriteRuleSubtreeStream stream_parameter_decl_=new RewriteRuleSubtreeStream(adaptor,"rule parameter_decl_");
        try {
            // CPPGrammar.g:280:15: ( parameter_decl_ -> ^( PARAMETER_DECL parameter_decl_ ) )
            // CPPGrammar.g:280:17: parameter_decl_
            {
            pushFollow(FOLLOW_parameter_decl__in_parameter_decl3055);
            parameter_decl_368=parameter_decl_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter_decl_.add(parameter_decl_368.getTree());

            // AST REWRITE
            // elements: parameter_decl_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 280:33: -> ^( PARAMETER_DECL parameter_decl_ )
            {
                // CPPGrammar.g:280:36: ^( PARAMETER_DECL parameter_decl_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAMETER_DECL, "PARAMETER_DECL")
                , root_1);

                adaptor.addChild(root_1, stream_parameter_decl_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_decl"


    public static class parameter_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_name"
    // CPPGrammar.g:281:1: parameter_name : parameter_name_ -> ^( PARAMETER_NAME parameter_name_ ) ;
    public final CPPGrammarParser.parameter_name_return parameter_name() throws RecognitionException {
        CPPGrammarParser.parameter_name_return retval = new CPPGrammarParser.parameter_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.parameter_name__return parameter_name_369 =null;


        RewriteRuleSubtreeStream stream_parameter_name_=new RewriteRuleSubtreeStream(adaptor,"rule parameter_name_");
        try {
            // CPPGrammar.g:281:15: ( parameter_name_ -> ^( PARAMETER_NAME parameter_name_ ) )
            // CPPGrammar.g:281:17: parameter_name_
            {
            pushFollow(FOLLOW_parameter_name__in_parameter_name3069);
            parameter_name_369=parameter_name_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter_name_.add(parameter_name_369.getTree());

            // AST REWRITE
            // elements: parameter_name_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 281:33: -> ^( PARAMETER_NAME parameter_name_ )
            {
                // CPPGrammar.g:281:36: ^( PARAMETER_NAME parameter_name_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAMETER_NAME, "PARAMETER_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_parameter_name_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_name"


    public static class namespace_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namespace_def"
    // CPPGrammar.g:283:1: namespace_def : namespace_def_ -> ^( NAMESPACE_DEF namespace_def_ ) ;
    public final CPPGrammarParser.namespace_def_return namespace_def() throws RecognitionException {
        CPPGrammarParser.namespace_def_return retval = new CPPGrammarParser.namespace_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.namespace_def__return namespace_def_370 =null;


        RewriteRuleSubtreeStream stream_namespace_def_=new RewriteRuleSubtreeStream(adaptor,"rule namespace_def_");
        try {
            // CPPGrammar.g:283:14: ( namespace_def_ -> ^( NAMESPACE_DEF namespace_def_ ) )
            // CPPGrammar.g:283:16: namespace_def_
            {
            pushFollow(FOLLOW_namespace_def__in_namespace_def3084);
            namespace_def_370=namespace_def_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_namespace_def_.add(namespace_def_370.getTree());

            // AST REWRITE
            // elements: namespace_def_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 283:31: -> ^( NAMESPACE_DEF namespace_def_ )
            {
                // CPPGrammar.g:283:34: ^( NAMESPACE_DEF namespace_def_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NAMESPACE_DEF, "NAMESPACE_DEF")
                , root_1);

                adaptor.addChild(root_1, stream_namespace_def_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namespace_def"


    public static class using_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "using_directive"
    // CPPGrammar.g:284:1: using_directive : using_directive_ -> ^( USING_DIRECTIVE using_directive_ ) ;
    public final CPPGrammarParser.using_directive_return using_directive() throws RecognitionException {
        CPPGrammarParser.using_directive_return retval = new CPPGrammarParser.using_directive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.using_directive__return using_directive_371 =null;


        RewriteRuleSubtreeStream stream_using_directive_=new RewriteRuleSubtreeStream(adaptor,"rule using_directive_");
        try {
            // CPPGrammar.g:284:16: ( using_directive_ -> ^( USING_DIRECTIVE using_directive_ ) )
            // CPPGrammar.g:284:18: using_directive_
            {
            pushFollow(FOLLOW_using_directive__in_using_directive3098);
            using_directive_371=using_directive_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_using_directive_.add(using_directive_371.getTree());

            // AST REWRITE
            // elements: using_directive_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 284:35: -> ^( USING_DIRECTIVE using_directive_ )
            {
                // CPPGrammar.g:284:38: ^( USING_DIRECTIVE using_directive_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(USING_DIRECTIVE, "USING_DIRECTIVE")
                , root_1);

                adaptor.addChild(root_1, stream_using_directive_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "using_directive"


    public static class simple_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_decl"
    // CPPGrammar.g:285:1: simple_decl : simple_decl_ -> ^( SIMPLE_DECL simple_decl_ ) ;
    public final CPPGrammarParser.simple_decl_return simple_decl() throws RecognitionException {
        CPPGrammarParser.simple_decl_return retval = new CPPGrammarParser.simple_decl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.simple_decl__return simple_decl_372 =null;


        RewriteRuleSubtreeStream stream_simple_decl_=new RewriteRuleSubtreeStream(adaptor,"rule simple_decl_");
        try {
            // CPPGrammar.g:285:12: ( simple_decl_ -> ^( SIMPLE_DECL simple_decl_ ) )
            // CPPGrammar.g:285:14: simple_decl_
            {
            pushFollow(FOLLOW_simple_decl__in_simple_decl3112);
            simple_decl_372=simple_decl_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simple_decl_.add(simple_decl_372.getTree());

            // AST REWRITE
            // elements: simple_decl_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 285:27: -> ^( SIMPLE_DECL simple_decl_ )
            {
                // CPPGrammar.g:285:30: ^( SIMPLE_DECL simple_decl_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SIMPLE_DECL, "SIMPLE_DECL")
                , root_1);

                adaptor.addChild(root_1, stream_simple_decl_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple_decl"


    public static class jump_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump_statement"
    // CPPGrammar.g:286:1: jump_statement : jump_statement_ -> ^( JUMP_STATEMENT jump_statement_ ) ;
    public final CPPGrammarParser.jump_statement_return jump_statement() throws RecognitionException {
        CPPGrammarParser.jump_statement_return retval = new CPPGrammarParser.jump_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.jump_statement__return jump_statement_373 =null;


        RewriteRuleSubtreeStream stream_jump_statement_=new RewriteRuleSubtreeStream(adaptor,"rule jump_statement_");
        try {
            // CPPGrammar.g:286:15: ( jump_statement_ -> ^( JUMP_STATEMENT jump_statement_ ) )
            // CPPGrammar.g:286:17: jump_statement_
            {
            pushFollow(FOLLOW_jump_statement__in_jump_statement3126);
            jump_statement_373=jump_statement_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_jump_statement_.add(jump_statement_373.getTree());

            // AST REWRITE
            // elements: jump_statement_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 286:33: -> ^( JUMP_STATEMENT jump_statement_ )
            {
                // CPPGrammar.g:286:36: ^( JUMP_STATEMENT jump_statement_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT")
                , root_1);

                adaptor.addChild(root_1, stream_jump_statement_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "jump_statement"


    public static class condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // CPPGrammar.g:287:1: condition : ( condition_ )? -> ^( CONDITION ( condition_ )? ) ;
    public final CPPGrammarParser.condition_return condition() throws RecognitionException {
        CPPGrammarParser.condition_return retval = new CPPGrammarParser.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.condition__return condition_374 =null;


        RewriteRuleSubtreeStream stream_condition_=new RewriteRuleSubtreeStream(adaptor,"rule condition_");
        try {
            // CPPGrammar.g:287:10: ( ( condition_ )? -> ^( CONDITION ( condition_ )? ) )
            // CPPGrammar.g:287:12: ( condition_ )?
            {
            // CPPGrammar.g:287:12: ( condition_ )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( ((LA102_0 >= ALPHA_NUMERIC && LA102_0 <= 66)||(LA102_0 >= 68 && LA102_0 <= 82)||(LA102_0 >= 84 && LA102_0 <= 142)) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // CPPGrammar.g:287:12: condition_
                    {
                    pushFollow(FOLLOW_condition__in_condition3140);
                    condition_374=condition_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_.add(condition_374.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: condition_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 287:24: -> ^( CONDITION ( condition_ )? )
            {
                // CPPGrammar.g:287:27: ^( CONDITION ( condition_ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONDITION, "CONDITION")
                , root_1);

                // CPPGrammar.g:287:39: ( condition_ )?
                if ( stream_condition_.hasNext() ) {
                    adaptor.addChild(root_1, stream_condition_.nextTree());

                }
                stream_condition_.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class init_decl_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_decl_name"
    // CPPGrammar.g:289:1: init_decl_name : init_decl_name_ -> ^( INIT_DECL_NAME init_decl_name_ ) ;
    public final CPPGrammarParser.init_decl_name_return init_decl_name() throws RecognitionException {
        CPPGrammarParser.init_decl_name_return retval = new CPPGrammarParser.init_decl_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.init_decl_name__return init_decl_name_375 =null;


        RewriteRuleSubtreeStream stream_init_decl_name_=new RewriteRuleSubtreeStream(adaptor,"rule init_decl_name_");
        try {
            // CPPGrammar.g:289:15: ( init_decl_name_ -> ^( INIT_DECL_NAME init_decl_name_ ) )
            // CPPGrammar.g:289:17: init_decl_name_
            {
            pushFollow(FOLLOW_init_decl_name__in_init_decl_name3157);
            init_decl_name_375=init_decl_name_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_decl_name_.add(init_decl_name_375.getTree());

            // AST REWRITE
            // elements: init_decl_name_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 289:33: -> ^( INIT_DECL_NAME init_decl_name_ )
            {
                // CPPGrammar.g:289:36: ^( INIT_DECL_NAME init_decl_name_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INIT_DECL_NAME, "INIT_DECL_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_init_decl_name_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "init_decl_name"


    public static class include_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "include_directive"
    // CPPGrammar.g:291:1: include_directive : include_directive_ -> ^( INCLUDE_DIRECTIVE include_directive_ ) ;
    public final CPPGrammarParser.include_directive_return include_directive() throws RecognitionException {
        CPPGrammarParser.include_directive_return retval = new CPPGrammarParser.include_directive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.include_directive__return include_directive_376 =null;


        RewriteRuleSubtreeStream stream_include_directive_=new RewriteRuleSubtreeStream(adaptor,"rule include_directive_");
        try {
            // CPPGrammar.g:291:18: ( include_directive_ -> ^( INCLUDE_DIRECTIVE include_directive_ ) )
            // CPPGrammar.g:291:20: include_directive_
            {
            pushFollow(FOLLOW_include_directive__in_include_directive3172);
            include_directive_376=include_directive_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_include_directive_.add(include_directive_376.getTree());

            // AST REWRITE
            // elements: include_directive_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 291:39: -> ^( INCLUDE_DIRECTIVE include_directive_ )
            {
                // CPPGrammar.g:291:42: ^( INCLUDE_DIRECTIVE include_directive_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INCLUDE_DIRECTIVE, "INCLUDE_DIRECTIVE")
                , root_1);

                adaptor.addChild(root_1, stream_include_directive_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "include_directive"


    public static class label_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "label"
    // CPPGrammar.g:292:1: label : label_ -> ^( LABEL label_ ) ;
    public final CPPGrammarParser.label_return label() throws RecognitionException {
        CPPGrammarParser.label_return retval = new CPPGrammarParser.label_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.label__return label_377 =null;


        RewriteRuleSubtreeStream stream_label_=new RewriteRuleSubtreeStream(adaptor,"rule label_");
        try {
            // CPPGrammar.g:292:6: ( label_ -> ^( LABEL label_ ) )
            // CPPGrammar.g:292:8: label_
            {
            pushFollow(FOLLOW_label__in_label3186);
            label_377=label_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_label_.add(label_377.getTree());

            // AST REWRITE
            // elements: label_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 292:15: -> ^( LABEL label_ )
            {
                // CPPGrammar.g:292:18: ^( LABEL label_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LABEL, "LABEL")
                , root_1);

                adaptor.addChild(root_1, stream_label_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "label"


    public static class function_call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call"
    // CPPGrammar.g:293:1: function_call : function_call_ -> ^( FUNCTION_CALL function_call_ ) ;
    public final CPPGrammarParser.function_call_return function_call() throws RecognitionException {
        CPPGrammarParser.function_call_return retval = new CPPGrammarParser.function_call_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.function_call__return function_call_378 =null;


        RewriteRuleSubtreeStream stream_function_call_=new RewriteRuleSubtreeStream(adaptor,"rule function_call_");
        try {
            // CPPGrammar.g:293:14: ( function_call_ -> ^( FUNCTION_CALL function_call_ ) )
            // CPPGrammar.g:293:16: function_call_
            {
            pushFollow(FOLLOW_function_call__in_function_call3200);
            function_call_378=function_call_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_call_.add(function_call_378.getTree());

            // AST REWRITE
            // elements: function_call_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 293:31: -> ^( FUNCTION_CALL function_call_ )
            {
                // CPPGrammar.g:293:34: ^( FUNCTION_CALL function_call_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL")
                , root_1);

                adaptor.addChild(root_1, stream_function_call_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_call"

    // $ANTLR start synpred1_CPPGrammar
    public final void synpred1_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:51:7: ( declaration )
        // CPPGrammar.g:51:8: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred1_CPPGrammar236);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_CPPGrammar

    // $ANTLR start synpred2_CPPGrammar
    public final void synpred2_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:55:14: ( simple_decl )
        // CPPGrammar.g:55:15: simple_decl
        {
        pushFollow(FOLLOW_simple_decl_in_synpred2_CPPGrammar264);
        simple_decl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_CPPGrammar

    // $ANTLR start synpred3_CPPGrammar
    public final void synpred3_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:81:22: ( simple_decl )
        // CPPGrammar.g:81:23: simple_decl
        {
        pushFollow(FOLLOW_simple_decl_in_synpred3_CPPGrammar585);
        simple_decl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_CPPGrammar

    // $ANTLR start synpred4_CPPGrammar
    public final void synpred4_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:82:5: ( function_def )
        // CPPGrammar.g:82:6: function_def
        {
        pushFollow(FOLLOW_function_def_in_synpred4_CPPGrammar597);
        function_def();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_CPPGrammar

    // $ANTLR start synpred5_CPPGrammar
    public final void synpred5_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:83:5: ( label )
        // CPPGrammar.g:83:6: label
        {
        pushFollow(FOLLOW_label_in_synpred5_CPPGrammar609);
        label();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_CPPGrammar

    // $ANTLR start synpred6_CPPGrammar
    public final void synpred6_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:132:26: ( non_expr_statement )
        // CPPGrammar.g:132:27: non_expr_statement
        {
        pushFollow(FOLLOW_non_expr_statement_in_synpred6_CPPGrammar1175);
        non_expr_statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_CPPGrammar

    // $ANTLR start synpred7_CPPGrammar
    public final void synpred7_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:133:7: ( expr_statement )
        // CPPGrammar.g:133:8: expr_statement
        {
        pushFollow(FOLLOW_expr_statement_in_synpred7_CPPGrammar1189);
        expr_statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_CPPGrammar

    // $ANTLR start synpred8_CPPGrammar
    public final void synpred8_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:146:23: ( recognized_expr )
        // CPPGrammar.g:146:24: recognized_expr
        {
        pushFollow(FOLLOW_recognized_expr_in_synpred8_CPPGrammar1274);
        recognized_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_CPPGrammar

    // $ANTLR start synpred9_CPPGrammar
    public final void synpred9_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:149:23: ( recognized_expr )
        // CPPGrammar.g:149:24: recognized_expr
        {
        pushFollow(FOLLOW_recognized_expr_in_synpred9_CPPGrammar1296);
        recognized_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_CPPGrammar

    // $ANTLR start synpred10_CPPGrammar
    public final void synpred10_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:156:25: ( recognized_expr )
        // CPPGrammar.g:156:26: recognized_expr
        {
        pushFollow(FOLLOW_recognized_expr_in_synpred10_CPPGrammar1357);
        recognized_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_CPPGrammar

    // $ANTLR start synpred11_CPPGrammar
    public final void synpred11_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:191:22: ( simple_decl )
        // CPPGrammar.g:191:23: simple_decl
        {
        pushFollow(FOLLOW_simple_decl_in_synpred11_CPPGrammar1901);
        simple_decl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_CPPGrammar

    // $ANTLR start synpred12_CPPGrammar
    public final void synpred12_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:198:25: ( simple_decl )
        // CPPGrammar.g:198:26: simple_decl
        {
        pushFollow(FOLLOW_simple_decl_in_synpred12_CPPGrammar2007);
        simple_decl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_CPPGrammar

    // $ANTLR start synpred13_CPPGrammar
    public final void synpred13_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:199:5: ( function_def )
        // CPPGrammar.g:199:6: function_def
        {
        pushFollow(FOLLOW_function_def_in_synpred13_CPPGrammar2019);
        function_def();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_CPPGrammar

    // $ANTLR start synpred14_CPPGrammar
    public final void synpred14_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:212:13: ( recognized_expr )
        // CPPGrammar.g:212:14: recognized_expr
        {
        pushFollow(FOLLOW_recognized_expr_in_synpred14_CPPGrammar2155);
        recognized_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_CPPGrammar

    // $ANTLR start synpred15_CPPGrammar
    public final void synpred15_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:224:20: ( '(' expr ')' )
        // CPPGrammar.g:224:22: '(' expr ')'
        {
        match(input,66,FOLLOW_66_in_synpred15_CPPGrammar2337); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred15_CPPGrammar2339);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,67,FOLLOW_67_in_synpred15_CPPGrammar2341); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_CPPGrammar

    // $ANTLR start synpred16_CPPGrammar
    public final void synpred16_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:234:23: ( recognized_expr )
        // CPPGrammar.g:234:24: recognized_expr
        {
        pushFollow(FOLLOW_recognized_expr_in_synpred16_CPPGrammar2449);
        recognized_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_CPPGrammar

    // $ANTLR start synpred17_CPPGrammar
    public final void synpred17_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:242:26: ( recognized_expr )
        // CPPGrammar.g:242:27: recognized_expr
        {
        pushFollow(FOLLOW_recognized_expr_in_synpred17_CPPGrammar2552);
        recognized_expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_CPPGrammar

    // Delegated rules

    public final boolean synpred3_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA10_eotS =
        "\7\uffff";
    static final String DFA10_eofS =
        "\7\uffff";
    static final String DFA10_minS =
        "\1\4\1\uffff\2\4\1\uffff\2\4";
    static final String DFA10_maxS =
        "\1\u0087\1\uffff\2\u0089\1\uffff\1\4\1\u0089";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\2\uffff";
    static final String DFA10_specialS =
        "\7\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\141\uffff\1\2\1\1\4\uffff\1\2\16\uffff\1\1\1\uffff\1\2"+
            "\5\uffff\1\2\1\1\2\uffff\1\1",
            "",
            "\1\3\114\uffff\1\4\51\uffff\1\1\10\uffff\1\1\4\uffff\1\4",
            "\1\1\73\uffff\1\1\3\uffff\1\1\14\uffff\1\4\1\5\1\uffff\1\1"+
            "\64\uffff\1\4",
            "",
            "\1\6",
            "\1\1\73\uffff\1\1\3\uffff\1\1\14\uffff\1\4\1\5\1\uffff\1\1"+
            "\64\uffff\1\4"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "68:16: ( type_specifier init_declarator_list | class_def ( init_declarator_list )? )";
        }
    }
    static final String DFA27_eotS =
        "\14\uffff";
    static final String DFA27_eofS =
        "\14\uffff";
    static final String DFA27_minS =
        "\2\4\1\uffff\1\4\1\uffff\5\4\1\102\1\4";
    static final String DFA27_maxS =
        "\2\u0087\1\uffff\1\u0086\1\uffff\1\4\1\u0087\1\u0086\1\124\1\4\1"+
        "\u0089\1\124";
    static final String DFA27_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\7\uffff";
    static final String DFA27_specialS =
        "\14\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\3\73\uffff\1\4\1\uffff\1\4\1\uffff\1\4\41\uffff\2\2\4\uffff"+
            "\1\2\1\1\1\uffff\1\1\2\uffff\1\1\2\uffff\1\4\5\uffff\1\2\1\1"+
            "\1\2\5\uffff\2\2\1\uffff\1\1\1\2",
            "\1\3\73\uffff\1\4\1\uffff\1\4\1\uffff\1\4\41\uffff\2\2\4\uffff"+
            "\1\2\1\1\1\uffff\1\1\2\uffff\1\1\2\uffff\1\4\5\uffff\1\2\1\1"+
            "\1\2\5\uffff\2\2\1\uffff\1\1\1\2",
            "",
            "\1\2\73\uffff\1\2\1\uffff\1\6\1\uffff\1\2\15\uffff\1\5\1\uffff"+
            "\1\2\30\uffff\1\2\1\uffff\1\2\2\uffff\1\2\2\uffff\1\2\6\uffff"+
            "\1\2\11\uffff\1\2",
            "",
            "\1\7",
            "\1\10\75\uffff\1\2\1\4\36\uffff\1\4\3\uffff\2\4\4\uffff\1\4"+
            "\10\uffff\1\2\3\uffff\1\4\1\uffff\1\4\1\uffff\1\4\5\uffff\2"+
            "\4\2\uffff\1\4",
            "\1\2\73\uffff\1\2\1\uffff\1\6\1\uffff\1\2\15\uffff\1\5\1\uffff"+
            "\1\2\30\uffff\1\2\1\uffff\1\2\2\uffff\1\2\2\uffff\1\2\6\uffff"+
            "\1\2\11\uffff\1\2",
            "\1\4\73\uffff\1\4\1\uffff\1\4\1\12\1\4\4\uffff\1\4\10\uffff"+
            "\1\11\1\uffff\1\4",
            "\1\13",
            "\1\2\16\uffff\1\4\25\uffff\1\4\30\uffff\1\4\6\uffff\1\4\1\uffff"+
            "\1\4",
            "\1\4\73\uffff\1\4\1\uffff\1\4\1\12\1\4\4\uffff\1\4\10\uffff"+
            "\1\11\1\uffff\1\4"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "106:15: ( ( function_decl_specifiers )* type_specifier )?";
        }
    }
    static final String DFA39_eotS =
        "\6\uffff";
    static final String DFA39_eofS =
        "\6\uffff";
    static final String DFA39_minS =
        "\1\4\1\uffff\2\4\1\uffff\1\4";
    static final String DFA39_maxS =
        "\1\u0087\1\uffff\1\124\1\4\1\uffff\1\124";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA39_specialS =
        "\6\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\2\135\uffff\1\1\3\uffff\2\1\4\uffff\1\1\14\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\5\uffff\2\1\2\uffff\1\1",
            "",
            "\1\1\73\uffff\1\1\1\uffff\1\1\1\4\1\1\4\uffff\1\4\10\uffff"+
            "\1\3\1\uffff\1\1",
            "\1\5",
            "",
            "\1\1\73\uffff\1\1\1\uffff\1\1\1\4\1\1\4\uffff\1\4\10\uffff"+
            "\1\3\1\uffff\1\1"
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "118:1: parameter_decl_ : ( param_decl_specifiers ( ptr_operator )* parameter_name -> ^( PARAMETER_TYPE param_decl_specifiers ( ptr_operator )* ) parameter_name | identifier -> ^( SW identifier ) );";
        }
    }
    static final String DFA46_eotS =
        "\16\uffff";
    static final String DFA46_eofS =
        "\16\uffff";
    static final String DFA46_minS =
        "\1\4\6\uffff\1\4\1\uffff\5\4";
    static final String DFA46_maxS =
        "\1\u0088\6\uffff\1\124\1\uffff\1\122\1\136\1\124\1\122\1\136";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\5\uffff";
    static final String DFA46_specialS =
        "\16\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\7\17\uffff\1\10\75\uffff\1\10\20\uffff\1\3\1\10\1\5\2\6\1"+
            "\3\1\uffff\1\2\1\1\1\6\1\uffff\1\2\1\uffff\1\3\1\1\4\uffff\3"+
            "\10\1\uffff\1\3\1\6\1\uffff\1\6\1\1\1\6\1\uffff\1\4\3\6\2\uffff"+
            "\1\6\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\17\uffff\1\10\53\uffff\1\6\3\uffff\1\6\14\uffff\1\10"+
            "\1\11\1\uffff\1\6",
            "",
            "\1\13\17\uffff\1\10\74\uffff\2\10",
            "\1\10\17\uffff\1\10\55\uffff\1\6\6\uffff\1\6\7\uffff\1\10\1"+
            "\14\1\6\4\uffff\1\6\5\uffff\1\6",
            "\1\12\17\uffff\1\10\53\uffff\1\6\3\uffff\1\6\14\uffff\1\10"+
            "\1\11\1\uffff\1\6",
            "\1\15\17\uffff\1\10\74\uffff\2\10",
            "\1\10\17\uffff\1\10\55\uffff\1\6\6\uffff\1\6\7\uffff\1\10\1"+
            "\14\1\6\4\uffff\1\6\5\uffff\1\6"
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "137:1: non_expr_statement : ( selection_statement | iteration_statement | jump_statement | try_block | catch_block | simple_decl | label );";
        }
    }
 

    public static final BitSet FOLLOW_part_in_code218 = new BitSet(new long[]{0xFFFFFFEFFFFFFFF2L,0xFFFFFFFFFFFFFFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_declaration_in_part240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_water_in_part249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_declaration269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_declaration277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_def_in_declaration285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_using_directive_in_declaration293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_directive_in_declaration301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_using_directive_311 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_using_directive_313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_using_directive_315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_using_directive_317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_include_directive_323 = new BitSet(new long[]{0x0800000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_59_in_include_directive_326 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_59_in_include_directive_338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_include_directive_342 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_90_in_include_directive_353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_simple_decl_366 = new BitSet(new long[]{0x0000000000000010L,0xA80010C000000000L,0x0000000000000098L});
    public static final BitSet FOLLOW_template_declaration_start_in_simple_decl_369 = new BitSet(new long[]{0x0000000000000010L,0x280010C000000000L,0x0000000000000098L});
    public static final BitSet FOLLOW_type_specifier_in_simple_decl_390 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000011L});
    public static final BitSet FOLLOW_init_declarator_list_in_simple_decl_392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_class_def_in_simple_decl_396 = new BitSet(new long[]{0x0000000000000010L,0x0000000000080011L});
    public static final BitSet FOLLOW_init_declarator_list_in_simple_decl_398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_simple_decl_406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_template_declaration_start513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_template_declaration_start515 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_template_param_list_in_template_declaration_start517 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_template_declaration_start519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_key_in_class_def527 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L,0x0000000000000200L});
    public static final BitSet FOLLOW_class_name_in_class_def529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000000200L});
    public static final BitSet FOLLOW_base_classes_in_class_def531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_class_def533 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_class_content_in_class_def535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_class_def537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_class_name543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_content__in_class_content560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_content_elem_in_class_content_575 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_simple_decl_in_class_content_elem590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_class_content_elem602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_class_content_elem614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_class_content_elem620 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_class_content__in_class_content_elem622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_class_content_elem624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_curlies_in_class_content_elem630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_classes__in_base_classes640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_base_classes_657 = new BitSet(new long[]{0x0000000000000010L,0x01C0000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_base_class_in_base_classes_659 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_base_classes_662 = new BitSet(new long[]{0x0000000000000010L,0x01C0000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_base_class_in_base_classes_664 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_134_in_base_class672 = new BitSet(new long[]{0x0000000000000010L,0x01C0000000000000L});
    public static final BitSet FOLLOW_access_specifier_in_base_class675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_base_class678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list685 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_init_declarator_list688 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000011L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_init_decl_name_in_init_declarator698 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000004L});
    public static final BitSet FOLLOW_initializer_in_init_declarator700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ptr_operator_in_init_decl_name_709 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000011L});
    public static final BitSet FOLLOW_identifier_in_init_decl_name_712 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_init_decl_name_716 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFF7FFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_constant_expr_in_init_decl_name_718 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_init_decl_name_720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_initializer729 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFF7FFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expr_in_initializer731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_initializer734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_initializer739 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFF7FF7FDF7L,0x0000000000005FFFL});
    public static final BitSet FOLLOW_assignment_expr_in_initializer741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_start_in_function_def_757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_function_param_list_in_function_def_759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ctor_list_in_function_def_761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_compound_statement_in_function_def_764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_template_declaration_start_in_function_start803 = new BitSet(new long[]{0x0000000000000010L,0x3804B0C000000011L,0x00000000000000D8L});
    public static final BitSet FOLLOW_return_type_in_function_start806 = new BitSet(new long[]{0x0000000000000010L,0x0020000000000004L});
    public static final BitSet FOLLOW_function_name_in_function_start808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_type__in_return_type844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_decl_specifiers_in_return_type_860 = new BitSet(new long[]{0x0000000000000010L,0x3804B0C000000000L,0x00000000000000D8L});
    public static final BitSet FOLLOW_type_specifier_in_return_type_863 = new BitSet(new long[]{0x0000000000000002L,0x1004A00000000011L,0x0000000000000040L});
    public static final BitSet FOLLOW_function_decl_specifiers_in_return_type_867 = new BitSet(new long[]{0x0000000000000002L,0x1004A00000000011L,0x0000000000000040L});
    public static final BitSet FOLLOW_ptr_operator_in_return_type_870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000011L});
    public static final BitSet FOLLOW_66_in_function_name_878 = new BitSet(new long[]{0x0000000000000010L,0x0020000000000004L});
    public static final BitSet FOLLOW_function_name__in_function_name_880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_function_name_882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_function_name_886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_function_id_in_function_name_890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_function_param_list899 = new BitSet(new long[]{0x0000000000000010L,0x2A0010C400000008L,0x0000000000000098L});
    public static final BitSet FOLLOW_parameter_declaration_clause_in_function_param_list901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_function_param_list906 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_cv_qualifier_in_function_param_list908 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_exception_specification_in_function_param_list911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_exception_specification956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_exception_specification958 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_type_id_list_in_exception_specification960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_exception_specification962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ctor_list969 = new BitSet(new long[]{0x0000000000000010L,0x0000000000040000L});
    public static final BitSet FOLLOW_ctor_initializer_in_ctor_list972 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ctor_list975 = new BitSet(new long[]{0x0000000000000010L,0x0000000000040000L});
    public static final BitSet FOLLOW_ctor_initializer_in_ctor_list977 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_82_in_ctor_initializer991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_ctor_initializer994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ctor_initializer996 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFF7FFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expr_in_ctor_initializer998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ctor_initializer1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_decl_in_parameter_declaration_clause1031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_parameter_declaration_clause1034 = new BitSet(new long[]{0x0000000000000010L,0x2A0010C400000000L,0x0000000000000098L});
    public static final BitSet FOLLOW_parameter_decl_in_parameter_declaration_clause1036 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_param_decl_specifiers_in_parameter_decl_1044 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000015L});
    public static final BitSet FOLLOW_ptr_operator_in_parameter_decl_1046 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000015L});
    public static final BitSet FOLLOW_parameter_name_in_parameter_decl_1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_parameter_decl_1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_parameter_name_1085 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_name__in_parameter_name_1087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_parameter_name_1089 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_identifier_in_parameter_name_1093 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_parameter_name_1097 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFF7FFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_constant_expr_in_parameter_name_1099 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_parameter_name_1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_param_decl_specifiers1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_compound_statement_in_statement1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_compound_statement1148 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_statement_in_compound_statement1150 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_141_in_compound_statement1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_expr_statement_in_non_compound_statement1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_statement_in_non_compound_statement1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_water_in_non_compound_statement1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_non_expr_statement1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_non_expr_statement1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_non_expr_statement1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_block_in_non_expr_statement1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catch_block_in_non_expr_statement1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_non_expr_statement1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_non_expr_statement1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_curlies_in_statement_water1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_statement_start_in_expr_statement1261 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_expr_statement_elem_in_expr_statement1263 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_83_in_expr_statement1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recognized_expr_in_expr_statement_start1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_statement_water_in_expr_statement_start1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recognized_expr_in_expr_statement_elem1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_expr_statement_elem1309 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expr_statement_l2_in_expr_statement_elem1311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_expr_statement_elem1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_statement_water_in_expr_statement_elem1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_statement_l2_elem_in_expr_statement_l21348 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_recognized_expr_in_expr_statement_l2_elem1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_expr_statement_l2_elem1365 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expr_statement_l2_in_expr_statement_l2_elem1367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_expr_statement_l2_elem1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_statement_l2_water_in_expr_statement_l2_elem1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_statement_water__in_expr_statement_water1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_statement_l2_water__in_expr_statement_l2_water1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_curlies_in_expr_statement_l2_water_1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement__in_selection_statement1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_selection_statement_1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_else_statement_in_selection_statement_1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switch_statement_in_selection_statement_1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement__in_iteration_statement1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_iteration_statement_1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_iteration_statement_1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_statement_in_iteration_statement_1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_break_or_continue_in_jump_statement_1511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_return_statement_in_jump_statement_1515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_goto_statement_in_jump_statement_1518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_jump_statement_1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_break_or_continue1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_break_or_continue1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_return_statement1559 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFF7FFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expr_in_return_statement1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_goto_statement1587 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ALPHA_NUMERIC_in_goto_statement1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGITS_in_goto_statement1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_try_block1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_compound_statement_in_try_block1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_catch_block1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_catch_block1634 = new BitSet(new long[]{0x0000000000000010L,0x2A0010C400000000L,0x0000000000000098L});
    public static final BitSet FOLLOW_param_decl_specifiers_in_catch_block1635 = new BitSet(new long[]{0x0000000000000010L,0x000000000000000CL});
    public static final BitSet FOLLOW_parameter_name_in_catch_block1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_catch_block1640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_compound_statement_in_catch_block1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_if_statement1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_if_statement1653 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFF7FFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_condition_in_if_statement1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_if_statement1657 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_statement_in_if_statement1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_else_statement1687 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_statement_in_else_statement1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_switch_statement1713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_switch_statement1715 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFF7FFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_condition_in_switch_statement1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_switch_statement1719 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_statement_in_switch_statement1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_for_statement1749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_for_statement1751 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_for_init_statement_in_for_statement1753 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_condition_in_for_statement1755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_for_statement1757 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFF7FFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expr_in_for_statement1760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_for_statement1763 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_statement_in_for_statement1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_while_statement1819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_while_statement1821 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFF7FFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_condition_in_while_statement1823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_while_statement1825 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_statement_in_while_statement1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_do_statement1853 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_statement_in_do_statement1855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_do_statement1857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_do_statement1859 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFF7FFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expr_in_do_statement1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_do_statement1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_condition_1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_for_init_statement1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_for_init_statement1910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_for_init_statement1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_label_1922 = new BitSet(new long[]{0x0000000000100010L,0x0000000000040000L});
    public static final BitSet FOLLOW_access_specifier_in_label_1942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_label_1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_brackets_in_type_id_list1953 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_66_in_type_id_list1957 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_type_id_list_in_type_id_list1959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_type_id_list1961 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_no_brackets_in_type_id_list1963 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_115_in_namespace_def_1972 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_namespace_def_1974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_namespace_def_1977 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_namespace_content_in_namespace_def_1979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_namespace_def_1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_content_elem_in_namespace_content1987 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_137_in_namespace_content1991 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_namespace_content_in_namespace_content1993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_namespace_content1995 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_namespace_content_elem_in_namespace_content1997 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_simple_decl_in_namespace_content_elem2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_namespace_content_elem2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_curlies_in_namespace_content_elem2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cv_qualifier_in_type_specifier2039 = new BitSet(new long[]{0x0000000000000010L,0x280010C000000000L,0x0000000000000098L});
    public static final BitSet FOLLOW_class_key_in_type_specifier2042 = new BitSet(new long[]{0x0000000000000010L,0x0800000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ALPHA_NUMERIC_in_type_specifier2054 = new BitSet(new long[]{0x0000000000000002L,0x0000000000140000L});
    public static final BitSet FOLLOW_84_in_type_specifier2057 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_template_param_list_in_type_specifier2059 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_type_specifier2061 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_type_specifier2067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALPHA_NUMERIC_in_type_specifier2069 = new BitSet(new long[]{0x0000000000000002L,0x0000000000140000L});
    public static final BitSet FOLLOW_84_in_type_specifier2072 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_template_param_list_in_type_specifier2074 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_type_specifier2076 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_template_param_list_elem_in_template_param_list2089 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFBFFFFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_84_in_template_param_list_elem2098 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_template_param_list_in_template_param_list_elem2100 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_template_param_list_elem2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_template_param_list_elem2117 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFBFFFFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_template_param_list_in_template_param_list_elem2119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_template_param_list_elem2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_angle_brackets_or_brackets_in_template_param_list_elem2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_elem_in_expr2146 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFF7FFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_recognized_expr_in_expr_elem2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_expr_elem2180 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFF7FFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expr_in_expr_elem2182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_expr_elem2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_brackets_or_semicolon_in_expr_elem2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_recognized_expr2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_called_function_in_function_call_2218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100004L});
    public static final BitSet FOLLOW_call_template_list_in_function_call_2220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_function_argument_list_in_function_call_2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_call_template_list2256 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_template_param_list_in_call_template_list2258 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_call_template_list2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_argument_list__in_function_argument_list2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_function_argument_list_2284 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFF7FF7FDFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_function_argument_in_function_argument_list_2288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000208L});
    public static final BitSet FOLLOW_73_in_function_argument_list_2291 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFF7FF7FDF7L,0x0000000000005FFFL});
    public static final BitSet FOLLOW_function_argument_in_function_argument_list_2293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000208L});
    public static final BitSet FOLLOW_67_in_function_argument_list_2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_function_argument2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_called_function__in_called_function2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_called_function_2346 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFF7FFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expr_in_called_function_2348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_called_function_2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_b_ident_in_called_function_2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ptr_operator_in_b_ident2361 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000015L});
    public static final BitSet FOLLOW_66_in_b_ident2365 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000015L});
    public static final BitSet FOLLOW_b_ident_in_b_ident2368 = new BitSet(new long[]{0x0000000000000010L,0x000000000000001DL});
    public static final BitSet FOLLOW_67_in_b_ident2371 = new BitSet(new long[]{0x0000000000200002L,0x0000000000002000L});
    public static final BitSet FOLLOW_identifier_in_b_ident2376 = new BitSet(new long[]{0x0000000000200002L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_b_ident2380 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000015L});
    public static final BitSet FOLLOW_b_ident_in_b_ident2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_expr_elem_in_constant_expr2397 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFF7FF7FFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_94_in_constant_expr_elem2405 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFF7FFFFL,0x0000000000007FFFL});
    public static final BitSet FOLLOW_constant_expr_in_constant_expr_elem2407 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_constant_expr_elem2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_squares_or_semicolon_in_constant_expr_elem2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_elem_in_assignment_expr2440 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFF7FF7FDF7L,0x0000000000005FFFL});
    public static final BitSet FOLLOW_recognized_expr_in_assignment_expr_elem2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_assignment_expr_elem2463 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFF7FFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_assignment_expr_l2_in_assignment_expr_elem2465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_assignment_expr_elem2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_assignment_expr_elem2475 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFF7FFFFFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_assignment_expr_l2_in_assignment_expr_elem2477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_assignment_expr_elem2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_assignment_expr_elem2488 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFF7L,0x0000000000005FFFL});
    public static final BitSet FOLLOW_assignment_expr_l2_in_assignment_expr_elem2490 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_assignment_expr_elem2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignment_expr_elem2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_l2_elem_in_assignment_expr_l22543 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFF7FFFFFF7L,0x0000000000005FFFL});
    public static final BitSet FOLLOW_recognized_expr_in_assignment_expr_l2_elem2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_assignment_expr_l2_elem2564 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFF7FFFFFFFL,0x0000000000005FFFL});
    public static final BitSet FOLLOW_assignment_expr_l2_in_assignment_expr_l2_elem2566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_assignment_expr_l2_elem2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_assignment_expr_l2_elem2572 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFF7FFFFFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_assignment_expr_l2_in_assignment_expr_l2_elem2574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_assignment_expr_l2_elem2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_assignment_expr_l2_elem2581 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFF7L,0x0000000000005FFFL});
    public static final BitSet FOLLOW_assignment_expr_l2_in_assignment_expr_l2_elem2583 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_assignment_expr_l2_elem2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_brackets_curlies_or_squares_in_assignment_expr_l2_elem2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_operator_function_id2801 = new BitSet(new long[]{0xE600000000000000L,0x001002037FF1FFF7L,0x0000000000005C00L});
    public static final BitSet FOLLOW_operator_in_operator_function_id2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator2811 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_operator2821 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_operator2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_operator2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_operator2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_operator2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_operator2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_operator2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_operator2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_operator2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_operator2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_operator2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_operator2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_operator2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_operator2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_operator2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_operator2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_operator2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_operator2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_operator2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_operator2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_operator2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_operator2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_operator2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_operator2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_operator2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_operator2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_operator2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_operator2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_operator2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_operator2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_operator2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_operator2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_operator2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_operator2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_operator2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_operator2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_operator2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_operator2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_operator2984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_operator2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_operator2990 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_operator2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALPHA_NUMERIC_in_identifier3004 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_identifier3007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALPHA_NUMERIC_in_identifier3009 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_function_def__in_function_def3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name__in_function_name3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_decl__in_parameter_decl3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_name__in_parameter_name3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_def__in_namespace_def3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_using_directive__in_using_directive3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl__in_simple_decl3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement__in_jump_statement3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition__in_condition3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_decl_name__in_init_decl_name3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_directive__in_include_directive3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label__in_label3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call__in_function_call3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred1_CPPGrammar236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_synpred2_CPPGrammar264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_synpred3_CPPGrammar585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_synpred4_CPPGrammar597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_synpred5_CPPGrammar609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_expr_statement_in_synpred6_CPPGrammar1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_statement_in_synpred7_CPPGrammar1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recognized_expr_in_synpred8_CPPGrammar1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recognized_expr_in_synpred9_CPPGrammar1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recognized_expr_in_synpred10_CPPGrammar1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_synpred11_CPPGrammar1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_synpred12_CPPGrammar2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_synpred13_CPPGrammar2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recognized_expr_in_synpred14_CPPGrammar2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_synpred15_CPPGrammar2337 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFF7FFF7L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_expr_in_synpred15_CPPGrammar2339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_synpred15_CPPGrammar2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recognized_expr_in_synpred16_CPPGrammar2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recognized_expr_in_synpred17_CPPGrammar2552 = new BitSet(new long[]{0x0000000000000002L});

}