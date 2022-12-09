import org.testng.annotations.Test

class D06ConsecutiveCharsTest {
    data class TestInput(val input: String, val output: Int)

    @Test
    fun testCalories() {
        val tests = listOf(
            TestInput(
                input = """
                    bvwbjplbgvbhsrlpgdmjqwftvncz
                """.trimIndent(),
                output = 5
            ),
            TestInput(
                input = """
                    nppdvjthqldpwncqszvftbrmjlhg
                """.trimIndent(),
                output = 6
            ),
            TestInput(
                input = """
                    nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg
                """.trimIndent(),
                output = 10
            ),
            TestInput(
                input = """
                    zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw
                """.trimIndent(),
                output = 11
            ),
            TestInput(
                input = """
zdnnfgfsgffgllwrwprwrgwwpssznzrnznllstszsttpdptdpdmdsdzsdscsmcmttdllbsbwwtwnwswcchshlhjhfhwfftcchnnfwwbqwqwrqqgmgzmmwzwfzwfzzzsmzzrczcmmhphzhbbbgdbgddmggwwbbttvmtvttfsfttjlttdfdsdqqczqzffbrfbbfbrrmdrrlslshllwzwrzrzzlqldqdjdjwjvjzjrjjcsszjjqfqnfqqsrqrccbhhwphwhbwwlzwwjwfjwfwzfwzffssvjsjddcsdslslrsrfsrffsggdffrcrcdcpprrzbrzbbtstvvqttbqqgfgsggtvtrvtvbbrqrsqrsqsvsbbzmbmgmvgmmrqrzzbbnjjlwjjfssdrdbrbffwrrrjjgcgtgvvjbjjjsqjsqqncntnndcdrcrhhsgstslldwdbwdbdtbdbggpnndhdvhhvrrlzzfjjffzszvvzgzhhqzqttdhdrrwdwzdwdbwwfsfwsfwfqqzwzbzmzwmmvgggvssvwswfwswhwzzqtqrtthhbbjggjppnpfnfmnnghgrhhtvtqtsttbpprzzwqqfhqfflttzffrprwpwspplzpztptgtltjlttwwsrsrprwrsswnwttcscqsqlsqqhshbhlblnnpznnzlnndrnrcncvcqcjqqvhvppjzjddzbzsztzqqlmlnlnblnlwnllswszwzrzddqhdqhqffhfhjjpbbhvbvmmfhmhcccjlclhcllbrlblddnpplggcmmvddmmqzzmqmppnjpjjjzllqjqccrwwhzhnnlmlhhbbtztvtltvtnvtvltlrtrllbttbzzfwfrrjzjbbmgghjhqhlljnjhhhjzjcjvcvwwzczwcwgcclflnnsvvcncbncnqqpjqjnjwjrrgqrrmqmfmmmjgjfgjfftggqdgqddgcdcdwdrdsswqqphpjhhdjjwswfwfnfqnqccvhvzvmzvzzplzljzjpzzhmzmqzqjjprpvrrhqqnbngnnpvpfvpvqvwwrhhdndqdppmcppzddbzzjcjdjfjnfnngqnnchcqqpllpwppgllcblcblbddzhhqsqbssjqqgmgbgzzvhvnhvnhvvpmpvvlddgppzrprmpmbpbjpbpfptpspddcgddqhdhhthrhjrhrvrlrffvbfbvfvbblssftfnfwwrwnnzdznnbwnbwnwlwttszzmmlzlhhpjhhjvvlvwwdnddzwdwgdgdssflfvfzvznzbzrbzzdssphhgttllcjcvcjjdrdqdhdnndlndldcllcnllslvlnvllmglgnnplpmpzzjwjtwtnntrtjtvjtjffhcfclltppftfwwprrwsrwwzdwzdztzccbmccfcfzczbcbsbqsstjtrrpnnfqqfmmchmmwmrwrwzwztzddgzdgzzfwzzrppcscrrgvgvgvtgtsslrsrvsrrdcdscscwcwqqsccwjcjgjvgvpvnvhhchrrgprpvrvsvsttgghdghhmphmmbvbcbsccdbcbnccbnnsjnjhnnzbnnpjbwdpczcvgjpgwfqrmnvwncflvnttwhfgmfqvngpdhbhvlglfhtdqmqtqcgjcqghzvbdghdgvjcsjrlpqvgcdnbpqrcrcvqqdlcpscqbfpsnhzcdbbcssslrjlzsqpprsbmtqhzblvwbswprhztmpcgfqfsgshchrhjmwwhpzsjzrmrvgdgwjrlwpgqhbzrmnmnnsnvzsrlhthgvlpljsjrpbhbzctdqgvdjcmrgtvqjqbcwsprnfmntzpbjcdtlchhjgwpmldmsstbtztfdbgbstgnlwbzrrzmvbrhnrlcwfgwwbfnntbjspqwngbjrvhdcnblqssgjlbcwbbgphhnmfcmdhqdhsnmvdjnwwwjlffswhsmwqrsprftjwtbtcvmpctgvfqvvcjpnwzqldglfbwfzpnqmdlrdpjmjptvwsctlmhmzzgvplglfgsvrfbqbmrhplczbvqpdjjhhvfqswhzhqfgzstwwpbtbsnnlgpshwqgppzbpsfpfvcntbbbzwdnfcgcwzbqwmhjrhpdfvpbzpmfnmllrcqlqhcbzfltzcgccwwqmtsmwchhvbqtdrnsbrchqqcmtfqpddcjplbvdhhtndrrmfdtmbpdvwthvgdccnrcqmpznlvzqzfjqmpvgjtfbtfjnrmlzhwhljrrqnbqzpfhcvncblfggrtbdfjqnlgpbrzmwcvrvjtjscfmcnfjgqzqsphldvhdbpvmghrvsdmvpmvvdmdhwdghtjltmlcmfhvrsvcvpblwhhfcfdqnrsjbcldgbwhtnjntmgvprhbjrcvsmhgtfphcwncpjtngqhvwrmgprstbtdstmttpzcntmzvncwslqlldpnjbtpmsfnwbpwpnlfgdvcqplvlqqjvfftnnvpcmwjrvwqhlrshftrbhcwnczzsnvtnjnrbzzgzfsqhnfwlcgzvvhqcgvqtmcpnhlvdlmwgsvtwbqgrdsrrddszvscbgtlpwpzjrbvwhjnrpprhtzmthbpfzvplzwfdtnwqwtctgjslmcczjvwplsqwgfnfbgdjbsdpwbgflttvvqlhzgmmpjsnwbqqtcdszfqbhgnmbbmrbrgnrzdmzwnjjzjqcwqcqfchjrzlspgbrchcbgwbhvggsqbvdpzbpnwdtqvcjwcwnbjdhsdfmbtwfbfhzwwtnqzhmtvtbfwrsqjzgssvlwszvlmvbslpncnhmsdhcqqfpftztpzbbhsgbnscddbjlgwgjjndgwbrhwmsfdmmsnlwgwdsdltwjfvwnczjrbgcvsfczppltdptlgcdfzgmqpjngstldqgmwhdmfrwwfqwdgswvfdrtsgtvttpcbnhzbscnchpvfjvbcszbwchnbmfrvsswslbzlhgwlvfchdbfthbpdbwwqtmlgwjqtjhzrjzzmrpdwnvfgrnqdcqmwtttmwjvgcmjsddvtlswldzhtppwvhmlghwlgblfttctnglwhtfvqgjmdjcnflsrjvpjwcjfftbdmmcbqvfwnnnzsltllncbstgnhtmpsltgztqzjbbrtqpcvdlnhpnhvmmztpfpplbqjlpqvfsdvhwvstdmqbtnpzrcbdhvdtghqwcppcfzjfjsfwvqrtfgcdzwgzjvrqqsjtnhlbjcmtjcnmtpffwcwhqqphwjsrhpqvnnhhrcnvztfdjzbjggwlgjprbpssgnmtcrvprwbsrfvvphrsgzgbrfnpgtqbbprhfphqntsglrmhzfnwqptlslnhtrhfprjpdcglcffsblnjwczmgwhmmtgsgwljmqlvdglqmzwmtqcvgcrmqjldlsnbssdvrrtltngvrsqbctqlsngqvcphjvhmwsssgwmvgzdctjcmjtpcjhvfcrfhbffdqfjjvpqwgvnlzhgfnfmlrrfvjrdvhzdcvdvmpncvtjbbnczpzmglfqnpbsrsjwgvszsnqvrnvlhmqjjnmsfngbdlpwbqllcptjtlbhrfdvhlrpdlznpvndjzjdtjflqqjdgjjpmnpmjgcglllgcqbfpvdtpbjdnvrclmnlfdrpbmwzgvdhgbzvbhwqfslhshbfcbwrnsjndgjgccllfbzgmcjqcmdnfftnccphqtwmgqgfqlvlwsrprctchqrscwvgpdrwgcfgzjwmzmmsmwzgtzsjtqfggcczcmghlqgnqqjvsrsfrrmwmnrnhbsszmwsqlrggsbdwzzfnhwcggjszfrlffplvcblvphqmzjnzwzdshhdprfrdbcrmbtztcfvgpzpmmgflswphvnvtwhbbhjwffsvqfjlfvzqmhmsmddwdwsqfnnplbqnptbvgjqgmflsbfdtpvdgbfnqmcqznhpqbpwtbfpqllvqwvcftdjjtlsvzbssbtcdzqqqvzlqhfpdthscqmvhpndmnztthvvzccqswswspnqcbncvszrgjshjhdsclrjdnjdczqmcjldbspclgrmwqdvcvpcsvjggfdqlrwlnzptfvcwjsgblpjzgcrrmjqptvdnwr
                """.trimIndent(),
                output = 1566
            ),
        )

        tests.forEach {
            assert(D06ConsecutiveChars.getBeginning(it.input) == it.output)
        }
    }
}