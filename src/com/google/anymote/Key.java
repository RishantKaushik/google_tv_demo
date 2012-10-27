// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keycodes.proto

package com.google.anymote;

public final class Key {
  private Key() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public enum Code
      implements com.google.protobuf.Internal.EnumLite {
    KEYCODE_UNKNOWN(0, 0),
    KEYCODE_SOFT_LEFT(1, 1),
    KEYCODE_SOFT_RIGHT(2, 2),
    KEYCODE_HOME(3, 3),
    KEYCODE_BACK(4, 4),
    KEYCODE_CALL(5, 5),
    KEYCODE_0(6, 7),
    KEYCODE_1(7, 8),
    KEYCODE_2(8, 9),
    KEYCODE_3(9, 10),
    KEYCODE_4(10, 11),
    KEYCODE_5(11, 12),
    KEYCODE_6(12, 13),
    KEYCODE_7(13, 14),
    KEYCODE_8(14, 15),
    KEYCODE_9(15, 16),
    KEYCODE_STAR(16, 17),
    KEYCODE_POUND(17, 18),
    KEYCODE_DPAD_UP(18, 19),
    KEYCODE_DPAD_DOWN(19, 20),
    KEYCODE_DPAD_LEFT(20, 21),
    KEYCODE_DPAD_RIGHT(21, 22),
    KEYCODE_DPAD_CENTER(22, 23),
    KEYCODE_VOLUME_UP(23, 24),
    KEYCODE_VOLUME_DOWN(24, 25),
    KEYCODE_POWER(25, 26),
    KEYCODE_CAMERA(26, 27),
    KEYCODE_A(27, 29),
    KEYCODE_B(28, 30),
    KEYCODE_C(29, 31),
    KEYCODE_D(30, 32),
    KEYCODE_E(31, 33),
    KEYCODE_F(32, 34),
    KEYCODE_G(33, 35),
    KEYCODE_H(34, 36),
    KEYCODE_I(35, 37),
    KEYCODE_J(36, 38),
    KEYCODE_K(37, 39),
    KEYCODE_L(38, 40),
    KEYCODE_M(39, 41),
    KEYCODE_N(40, 42),
    KEYCODE_O(41, 43),
    KEYCODE_P(42, 44),
    KEYCODE_Q(43, 45),
    KEYCODE_R(44, 46),
    KEYCODE_S(45, 47),
    KEYCODE_T(46, 48),
    KEYCODE_U(47, 49),
    KEYCODE_V(48, 50),
    KEYCODE_W(49, 51),
    KEYCODE_X(50, 52),
    KEYCODE_Y(51, 53),
    KEYCODE_Z(52, 54),
    KEYCODE_COMMA(53, 55),
    KEYCODE_PERIOD(54, 56),
    KEYCODE_ALT_LEFT(55, 57),
    KEYCODE_ALT_RIGHT(56, 58),
    KEYCODE_SHIFT_LEFT(57, 59),
    KEYCODE_SHIFT_RIGHT(58, 60),
    KEYCODE_TAB(59, 61),
    KEYCODE_SPACE(60, 62),
    KEYCODE_EXPLORER(61, 64),
    KEYCODE_ENTER(62, 66),
    KEYCODE_DEL(63, 67),
    KEYCODE_GRAVE(64, 68),
    KEYCODE_MINUS(65, 69),
    KEYCODE_EQUALS(66, 70),
    KEYCODE_LEFT_BRACKET(67, 71),
    KEYCODE_RIGHT_BRACKET(68, 72),
    KEYCODE_BACKSLASH(69, 73),
    KEYCODE_SEMICOLON(70, 74),
    KEYCODE_APOSTROPHE(71, 75),
    KEYCODE_SLASH(72, 76),
    KEYCODE_AT(73, 77),
    KEYCODE_FOCUS(74, 80),
    KEYCODE_PLUS(75, 81),
    KEYCODE_MENU(76, 82),
    KEYCODE_SEARCH(77, 84),
    KEYCODE_MEDIA_PLAY_PAUSE(78, 85),
    KEYCODE_MEDIA_STOP(79, 86),
    KEYCODE_MEDIA_NEXT(80, 87),
    KEYCODE_MEDIA_PREVIOUS(81, 88),
    KEYCODE_MEDIA_REWIND(82, 89),
    KEYCODE_MEDIA_FAST_FORWARD(83, 90),
    KEYCODE_MUTE(84, 91),
    KEYCODE_CTRL_LEFT(85, 92),
    KEYCODE_CTRL_RIGHT(86, 93),
    KEYCODE_INSERT(87, 94),
    KEYCODE_PAUSE(88, 95),
    KEYCODE_PAGE_UP(89, 96),
    KEYCODE_PAGE_DOWN(90, 97),
    KEYCODE_PRINT_SCREEN(91, 98),
    KEYCODE_INFO(92, 103),
    KEYCODE_WINDOW(93, 104),
    KEYCODE_BOOKMARK(94, 110),
    KEYCODE_CAPS_LOCK(95, 111),
    KEYCODE_ESCAPE(96, 112),
    KEYCODE_META_LEFT(97, 113),
    KEYCODE_META_RIGHT(98, 114),
    KEYCODE_ZOOM_IN(99, 115),
    KEYCODE_ZOOM_OUT(100, 116),
    KEYCODE_CHANNEL_UP(101, 117),
    KEYCODE_CHANNEL_DOWN(102, 118),
    KEYCODE_LIVE(103, 120),
    KEYCODE_DVR(104, 121),
    KEYCODE_GUIDE(105, 122),
    KEYCODE_MEDIA_SKIP_BACK(106, 123),
    KEYCODE_MEDIA_SKIP_FORWARD(107, 124),
    KEYCODE_MEDIA_RECORD(108, 125),
    KEYCODE_MEDIA_PLAY(109, 126),
    KEYCODE_PROG_RED(110, 128),
    KEYCODE_PROG_GREEN(111, 129),
    KEYCODE_PROG_YELLOW(112, 130),
    KEYCODE_PROG_BLUE(113, 131),
    KEYCODE_BD_POWER(114, 132),
    KEYCODE_BD_INPUT(115, 133),
    KEYCODE_STB_POWER(116, 134),
    KEYCODE_STB_INPUT(117, 135),
    KEYCODE_STB_MENU(118, 136),
    KEYCODE_TV_POWER(119, 137),
    KEYCODE_TV_INPUT(120, 138),
    KEYCODE_AVR_POWER(121, 139),
    KEYCODE_AVR_INPUT(122, 140),
    KEYCODE_AUDIO(123, 141),
    KEYCODE_EJECT(124, 142),
    KEYCODE_BD_POPUP_MENU(125, 143),
    KEYCODE_BD_TOP_MENU(126, 144),
    KEYCODE_SETTINGS(127, 145),
    KEYCODE_SETUP(128, 146),
    KEYCODE_MICROPHONE_MUTE(129, 147),
    KEYCODE_PICTSYMBOLS(130, 148),
    KEYCODE_SWITCH_CHARSET(131, 149),
    KEYCODE_FORWARD_DEL(132, 150),
    KEYCODE_SCROLL_LOCK(133, 151),
    KEYCODE_FUNCTION(134, 152),
    KEYCODE_SYSRQ(135, 153),
    KEYCODE_BREAK(136, 154),
    KEYCODE_MOVE_HOME(137, 155),
    KEYCODE_MOVE_END(138, 156),
    KEYCODE_FORWARD(139, 157),
    KEYCODE_MEDIA_CLOSE(140, 158),
    KEYCODE_F1(141, 159),
    KEYCODE_F2(142, 160),
    KEYCODE_F3(143, 161),
    KEYCODE_F4(144, 162),
    KEYCODE_F5(145, 163),
    KEYCODE_F6(146, 164),
    KEYCODE_F7(147, 165),
    KEYCODE_F8(148, 166),
    KEYCODE_F9(149, 167),
    KEYCODE_F10(150, 168),
    KEYCODE_F11(151, 169),
    KEYCODE_F12(152, 170),
    KEYCODE_NUM_LOCK(153, 171),
    KEYCODE_NUMPAD_0(154, 172),
    KEYCODE_NUMPAD_1(155, 173),
    KEYCODE_NUMPAD_2(156, 174),
    KEYCODE_NUMPAD_3(157, 175),
    KEYCODE_NUMPAD_4(158, 176),
    KEYCODE_NUMPAD_5(159, 177),
    KEYCODE_NUMPAD_6(160, 178),
    KEYCODE_NUMPAD_7(161, 179),
    KEYCODE_NUMPAD_8(162, 180),
    KEYCODE_NUMPAD_9(163, 181),
    KEYCODE_NUMPAD_DIVIDE(164, 182),
    KEYCODE_NUMPAD_MULTIPLY(165, 183),
    KEYCODE_NUMPAD_SUBTRACT(166, 184),
    KEYCODE_NUMPAD_ADD(167, 185),
    KEYCODE_NUMPAD_DOT(168, 186),
    KEYCODE_NUMPAD_COMMA(169, 187),
    KEYCODE_NUMPAD_ENTER(170, 188),
    KEYCODE_NUMPAD_EQUALS(171, 189),
    KEYCODE_NUMPAD_LEFT_PAREN(172, 190),
    KEYCODE_NUMPAD_RIGHT_PAREN(173, 191),
    KEYCODE_APP_SWITCH(174, 192),
    BTN_FIRST(175, 256),
    BTN_1(178, 257),
    BTN_2(179, 258),
    BTN_3(180, 259),
    BTN_4(181, 260),
    BTN_5(182, 261),
    BTN_6(183, 262),
    BTN_7(184, 263),
    BTN_8(185, 264),
    BTN_9(186, 265),
    BTN_MOUSE(187, 272),
    BTN_RIGHT(189, 273),
    BTN_MIDDLE(190, 274),
    BTN_SIDE(191, 275),
    BTN_EXTRA(192, 276),
    BTN_FORWARD(193, 277),
    BTN_BACK(194, 278),
    BTN_TASK(195, 279),
    BTN_GAME_A(196, 280),
    BTN_GAME_B(197, 281),
    BTN_GAME_C(198, 282),
    BTN_GAME_X(199, 283),
    BTN_GAME_Y(200, 284),
    BTN_GAME_Z(201, 285),
    BTN_GAME_L1(202, 286),
    BTN_GAME_R1(203, 287),
    BTN_GAME_L2(204, 288),
    BTN_GAME_R2(205, 289),
    BTN_GAME_THUMBL(206, 290),
    BTN_GAME_THUMBR(207, 291),
    BTN_GAME_START(208, 292),
    BTN_GAME_SELECT(209, 293),
    BTN_GAME_MODE(210, 294),
    BTN_GAME_1(211, 295),
    BTN_GAME_2(212, 296),
    BTN_GAME_3(213, 297),
    BTN_GAME_4(214, 298),
    BTN_GAME_5(215, 299),
    BTN_GAME_6(216, 300),
    BTN_GAME_7(217, 301),
    BTN_GAME_8(218, 302),
    BTN_GAME_9(219, 303),
    BTN_GAME_10(220, 304),
    BTN_GAME_11(221, 305),
    BTN_GAME_12(222, 306),
    BTN_GAME_13(223, 307),
    BTN_GAME_14(224, 308),
    BTN_GAME_15(225, 309),
    BTN_GAME_16(226, 310),
    ;
    
    public static final Code BTN_MISC = BTN_FIRST;
    public static final Code BTN_0 = BTN_FIRST;
    public static final Code BTN_LEFT = BTN_MOUSE;
    public static final int KEYCODE_UNKNOWN_VALUE = 0;
    public static final int KEYCODE_SOFT_LEFT_VALUE = 1;
    public static final int KEYCODE_SOFT_RIGHT_VALUE = 2;
    public static final int KEYCODE_HOME_VALUE = 3;
    public static final int KEYCODE_BACK_VALUE = 4;
    public static final int KEYCODE_CALL_VALUE = 5;
    public static final int KEYCODE_0_VALUE = 7;
    public static final int KEYCODE_1_VALUE = 8;
    public static final int KEYCODE_2_VALUE = 9;
    public static final int KEYCODE_3_VALUE = 10;
    public static final int KEYCODE_4_VALUE = 11;
    public static final int KEYCODE_5_VALUE = 12;
    public static final int KEYCODE_6_VALUE = 13;
    public static final int KEYCODE_7_VALUE = 14;
    public static final int KEYCODE_8_VALUE = 15;
    public static final int KEYCODE_9_VALUE = 16;
    public static final int KEYCODE_STAR_VALUE = 17;
    public static final int KEYCODE_POUND_VALUE = 18;
    public static final int KEYCODE_DPAD_UP_VALUE = 19;
    public static final int KEYCODE_DPAD_DOWN_VALUE = 20;
    public static final int KEYCODE_DPAD_LEFT_VALUE = 21;
    public static final int KEYCODE_DPAD_RIGHT_VALUE = 22;
    public static final int KEYCODE_DPAD_CENTER_VALUE = 23;
    public static final int KEYCODE_VOLUME_UP_VALUE = 24;
    public static final int KEYCODE_VOLUME_DOWN_VALUE = 25;
    public static final int KEYCODE_POWER_VALUE = 26;
    public static final int KEYCODE_CAMERA_VALUE = 27;
    public static final int KEYCODE_A_VALUE = 29;
    public static final int KEYCODE_B_VALUE = 30;
    public static final int KEYCODE_C_VALUE = 31;
    public static final int KEYCODE_D_VALUE = 32;
    public static final int KEYCODE_E_VALUE = 33;
    public static final int KEYCODE_F_VALUE = 34;
    public static final int KEYCODE_G_VALUE = 35;
    public static final int KEYCODE_H_VALUE = 36;
    public static final int KEYCODE_I_VALUE = 37;
    public static final int KEYCODE_J_VALUE = 38;
    public static final int KEYCODE_K_VALUE = 39;
    public static final int KEYCODE_L_VALUE = 40;
    public static final int KEYCODE_M_VALUE = 41;
    public static final int KEYCODE_N_VALUE = 42;
    public static final int KEYCODE_O_VALUE = 43;
    public static final int KEYCODE_P_VALUE = 44;
    public static final int KEYCODE_Q_VALUE = 45;
    public static final int KEYCODE_R_VALUE = 46;
    public static final int KEYCODE_S_VALUE = 47;
    public static final int KEYCODE_T_VALUE = 48;
    public static final int KEYCODE_U_VALUE = 49;
    public static final int KEYCODE_V_VALUE = 50;
    public static final int KEYCODE_W_VALUE = 51;
    public static final int KEYCODE_X_VALUE = 52;
    public static final int KEYCODE_Y_VALUE = 53;
    public static final int KEYCODE_Z_VALUE = 54;
    public static final int KEYCODE_COMMA_VALUE = 55;
    public static final int KEYCODE_PERIOD_VALUE = 56;
    public static final int KEYCODE_ALT_LEFT_VALUE = 57;
    public static final int KEYCODE_ALT_RIGHT_VALUE = 58;
    public static final int KEYCODE_SHIFT_LEFT_VALUE = 59;
    public static final int KEYCODE_SHIFT_RIGHT_VALUE = 60;
    public static final int KEYCODE_TAB_VALUE = 61;
    public static final int KEYCODE_SPACE_VALUE = 62;
    public static final int KEYCODE_EXPLORER_VALUE = 64;
    public static final int KEYCODE_ENTER_VALUE = 66;
    public static final int KEYCODE_DEL_VALUE = 67;
    public static final int KEYCODE_GRAVE_VALUE = 68;
    public static final int KEYCODE_MINUS_VALUE = 69;
    public static final int KEYCODE_EQUALS_VALUE = 70;
    public static final int KEYCODE_LEFT_BRACKET_VALUE = 71;
    public static final int KEYCODE_RIGHT_BRACKET_VALUE = 72;
    public static final int KEYCODE_BACKSLASH_VALUE = 73;
    public static final int KEYCODE_SEMICOLON_VALUE = 74;
    public static final int KEYCODE_APOSTROPHE_VALUE = 75;
    public static final int KEYCODE_SLASH_VALUE = 76;
    public static final int KEYCODE_AT_VALUE = 77;
    public static final int KEYCODE_FOCUS_VALUE = 80;
    public static final int KEYCODE_PLUS_VALUE = 81;
    public static final int KEYCODE_MENU_VALUE = 82;
    public static final int KEYCODE_SEARCH_VALUE = 84;
    public static final int KEYCODE_MEDIA_PLAY_PAUSE_VALUE = 85;
    public static final int KEYCODE_MEDIA_STOP_VALUE = 86;
    public static final int KEYCODE_MEDIA_NEXT_VALUE = 87;
    public static final int KEYCODE_MEDIA_PREVIOUS_VALUE = 88;
    public static final int KEYCODE_MEDIA_REWIND_VALUE = 89;
    public static final int KEYCODE_MEDIA_FAST_FORWARD_VALUE = 90;
    public static final int KEYCODE_MUTE_VALUE = 91;
    public static final int KEYCODE_CTRL_LEFT_VALUE = 92;
    public static final int KEYCODE_CTRL_RIGHT_VALUE = 93;
    public static final int KEYCODE_INSERT_VALUE = 94;
    public static final int KEYCODE_PAUSE_VALUE = 95;
    public static final int KEYCODE_PAGE_UP_VALUE = 96;
    public static final int KEYCODE_PAGE_DOWN_VALUE = 97;
    public static final int KEYCODE_PRINT_SCREEN_VALUE = 98;
    public static final int KEYCODE_INFO_VALUE = 103;
    public static final int KEYCODE_WINDOW_VALUE = 104;
    public static final int KEYCODE_BOOKMARK_VALUE = 110;
    public static final int KEYCODE_CAPS_LOCK_VALUE = 111;
    public static final int KEYCODE_ESCAPE_VALUE = 112;
    public static final int KEYCODE_META_LEFT_VALUE = 113;
    public static final int KEYCODE_META_RIGHT_VALUE = 114;
    public static final int KEYCODE_ZOOM_IN_VALUE = 115;
    public static final int KEYCODE_ZOOM_OUT_VALUE = 116;
    public static final int KEYCODE_CHANNEL_UP_VALUE = 117;
    public static final int KEYCODE_CHANNEL_DOWN_VALUE = 118;
    public static final int KEYCODE_LIVE_VALUE = 120;
    public static final int KEYCODE_DVR_VALUE = 121;
    public static final int KEYCODE_GUIDE_VALUE = 122;
    public static final int KEYCODE_MEDIA_SKIP_BACK_VALUE = 123;
    public static final int KEYCODE_MEDIA_SKIP_FORWARD_VALUE = 124;
    public static final int KEYCODE_MEDIA_RECORD_VALUE = 125;
    public static final int KEYCODE_MEDIA_PLAY_VALUE = 126;
    public static final int KEYCODE_PROG_RED_VALUE = 128;
    public static final int KEYCODE_PROG_GREEN_VALUE = 129;
    public static final int KEYCODE_PROG_YELLOW_VALUE = 130;
    public static final int KEYCODE_PROG_BLUE_VALUE = 131;
    public static final int KEYCODE_BD_POWER_VALUE = 132;
    public static final int KEYCODE_BD_INPUT_VALUE = 133;
    public static final int KEYCODE_STB_POWER_VALUE = 134;
    public static final int KEYCODE_STB_INPUT_VALUE = 135;
    public static final int KEYCODE_STB_MENU_VALUE = 136;
    public static final int KEYCODE_TV_POWER_VALUE = 137;
    public static final int KEYCODE_TV_INPUT_VALUE = 138;
    public static final int KEYCODE_AVR_POWER_VALUE = 139;
    public static final int KEYCODE_AVR_INPUT_VALUE = 140;
    public static final int KEYCODE_AUDIO_VALUE = 141;
    public static final int KEYCODE_EJECT_VALUE = 142;
    public static final int KEYCODE_BD_POPUP_MENU_VALUE = 143;
    public static final int KEYCODE_BD_TOP_MENU_VALUE = 144;
    public static final int KEYCODE_SETTINGS_VALUE = 145;
    public static final int KEYCODE_SETUP_VALUE = 146;
    public static final int KEYCODE_MICROPHONE_MUTE_VALUE = 147;
    public static final int KEYCODE_PICTSYMBOLS_VALUE = 148;
    public static final int KEYCODE_SWITCH_CHARSET_VALUE = 149;
    public static final int KEYCODE_FORWARD_DEL_VALUE = 150;
    public static final int KEYCODE_SCROLL_LOCK_VALUE = 151;
    public static final int KEYCODE_FUNCTION_VALUE = 152;
    public static final int KEYCODE_SYSRQ_VALUE = 153;
    public static final int KEYCODE_BREAK_VALUE = 154;
    public static final int KEYCODE_MOVE_HOME_VALUE = 155;
    public static final int KEYCODE_MOVE_END_VALUE = 156;
    public static final int KEYCODE_FORWARD_VALUE = 157;
    public static final int KEYCODE_MEDIA_CLOSE_VALUE = 158;
    public static final int KEYCODE_F1_VALUE = 159;
    public static final int KEYCODE_F2_VALUE = 160;
    public static final int KEYCODE_F3_VALUE = 161;
    public static final int KEYCODE_F4_VALUE = 162;
    public static final int KEYCODE_F5_VALUE = 163;
    public static final int KEYCODE_F6_VALUE = 164;
    public static final int KEYCODE_F7_VALUE = 165;
    public static final int KEYCODE_F8_VALUE = 166;
    public static final int KEYCODE_F9_VALUE = 167;
    public static final int KEYCODE_F10_VALUE = 168;
    public static final int KEYCODE_F11_VALUE = 169;
    public static final int KEYCODE_F12_VALUE = 170;
    public static final int KEYCODE_NUM_LOCK_VALUE = 171;
    public static final int KEYCODE_NUMPAD_0_VALUE = 172;
    public static final int KEYCODE_NUMPAD_1_VALUE = 173;
    public static final int KEYCODE_NUMPAD_2_VALUE = 174;
    public static final int KEYCODE_NUMPAD_3_VALUE = 175;
    public static final int KEYCODE_NUMPAD_4_VALUE = 176;
    public static final int KEYCODE_NUMPAD_5_VALUE = 177;
    public static final int KEYCODE_NUMPAD_6_VALUE = 178;
    public static final int KEYCODE_NUMPAD_7_VALUE = 179;
    public static final int KEYCODE_NUMPAD_8_VALUE = 180;
    public static final int KEYCODE_NUMPAD_9_VALUE = 181;
    public static final int KEYCODE_NUMPAD_DIVIDE_VALUE = 182;
    public static final int KEYCODE_NUMPAD_MULTIPLY_VALUE = 183;
    public static final int KEYCODE_NUMPAD_SUBTRACT_VALUE = 184;
    public static final int KEYCODE_NUMPAD_ADD_VALUE = 185;
    public static final int KEYCODE_NUMPAD_DOT_VALUE = 186;
    public static final int KEYCODE_NUMPAD_COMMA_VALUE = 187;
    public static final int KEYCODE_NUMPAD_ENTER_VALUE = 188;
    public static final int KEYCODE_NUMPAD_EQUALS_VALUE = 189;
    public static final int KEYCODE_NUMPAD_LEFT_PAREN_VALUE = 190;
    public static final int KEYCODE_NUMPAD_RIGHT_PAREN_VALUE = 191;
    public static final int KEYCODE_APP_SWITCH_VALUE = 192;
    public static final int BTN_FIRST_VALUE = 256;
    public static final int BTN_MISC_VALUE = 256;
    public static final int BTN_0_VALUE = 256;
    public static final int BTN_1_VALUE = 257;
    public static final int BTN_2_VALUE = 258;
    public static final int BTN_3_VALUE = 259;
    public static final int BTN_4_VALUE = 260;
    public static final int BTN_5_VALUE = 261;
    public static final int BTN_6_VALUE = 262;
    public static final int BTN_7_VALUE = 263;
    public static final int BTN_8_VALUE = 264;
    public static final int BTN_9_VALUE = 265;
    public static final int BTN_MOUSE_VALUE = 272;
    public static final int BTN_LEFT_VALUE = 272;
    public static final int BTN_RIGHT_VALUE = 273;
    public static final int BTN_MIDDLE_VALUE = 274;
    public static final int BTN_SIDE_VALUE = 275;
    public static final int BTN_EXTRA_VALUE = 276;
    public static final int BTN_FORWARD_VALUE = 277;
    public static final int BTN_BACK_VALUE = 278;
    public static final int BTN_TASK_VALUE = 279;
    public static final int BTN_GAME_A_VALUE = 280;
    public static final int BTN_GAME_B_VALUE = 281;
    public static final int BTN_GAME_C_VALUE = 282;
    public static final int BTN_GAME_X_VALUE = 283;
    public static final int BTN_GAME_Y_VALUE = 284;
    public static final int BTN_GAME_Z_VALUE = 285;
    public static final int BTN_GAME_L1_VALUE = 286;
    public static final int BTN_GAME_R1_VALUE = 287;
    public static final int BTN_GAME_L2_VALUE = 288;
    public static final int BTN_GAME_R2_VALUE = 289;
    public static final int BTN_GAME_THUMBL_VALUE = 290;
    public static final int BTN_GAME_THUMBR_VALUE = 291;
    public static final int BTN_GAME_START_VALUE = 292;
    public static final int BTN_GAME_SELECT_VALUE = 293;
    public static final int BTN_GAME_MODE_VALUE = 294;
    public static final int BTN_GAME_1_VALUE = 295;
    public static final int BTN_GAME_2_VALUE = 296;
    public static final int BTN_GAME_3_VALUE = 297;
    public static final int BTN_GAME_4_VALUE = 298;
    public static final int BTN_GAME_5_VALUE = 299;
    public static final int BTN_GAME_6_VALUE = 300;
    public static final int BTN_GAME_7_VALUE = 301;
    public static final int BTN_GAME_8_VALUE = 302;
    public static final int BTN_GAME_9_VALUE = 303;
    public static final int BTN_GAME_10_VALUE = 304;
    public static final int BTN_GAME_11_VALUE = 305;
    public static final int BTN_GAME_12_VALUE = 306;
    public static final int BTN_GAME_13_VALUE = 307;
    public static final int BTN_GAME_14_VALUE = 308;
    public static final int BTN_GAME_15_VALUE = 309;
    public static final int BTN_GAME_16_VALUE = 310;
    
    
    public final int getNumber() { return value; }
    
    public static Code valueOf(int value) {
      switch (value) {
        case 0: return KEYCODE_UNKNOWN;
        case 1: return KEYCODE_SOFT_LEFT;
        case 2: return KEYCODE_SOFT_RIGHT;
        case 3: return KEYCODE_HOME;
        case 4: return KEYCODE_BACK;
        case 5: return KEYCODE_CALL;
        case 7: return KEYCODE_0;
        case 8: return KEYCODE_1;
        case 9: return KEYCODE_2;
        case 10: return KEYCODE_3;
        case 11: return KEYCODE_4;
        case 12: return KEYCODE_5;
        case 13: return KEYCODE_6;
        case 14: return KEYCODE_7;
        case 15: return KEYCODE_8;
        case 16: return KEYCODE_9;
        case 17: return KEYCODE_STAR;
        case 18: return KEYCODE_POUND;
        case 19: return KEYCODE_DPAD_UP;
        case 20: return KEYCODE_DPAD_DOWN;
        case 21: return KEYCODE_DPAD_LEFT;
        case 22: return KEYCODE_DPAD_RIGHT;
        case 23: return KEYCODE_DPAD_CENTER;
        case 24: return KEYCODE_VOLUME_UP;
        case 25: return KEYCODE_VOLUME_DOWN;
        case 26: return KEYCODE_POWER;
        case 27: return KEYCODE_CAMERA;
        case 29: return KEYCODE_A;
        case 30: return KEYCODE_B;
        case 31: return KEYCODE_C;
        case 32: return KEYCODE_D;
        case 33: return KEYCODE_E;
        case 34: return KEYCODE_F;
        case 35: return KEYCODE_G;
        case 36: return KEYCODE_H;
        case 37: return KEYCODE_I;
        case 38: return KEYCODE_J;
        case 39: return KEYCODE_K;
        case 40: return KEYCODE_L;
        case 41: return KEYCODE_M;
        case 42: return KEYCODE_N;
        case 43: return KEYCODE_O;
        case 44: return KEYCODE_P;
        case 45: return KEYCODE_Q;
        case 46: return KEYCODE_R;
        case 47: return KEYCODE_S;
        case 48: return KEYCODE_T;
        case 49: return KEYCODE_U;
        case 50: return KEYCODE_V;
        case 51: return KEYCODE_W;
        case 52: return KEYCODE_X;
        case 53: return KEYCODE_Y;
        case 54: return KEYCODE_Z;
        case 55: return KEYCODE_COMMA;
        case 56: return KEYCODE_PERIOD;
        case 57: return KEYCODE_ALT_LEFT;
        case 58: return KEYCODE_ALT_RIGHT;
        case 59: return KEYCODE_SHIFT_LEFT;
        case 60: return KEYCODE_SHIFT_RIGHT;
        case 61: return KEYCODE_TAB;
        case 62: return KEYCODE_SPACE;
        case 64: return KEYCODE_EXPLORER;
        case 66: return KEYCODE_ENTER;
        case 67: return KEYCODE_DEL;
        case 68: return KEYCODE_GRAVE;
        case 69: return KEYCODE_MINUS;
        case 70: return KEYCODE_EQUALS;
        case 71: return KEYCODE_LEFT_BRACKET;
        case 72: return KEYCODE_RIGHT_BRACKET;
        case 73: return KEYCODE_BACKSLASH;
        case 74: return KEYCODE_SEMICOLON;
        case 75: return KEYCODE_APOSTROPHE;
        case 76: return KEYCODE_SLASH;
        case 77: return KEYCODE_AT;
        case 80: return KEYCODE_FOCUS;
        case 81: return KEYCODE_PLUS;
        case 82: return KEYCODE_MENU;
        case 84: return KEYCODE_SEARCH;
        case 85: return KEYCODE_MEDIA_PLAY_PAUSE;
        case 86: return KEYCODE_MEDIA_STOP;
        case 87: return KEYCODE_MEDIA_NEXT;
        case 88: return KEYCODE_MEDIA_PREVIOUS;
        case 89: return KEYCODE_MEDIA_REWIND;
        case 90: return KEYCODE_MEDIA_FAST_FORWARD;
        case 91: return KEYCODE_MUTE;
        case 92: return KEYCODE_CTRL_LEFT;
        case 93: return KEYCODE_CTRL_RIGHT;
        case 94: return KEYCODE_INSERT;
        case 95: return KEYCODE_PAUSE;
        case 96: return KEYCODE_PAGE_UP;
        case 97: return KEYCODE_PAGE_DOWN;
        case 98: return KEYCODE_PRINT_SCREEN;
        case 103: return KEYCODE_INFO;
        case 104: return KEYCODE_WINDOW;
        case 110: return KEYCODE_BOOKMARK;
        case 111: return KEYCODE_CAPS_LOCK;
        case 112: return KEYCODE_ESCAPE;
        case 113: return KEYCODE_META_LEFT;
        case 114: return KEYCODE_META_RIGHT;
        case 115: return KEYCODE_ZOOM_IN;
        case 116: return KEYCODE_ZOOM_OUT;
        case 117: return KEYCODE_CHANNEL_UP;
        case 118: return KEYCODE_CHANNEL_DOWN;
        case 120: return KEYCODE_LIVE;
        case 121: return KEYCODE_DVR;
        case 122: return KEYCODE_GUIDE;
        case 123: return KEYCODE_MEDIA_SKIP_BACK;
        case 124: return KEYCODE_MEDIA_SKIP_FORWARD;
        case 125: return KEYCODE_MEDIA_RECORD;
        case 126: return KEYCODE_MEDIA_PLAY;
        case 128: return KEYCODE_PROG_RED;
        case 129: return KEYCODE_PROG_GREEN;
        case 130: return KEYCODE_PROG_YELLOW;
        case 131: return KEYCODE_PROG_BLUE;
        case 132: return KEYCODE_BD_POWER;
        case 133: return KEYCODE_BD_INPUT;
        case 134: return KEYCODE_STB_POWER;
        case 135: return KEYCODE_STB_INPUT;
        case 136: return KEYCODE_STB_MENU;
        case 137: return KEYCODE_TV_POWER;
        case 138: return KEYCODE_TV_INPUT;
        case 139: return KEYCODE_AVR_POWER;
        case 140: return KEYCODE_AVR_INPUT;
        case 141: return KEYCODE_AUDIO;
        case 142: return KEYCODE_EJECT;
        case 143: return KEYCODE_BD_POPUP_MENU;
        case 144: return KEYCODE_BD_TOP_MENU;
        case 145: return KEYCODE_SETTINGS;
        case 146: return KEYCODE_SETUP;
        case 147: return KEYCODE_MICROPHONE_MUTE;
        case 148: return KEYCODE_PICTSYMBOLS;
        case 149: return KEYCODE_SWITCH_CHARSET;
        case 150: return KEYCODE_FORWARD_DEL;
        case 151: return KEYCODE_SCROLL_LOCK;
        case 152: return KEYCODE_FUNCTION;
        case 153: return KEYCODE_SYSRQ;
        case 154: return KEYCODE_BREAK;
        case 155: return KEYCODE_MOVE_HOME;
        case 156: return KEYCODE_MOVE_END;
        case 157: return KEYCODE_FORWARD;
        case 158: return KEYCODE_MEDIA_CLOSE;
        case 159: return KEYCODE_F1;
        case 160: return KEYCODE_F2;
        case 161: return KEYCODE_F3;
        case 162: return KEYCODE_F4;
        case 163: return KEYCODE_F5;
        case 164: return KEYCODE_F6;
        case 165: return KEYCODE_F7;
        case 166: return KEYCODE_F8;
        case 167: return KEYCODE_F9;
        case 168: return KEYCODE_F10;
        case 169: return KEYCODE_F11;
        case 170: return KEYCODE_F12;
        case 171: return KEYCODE_NUM_LOCK;
        case 172: return KEYCODE_NUMPAD_0;
        case 173: return KEYCODE_NUMPAD_1;
        case 174: return KEYCODE_NUMPAD_2;
        case 175: return KEYCODE_NUMPAD_3;
        case 176: return KEYCODE_NUMPAD_4;
        case 177: return KEYCODE_NUMPAD_5;
        case 178: return KEYCODE_NUMPAD_6;
        case 179: return KEYCODE_NUMPAD_7;
        case 180: return KEYCODE_NUMPAD_8;
        case 181: return KEYCODE_NUMPAD_9;
        case 182: return KEYCODE_NUMPAD_DIVIDE;
        case 183: return KEYCODE_NUMPAD_MULTIPLY;
        case 184: return KEYCODE_NUMPAD_SUBTRACT;
        case 185: return KEYCODE_NUMPAD_ADD;
        case 186: return KEYCODE_NUMPAD_DOT;
        case 187: return KEYCODE_NUMPAD_COMMA;
        case 188: return KEYCODE_NUMPAD_ENTER;
        case 189: return KEYCODE_NUMPAD_EQUALS;
        case 190: return KEYCODE_NUMPAD_LEFT_PAREN;
        case 191: return KEYCODE_NUMPAD_RIGHT_PAREN;
        case 192: return KEYCODE_APP_SWITCH;
        case 256: return BTN_FIRST;
        case 257: return BTN_1;
        case 258: return BTN_2;
        case 259: return BTN_3;
        case 260: return BTN_4;
        case 261: return BTN_5;
        case 262: return BTN_6;
        case 263: return BTN_7;
        case 264: return BTN_8;
        case 265: return BTN_9;
        case 272: return BTN_MOUSE;
        case 273: return BTN_RIGHT;
        case 274: return BTN_MIDDLE;
        case 275: return BTN_SIDE;
        case 276: return BTN_EXTRA;
        case 277: return BTN_FORWARD;
        case 278: return BTN_BACK;
        case 279: return BTN_TASK;
        case 280: return BTN_GAME_A;
        case 281: return BTN_GAME_B;
        case 282: return BTN_GAME_C;
        case 283: return BTN_GAME_X;
        case 284: return BTN_GAME_Y;
        case 285: return BTN_GAME_Z;
        case 286: return BTN_GAME_L1;
        case 287: return BTN_GAME_R1;
        case 288: return BTN_GAME_L2;
        case 289: return BTN_GAME_R2;
        case 290: return BTN_GAME_THUMBL;
        case 291: return BTN_GAME_THUMBR;
        case 292: return BTN_GAME_START;
        case 293: return BTN_GAME_SELECT;
        case 294: return BTN_GAME_MODE;
        case 295: return BTN_GAME_1;
        case 296: return BTN_GAME_2;
        case 297: return BTN_GAME_3;
        case 298: return BTN_GAME_4;
        case 299: return BTN_GAME_5;
        case 300: return BTN_GAME_6;
        case 301: return BTN_GAME_7;
        case 302: return BTN_GAME_8;
        case 303: return BTN_GAME_9;
        case 304: return BTN_GAME_10;
        case 305: return BTN_GAME_11;
        case 306: return BTN_GAME_12;
        case 307: return BTN_GAME_13;
        case 308: return BTN_GAME_14;
        case 309: return BTN_GAME_15;
        case 310: return BTN_GAME_16;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<Code>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Code>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Code>() {
            public Code findValueByNumber(int number) {
              return Code.valueOf(number);
            }
          };
    
    private final int value;
    
    private Code(int index, int value) {
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:anymote.messages.Code)
  }
  
  public enum Action
      implements com.google.protobuf.Internal.EnumLite {
    UP(0, 0),
    DOWN(1, 1),
    ;
    
    public static final int UP_VALUE = 0;
    public static final int DOWN_VALUE = 1;
    
    
    public final int getNumber() { return value; }
    
    public static Action valueOf(int value) {
      switch (value) {
        case 0: return UP;
        case 1: return DOWN;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<Action>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Action>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Action>() {
            public Action findValueByNumber(int number) {
              return Action.valueOf(number);
            }
          };
    
    private final int value;
    
    private Action(int index, int value) {
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:anymote.messages.Action)
  }
  
  
  static {
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
