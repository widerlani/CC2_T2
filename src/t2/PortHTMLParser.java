// Generated from PortHTML.g4 by ANTLR 4.5.1
package t2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortHTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, COMENTARIO=44, CADEIA=45, 
		IDENT=46, INT=47, LATITUDE=48, LONGITUDE=49, WS=50;
	public static final int
		RULE_site = 0, RULE_cabecalho = 1, RULE_corpo = 2, RULE_tags = 3, RULE_definir = 4, 
		RULE_menu_fixo = 5, RULE_div = 6, RULE_container = 7, RULE_link = 8, RULE_texto = 9, 
		RULE_botao = 10, RULE_estado = 11, RULE_titulo = 12, RULE_subtitulo = 13, 
		RULE_cor = 14, RULE_imagem = 15, RULE_dimensoes = 16, RULE_largura = 17, 
		RULE_altura = 18, RULE_mapa = 19, RULE_pais = 20, RULE_cidade = 21, RULE_coordenadas = 22, 
		RULE_slide_show = 23, RULE_titulo_site = 24, RULE_nome_pagina = 25, RULE_url = 26, 
		RULE_nome_cor = 27;
	public static final String[] ruleNames = {
		"site", "cabecalho", "corpo", "tags", "definir", "menu_fixo", "div", "container", 
		"link", "texto", "botao", "estado", "titulo", "subtitulo", "cor", "imagem", 
		"dimensoes", "largura", "altura", "mapa", "pais", "cidade", "coordenadas", 
		"slide_show", "titulo_site", "nome_pagina", "url", "nome_cor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'site'", "'fim-site'", "'cabecalho'", "'fim-cabecalho'", "'corpo'", 
		"'fim-corpo'", "'definir'", "'como'", "'menu-fixo'", "'fim-fixo'", "'div'", 
		"'fim-div'", "'container'", "'link'", "'fim-link'", "'texto'", "'fim-texto'", 
		"'botao'", "'fim-botao'", "'aviso'", "'alerta'", "'sucesso'", "'erro'", 
		"'titulo'", "'fim-titulo'", "'subtitulo'", "'fim-subtitulo'", "'imagem'", 
		"'fim-imagem'", "'dimensoes'", "'fim-dimensoes'", "'mapa'", "'fim-mapa'", 
		"'slide-show'", "'fim-slide-show'", "'azul'", "'vermelho'", "'branco'", 
		"'preto'", "'verde'", "'amarelo'", "'rosa'", "'cinza'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "COMENTARIO", "CADEIA", 
		"IDENT", "INT", "LATITUDE", "LONGITUDE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PortHTML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PortHTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SiteContext extends ParserRuleContext {
		public CabecalhoContext cabecalho() {
			return getRuleContext(CabecalhoContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public SiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_site; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterSite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitSite(this);
		}
	}

	public final SiteContext site() throws RecognitionException {
		SiteContext _localctx = new SiteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_site);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			cabecalho();
			setState(58);
			corpo();
			setState(59);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CabecalhoContext extends ParserRuleContext {
		public Titulo_siteContext titulo_site() {
			return getRuleContext(Titulo_siteContext.class,0);
		}
		public CabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecalho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterCabecalho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitCabecalho(this);
		}
	}

	public final CabecalhoContext cabecalho() throws RecognitionException {
		CabecalhoContext _localctx = new CabecalhoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__2);
			setState(62);
			titulo_site();
			setState(63);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public CorContext cor() {
			return getRuleContext(CorContext.class,0);
		}
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__4);
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(66);
				cor();
				}
				break;
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__31) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << IDENT))) != 0)) {
				{
				{
				setState(69);
				tags();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagsContext extends ParserRuleContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public SubtituloContext subtitulo() {
			return getRuleContext(SubtituloContext.class,0);
		}
		public CorContext cor() {
			return getRuleContext(CorContext.class,0);
		}
		public ImagemContext imagem() {
			return getRuleContext(ImagemContext.class,0);
		}
		public MapaContext mapa() {
			return getRuleContext(MapaContext.class,0);
		}
		public BotaoContext botao() {
			return getRuleContext(BotaoContext.class,0);
		}
		public Slide_showContext slide_show() {
			return getRuleContext(Slide_showContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public Menu_fixoContext menu_fixo() {
			return getRuleContext(Menu_fixoContext.class,0);
		}
		public DefinirContext definir() {
			return getRuleContext(DefinirContext.class,0);
		}
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitTags(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tags);
		try {
			setState(90);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				link();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				texto();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				titulo();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				subtitulo();
				}
				break;
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				cor();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				imagem();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				mapa();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				botao();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				slide_show();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 10);
				{
				setState(86);
				div();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 11);
				{
				setState(87);
				container();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 12);
				{
				setState(88);
				menu_fixo();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 13);
				{
				setState(89);
				definir();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinirContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PortHTMLParser.IDENT, 0); }
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public DefinirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterDefinir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitDefinir(this);
		}
	}

	public final DefinirContext definir() throws RecognitionException {
		DefinirContext _localctx = new DefinirContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__6);
			setState(93);
			match(IDENT);
			setState(94);
			match(T__7);
			setState(95);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Menu_fixoContext extends ParserRuleContext {
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public Menu_fixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menu_fixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterMenu_fixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitMenu_fixo(this);
		}
	}

	public final Menu_fixoContext menu_fixo() throws RecognitionException {
		Menu_fixoContext _localctx = new Menu_fixoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_menu_fixo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__8);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				link();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 );
			setState(103);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivContext extends ParserRuleContext {
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__10);
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(106);
				container();
				}
				break;
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__31) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << IDENT))) != 0)) {
				{
				{
				setState(109);
				tags();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainerContext extends ParserRuleContext {
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitContainer(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_container);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public Nome_paginaContext nome_pagina() {
			return getRuleContext(Nome_paginaContext.class,0);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitLink(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__13);
			setState(120);
			url();
			setState(121);
			nome_pagina();
			setState(122);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public CorContext cor() {
			return getRuleContext(CorContext.class,0);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitTexto(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_texto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__15);
			setState(126);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) {
				{
				setState(125);
				estado();
				}
			}

			setState(129);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << IDENT))) != 0)) {
				{
				setState(128);
				cor();
				}
			}

			setState(131);
			match(CADEIA);
			setState(132);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BotaoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public BotaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterBotao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitBotao(this);
		}
	}

	public final BotaoContext botao() throws RecognitionException {
		BotaoContext _localctx = new BotaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_botao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__17);
			setState(136);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) {
				{
				setState(135);
				estado();
				}
			}

			setState(138);
			match(CADEIA);
			setState(139);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstadoContext extends ParserRuleContext {
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitEstado(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_estado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TituloContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitTitulo(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__23);
			setState(144);
			match(CADEIA);
			setState(145);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubtituloContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public SubtituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtitulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterSubtitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitSubtitulo(this);
		}
	}

	public final SubtituloContext subtitulo() throws RecognitionException {
		SubtituloContext _localctx = new SubtituloContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_subtitulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__25);
			setState(148);
			match(CADEIA);
			setState(149);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PortHTMLParser.IDENT, 0); }
		public Nome_corContext nome_cor() {
			return getRuleContext(Nome_corContext.class,0);
		}
		public CorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterCor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitCor(this);
		}
	}

	public final CorContext cor() throws RecognitionException {
		CorContext _localctx = new CorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cor);
		try {
			setState(153);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(IDENT);
				}
				break;
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				nome_cor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImagemContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public DimensoesContext dimensoes() {
			return getRuleContext(DimensoesContext.class,0);
		}
		public ImagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterImagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitImagem(this);
		}
	}

	public final ImagemContext imagem() throws RecognitionException {
		ImagemContext _localctx = new ImagemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_imagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__27);
			setState(156);
			url();
			setState(157);
			dimensoes();
			setState(158);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensoesContext extends ParserRuleContext {
		public LarguraContext largura() {
			return getRuleContext(LarguraContext.class,0);
		}
		public AlturaContext altura() {
			return getRuleContext(AlturaContext.class,0);
		}
		public DimensoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterDimensoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitDimensoes(this);
		}
	}

	public final DimensoesContext dimensoes() throws RecognitionException {
		DimensoesContext _localctx = new DimensoesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dimensoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__29);
			setState(161);
			largura();
			setState(162);
			altura();
			setState(163);
			match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LarguraContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PortHTMLParser.INT, 0); }
		public LarguraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_largura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterLargura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitLargura(this);
		}
	}

	public final LarguraContext largura() throws RecognitionException {
		LarguraContext _localctx = new LarguraContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_largura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlturaContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PortHTMLParser.INT, 0); }
		public AlturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterAltura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitAltura(this);
		}
	}

	public final AlturaContext altura() throws RecognitionException {
		AlturaContext _localctx = new AlturaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_altura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapaContext extends ParserRuleContext {
		public CoordenadasContext coordenadas() {
			return getRuleContext(CoordenadasContext.class,0);
		}
		public MapaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterMapa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitMapa(this);
		}
	}

	public final MapaContext mapa() throws RecognitionException {
		MapaContext _localctx = new MapaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mapa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__31);
			setState(170);
			coordenadas();
			setState(171);
			match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PaisContext extends ParserRuleContext {
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public PaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterPais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitPais(this);
		}
	}

	public final PaisContext pais() throws RecognitionException {
		PaisContext _localctx = new PaisContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				texto();
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CidadeContext extends ParserRuleContext {
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public CidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterCidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitCidade(this);
		}
	}

	public final CidadeContext cidade() throws RecognitionException {
		CidadeContext _localctx = new CidadeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cidade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178);
				texto();
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoordenadasContext extends ParserRuleContext {
		public TerminalNode LATITUDE() { return getToken(PortHTMLParser.LATITUDE, 0); }
		public TerminalNode LONGITUDE() { return getToken(PortHTMLParser.LONGITUDE, 0); }
		public CoordenadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordenadas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterCoordenadas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitCoordenadas(this);
		}
	}

	public final CoordenadasContext coordenadas() throws RecognitionException {
		CoordenadasContext _localctx = new CoordenadasContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_coordenadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(LATITUDE);
			setState(184);
			match(LONGITUDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Slide_showContext extends ParserRuleContext {
		public List<ImagemContext> imagem() {
			return getRuleContexts(ImagemContext.class);
		}
		public ImagemContext imagem(int i) {
			return getRuleContext(ImagemContext.class,i);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public Slide_showContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slide_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterSlide_show(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitSlide_show(this);
		}
	}

	public final Slide_showContext slide_show() throws RecognitionException {
		Slide_showContext _localctx = new Slide_showContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_slide_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__33);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				imagem();
				setState(189);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(188);
					texto();
					}
				}

				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__27 );
			setState(195);
			match(T__34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Titulo_siteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public Titulo_siteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo_site; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterTitulo_site(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitTitulo_site(this);
		}
	}

	public final Titulo_siteContext titulo_site() throws RecognitionException {
		Titulo_siteContext _localctx = new Titulo_siteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_titulo_site);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nome_paginaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public Nome_paginaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_pagina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterNome_pagina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitNome_pagina(this);
		}
	}

	public final Nome_paginaContext nome_pagina() throws RecognitionException {
		Nome_paginaContext _localctx = new Nome_paginaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nome_pagina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(PortHTMLParser.CADEIA, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitUrl(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nome_corContext extends ParserRuleContext {
		public Nome_corContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_cor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).enterNome_cor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortHTMLListener ) ((PortHTMLListener)listener).exitNome_cor(this);
		}
	}

	public final Nome_corContext nome_cor() throws RecognitionException {
		Nome_corContext _localctx = new Nome_corContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nome_cor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u00d0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\5\4F\n\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\6\7f\n\7\r\7\16\7g\3\7\3\7\3\b\3\b\5\bn\n\b\3\b\7\bq\n\b\f"+
		"\b\16\bt\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u0081"+
		"\n\13\3\13\5\13\u0084\n\13\3\13\3\13\3\13\3\f\3\f\5\f\u008b\n\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\5\20"+
		"\u009c\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\6\26\u00b1\n\26\r\26\16\26\u00b2\3"+
		"\27\6\27\u00b6\n\27\r\27\16\27\u00b7\3\30\3\30\3\30\3\31\3\31\3\31\5\31"+
		"\u00c0\n\31\6\31\u00c2\n\31\r\31\16\31\u00c3\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668\2\4\3\2\26\31\3\2&-\u00cc\2:\3\2\2\2\4?\3"+
		"\2\2\2\6C\3\2\2\2\b\\\3\2\2\2\n^\3\2\2\2\fc\3\2\2\2\16k\3\2\2\2\20w\3"+
		"\2\2\2\22y\3\2\2\2\24~\3\2\2\2\26\u0088\3\2\2\2\30\u008f\3\2\2\2\32\u0091"+
		"\3\2\2\2\34\u0095\3\2\2\2\36\u009b\3\2\2\2 \u009d\3\2\2\2\"\u00a2\3\2"+
		"\2\2$\u00a7\3\2\2\2&\u00a9\3\2\2\2(\u00ab\3\2\2\2*\u00b0\3\2\2\2,\u00b5"+
		"\3\2\2\2.\u00b9\3\2\2\2\60\u00bc\3\2\2\2\62\u00c7\3\2\2\2\64\u00c9\3\2"+
		"\2\2\66\u00cb\3\2\2\28\u00cd\3\2\2\2:;\7\3\2\2;<\5\4\3\2<=\5\6\4\2=>\7"+
		"\4\2\2>\3\3\2\2\2?@\7\5\2\2@A\5\62\32\2AB\7\6\2\2B\5\3\2\2\2CE\7\7\2\2"+
		"DF\5\36\20\2ED\3\2\2\2EF\3\2\2\2FJ\3\2\2\2GI\5\b\5\2HG\3\2\2\2IL\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\b\2\2N\7\3\2\2\2O]\5\22"+
		"\n\2P]\5\24\13\2Q]\5\32\16\2R]\5\34\17\2S]\5\36\20\2T]\5 \21\2U]\5(\25"+
		"\2V]\5\26\f\2W]\5\60\31\2X]\5\16\b\2Y]\5\20\t\2Z]\5\f\7\2[]\5\n\6\2\\"+
		"O\3\2\2\2\\P\3\2\2\2\\Q\3\2\2\2\\R\3\2\2\2\\S\3\2\2\2\\T\3\2\2\2\\U\3"+
		"\2\2\2\\V\3\2\2\2\\W\3\2\2\2\\X\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2"+
		"\2]\t\3\2\2\2^_\7\t\2\2_`\7\60\2\2`a\7\n\2\2ab\7/\2\2b\13\3\2\2\2ce\7"+
		"\13\2\2df\5\22\n\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2i"+
		"j\7\f\2\2j\r\3\2\2\2km\7\r\2\2ln\5\20\t\2ml\3\2\2\2mn\3\2\2\2nr\3\2\2"+
		"\2oq\5\b\5\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2"+
		"\2uv\7\16\2\2v\17\3\2\2\2wx\7\17\2\2x\21\3\2\2\2yz\7\20\2\2z{\5\66\34"+
		"\2{|\5\64\33\2|}\7\21\2\2}\23\3\2\2\2~\u0080\7\22\2\2\177\u0081\5\30\r"+
		"\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084"+
		"\5\36\20\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0086\7/\2\2\u0086\u0087\7\23\2\2\u0087\25\3\2\2\2\u0088\u008a"+
		"\7\24\2\2\u0089\u008b\5\30\r\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008d\7/\2\2\u008d\u008e\7\25\2\2\u008e\27"+
		"\3\2\2\2\u008f\u0090\t\2\2\2\u0090\31\3\2\2\2\u0091\u0092\7\32\2\2\u0092"+
		"\u0093\7/\2\2\u0093\u0094\7\33\2\2\u0094\33\3\2\2\2\u0095\u0096\7\34\2"+
		"\2\u0096\u0097\7/\2\2\u0097\u0098\7\35\2\2\u0098\35\3\2\2\2\u0099\u009c"+
		"\7\60\2\2\u009a\u009c\58\35\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2"+
		"\u009c\37\3\2\2\2\u009d\u009e\7\36\2\2\u009e\u009f\5\66\34\2\u009f\u00a0"+
		"\5\"\22\2\u00a0\u00a1\7\37\2\2\u00a1!\3\2\2\2\u00a2\u00a3\7 \2\2\u00a3"+
		"\u00a4\5$\23\2\u00a4\u00a5\5&\24\2\u00a5\u00a6\7!\2\2\u00a6#\3\2\2\2\u00a7"+
		"\u00a8\7\61\2\2\u00a8%\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\'\3\2\2\2\u00ab"+
		"\u00ac\7\"\2\2\u00ac\u00ad\5.\30\2\u00ad\u00ae\7#\2\2\u00ae)\3\2\2\2\u00af"+
		"\u00b1\5\24\13\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3+\3\2\2\2\u00b4\u00b6\5\24\13\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8-\3\2\2\2\u00b9\u00ba\7\62\2\2\u00ba\u00bb\7\63\2\2\u00bb/\3"+
		"\2\2\2\u00bc\u00c1\7$\2\2\u00bd\u00bf\5 \21\2\u00be\u00c0\5\24\13\2\u00bf"+
		"\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bd\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\7%\2\2\u00c6\61\3\2\2\2\u00c7\u00c8\7/\2\2"+
		"\u00c8\63\3\2\2\2\u00c9\u00ca\7/\2\2\u00ca\65\3\2\2\2\u00cb\u00cc\7/\2"+
		"\2\u00cc\67\3\2\2\2\u00cd\u00ce\t\3\2\2\u00ce9\3\2\2\2\20EJ\\gmr\u0080"+
		"\u0083\u008a\u009b\u00b2\u00b7\u00bf\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}