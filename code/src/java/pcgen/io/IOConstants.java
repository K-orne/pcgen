/*
 * IOConstants.java
 * Copyright 2002 (C) Thomas Behr <ravenlock@gmx.de>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * Created on March 19, 2002, 5:15 PM
 */
package pcgen.io;

/**
 * <code>IOConstants</code>
 *
 * @author   Thomas Behr
 * @version  $Revision$
 */
interface IOConstants
{
	/** AGE tag */
	String TAG_AGE = "AGE";

	/** AGE SET tag */
	String TAG_AGESET = "AGESET";

	/** ALIGNALLOW */
	String TAG_ALIGNALLOW = "ALIGNALLOW";

	/** ALIGN */
	String TAG_ALIGNMENT = "ALIGN";

	/** APPLIEDTO */
	String TAG_APPLIEDTO = "APPLIEDTO";

	/** ARMORPROF */
	String TAG_ARMORPROF = "ARMORPROF";

	/** ASSOCIATED DATA */
	String TAG_ASSOCIATEDDATA = "ASSOCIATEDDATA";

	/** AUTOSORTGEAR */
	String TAG_AUTOSORTGEAR = "AUTOSORTGEAR";

	/** AUTOSORTSKILLS */
	String TAG_AUTOSORTSKILLS = "AUTOSORTSKILLS";

	/** AUTOSPELLS */
	String TAG_AUTOSPELLS = "AUTOSPELLS";

	/** AUTOADDKNOWN */
	String TAG_AUTOADDKNOWN = "AUTOADDKNOWN";

	/** BASEITEM */
	String TAG_BASEITEM = "BASEITEM";

	/** BIRTHDAY */
	String TAG_BIRTHDAY = "BIRTHDAY";

	/** BIRTHPLACE */
	String TAG_BIRTHPLACE = "BIRTHPLACE";

	/** CALCEQUIPSET */
	String TAG_CALCEQUIPSET = "CALCEQUIPSET";

	/** CAMPAIGN - System Information */
	String TAG_CAMPAIGN = "CAMPAIGN";

	/** @deprecated  Unused, to be removed 5.10 Beta 1 */
	String TAG_CAMPAIGNS = "CAMPAIGNS";

	/** CANCASTPERDAY - character spells info */
	String TAG_CANCASTPERDAY = "CANCASTPERDAY";

	/** @deprecated  Unused, to be removed 5.10 Beta 1 */
	String TAG_CARRIED = "CARRIED";

	/** CATCHPHRASE */
	String TAG_CATCHPHRASE = "CATCHPHRASE";

	/** CHARACTERASSET */
	String TAG_CHARACTERASSET = "CHARACTERASSET";

	/** CHARACTERBIO - Character description/bio/history */
	String TAG_CHARACTERBIO = "CHARACTERBIO";

	/** CHARACTERCOMP */
	String TAG_CHARACTERCOMP = "CHARACTERCOMP";

	/** CHARACTERDESC */
	String TAG_CHARACTERDESC = "CHARACTERDESC";

	/** CHARACTERMAGIC */
	String TAG_CHARACTERMAGIC = "CHARACTERMAGIC";

	/** Character Name */
	String TAG_CHARACTERNAME = "CHARACTERNAME";

	/** CHOICE */
	String TAG_CHOICE = "CHOICE";

	/** CHOSENFEAT */
	String TAG_CHOSENFEAT = "CHOSENFEAT";

	/** CHOSENTEMPLATE */
	String TAG_CHOSENTEMPLATE = "CHOSENTEMPLATE";

	/** CITY */
	String TAG_CITY = "CITY";

	/** Character class(es) */
	String TAG_CLASS = "CLASS";

	/** CLASSABILITIESLEVEL */
	String TAG_CLASSABILITIESLEVEL = "CLASSABILITIESLEVEL";

	/** CLASSBOUGHT - Character skills */
	String TAG_CLASSBOUGHT = "CLASSBOUGHT";

	/** @deprecated  Unused, to be removed in 5.10 Beta 1 */
	String TAG_CLASSLEVEL = "CLASSLEVEL";

	/** CLASSSKILL */
	String TAG_CLASSSKILL = "CLASSSKILL";

	/** @deprecated  Unused, to be removed in 5.10 Beta 1 */
	String TAG_COMP = "COMP";

	/** @deprecated  Unused, to be removed in 5.10 Beta 1 */
	String TAG_CONTAINS = "CONTAINS";

	/** COST - Currently (20/03/2006) only being used by CMP data sources */
	String TAG_COST = "COST";

	/** @deprecated  Unused, to be removed in 5.10 Beta 1 */
	String TAG_CROSSCLASS = "CROSSCLASS";

	/** @deprecated  Unused, to be removed in 5.10 Beta 1 */
	String TAG_CT            = "CT";

	/** CUSTOMIZATION */
	String TAG_CUSTOMIZATION = "CUSTOMIZATION";
	/** DATA */
	String TAG_DATA          = "DATA";
	/** DEFINED */
	String TAG_DEFINED       = "DEFINED";

	/** Character deity/domain */
	String TAG_DEITY        = "DEITY";
	/** DEITYALIGN */
	String TAG_DEITYALIGN   = "DEITYALIGN";
	/** DEITYDOMAINS */
	String TAG_DEITYDOMAINS = "DEITYDOMAINS";
	/** DEITYFAVWEAP */
	String TAG_DEITYFAVWEAP = "DEITYFAVWEAP";
	/** DESC */
	String TAG_DESC         = "DESC";

	/** @deprecated  Unused - remove in 5.10 Beta 1 */
	String TAG_DESCRIPTOR = "DESCRIPTOR";
	/** DOMAIN */
	String TAG_DOMAIN     = "DOMAIN";

	/** @deprecated  Unused remove in 5.10 Beta 1 */
	String TAG_DOMAINFEATS  = "DOMAINFEATS";
	/** DOMAINGRANTS */
	String TAG_DOMAINGRANTS = "DOMAINGRANTS";

	/** @deprecated  Unused - remove in 5.10 Beta 1 */
	String TAG_DOMAINSKILLS = "DOMAINSKILLS";

	/** @deprecated  Unused - remove in 5.10 Beta 1 */
	String TAG_DOMAINSPECIALS = "DOMAINSPECIALS";
	/** DOMAINSPELLS */
	String TAG_DOMAINSPELLS   = "DOMAINSPELLS";

	/** @deprecated  Unused - remove in 5.10 Beta 1 */
	String TAG_DURATION = "DURATION";

	/** @deprecated  Unused - remove in 5.10 Beta 1 */
	String TAG_EFFECT = "EFFECT";

	/** @deprecated  Unused - remove in 5.10 Beta 1 */
	String TAG_EFFECTTYPE = "EFFECTTYPE";

	/** EquipSet Temporary Bonuses */
	String TAG_EQSETBONUS = "EQSETBONUS";

	/** Character equipment */
	String TAG_EQUIPMENT = "EQUIPMENT";
	/** Character equipment name */
	String TAG_EQUIPNAME = "EQUIPNAME";

	/** equipped */
	String TAG_EQUIPPED = "EQUIPPED";
	/** EQUIPSET */
	String TAG_EQUIPSET = "EQUIPSET";

	/** Character experience */
	String TAG_EXPERIENCE = "EXPERIENCE";
	/** EXPRESSION */
	String TAG_EXPRESSION = "EXPRESSION";
	/** EYECOLOR */
	String TAG_EYECOLOR   = "EYECOLOR";

	/** Character feats */
	String TAG_FEAT = "FEAT";

	/** @deprecated  Unused - remove in 5.10 Beta 1 */
	String TAG_FEAT_CATEGORY = "CATEGORY";
	/** FEATLIST */
	String TAG_FEATLIST      = "FEATLIST";
	/** FEATPOOL */
	String TAG_FEATPOOL      = "FEATPOOL";
	/** FILE */
	String TAG_FILE          = "FILE";

	/** Character follower */
	String TAG_FOLLOWER  = "FOLLOWER";
	/** GAMEMODE */
	String TAG_GAMEMODE  = "GAMEMODE";
	/** GENDER */
	String TAG_GENDER    = "GENDER";
	/** HAIRCOLOR */
	String TAG_HAIRCOLOR = "HAIRCOLOR";
	/** HAIRSTYLE */
	String TAG_HAIRSTYLE = "HAIRSTYLE";
	/** HANDED */
	String TAG_HANDED    = "HANDED";
	/** HEIGHT */
	String TAG_HEIGHT    = "HEIGHT";
	/** HITDICE */
	String TAG_HITDICE   = "HITDICE";
	/** HITPOINTS */
	String TAG_HITPOINTS = "HITPOINTS";
	/** HOLYITEM */
	String TAG_HOLYITEM  = "HOLYITEM";

	/** Output Sheets */
	String TAG_HTMLOUTPUTSHEET = "OUTPUTSHEETHTML";
	String TAG_ID              = "ID";
	String TAG_INTERESTS       = "INTERESTS";

	// Kits
	String TAG_KIT = "KIT";

	// Character languages
	String TAG_LANGUAGE       = "LANGUAGE";
	String TAG_LEVEL          = "LEVEL";
	String TAG_LEVELABILITY   = "ABILITY";
	String TAG_LOADCOMPANIONS = "LOADCOMPANIONS";
	String TAG_LOCATION       = "LOCATION";
	String TAG_MAPKEY         = "KEY";
	String TAG_MAPVALUE       = "VALUE";
	String TAG_MASTER         = "MASTER";


	/**
	 * @deprecated  Unused
	 */
	String TAG_MISC              = "MISC";
	String TAG_MONEY             = "MONEY";
	String TAG_MULTISELECT       = "MULTISELECT";
	String TAG_NAME              = "NAME";
	String TAG_NOTE              = "NOTE";
	String TAG_OUTPUTORDER       = "OUTPUTORDER";
	String TAG_PARENTID          = "PARENTID";
	String TAG_PCGVERSION        = "PCGVERSION";
	String TAG_PDFOUTPUTSHEET    = "OUTPUTSHEETPDF";
	String TAG_PERSONALITYTRAIT1 = "PERSONALITYTRAIT1";
	String TAG_PERSONALITYTRAIT2 = "PERSONALITYTRAIT2";
	String TAG_PHOBIAS           = "PHOBIAS";
	String TAG_PLAYERNAME        = "PLAYERNAME";
	String TAG_POOLPOINTS        = "POOLPOINTS";
	String TAG_POOLPOINTSAVAIL   = "POOLPOINTSAVAIL";
	String TAG_PORTRAIT          = "PORTRAIT";
	String TAG_POSTSTAT          = "POSTSTAT";


	/**
	 * @deprecated  Unused
	 */
	String TAG_POWERNAME      = "POWERNAME";
	String TAG_PRESTAT        = "PRESTAT";
	String TAG_PROHIBITED     = "PROHIBITED";
	String TAG_PROMPT         = "PROMPT";
	String TAG_PURCHASEPOINTS = "PURCHASEPOINTS";
	String TAG_QUANTITY       = "QUANTITY";
	String TAG_RACE           = "RACE";


	/**
	 * @deprecated  Unused
	 */
	String TAG_RANGE      = "RANGE";
	String TAG_RANKS      = "RANKS";
	String TAG_REGION     = "REGION";
	String TAG_RESIDENCE  = "RESIDENCE";
	String TAG_ROLLMETHOD = "ROLLMETHOD";
	String TAG_SA         = "SA";
	String TAG_SAVE       = "SAVE";
	String TAG_SAVES      = "SAVES";


	/**
	 * @deprecated  Unused
	 */
	String TAG_SCHOOL               = "SCHOOL";
	String TAG_SCORE                = "SCORE";
	String TAG_SKILL                = "SKILL";
	String TAG_SKILLPOINTSGAINED    = "SKILLSGAINED";
	String TAG_SKILLPOINTSREMAINING = "SKILLSREMAINING";
	String TAG_SKILLPOOL            = "SKILLPOOL";
	String TAG_SKILLSOUTPUTORDER    = "SKILLSOUTPUTORDER";
	String TAG_SKINCOLOR            = "SKINCOLOR";
	String TAG_SOURCE               = "SOURCE";
	String TAG_SPECIALABILITIES     = "SPECIALABILITIES";
	String TAG_SPECIALTIES          = "SPECIALTIES";
	String TAG_SPECIALTY            = "SPECIALTY";
	String TAG_SPEECHPATTERN        = "SPEECHPATTERN";


	/**
	 * @deprecated  Unused
	 */
	String TAG_SPELL         = "SPELL";
	String TAG_SPELLBASE     = "SPELLBASE";
	String TAG_SPELL_BOOK    = "BOOK";
	String TAG_SPELLBOOK     = "SPELLBOOK";
	String TAG_SPELLLEVEL    = "SPELLLEVEL";
	String TAG_SPELLLIST     = "SPELLLIST";
	String TAG_SPELLNAME     = "SPELLNAME";
	String TAG_SPELLPPCOST   = "SPELLPPCOST";
	String TAG_SPELLNUMPAGES = "SPELLNUMPAGES";


	/**
	 * @deprecated  Unused
	 */
	String TAG_SR = "SR";

	// Character attributes
	String TAG_STAT     = "STAT";
	String TAG_SUBCLASS = "SUBCLASS";


	/**
	 * @deprecated  Unused
	 */
	String TAG_SUBSCHOOL = "SUBSCHOOL";


	/**
	 * @deprecated  Unused
	 */
	String TAG_SYMBOL   = "SYMBOL";
	String TAG_SYNERGY  = "SYNERGY";
	String TAG_TABLABEL = "TABLABEL";
	String TAG_TABNAME  = "TABNAME";

	// Temporary Bonuses
	String TAG_TEMPBONUS      = "TEMPBONUS";
	String TAG_TEMPBONUSBONUS = "TBBONUS";


	/**
	 * @deprecated  Unused
	 */
	String TAG_TEMPBONUSSOURCE = "TBSOURCE";
	String TAG_TEMPBONUSTARGET = "TBTARGET";
	String TAG_TEMPLATE        = "TEMPLATE";

	// Character templates
	String TAG_TEMPLATESAPPLIED = "TEMPLATESAPPLIED";
	String TAG_TIMES            = "TIMES";


	/**
	 * @deprecated  Unused
	 */
	String TAG_TOTALWT = "TOTALWT";
	String TAG_TYPE    = "TYPE";


	/**
	 * @deprecated  Unused
	 */
	String TAG_UNLIMITEDPOOLCHECKED = "UNLIMITEDPOOLCHECKED";
	String TAG_USETEMPMODS          = "USETEMPMODS";
	String TAG_USEHIGHERKNOWN       = "USEHIGHERKNOWN";
	String TAG_USEHIGHERPREPPED     = "USEHIGHERPREPPED";
	String TAG_VALUE                = "VALUE";
	String TAG_VERSION              = "VERSION";
	String TAG_VFEAT                = "VFEAT";
	String TAG_WEAPON               = "WEAPON";

	// Character weapon proficiencies
	String TAG_WEAPONPROF = "WEAPONPROF";
	String TAG_WEIGHT     = "WEIGHT";
	String TAG_WT         = "WT";
}
