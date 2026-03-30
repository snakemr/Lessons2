import data.*
import lessons.Lesson.*
import ui.main


fun main() = main { lesson, exit ->
    when (lesson) {
        Text1x1Column -> Lesson1x1()
        Text1x2Row -> Lesson1x2()
        Text1x3Box -> Lesson1x3()
        Text1x4Alignment -> Lesson1x4()
        Text1x5Alignment -> Lesson1x5()
        Text1x6Arrangement -> Lesson1x6()
        Text1x7Alignment -> Lesson1x7()
        Text1x8Lights -> Lesson1x8()
        Text1x9Dossier -> Lesson1x9()
        Text1x10Space -> Lesson1x10()

        Control2x1Button -> Lesson2x1(exit)
        Control2x2OutlinedButton -> Lesson2x2(userName)
        Control2x3FilledTonalButton -> Lesson2x3()
        Control2x4ElevatedButton -> Lesson2x4()
        Control2x5TextButton -> Lesson2x5()
        Control2x6IconButtons -> ComposeSendingMessage { Lesson2x6(it) }
        Control2x7OutlinedIconButton -> Lesson2x7()
        Control2x8ElevatedIconButton -> Lesson2x8()
        Control2x9CheckBox -> Lesson2x9()
        Control2x10Switch -> Lesson2x10()
        Control2x11Radio -> Lesson2x11()
        Control2x12Toggle -> Lesson2x12()
        Control2x13Radio -> Lesson2x13()
        Control2x14Check -> Lesson2x14()
        Control2x15TriStateCheck -> Lesson2x15()
        Control2x16Toggles -> Lesson2x16(userName)
        Control2x17TextField -> ComposeEnteringMessage { Lesson2x17(it) }
        Control2x18PassField -> ComposeAuthenticatingMessage { Lesson2x18(it) }
        Control2x19CustomField -> ComposeSearchingMessage { Lesson2x19(it) }
        Control2x20BasicField -> ComposeAddingMessage { Lesson2x20(it) }
        Control2x21RegForm -> ComposeRegisterMessage { Lesson2x21(it, exit) }
        Control2x22SingleSegment -> Lesson2x22()
        Control2x23MultiSegment -> Lesson2x23()
        Control2x24Badge -> Lesson2x24()
        Control2x25Chip -> ComposeCallingMessage { Lesson2x25(it) }
        Control2x26Chip -> ComposeFullScreenPaddings { Lesson2x26() }
        Control2x27Chip -> Lesson2x27()
        Control2x28Chip -> Lesson2x28(userName)
        Control2x29Sliders -> Lesson2x29()
        Control2x30Sliders -> Lesson2x30()
        Control2x31Progress -> Lesson2x31()
        Control2x32Progress -> Lesson2x32(takeLoadingPainterResource(R.drawable.p1))
        Control2x33Menu -> Lesson2x33(exit)
        Control2x34Select -> Lesson2x34()
        Control2x35Time -> Lesson2x35()
        Control2x36Date -> Lesson2x36()
        Control2x37Time -> Lesson2x37()
        Control2x38Date -> Lesson2x38()
        Control2x39Calc -> Lesson2x39()
        Control2x40Back -> Lesson2x40(takeFruits(3))

        List3x1Simple -> Lesson3x1(takeColors())
        List3x2Padding -> Lesson3x2(takeColors())
        List3x3Items -> Lesson3x3(takeColors())
        List3x4Rows -> Lesson3x4(takeCoreIcons())
        List3x5Images -> Lesson3x5(takeNamedFruits())
        List3x6Cards -> Lesson3x6(takeNamedFruits())
        List3x7Cards -> Lesson3x7(takeCoreIcons())
        List3x8Users -> Lesson3x8(takeUsers())
        List3x9LongList -> Lesson3x9(takeNamedFruits(repeat = 500))
        List3x10LongRow -> Lesson3x10(takeNamedFruits(repeat = 500))
        List3x11Pager -> Lesson3x11(takeUsers())
        List3x12Pager -> Lesson3x12(takeFruits())
        List3x13VGrid -> Lesson3x13(takeNamedFruits(repeat = 500))
        List3x14HGrid -> Lesson3x14(takeUsers())
        List3x15Select -> Lesson3x15(takeUsers(13))
        List3x16Select -> Lesson3x16()
        List3x17Select -> Lesson3x17(takeCoreIcons())
        List3x18Carousel -> Lesson3x18(takePosters())
        List3x19Chat -> Lesson3x19(takeChat())
        List3x20Feedback -> Lesson3x20(takeReviews())
        List3x21UserList -> Lesson3x21(takeUsers())
        List3x22Movies -> TakePosters { p,l,r -> Lesson3x22(p,l,r) }
        List3x23Review -> Lesson3x23(takeReviews())
        List3x24Friends -> Lesson3x24(takeUsers())
        List3x25Swipes -> Lesson3x25(takeUsers())
        List3x26Swipes -> Lesson3x26(takeUsers())
        List3x27Order -> Lesson3x27(takeUsers())

        Ui4x1Action -> ComposeFloatingButton { Lesson4x1(exit) }
        Ui4x2ExtAction -> ComposeFloatingButton { Lesson4x2(exit) }
        Ui4x3TopBar -> ComposeTopBar { Lesson4x3(exit) }
        Ui4x4BottomBar -> ComposeBottomBar { Lesson4x4(userName, exit) }
        Ui4x5Scaffold -> Lesson4x5(userName, exit)
        Ui4x6Tabs -> Lesson4x6()
        Ui4x7Tabs -> Lesson4x7()
        Ui4x8Search -> Lesson4x8()
        Ui4x9Alert -> Lesson4x9(exit)
        Ui4x10Ads -> Lesson4x10()
        Ui4x11DateTime -> Lesson4x11()
        Ui4x12SnackBar -> Lesson4x12(userName)
        Ui4x13Bar -> ComposeBottomBar({ Lesson4x13() }) { Lesson4x13Content() }
        Ui4x14Rail -> Lesson4x14(exit)
        Ui4x15Drawer -> Lesson4x15(exit)
        Ui4x16Drawer -> Lesson4x16(exit)
        Ui4x17Test -> Lesson4x17(exit)
        Ui4x18Pager -> Lesson4x18()

        Api5x1Cities -> Lesson5x1()
        Api5x2Regions -> Lesson5x2()
        Api5x3RegionCities -> Lesson5x3()
        Api5x4WeatherCities -> Lesson5x4()
        Api5x5SearchPrice -> Lesson5x5()
        Api5x6AlphaPages -> Lesson5x6()
        Api5x7NumberPages -> Lesson5x7()
        Api5x8Infinity -> Lesson5x8()
        Api5x9Genres -> Lesson5x9(exit)
        Api5x10Search -> Lesson5x10()
        Api5x11Likes -> Lesson5x11()
        Api5x12Register -> Lesson5x12(takePositions())
        Api5x13Login -> Lesson5x13(takePositions())
        Api5x14Inbox -> Lesson5x14(takeAvatars())
        Api5x15Delete -> Lesson5x15(takeAvatars())
        Api5x16Send -> Lesson5x16(takeUsersMails())
        Api5x17Sent -> Lesson5x17(takeAvatars())
        Api5x18Mail -> Lesson5x18(takeUsersMails())

        Data6x1 -> Lesson6x1(database)

        System7x1Adopt -> Lesson7x1()
        System7x2Save -> Lesson7x2(exit)
        System7x3Launch -> Lesson7x3()
        System7x4Call -> Lesson7x4()
        System7x5Image -> Lesson7x5()
        System7x6Images -> Lesson7x6()
        System7x7Camera -> Lesson7x7()
        System7x8Geo -> Lesson7x8()

        else -> {}
    }
}
