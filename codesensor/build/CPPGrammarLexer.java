// $ANTLR 3.4 CPPGrammar.g 2022-04-30 18:22:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CPPGrammarLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CPPGrammarLexer() {} 
    public CPPGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CPPGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "CPPGrammar.g"; }

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:7:7: ( '!' )
            // CPPGrammar.g:7:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:8:7: ( '!=' )
            // CPPGrammar.g:8:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:9:7: ( '\"' )
            // CPPGrammar.g:9:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:10:7: ( '#include' )
            // CPPGrammar.g:10:9: '#include'
            {
            match("#include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:11:7: ( '%' )
            // CPPGrammar.g:11:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:12:7: ( '%=' )
            // CPPGrammar.g:12:9: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:13:7: ( '&&' )
            // CPPGrammar.g:13:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:14:7: ( '&' )
            // CPPGrammar.g:14:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:15:7: ( '&=' )
            // CPPGrammar.g:15:9: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:16:7: ( '(' )
            // CPPGrammar.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:17:7: ( ')' )
            // CPPGrammar.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:18:7: ( '*' )
            // CPPGrammar.g:18:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:19:7: ( '*=' )
            // CPPGrammar.g:19:9: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:20:7: ( '+' )
            // CPPGrammar.g:20:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:21:7: ( '++' )
            // CPPGrammar.g:21:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:22:7: ( '+=' )
            // CPPGrammar.g:22:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:23:7: ( ',' )
            // CPPGrammar.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:24:7: ( '-' )
            // CPPGrammar.g:24:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:25:7: ( '--' )
            // CPPGrammar.g:25:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:26:7: ( '-=' )
            // CPPGrammar.g:26:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:27:7: ( '->' )
            // CPPGrammar.g:27:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:28:7: ( '->*' )
            // CPPGrammar.g:28:9: '->*'
            {
            match("->*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:29:7: ( '/' )
            // CPPGrammar.g:29:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:30:7: ( '/=' )
            // CPPGrammar.g:30:9: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:31:7: ( ':' )
            // CPPGrammar.g:31:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:32:7: ( '::' )
            // CPPGrammar.g:32:9: '::'
            {
            match("::"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:33:7: ( ';' )
            // CPPGrammar.g:33:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:34:7: ( '<' )
            // CPPGrammar.g:34:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:35:7: ( '<<' )
            // CPPGrammar.g:35:9: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:36:7: ( '<<=' )
            // CPPGrammar.g:36:9: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:37:7: ( '<=' )
            // CPPGrammar.g:37:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:38:7: ( '=' )
            // CPPGrammar.g:38:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:39:7: ( '==' )
            // CPPGrammar.g:39:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:40:7: ( '>' )
            // CPPGrammar.g:40:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:41:7: ( '>=' )
            // CPPGrammar.g:41:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:42:7: ( '>>' )
            // CPPGrammar.g:42:9: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:43:7: ( '>>=' )
            // CPPGrammar.g:43:9: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:44:7: ( '[' )
            // CPPGrammar.g:44:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:45:7: ( ']' )
            // CPPGrammar.g:45:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:46:7: ( '^' )
            // CPPGrammar.g:46:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:47:7: ( '^=' )
            // CPPGrammar.g:47:9: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:48:7: ( 'auto' )
            // CPPGrammar.g:48:9: 'auto'
            {
            match("auto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:49:7: ( 'break' )
            // CPPGrammar.g:49:9: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:50:8: ( 'case' )
            // CPPGrammar.g:50:10: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:51:8: ( 'catch' )
            // CPPGrammar.g:51:10: 'catch'
            {
            match("catch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:52:8: ( 'class' )
            // CPPGrammar.g:52:10: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:53:8: ( 'const' )
            // CPPGrammar.g:53:10: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:54:8: ( 'continue' )
            // CPPGrammar.g:54:10: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:55:8: ( 'delete' )
            // CPPGrammar.g:55:10: 'delete'
            {
            match("delete"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:56:8: ( 'do' )
            // CPPGrammar.g:56:10: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:57:8: ( 'else' )
            // CPPGrammar.g:57:10: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:58:8: ( 'enum' )
            // CPPGrammar.g:58:10: 'enum'
            {
            match("enum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:59:8: ( 'explicit' )
            // CPPGrammar.g:59:10: 'explicit'
            {
            match("explicit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:60:8: ( 'for' )
            // CPPGrammar.g:60:10: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:61:8: ( 'friend' )
            // CPPGrammar.g:61:10: 'friend'
            {
            match("friend"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:62:8: ( 'goto' )
            // CPPGrammar.g:62:10: 'goto'
            {
            match("goto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:63:8: ( 'if' )
            // CPPGrammar.g:63:10: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:64:8: ( 'inline' )
            // CPPGrammar.g:64:10: 'inline'
            {
            match("inline"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:65:8: ( 'namespace' )
            // CPPGrammar.g:65:10: 'namespace'
            {
            match("namespace"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:66:8: ( 'new' )
            // CPPGrammar.g:66:10: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:67:8: ( 'operator' )
            // CPPGrammar.g:67:10: 'operator'
            {
            match("operator"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:68:8: ( 'private' )
            // CPPGrammar.g:68:10: 'private'
            {
            match("private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:69:8: ( 'protected' )
            // CPPGrammar.g:69:10: 'protected'
            {
            match("protected"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:70:8: ( 'public' )
            // CPPGrammar.g:70:10: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:71:8: ( 'register' )
            // CPPGrammar.g:71:10: 'register'
            {
            match("register"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:72:8: ( 'return' )
            // CPPGrammar.g:72:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:73:8: ( 'signed' )
            // CPPGrammar.g:73:10: 'signed'
            {
            match("signed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:74:8: ( 'static' )
            // CPPGrammar.g:74:10: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:75:8: ( 'struct' )
            // CPPGrammar.g:75:10: 'struct'
            {
            match("struct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:76:8: ( 'switch' )
            // CPPGrammar.g:76:10: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:77:8: ( 'template' )
            // CPPGrammar.g:77:10: 'template'
            {
            match("template"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:78:8: ( 'throw' )
            // CPPGrammar.g:78:10: 'throw'
            {
            match("throw"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:79:8: ( 'try' )
            // CPPGrammar.g:79:10: 'try'
            {
            match("try"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:80:8: ( 'typedef' )
            // CPPGrammar.g:80:10: 'typedef'
            {
            match("typedef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:81:8: ( 'union' )
            // CPPGrammar.g:81:10: 'union'
            {
            match("union"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:82:8: ( 'unsigned' )
            // CPPGrammar.g:82:10: 'unsigned'
            {
            match("unsigned"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:83:8: ( 'using' )
            // CPPGrammar.g:83:10: 'using'
            {
            match("using"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:84:8: ( 'virtual' )
            // CPPGrammar.g:84:10: 'virtual'
            {
            match("virtual"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:85:8: ( 'volatile' )
            // CPPGrammar.g:85:10: 'volatile'
            {
            match("volatile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:86:8: ( 'while' )
            // CPPGrammar.g:86:10: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:87:8: ( '{' )
            // CPPGrammar.g:87:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:88:8: ( '|' )
            // CPPGrammar.g:88:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:89:8: ( '|=' )
            // CPPGrammar.g:89:10: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:90:8: ( '||' )
            // CPPGrammar.g:90:10: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:91:8: ( '}' )
            // CPPGrammar.g:91:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:92:8: ( '~' )
            // CPPGrammar.g:92:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:297:4: ( '.' )
            // CPPGrammar.g:297:6: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "SIZEOF"
    public final void mSIZEOF() throws RecognitionException {
        try {
            int _type = SIZEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:297:7: ( 'sizeof' )
            // CPPGrammar.g:297:9: 'sizeof'
            {
            match("sizeof"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIZEOF"

    // $ANTLR start "Q_MARK"
    public final void mQ_MARK() throws RecognitionException {
        try {
            int _type = Q_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:298:7: ( '?' )
            // CPPGrammar.g:298:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Q_MARK"

    // $ANTLR start "ALPHA_NUMERIC"
    public final void mALPHA_NUMERIC() throws RecognitionException {
        try {
            int _type = ALPHA_NUMERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:300:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '~' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // CPPGrammar.g:300:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '~' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='~' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // CPPGrammar.g:300:53: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // CPPGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALPHA_NUMERIC"

    // $ANTLR start "DIGITS"
    public final void mDIGITS() throws RecognitionException {
        try {
            int _type = DIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:301:9: ( ( '0' .. '9' )+ )
            // CPPGrammar.g:301:11: ( '0' .. '9' )+
            {
            // CPPGrammar.g:301:11: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // CPPGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGITS"

    // $ANTLR start "CPPCOMMENT"
    public final void mCPPCOMMENT() throws RecognitionException {
        try {
            int _type = CPPCOMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:306:5: ( '//' ( options {greedy=false; } : . )* '\\n' )
            // CPPGrammar.g:306:7: '//' ( options {greedy=false; } : . )* '\\n'
            {
            match("//"); 



            // CPPGrammar.g:306:12: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n') ) {
                    alt3=2;
                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // CPPGrammar.g:306:40: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match('\n'); 

            _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CPPCOMMENT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:309:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // CPPGrammar.g:309:17: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // CPPGrammar.g:309:23: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // CPPGrammar.g:309:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match("*/"); 



             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:313:7: ( ( '\\'' ( ( '\\\\' . ) |~ ( '\\\\' | '\\'' ) )* '\\'' ) | ( '\"' ( ( '\\\\' . ) |~ ( '\\\\' | '\"' ) )* '\"' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\'') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\"') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // CPPGrammar.g:313:9: ( '\\'' ( ( '\\\\' . ) |~ ( '\\\\' | '\\'' ) )* '\\'' )
                    {
                    // CPPGrammar.g:313:9: ( '\\'' ( ( '\\\\' . ) |~ ( '\\\\' | '\\'' ) )* '\\'' )
                    // CPPGrammar.g:313:10: '\\'' ( ( '\\\\' . ) |~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 

                    // CPPGrammar.g:313:15: ( ( '\\\\' . ) |~ ( '\\\\' | '\\'' ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '&')||(LA5_0 >= '(' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // CPPGrammar.g:313:17: ( '\\\\' . )
                    	    {
                    	    // CPPGrammar.g:313:17: ( '\\\\' . )
                    	    // CPPGrammar.g:313:18: '\\\\' .
                    	    {
                    	    match('\\'); 

                    	    matchAny(); 

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // CPPGrammar.g:313:29: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match('\''); 

                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:314:10: ( '\"' ( ( '\\\\' . ) |~ ( '\\\\' | '\"' ) )* '\"' )
                    {
                    // CPPGrammar.g:314:10: ( '\"' ( ( '\\\\' . ) |~ ( '\\\\' | '\"' ) )* '\"' )
                    // CPPGrammar.g:314:11: '\"' ( ( '\\\\' . ) |~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 

                    // CPPGrammar.g:314:16: ( ( '\\\\' . ) |~ ( '\\\\' | '\"' ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // CPPGrammar.g:314:18: ( '\\\\' . )
                    	    {
                    	    // CPPGrammar.g:314:18: ( '\\\\' . )
                    	    // CPPGrammar.g:314:19: '\\\\' .
                    	    {
                    	    match('\\'); 

                    	    matchAny(); 

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // CPPGrammar.g:314:30: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    match('\"'); 

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "PREPROC"
    public final void mPREPROC() throws RecognitionException {
        try {
            int _type = PREPROC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:318:5: ( '#' ( options {greedy=false; } : . )* ~ ( '\\\\' ) '\\n' )
            // CPPGrammar.g:318:7: '#' ( options {greedy=false; } : . )* ~ ( '\\\\' ) '\\n'
            {
            match('#'); 

            // CPPGrammar.g:318:12: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\u0000' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='\n') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '\t')||(LA8_1 >= '\u000B' && LA8_1 <= '\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0=='\\') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // CPPGrammar.g:318:40: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\n'); 

            _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREPROC"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:321:11: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // CPPGrammar.g:321:13: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // CPPGrammar.g:321:13: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // CPPGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "OTHER"
    public final void mOTHER() throws RecognitionException {
        try {
            int _type = OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:322:7: ( . )
            // CPPGrammar.g:322:9: .
            {
            matchAny(); 

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OTHER"

    public void mTokens() throws RecognitionException {
        // CPPGrammar.g:1:8: ( T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | DOT | SIZEOF | Q_MARK | ALPHA_NUMERIC | DIGITS | CPPCOMMENT | COMMENT | STRING | PREPROC | WHITESPACE | OTHER )
        int alt10=97;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // CPPGrammar.g:1:10: T__57
                {
                mT__57(); 


                }
                break;
            case 2 :
                // CPPGrammar.g:1:16: T__58
                {
                mT__58(); 


                }
                break;
            case 3 :
                // CPPGrammar.g:1:22: T__59
                {
                mT__59(); 


                }
                break;
            case 4 :
                // CPPGrammar.g:1:28: T__60
                {
                mT__60(); 


                }
                break;
            case 5 :
                // CPPGrammar.g:1:34: T__61
                {
                mT__61(); 


                }
                break;
            case 6 :
                // CPPGrammar.g:1:40: T__62
                {
                mT__62(); 


                }
                break;
            case 7 :
                // CPPGrammar.g:1:46: T__63
                {
                mT__63(); 


                }
                break;
            case 8 :
                // CPPGrammar.g:1:52: T__64
                {
                mT__64(); 


                }
                break;
            case 9 :
                // CPPGrammar.g:1:58: T__65
                {
                mT__65(); 


                }
                break;
            case 10 :
                // CPPGrammar.g:1:64: T__66
                {
                mT__66(); 


                }
                break;
            case 11 :
                // CPPGrammar.g:1:70: T__67
                {
                mT__67(); 


                }
                break;
            case 12 :
                // CPPGrammar.g:1:76: T__68
                {
                mT__68(); 


                }
                break;
            case 13 :
                // CPPGrammar.g:1:82: T__69
                {
                mT__69(); 


                }
                break;
            case 14 :
                // CPPGrammar.g:1:88: T__70
                {
                mT__70(); 


                }
                break;
            case 15 :
                // CPPGrammar.g:1:94: T__71
                {
                mT__71(); 


                }
                break;
            case 16 :
                // CPPGrammar.g:1:100: T__72
                {
                mT__72(); 


                }
                break;
            case 17 :
                // CPPGrammar.g:1:106: T__73
                {
                mT__73(); 


                }
                break;
            case 18 :
                // CPPGrammar.g:1:112: T__74
                {
                mT__74(); 


                }
                break;
            case 19 :
                // CPPGrammar.g:1:118: T__75
                {
                mT__75(); 


                }
                break;
            case 20 :
                // CPPGrammar.g:1:124: T__76
                {
                mT__76(); 


                }
                break;
            case 21 :
                // CPPGrammar.g:1:130: T__77
                {
                mT__77(); 


                }
                break;
            case 22 :
                // CPPGrammar.g:1:136: T__78
                {
                mT__78(); 


                }
                break;
            case 23 :
                // CPPGrammar.g:1:142: T__79
                {
                mT__79(); 


                }
                break;
            case 24 :
                // CPPGrammar.g:1:148: T__80
                {
                mT__80(); 


                }
                break;
            case 25 :
                // CPPGrammar.g:1:154: T__81
                {
                mT__81(); 


                }
                break;
            case 26 :
                // CPPGrammar.g:1:160: T__82
                {
                mT__82(); 


                }
                break;
            case 27 :
                // CPPGrammar.g:1:166: T__83
                {
                mT__83(); 


                }
                break;
            case 28 :
                // CPPGrammar.g:1:172: T__84
                {
                mT__84(); 


                }
                break;
            case 29 :
                // CPPGrammar.g:1:178: T__85
                {
                mT__85(); 


                }
                break;
            case 30 :
                // CPPGrammar.g:1:184: T__86
                {
                mT__86(); 


                }
                break;
            case 31 :
                // CPPGrammar.g:1:190: T__87
                {
                mT__87(); 


                }
                break;
            case 32 :
                // CPPGrammar.g:1:196: T__88
                {
                mT__88(); 


                }
                break;
            case 33 :
                // CPPGrammar.g:1:202: T__89
                {
                mT__89(); 


                }
                break;
            case 34 :
                // CPPGrammar.g:1:208: T__90
                {
                mT__90(); 


                }
                break;
            case 35 :
                // CPPGrammar.g:1:214: T__91
                {
                mT__91(); 


                }
                break;
            case 36 :
                // CPPGrammar.g:1:220: T__92
                {
                mT__92(); 


                }
                break;
            case 37 :
                // CPPGrammar.g:1:226: T__93
                {
                mT__93(); 


                }
                break;
            case 38 :
                // CPPGrammar.g:1:232: T__94
                {
                mT__94(); 


                }
                break;
            case 39 :
                // CPPGrammar.g:1:238: T__95
                {
                mT__95(); 


                }
                break;
            case 40 :
                // CPPGrammar.g:1:244: T__96
                {
                mT__96(); 


                }
                break;
            case 41 :
                // CPPGrammar.g:1:250: T__97
                {
                mT__97(); 


                }
                break;
            case 42 :
                // CPPGrammar.g:1:256: T__98
                {
                mT__98(); 


                }
                break;
            case 43 :
                // CPPGrammar.g:1:262: T__99
                {
                mT__99(); 


                }
                break;
            case 44 :
                // CPPGrammar.g:1:268: T__100
                {
                mT__100(); 


                }
                break;
            case 45 :
                // CPPGrammar.g:1:275: T__101
                {
                mT__101(); 


                }
                break;
            case 46 :
                // CPPGrammar.g:1:282: T__102
                {
                mT__102(); 


                }
                break;
            case 47 :
                // CPPGrammar.g:1:289: T__103
                {
                mT__103(); 


                }
                break;
            case 48 :
                // CPPGrammar.g:1:296: T__104
                {
                mT__104(); 


                }
                break;
            case 49 :
                // CPPGrammar.g:1:303: T__105
                {
                mT__105(); 


                }
                break;
            case 50 :
                // CPPGrammar.g:1:310: T__106
                {
                mT__106(); 


                }
                break;
            case 51 :
                // CPPGrammar.g:1:317: T__107
                {
                mT__107(); 


                }
                break;
            case 52 :
                // CPPGrammar.g:1:324: T__108
                {
                mT__108(); 


                }
                break;
            case 53 :
                // CPPGrammar.g:1:331: T__109
                {
                mT__109(); 


                }
                break;
            case 54 :
                // CPPGrammar.g:1:338: T__110
                {
                mT__110(); 


                }
                break;
            case 55 :
                // CPPGrammar.g:1:345: T__111
                {
                mT__111(); 


                }
                break;
            case 56 :
                // CPPGrammar.g:1:352: T__112
                {
                mT__112(); 


                }
                break;
            case 57 :
                // CPPGrammar.g:1:359: T__113
                {
                mT__113(); 


                }
                break;
            case 58 :
                // CPPGrammar.g:1:366: T__114
                {
                mT__114(); 


                }
                break;
            case 59 :
                // CPPGrammar.g:1:373: T__115
                {
                mT__115(); 


                }
                break;
            case 60 :
                // CPPGrammar.g:1:380: T__116
                {
                mT__116(); 


                }
                break;
            case 61 :
                // CPPGrammar.g:1:387: T__117
                {
                mT__117(); 


                }
                break;
            case 62 :
                // CPPGrammar.g:1:394: T__118
                {
                mT__118(); 


                }
                break;
            case 63 :
                // CPPGrammar.g:1:401: T__119
                {
                mT__119(); 


                }
                break;
            case 64 :
                // CPPGrammar.g:1:408: T__120
                {
                mT__120(); 


                }
                break;
            case 65 :
                // CPPGrammar.g:1:415: T__121
                {
                mT__121(); 


                }
                break;
            case 66 :
                // CPPGrammar.g:1:422: T__122
                {
                mT__122(); 


                }
                break;
            case 67 :
                // CPPGrammar.g:1:429: T__123
                {
                mT__123(); 


                }
                break;
            case 68 :
                // CPPGrammar.g:1:436: T__124
                {
                mT__124(); 


                }
                break;
            case 69 :
                // CPPGrammar.g:1:443: T__125
                {
                mT__125(); 


                }
                break;
            case 70 :
                // CPPGrammar.g:1:450: T__126
                {
                mT__126(); 


                }
                break;
            case 71 :
                // CPPGrammar.g:1:457: T__127
                {
                mT__127(); 


                }
                break;
            case 72 :
                // CPPGrammar.g:1:464: T__128
                {
                mT__128(); 


                }
                break;
            case 73 :
                // CPPGrammar.g:1:471: T__129
                {
                mT__129(); 


                }
                break;
            case 74 :
                // CPPGrammar.g:1:478: T__130
                {
                mT__130(); 


                }
                break;
            case 75 :
                // CPPGrammar.g:1:485: T__131
                {
                mT__131(); 


                }
                break;
            case 76 :
                // CPPGrammar.g:1:492: T__132
                {
                mT__132(); 


                }
                break;
            case 77 :
                // CPPGrammar.g:1:499: T__133
                {
                mT__133(); 


                }
                break;
            case 78 :
                // CPPGrammar.g:1:506: T__134
                {
                mT__134(); 


                }
                break;
            case 79 :
                // CPPGrammar.g:1:513: T__135
                {
                mT__135(); 


                }
                break;
            case 80 :
                // CPPGrammar.g:1:520: T__136
                {
                mT__136(); 


                }
                break;
            case 81 :
                // CPPGrammar.g:1:527: T__137
                {
                mT__137(); 


                }
                break;
            case 82 :
                // CPPGrammar.g:1:534: T__138
                {
                mT__138(); 


                }
                break;
            case 83 :
                // CPPGrammar.g:1:541: T__139
                {
                mT__139(); 


                }
                break;
            case 84 :
                // CPPGrammar.g:1:548: T__140
                {
                mT__140(); 


                }
                break;
            case 85 :
                // CPPGrammar.g:1:555: T__141
                {
                mT__141(); 


                }
                break;
            case 86 :
                // CPPGrammar.g:1:562: T__142
                {
                mT__142(); 


                }
                break;
            case 87 :
                // CPPGrammar.g:1:569: DOT
                {
                mDOT(); 


                }
                break;
            case 88 :
                // CPPGrammar.g:1:573: SIZEOF
                {
                mSIZEOF(); 


                }
                break;
            case 89 :
                // CPPGrammar.g:1:580: Q_MARK
                {
                mQ_MARK(); 


                }
                break;
            case 90 :
                // CPPGrammar.g:1:587: ALPHA_NUMERIC
                {
                mALPHA_NUMERIC(); 


                }
                break;
            case 91 :
                // CPPGrammar.g:1:601: DIGITS
                {
                mDIGITS(); 


                }
                break;
            case 92 :
                // CPPGrammar.g:1:608: CPPCOMMENT
                {
                mCPPCOMMENT(); 


                }
                break;
            case 93 :
                // CPPGrammar.g:1:619: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 94 :
                // CPPGrammar.g:1:627: STRING
                {
                mSTRING(); 


                }
                break;
            case 95 :
                // CPPGrammar.g:1:634: PREPROC
                {
                mPREPROC(); 


                }
                break;
            case 96 :
                // CPPGrammar.g:1:642: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 97 :
                // CPPGrammar.g:1:653: OTHER
                {
                mOTHER(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\62\1\63\1\60\1\70\1\73\2\uffff\1\77\1\102\1\uffff\1\107"+
        "\1\113\1\115\1\uffff\1\121\1\123\1\126\2\uffff\1\132\21\134\1\uffff"+
        "\1\u0080\1\uffff\1\u0082\4\uffff\1\60\27\uffff\1\u0089\10\uffff"+
        "\1\u008b\5\uffff\1\u008d\5\uffff\1\134\1\uffff\5\134\1\u0095\6\134"+
        "\1\u009c\23\134\21\uffff\7\134\1\uffff\3\134\1\u00c1\2\134\1\uffff"+
        "\2\134\1\u00c6\15\134\1\u00d4\7\134\1\uffff\1\u00dd\1\134\1\u00df"+
        "\5\134\1\u00e5\1\u00e6\1\134\1\uffff\1\134\1\u00e9\2\134\1\uffff"+
        "\15\134\1\uffff\7\134\2\uffff\1\u0101\1\uffff\1\u0102\1\u0103\1"+
        "\u0104\2\134\2\uffff\2\134\1\uffff\16\134\1\u0117\1\134\1\u0119"+
        "\1\134\1\u011b\2\134\1\u011e\5\uffff\1\134\1\u0121\1\134\1\u0123"+
        "\1\u0124\4\134\1\u0129\1\134\1\u012b\1\u012c\1\u012d\1\u012e\1\u012f"+
        "\1\u0130\1\134\1\uffff\1\134\1\uffff\1\134\1\uffff\2\134\2\uffff"+
        "\1\134\1\uffff\1\134\2\uffff\2\134\1\u013b\1\134\1\uffff\1\134\6"+
        "\uffff\1\134\1\u013f\1\134\1\u0141\1\134\1\u0143\1\u0144\1\u0145"+
        "\1\134\1\u0147\1\uffff\1\134\1\u0149\1\u014a\1\uffff\1\u014b\1\uffff"+
        "\1\u014c\3\uffff\1\u014d\1\uffff\1\u014e\6\uffff";
    static final String DFA10_eofS =
        "\u014f\uffff";
    static final String DFA10_minS =
        "\1\0\1\75\2\0\1\75\1\46\2\uffff\1\75\1\53\1\uffff\1\55\1\52\1\72"+
        "\1\uffff\1\74\2\75\2\uffff\1\75\1\165\1\162\1\141\1\145\1\154\2"+
        "\157\1\146\1\141\1\160\1\162\1\145\1\151\1\145\1\156\1\151\1\150"+
        "\1\uffff\1\75\1\uffff\1\60\4\uffff\1\0\6\uffff\1\0\20\uffff\1\52"+
        "\10\uffff\1\75\5\uffff\1\75\5\uffff\1\164\1\uffff\1\145\1\163\1"+
        "\141\1\156\1\154\1\60\1\163\1\165\1\160\1\162\1\151\1\164\1\60\1"+
        "\154\1\155\1\167\1\145\1\151\1\142\2\147\1\141\1\151\1\155\1\162"+
        "\1\171\1\160\2\151\1\162\1\154\1\151\12\uffff\1\0\6\uffff\1\157"+
        "\1\141\1\145\1\143\2\163\1\145\1\uffff\1\145\1\155\1\154\1\60\1"+
        "\145\1\157\1\uffff\1\151\1\145\1\60\1\162\1\166\1\164\1\154\1\151"+
        "\1\165\1\156\1\145\1\164\1\165\1\164\1\160\1\157\1\60\1\145\1\157"+
        "\1\151\1\156\1\164\1\141\1\154\1\0\1\60\1\153\1\60\1\150\1\163\1"+
        "\164\1\151\1\164\2\60\1\151\1\uffff\1\156\1\60\1\156\1\163\1\uffff"+
        "\2\141\1\145\1\151\1\163\1\162\1\145\1\157\1\151\2\143\1\154\1\167"+
        "\1\uffff\1\144\1\156\2\147\1\165\1\164\1\145\1\0\1\uffff\1\60\1"+
        "\uffff\3\60\1\156\1\145\2\uffff\1\143\1\144\1\uffff\1\145\1\160"+
        "\2\164\2\143\1\164\1\156\1\144\1\146\1\143\1\164\1\150\1\141\1\60"+
        "\1\145\1\60\1\156\1\60\1\141\1\151\1\60\1\0\4\uffff\1\165\1\60\1"+
        "\151\2\60\1\141\1\157\1\145\1\164\1\60\1\145\6\60\1\164\1\uffff"+
        "\1\146\1\uffff\1\145\1\uffff\2\154\1\uffff\1\0\1\145\1\uffff\1\164"+
        "\2\uffff\1\143\1\162\1\60\1\145\1\uffff\1\162\6\uffff\1\145\1\60"+
        "\1\144\1\60\1\145\1\0\2\60\1\145\1\60\1\uffff\1\144\2\60\1\uffff"+
        "\1\60\1\uffff\1\60\3\uffff\1\60\1\uffff\1\60\6\uffff";
    static final String DFA10_maxS =
        "\1\uffff\1\75\2\uffff\2\75\2\uffff\2\75\1\uffff\1\76\1\75\1\72\1"+
        "\uffff\2\75\1\76\2\uffff\1\75\1\165\1\162\2\157\1\170\1\162\1\157"+
        "\1\156\1\145\1\160\1\165\1\145\1\167\1\171\1\163\1\157\1\150\1\uffff"+
        "\1\174\1\uffff\1\172\4\uffff\1\uffff\6\uffff\1\uffff\20\uffff\1"+
        "\52\10\uffff\1\75\5\uffff\1\75\5\uffff\1\164\1\uffff\1\145\1\164"+
        "\1\141\1\156\1\154\1\172\1\163\1\165\1\160\1\162\1\151\1\164\1\172"+
        "\1\154\1\155\1\167\1\145\1\157\1\142\1\164\1\172\1\162\1\151\1\155"+
        "\1\162\1\171\1\160\1\163\1\151\1\162\1\154\1\151\12\uffff\1\uffff"+
        "\6\uffff\1\157\1\141\1\145\1\143\1\163\1\164\1\145\1\uffff\1\145"+
        "\1\155\1\154\1\172\1\145\1\157\1\uffff\1\151\1\145\1\172\1\162\1"+
        "\166\1\164\1\154\1\151\1\165\1\156\1\145\1\164\1\165\1\164\1\160"+
        "\1\157\1\172\1\145\1\157\1\151\1\156\1\164\1\141\1\154\1\uffff\1"+
        "\172\1\153\1\172\1\150\1\163\1\164\1\151\1\164\2\172\1\151\1\uffff"+
        "\1\156\1\172\1\156\1\163\1\uffff\2\141\1\145\1\151\1\163\1\162\1"+
        "\145\1\157\1\151\2\143\1\154\1\167\1\uffff\1\144\1\156\2\147\1\165"+
        "\1\164\1\145\1\uffff\1\uffff\1\172\1\uffff\3\172\1\156\1\145\2\uffff"+
        "\1\143\1\144\1\uffff\1\145\1\160\2\164\2\143\1\164\1\156\1\144\1"+
        "\146\1\143\1\164\1\150\1\141\1\172\1\145\1\172\1\156\1\172\1\141"+
        "\1\151\1\172\1\uffff\4\uffff\1\165\1\172\1\151\2\172\1\141\1\157"+
        "\1\145\1\164\1\172\1\145\6\172\1\164\1\uffff\1\146\1\uffff\1\145"+
        "\1\uffff\2\154\1\uffff\1\uffff\1\145\1\uffff\1\164\2\uffff\1\143"+
        "\1\162\1\172\1\145\1\uffff\1\162\6\uffff\1\145\1\172\1\144\1\172"+
        "\1\145\1\uffff\2\172\1\145\1\172\1\uffff\1\144\2\172\1\uffff\1\172"+
        "\1\uffff\1\172\3\uffff\1\172\1\uffff\1\172\6\uffff";
    static final String DFA10_acceptS =
        "\6\uffff\1\12\1\13\2\uffff\1\21\3\uffff\1\33\3\uffff\1\46\1\47\22"+
        "\uffff\1\121\1\uffff\1\125\1\uffff\1\127\1\131\1\132\1\133\1\uffff"+
        "\1\140\1\141\1\2\1\1\1\3\1\136\1\uffff\1\137\1\6\1\5\1\7\1\11\1"+
        "\10\1\12\1\13\1\15\1\14\1\17\1\20\1\16\1\21\1\23\1\24\1\uffff\1"+
        "\22\1\30\1\134\1\135\1\27\1\32\1\31\1\33\1\uffff\1\37\1\34\1\41"+
        "\1\40\1\43\1\uffff\1\42\1\46\1\47\1\51\1\50\1\uffff\1\132\40\uffff"+
        "\1\121\1\123\1\124\1\122\1\125\1\126\1\127\1\131\1\133\1\140\1\uffff"+
        "\1\26\1\25\1\36\1\35\1\45\1\44\7\uffff\1\62\6\uffff\1\71\44\uffff"+
        "\1\66\4\uffff\1\74\15\uffff\1\111\10\uffff\1\52\1\uffff\1\54\5\uffff"+
        "\1\63\1\64\2\uffff\1\70\27\uffff\1\53\1\55\1\56\1\57\22\uffff\1"+
        "\110\1\uffff\1\113\1\uffff\1\115\2\uffff\1\120\2\uffff\1\61\1\uffff"+
        "\1\67\1\72\4\uffff\1\100\1\uffff\1\102\1\103\1\130\1\104\1\105\1"+
        "\106\12\uffff\1\76\3\uffff\1\112\1\uffff\1\116\1\uffff\1\4\1\60"+
        "\1\65\1\uffff\1\75\1\uffff\1\101\1\107\1\114\1\117\1\73\1\77";
    static final String DFA10_specialS =
        "\1\2\1\uffff\1\1\1\0\52\uffff\1\4\6\uffff\1\5\121\uffff\1\6\55\uffff"+
        "\1\7\46\uffff\1\10\43\uffff\1\11\36\uffff\1\12\26\uffff\1\3\30\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\1\1\2\1\3\1\60\1\4\1\5\1"+
            "\56\1\6\1\7\1\10\1\11\1\12\1\13\1\52\1\14\12\55\1\15\1\16\1"+
            "\17\1\20\1\21\1\53\1\60\32\54\1\22\1\60\1\23\1\24\1\54\1\60"+
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\54\1\34\4\54\1\35\1\36"+
            "\1\37\1\54\1\40\1\41\1\42\1\43\1\44\1\45\3\54\1\46\1\47\1\50"+
            "\1\51\uff81\60",
            "\1\61",
            "\0\64",
            "\151\66\1\65\uff96\66",
            "\1\67",
            "\1\71\26\uffff\1\72",
            "",
            "",
            "\1\76",
            "\1\100\21\uffff\1\101",
            "",
            "\1\104\17\uffff\1\105\1\106",
            "\1\112\4\uffff\1\111\15\uffff\1\110",
            "\1\114",
            "",
            "\1\117\1\120",
            "\1\122",
            "\1\124\1\125",
            "",
            "",
            "\1\131",
            "\1\133",
            "\1\135",
            "\1\136\12\uffff\1\137\2\uffff\1\140",
            "\1\141\11\uffff\1\142",
            "\1\143\1\uffff\1\144\11\uffff\1\145",
            "\1\146\2\uffff\1\147",
            "\1\150",
            "\1\151\7\uffff\1\152",
            "\1\153\3\uffff\1\154",
            "\1\155",
            "\1\156\2\uffff\1\157",
            "\1\160",
            "\1\161\12\uffff\1\162\2\uffff\1\163",
            "\1\164\2\uffff\1\165\11\uffff\1\166\6\uffff\1\167",
            "\1\170\4\uffff\1\171",
            "\1\172\5\uffff\1\173",
            "\1\174",
            "",
            "\1\176\76\uffff\1\177",
            "",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "",
            "",
            "",
            "",
            "\0\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "\156\66\1\u0087\uff91\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0088",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008a",
            "",
            "",
            "",
            "",
            "",
            "\1\u008c",
            "",
            "",
            "",
            "",
            "",
            "\1\u008e",
            "",
            "\1\u008f",
            "\1\u0090\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1\5\uffff\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\14\uffff\1\u00a5",
            "\1\u00a6\22\uffff\1\u00a7",
            "\1\u00a8\20\uffff\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af\11\uffff\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\143\66\1\u00b5\uff9c\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\154\66\1\u00dc\uff93\66",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u00de",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\165\66\1\u0100\uff8a\66",
            "",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u0105",
            "\1\u0106",
            "",
            "",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u0118",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u011a",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u011c",
            "\1\u011d",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\144\66\1\u011f\uff9b\66",
            "",
            "",
            "",
            "",
            "\1\u0120",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u0122",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u012a",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u0131",
            "",
            "\1\u0132",
            "",
            "\1\u0133",
            "",
            "\1\u0134",
            "\1\u0135",
            "",
            "\145\66\1\u0136\uff9a\66",
            "\1\u0137",
            "",
            "\1\u0138",
            "",
            "",
            "\1\u0139",
            "\1\u013a",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u013c",
            "",
            "\1\u013d",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u013e",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u0140",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u0142",
            "\0\66",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\1\u0146",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "",
            "\1\u0148",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "",
            "",
            "",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "",
            "\12\134\7\uffff\32\134\4\uffff\1\134\1\uffff\32\134",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "1:1: Tokens : ( T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | DOT | SIZEOF | Q_MARK | ALPHA_NUMERIC | DIGITS | CPPCOMMENT | COMMENT | STRING | PREPROC | WHITESPACE | OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_3 = input.LA(1);

                        s = -1;
                        if ( (LA10_3=='i') ) {s = 53;}

                        else if ( ((LA10_3 >= '\u0000' && LA10_3 <= 'h')||(LA10_3 >= 'j' && LA10_3 <= '\uFFFF')) ) {s = 54;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA10_2 = input.LA(1);

                        s = -1;
                        if ( ((LA10_2 >= '\u0000' && LA10_2 <= '\uFFFF')) ) {s = 52;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='!') ) {s = 1;}

                        else if ( (LA10_0=='\"') ) {s = 2;}

                        else if ( (LA10_0=='#') ) {s = 3;}

                        else if ( (LA10_0=='%') ) {s = 4;}

                        else if ( (LA10_0=='&') ) {s = 5;}

                        else if ( (LA10_0=='(') ) {s = 6;}

                        else if ( (LA10_0==')') ) {s = 7;}

                        else if ( (LA10_0=='*') ) {s = 8;}

                        else if ( (LA10_0=='+') ) {s = 9;}

                        else if ( (LA10_0==',') ) {s = 10;}

                        else if ( (LA10_0=='-') ) {s = 11;}

                        else if ( (LA10_0=='/') ) {s = 12;}

                        else if ( (LA10_0==':') ) {s = 13;}

                        else if ( (LA10_0==';') ) {s = 14;}

                        else if ( (LA10_0=='<') ) {s = 15;}

                        else if ( (LA10_0=='=') ) {s = 16;}

                        else if ( (LA10_0=='>') ) {s = 17;}

                        else if ( (LA10_0=='[') ) {s = 18;}

                        else if ( (LA10_0==']') ) {s = 19;}

                        else if ( (LA10_0=='^') ) {s = 20;}

                        else if ( (LA10_0=='a') ) {s = 21;}

                        else if ( (LA10_0=='b') ) {s = 22;}

                        else if ( (LA10_0=='c') ) {s = 23;}

                        else if ( (LA10_0=='d') ) {s = 24;}

                        else if ( (LA10_0=='e') ) {s = 25;}

                        else if ( (LA10_0=='f') ) {s = 26;}

                        else if ( (LA10_0=='g') ) {s = 27;}

                        else if ( (LA10_0=='i') ) {s = 28;}

                        else if ( (LA10_0=='n') ) {s = 29;}

                        else if ( (LA10_0=='o') ) {s = 30;}

                        else if ( (LA10_0=='p') ) {s = 31;}

                        else if ( (LA10_0=='r') ) {s = 32;}

                        else if ( (LA10_0=='s') ) {s = 33;}

                        else if ( (LA10_0=='t') ) {s = 34;}

                        else if ( (LA10_0=='u') ) {s = 35;}

                        else if ( (LA10_0=='v') ) {s = 36;}

                        else if ( (LA10_0=='w') ) {s = 37;}

                        else if ( (LA10_0=='{') ) {s = 38;}

                        else if ( (LA10_0=='|') ) {s = 39;}

                        else if ( (LA10_0=='}') ) {s = 40;}

                        else if ( (LA10_0=='~') ) {s = 41;}

                        else if ( (LA10_0=='.') ) {s = 42;}

                        else if ( (LA10_0=='?') ) {s = 43;}

                        else if ( ((LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||LA10_0=='h'||(LA10_0 >= 'j' && LA10_0 <= 'm')||LA10_0=='q'||(LA10_0 >= 'x' && LA10_0 <= 'z')) ) {s = 44;}

                        else if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {s = 45;}

                        else if ( (LA10_0=='\'') ) {s = 46;}

                        else if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 47;}

                        else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\b')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\u001F')||LA10_0=='$'||LA10_0=='@'||LA10_0=='\\'||LA10_0=='`'||(LA10_0 >= '\u007F' && LA10_0 <= '\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA10_310 = input.LA(1);

                        s = -1;
                        if ( ((LA10_310 >= '\u0000' && LA10_310 <= '\uFFFF')) ) {s = 54;}

                        else s = 323;

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA10_46 = input.LA(1);

                        s = -1;
                        if ( ((LA10_46 >= '\u0000' && LA10_46 <= '\uFFFF')) ) {s = 52;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA10_53 = input.LA(1);

                        s = -1;
                        if ( (LA10_53=='n') ) {s = 135;}

                        else if ( ((LA10_53 >= '\u0000' && LA10_53 <= 'm')||(LA10_53 >= 'o' && LA10_53 <= '\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA10_135 = input.LA(1);

                        s = -1;
                        if ( (LA10_135=='c') ) {s = 181;}

                        else if ( ((LA10_135 >= '\u0000' && LA10_135 <= 'b')||(LA10_135 >= 'd' && LA10_135 <= '\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA10_181 = input.LA(1);

                        s = -1;
                        if ( (LA10_181=='l') ) {s = 220;}

                        else if ( ((LA10_181 >= '\u0000' && LA10_181 <= 'k')||(LA10_181 >= 'm' && LA10_181 <= '\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA10_220 = input.LA(1);

                        s = -1;
                        if ( (LA10_220=='u') ) {s = 256;}

                        else if ( ((LA10_220 >= '\u0000' && LA10_220 <= 't')||(LA10_220 >= 'v' && LA10_220 <= '\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA10_256 = input.LA(1);

                        s = -1;
                        if ( (LA10_256=='d') ) {s = 287;}

                        else if ( ((LA10_256 >= '\u0000' && LA10_256 <= 'c')||(LA10_256 >= 'e' && LA10_256 <= '\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA10_287 = input.LA(1);

                        s = -1;
                        if ( (LA10_287=='e') ) {s = 310;}

                        else if ( ((LA10_287 >= '\u0000' && LA10_287 <= 'd')||(LA10_287 >= 'f' && LA10_287 <= '\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}