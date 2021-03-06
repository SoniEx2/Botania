/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Feb 16, 2015, 1:41:58 PM (GMT)]
 */
package vazkii.botania.common.lexicon;

import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.common.lexicon.page.PageTutorial;
import vazkii.botania.common.lib.LibLexicon;

public class TLexiconEntry extends BLexiconEntry {

	public TLexiconEntry() {
		super(LibLexicon.BASICS_TUTORIAL, BotaniaAPI.categoryBasics);
		setPriority();
		setLexiconPages(new PageTutorial("0"));
	}


}
