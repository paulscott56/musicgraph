package za.co.paulscott.musicgraph.enums;

/**
 * The script used to write the release's track list. The possible values are
 * taken from the ISO 15924 standard.
 * 
 * Guide to common scripts
 * 
 * Latin (also known as Roman or, incorrectly, "English") Latin is the most
 * common script, and usually the correct choice. It is used for all Western
 * European languages, and many others. It is also the most common script used
 * for transliterations.
 * 
 * Arabic العربية The Arabic script is used for languages in the Middle East and
 * Central Asia such as Arabic, Farsi and Urdu.
 * 
 * Cyrillic Кириллица Cyrillic is used for languages in Eastern Europe such as
 * Russian, Ukrainian, Belarusian and Bulgarian.
 * 
 * Greek Ελληνικά The Greek script is used for Greek, but several characters
 * have also been adopted for mathematical uses.
 * 
 * Han 漢字/汉字 Han characters are used by Chinese, Japanese and Korean. Han
 * (simplified), Han (traditional), Japanese, or Korean should be used instead
 * when the variant is known.
 * 
 * Han (simplified) 简体字 The simplified variant of Han characters is used to
 * write Chinese in mainland China and Singapore.
 * 
 * Han (traditional) 繁體字/正體字 The traditional variant of Han characters is used
 * to write Chinese in Hong Kong, Macao and Taiwan.
 * 
 * Korean 한글 This covers any combination of Hangul and Hanja for Korean.
 * 
 * Hebrew עברית The Hebrew script is used for Hebrew, but a few characters have
 * also been adopted for mathematical uses.
 * 
 * Japanese 漢字 & ひらがな & カタカナ This covers any combination of Kanji, Hiragana and
 * Katakana for Japanese.
 * 
 * Katakana カタカナ Katakana should only be used for transliterations into Japanese
 * (example, English->Japanese). Japanese language titles with words written in
 * Katakana should use Japanese.
 * 
 * Thai ไทย The Thai script is used for Thai, as well as some minor languages in
 * south-east Asia.
 * 
 * @author paul
 * 
 */
public enum ScriptType {
	Afak, Aghb, Arab, Armi, Armn, Avst, Bali, Bamu, Bass, Batk, Beng, Blis, Bopo, Brah, Brai, Bugi, Buhd, Cakm, Cans, Cari, Cham, Cher, Cirt, Copt, Cprt, Cyrl, Cyrs, Deva, Dsrt, Dupl, Egyd, Egyh, Egyp, Elba, Ethi, Geok, Geor, Glag, Goth, Gran, Grek, Gujr, Guru, Hang, Hani, Hano, Hans, Hant, Hebr, Hira, Hluw, Hmng, Hrkt, Hung, Inds, Ital, Java, Jpan, Jurc, Kali, Kana, Khar, Khmr, Khoj, Knda, Kore, Kpel, Kthi, Lana, Laoo, Latf, Latg, Latn, Lepc, Limb, Lina, Linb, Lisu, Loma, Lyci, Lydi, Mand, Mahj, Mani, Maya, Mend, Merc, Mero, Mlym, Mong, Moon, Mroo, Mtei, Mymr, Narb, Nbat, Nkgb, Nkoo, Nshu, Ogam, Olck, Orkh, Orya, Osma, Palm, Perm, Phag, Phli, Phlp, Phlv, Phnx, Plrd, Prti, Qaaa_Qabx, Rjng, Roro, Runr, Samr, Sara, Sarb, Saur, Sgnw, Shaw, Shrd, Sind, Sinh, Sora, Sund, Sylo, Syrc, Syre, Syrj, Syrn, Tagb, Takr, Tale, Talu, Taml, Tang, Tavt, Telu, Teng, Tfng, Tglg, Thaa, Thai, Tibt, Tirh, Ugar, Vaii, Visp, Wara, Wole, Xpeo, Xsux, Yiii, Zinh, Zmth, Zsym, Zxxx, Zyyy, Zzzz,
}
