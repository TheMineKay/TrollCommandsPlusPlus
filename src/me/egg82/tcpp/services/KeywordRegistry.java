package me.egg82.tcpp.services;

import ninja.egg82.patterns.Registry;

public class KeywordRegistry extends Registry<String> {
	//vars
	
	//constructor
	public KeywordRegistry() {
		super(String.class);
		
		setRegister("alone", new String[] {
			"hide",
			"sneak",
			"iron",
			"door",
			"leave",
			"only",
			"solo",
			"abandon",
			"lonely",
			"isolated",
			"solitary"
		});
		setRegister("amnesia", new String[] {
			"forget",
			"remember",
			"duplicate",
			"copy",
			"remove",
			"diamond",
			"pickaxe",
			"stupor",
			"blackout"
		});
		setRegister("annoy", new String[] {
			"villager",
			"person",
			"sound",
			"egg",
			"agitate",
			"bother",
			"disturb",
			"exasperate",
			"provoke"
		});
		setRegister("anvil", new String[] {
			"squash",
			"crush",
			"drop",
			"smith",
			"weapon",
			"armor",
			"sword"
		});
		setRegister("attachcommand", new String[] {
			"exp",
			"xp",
			"experience",
			"bottle",
			"enchanting",
			"join",
			"fasten",
			"add",
			"adhere",
			"affix",
			"connect",
			"fix",
			"link",
			"stick",
			"tie",
			"bind",
			"couple"
		});
		setRegister("banish", new String[] {
			"wood",
			"door",
			"exile",
			"leave",
			"alone",
			"dismiss",
			"dispel",
			"eject",
			"eliminate",
			"evict",
			"isolate",
			"ban",
			"deport",
			"transport"
		});
		setRegister("bludger", new String[] {
			"magma",
			"cream",
			"harry",
			"potter",
			"quidditch",
			"seek",
			"follow",
			"trail",
			"explode",
			"fire",
			"track",
			"chase"
		});
		setRegister("bomb", new String[] {
			"tnt",
			"firework",
			"fireball",
			"rain",
			"explode",
			"explosion",
			"explosive",
			"missile",
			"projectile",
			"rocket",
			"torpedo",
			"charge",
			"grenade",
			"blast",
			"erupt",
			"detonate"
		});
		setRegister("brittle", new String[] {
			"fragile",
			"glass",
			"death",
			"kill",
			"break",
			"crisp",
			"frail",
			"crumble",
			"delicate",
			"weak"
		});
		setRegister("burn", new String[] {
			"blaze",
			"powder",
			"fire",
			"char",
			"heat",
			"ignite",
			"incinerate",
			"light",
			"melt",
			"scorch",
			"smolder",
			"torch",
			"bake",
			"cook",
			"flame",
			"smoke"
		});
		setRegister("cannon", new String[] {
			"tnt",
			"dynamite",
			"ac/dc",
			"explode",
			"explosion",
			"mortar",
			"artillary",
			"blast",
			"erupt",
			"detonate"
		});
		setRegister("clumsy", new String[] {
			"sand",
			"drop",
			"fumble",
			"mistake",
			"inept",
			"blunder",
			"bumbling",
			"crude",
			"unable"
		});
		setRegister("comet", new String[] {
			"fireball",
			"shoot",
			"explode",
			"explosion",
			"meteor",
			"blast",
			"erupt",
			"detonate"
		});
		setRegister("control", new String[] {
			"iron",
			"fence",
			"posess",
			"disguise",
			"camno",
			"veil",
			"cloak",
			"guise",
			"costume",
			"illusion",
			"mask",
			"force",
			"dominate",
			"restrict",
			"rope",
			"string"
		});
		setRegister("convert", new String[] {
			"tuber",
			"plant",
			"spud",
			"inventory",
			"change",
			"adapt",
			"modify",
			"reorganize",
			"switch",
			"transform",
			"translate",
			"alter"
		});
		setRegister("creep", new String[] {
			"egg",
			"creeper",
			"tnt",
			"dynamite",
			"explode",
			"explosion",
			"spawn",
			"create",
			"generate",
			"hatch",
			"make"
		});
		setRegister("display", new String[] {
			"thin",
			"glass",
			"showcase",
			"trap",
			"example",
			"exhibit",
			"present",
			"expose"
		});
		setRegister("effect", new String[] {
			"book",
			"quill",
			"impact",
			"impression",
			"force"
		});
		setRegister("electrify", new String[] {
			"energy",
			"lightning",
			"electricity",
			"daylight",
			"detector",
			"bolt"
		});
		setRegister("empower", new String[] {
			"dragon",
			"egg",
			"ender",
			"allow",
			"entitle",
			"grant",
			"power",
			"health",
			"regen",
			"regeneration",
			"attack",
			"defense",
			"speed",
			"vest",
			"permit",
			"invest",
			"privilege",
			"qualify",
			"sanction"
		});
		setRegister("enchant", new String[] {
			"enchanted",
			"book",
			"charm",
			"item",
			"sorcery",
			"magic",
			"spell"
		});
		setRegister("entomb", new String[] {
			"dirt",
			"bury",
			"enshrine"
		});
		setRegister("explodebreak", new String[] {
			"cobblestone",
			"tnt",
			"explosion",
			"dynamite",
			"blast",
			"erupt",
			"detonate"
		});
		setRegister("explodebuild", new String[] {
			"redstone",
			"torch",
			"tnt",
			"explosion",
			"dynamite",
			"blast",
			"erupt",
			"detonate"
		});
		setRegister("fakecrash", new String[] {
			"command",
			"block",
			"program",
			"exception",
			"error",
			"java",
			"system",
			"failure"
		});
		setRegister("fakeop", new String[] {
			"cake",
			"privilege",
			"bogus",
			"phony",
			"artificial"
		});
		setRegister("fill", new String[] {
			"leaves",
			"occupy",
			"block",
			"clog",
			"inventory",
			"cram",
			"crowd",
			"load",
			"overflow",
			"pack",
			"saturate",
			"stuff",
			"congest",
			"inflate"
		});
		setRegister("flip", new String[] {
			"wood",
			"stairs",
			"180",
			"rotate",
			"twist"
		});
		setRegister("foolsgold", new String[] {
			"gold",
			"ore",
			"stupid",
			"rediculous",
			"fake",
			"buffoon",
			"clown",
			"moron",
			"jerk",
			"dimwit",
			"nitwit",
			"twit"
		});
		setRegister("freeze", new String[] {
			"ice",
			"pause",
			"stop",
			"paralyze",
			"motionless",
			"block",
			"halt",
			"stun"
		});
		setRegister("garble", new String[] {
			"book",
			"misinterpret",
			"misquote",
			"confuse",
			"twist",
			"mislead",
			"obscure",
			"warp",
			"falsify"
		});
		setRegister("grantwishes", new String[] {
			"dropper",
			"allow",
			"gift",
			"award",
			"present",
			"desire",
			"chat",
			"talk",
			"choice"
		});
		setRegister("haunt", new String[] {
			"skull",
			"zombie",
			"annoy",
			"sound",
			"hound",
			"frighten",
			"terrify",
			"torment",
			"terrorize",
			"worry",
			"agitate"
		});
		setRegister("hottub", new String[] {
			"torch",
			"lava",
			"burn",
			"fire",
			"hot",
			"drop",
			"fall",
			"hole"
		});
		setRegister("hurt", new String[] {
			"diamond",
			"sword",
			"pain",
			"kill",
			"death",
			"suffering",
			"wound",
			"harm"
		});
		setRegister("infinity", new String[] {
			"water",
			"bucket",
			"fall",
			"forever",
			"endless",
			"eternal",
			"permanent",
			"drop"
		});
		setRegister("inspect", new String[] {
			"hopper",
			"inventory",
			"audit",
			"check",
			"investigate",
			"observe",
			"probe",
			"scan",
			"review",
			"survey",
			"watch",
			"case",
			"study",
			"view"
		});
		setRegister("invert", new String[] {
			"redstone",
			"comparator",
			"reverse",
			"upside",
			"down",
			"backtrack",
			"revert",
			"upend"
		});
		setRegister("kill", new String[] {
			"skull",
			"head",
			"player",
			"death",
			"assassinate",
			"execute",
			"murder",
			"slaughter",
			"slay",
			"finish"
		});
		setRegister("lag", new String[] {
			"gold",
			"block",
			"fail",
			"slow",
			"drag",
			"stay"
		});
		setRegister("lavabreak", new String[] {
			"lava",
			"bucket",
			"slag",
			"magma",
			"ashes",
			"obsidian",
			"fire",
			"char",
			"heat",
			"ignite",
			"incinerate",
			"light",
			"melt",
			"scorch",
			"smolder",
			"torch",
			"bake",
			"cook",
			"flame",
			"smoke"
		});
		setRegister("lavabuild", new String[] {
			"blaze",
			"rod",
			"nether",
			"slag",
			"magma",
			"ashes",
			"obsidian",
			"fire",
			"char",
			"heat",
			"ignite",
			"incinerate",
			"light",
			"melt",
			"scorch",
			"smolder",
			"torch",
			"bake",
			"cook",
			"flame",
			"smoke"
		});
		setRegister("levitate", new String[] {
			"ascend",
			"feather",
			"chicken",
			"drift",
			"float",
			"fly",
			"hang",
			"climb",
			"disappear",
			"hover",
			"raise",
			"rise",
			"soar",
			"gravity",
			"up",
			"vanish"
		});
		setRegister("lift", new String[] {
			"slime",
			"block",
			"ascend",
			"boost",
			"climb",
			"disappear",
			"hoist",
			"raise",
			"rise",
			"soar",
			"arise",
			"up",
			"vanish"
		});
		setRegister("lock", new String[] {
			"lever",
			"latch",
			"bar",
			"inventory",
			"link",
			"bond"
		});
		setRegister("lure", new String[] {
			"beacon",
			"bait",
			"charm",
			"draw",
			"hook",
			"pull"
		});
		setRegister("nausea", new String[] {
			"spider",
			"eye",
			"vomit",
			"revulsion",
			"spinning"
		});
		setRegister("nightmare", new String[] {
			"obsidian",
			"night",
			"bad",
			"fake",
			"dream",
			"hallucination",
			"horror",
			"torment"
		});
		setRegister("nopickup", new String[] {
			"dead",
			"bush",
			"gather",
			"elevate",
			"grasp"
		});
		setRegister("popup", new String[] {
			"chest",
			"appear",
			"inventory",
			"open",
			"close",
			"random"
		});
		setRegister("portal", new String[] {
			"end",
			"frame",
			"doorway",
			"entry",
			"gate",
			"opening",
			"drop",
			"fall"
		});
		setRegister("public", new String[] {
			"dispenser",
			"inventory",
			"civic",
			"communal",
			"mututal",
			"national",
			"popular",
			"social",
			"universal"
		});
		setRegister("radiate", new String[] {
			"soil",
			"farmland",
			"farm",
			"till",
			"tilled",
			"dirt",
			"podzol",
			"toxin",
			"venom",
			"virus",
			"cancer",
			"blight",
			"infection",
			"emission",
			"circulation",
			"spread",
			"radioactive",
			"nuclear"
		});
		setRegister("randombreak", new String[] {
			"iron",
			"pick",
			"pickaxe",
			"accident",
			"accidental",
			"arbitrary",
			"irregular",
			"odd",
			"unplanned"
		});
		setRegister("randombuild", new String[] {
			"map",
			"paper",
			"accident",
			"accidental",
			"arbitrary",
			"irregular",
			"odd",
			"unplanned"
		});
		setRegister("randomdrop", new String[] {
			"cookie",
			"accident",
			"accidental",
			"arbitrary",
			"irregular",
			"odd",
			"unplanned"
		});
		setRegister("randompotion", new String[] {
			"potion",
			"drink",
			"splash",
			"effect",
			"accident",
			"accidental",
			"arbitrary",
			"irregular",
			"odd",
			"unplanned"
		});
		setRegister("randomspeed", new String[] {
			"soul",
			"sand",
			"nether",
			"fast",
			"slow",
			"walk",
			"fly",
			"effect",
			"accident",
			"accidental",
			"arbitrary",
			"irregular",
			"odd",
			"unplanned"
		});
		setRegister("rewind", new String[] {
			"enchantment",
			"table",
			"back",
			"reverse",
			"undo",
			"invert"
		});
		setRegister("slap", new String[] {
			"piston",
			"punch",
			"whack",
			"bang",
			"poke",
			"slam",
			"strike",
			"sock"
		});
		setRegister("slender", new String[] {
			"egg",
			"enderman",
			"dark",
			"blind",
			"slow",
			"spawn",
			"create",
			"generate",
			"hatch",
			"make"
		});
		setRegister("slowundo", new String[] {
			"grass",
			"block",
			"invalidate",
			"nullify",
			"abolish",
			"annul",
			"destroy",
			"negate",
			"reverse",
			"ruin"
		});
		setRegister("snowballfight", new String[] {
			"snow",
			"ball",
			"snowball",
			"bow",
			"arrow",
			"shoot"
		});
		setRegister("spam", new String[] {
			"bookshelf",
			"unsolicited",
			"fill",
			"stuff"
		});
		setRegister("sparta", new String[] {
			"arrow",
			"poke",
			"jab",
			"blow",
			"sharp",
			"stab"
		});
		setRegister("spin", new String[] {
			"boat",
			"twist",
			"spiral",
			"revolution",
			"turn",
			"whirl",
			"rotate"
		});
		setRegister("spoil", new String[] {
			"inventory",
			"fish",
			"puffer",
			"decay",
			"taint",
			"addle",
			"crumble",
			"curdle",
			"decompose",
			"deteriorate",
			"mold",
			"molder",
			"rot",
			"turn",
			"bad"
		});
		setRegister("squid", new String[] {
			"ink",
			"sac",
			"octopus",
			"spawn",
			"create",
			"generate",
			"hatch",
			"make"
		});
		setRegister("stampede", new String[] {
			"leather",
			"cow",
			"panic",
			"charge",
			"chase",
			"crash",
			"smash"
		});
		setRegister("starve", new String[] {
			"poison",
			"potato",
			"famish",
			"fast",
			"diet"
		});
		setRegister("stop", new String[] {
			"barrier",
			"cancel",
			"cease",
			"end",
			"halt",
			"close",
			"hold",
			"pause",
			"quit",
			"finish"
		});
		setRegister("surround", new String[] {
			"skull",
			"creeper",
			"regeneration",
			"enclose",
			"circle",
			"encricle",
			"envelop",
			"rig",
			"border",
			"outline",
			"round"
		});
		setRegister("swap", new String[] {
			"diode",
			"redstone",
			"repeater",
			"substitute",
			"switch",
			"trade",
			"change"
		});
		setRegister("time", new String[] {
			"nether",
			"star",
			"sun",
			"light",
			"white",
			"moon",
			"bed",
			"black",
			"dark",
			"twilight"
		});
		setRegister("trickle", new String[] {
			"leak",
			"golden",
			"apple",
			"exp",
			"xp",
			"experience",
			"level"
		});
		setRegister("troll", new String[] {
			"ender",
			"chest",
			"user",
			"interface",
			"ui",
			"gui",
			"graphical"
		});
		setRegister("useless", new String[] {
			"bedrock",
			"fruitless",
			"futile",
			"hopeless",
			"idle",
			"impractical",
			"ineffective",
			"meaningless",
			"pointless",
			"stupid",
			"unproductive",
			"worthless",
			"waste",
			"weak"
		});
		setRegister("vaporize", new String[] {
			"sulphur",
			"gunpowder",
			"creeper",
			"zap",
			"destroy",
			"kill",
			"terminate",
			"tnt",
			"explode",
			"explosion",
			"dynamite",
			"blast",
			"erupt",
			"detonate"
		});
		setRegister("vegetable", new String[] {
			"carrot",
			"potato",
			"herb",
			"produce",
			"salad",
			"edible",
			"green"
		});
		setRegister("void", new String[] {
			"black",
			"wool",
			"bare",
			"clear",
			"empty",
			"drained",
			"lacking"
		});
		setRegister("vomit", new String[] {
			"raw",
			"fish",
			"eject",
			"gag",
			"heave",
			"regurgitate",
			"emit",
			"drop",
			"expel",
			"item",
			"hurt",
			"puke"
		});
		setRegister("whoami", new String[] {
			"mushroom",
			"careless",
			"distracted",
			"inattentive",
			"sloppy",
			"absent",
			"forgetful",
			"amnesia"
		});
	}
	
	//public
	
	//private
	
}
