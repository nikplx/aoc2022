import org.testng.annotations.Test

class D03RucksackTest {
    data class TestInput(val input: String, val output: Int)

    @Test
    fun testCalories() {
        val tests = listOf(
            TestInput(
                input = """
                    vJrwpWtwJgWrhcsFMMfFFhFp
                    jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
                    PmmdzqPrVvPwwTWBwg
                    wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
                    ttgJtRGJQctTZtZT
                    CrZsJsPPZsGzwwsLwLmpwMDw
                """.trimIndent(),
                output = 157
            ),
            TestInput(
                input = """
NGvdqJmJvpNbGRMGQgRsfgfn
WlHTHShlLwSWjFRsncfbcwsgQc
BHtSBHWHSCWLZHlhjTHLLdbNNqNpzpDzNvDvtPmmPp
JJSShnTpDSJJlllfwBNVbMQWwhQhgQtt
cTzrvrHdLwwzttQNWB
qrFqTFvqZvrmsplsjlnDflnZ
mhhhVHvNNddHMwBqQwlWZZtv
fbjzjJllCtWjjrZtjq
CbgcgpPRDJfzVHFFnSnsSDlm
ZqBPqBQnPLmqZsFqhsvFsLZQMfSSMbbWddWbjbJSrgWgJf
NRHnlllcDwwCNClNtttHbNJrSJNfbdWMdfbWgdrJ
cHGlzTptHtCpncHnCpHpRGzDmvVhqLmvLPmPvLqPmzsqqmPB
rCzVtMMbMvCmmvGlclFQFfLpJFJfJpcLHPJL
nDGGwqGqnRTfpHLpRFpLFf
ZNdNTDsWgNZsZBndnGrzrlMrjgrmjVGjvC
MgFZHFTgqFFDZZDTdVdHrzQvLzCGwpCPrGLqQpzz
JsnmbjhmffJbRNJppzPPzwzzrwdv
lfblfthBRbBRjnjhBtBlZgdVcFSTVFDtSSWgMcdM
hPVhVhWPCMhlDTTWdrPlTcLjfbZbFNjZBbFNBbdBFbsB
MHSwMJpHnqJHwtqHGqGGmvqZsZFjBmsBNRBFfLbsFsZfsZ
pqtMHHQpvqnwMpgJMCChTQhVVlclPWrCCD
zRBBhZFwWZlBQpMZNNNJsfDpLsNsJppN
SvggPbjvVSvvtgGVPbbnSMcCLtMrDddssJdsLdfdCD
mTSmMgHjgmgGgqzTwZwBlBFzwB
WLzWZHWSZPFRVSPSPM
hmrvmGvfTCmhBGBqTfnmJFfdbQcwdMhMwRdbQMVQQcMhsQ
JGJJnrnnCmqBTJTrNBqBLDzHFLFDNgjZlWtDNZHL
bwbbnWwpbTwFHwRzzzmH
ZccjZjddjPVhJmrBQHHFQRHcWF
NVhWldsMjZZZLSnvSTGTgvMb
ccJbHpzccZJsNpJCmHHlBTgHnlTPmF
qvQGQfDVhhDfvVfVDSdDCbFnjmllPQjlbCmnFgjg
hSbtWRGvhdfDVdVRfvRNpsWsZLNMZzcswLZWMM
vlTdlBTMdtjcvLGmtb
SSgfSsJngCSSwNFgspHFNFFpjlbGjQbbQGLthLnWtmWWhjbm
SJsfqqgfNHwJfHgCpwzBZVMDBPMMRPTlqzBr
VHsVhtbRHRpVHBfBCJdNfGjggGJdqLGq
wSzSrrSMPDSDwzPjdqJjNwGdsLqGjj
MnrnQTnWZWWzWQDMvZhtHtshhHlHBcBBsvVt
DZbPqdTqGTZtRrzjFmZZtF
gjQwVvBVWgfghvgmcrBNFccHFRmHtF
QlgvWlfgVsQfdlqqjqPDbPlM
VcfLwwcMlpnfVDrDtrtvbjMtTM
mmgBgzSQmQdgHBFSLvvbDTJmTDvTJJDr
RWNBHHzWNSdSdzFgSLNWWfZGwfpcwWVnnfpCCWlV
GDZLtsJMFGLDPnbblJlNJNcJ
BBRgSwqwqRZhTVSqjVgRwCdQcmcPmdnPPnPnmjlrbmQj
RCqfVvhfCCShBCRfVCwztDGZMHpLWHftFptspF
dlZqlBfBSShZhvprbCJTDrJCJjJNDh
WGRwQwHsMVVGMsVGcRVtQWRVpNCjWNDbzbDNJnbnrCbprrNW
HgHRRVGGwLgLBPvgSp
QPlZSlZzVLLDwhDfBppf
bghGGhmqrspDcfbsbs
tTrdTgFddtnvmdgvtCTdGTTqFZjjQQPVZPSZSjlZhVVQjlRS
BgBFHnwwSTNHqSPN
GJmCbDdlbZGCLhsstNLsMZZZ
JGJpCCDvmlVDVldGJBVfBBRwRjnVWWBRfN
WTFWQgGQtTMqMCJJzDVDgCchhj
mNPBmPlPHrWmwmNLHmShcnJjhrnzJzdcdzdjJJ
SHssNRSmvPRmlsmLwwsmwLvpQptpQWMQbGFQFtfpFfZQ
DgpNLVjgNjjmzGPVRmfrZrctdTcrzfwzdfMc
bnbNqnbFNwMcMtMfwF
svCQHHhShnbCvHChsvHlLDVhJJLRJGNpgPJPjLLD
TmBzgTVVBgfbmTVfPmFRJcHctnHDLDDLJqqBGB
hwvlNCCvSphMwSvrlwCCrrDcfRlJDLRtGqcqHnqRqLGR
pMSSMMNCSwMjjWhwrrjShQNFmsPmPFWbbZzVfZsPPPZVmZ
sTTrWGCMggpVWhSBltWp
HNJdwLDzNcJnNLwJJPqpllqhBpqStjfwlfpj
PJHzDzFLtLccdLggvrGGmgvFssgG
FwCssBFRBlvbBVdQ
jPzjDpqNGqJzZGSNHppPclFvvdfVflblbJlmFfll
SDzDpSNqjZjjZFSrHrFZTTCMLsnTLnnnMhrLtLnn
ScWQvvSDddGrWVrG
fwhPFLpwTfTjrzwHdmmmGdgdsPsqdRmV
CHlFpTpwwCjwFjwjCBnrvQBZZcBSnZtvZl
vJvdWVNslWtJcDtDHrDf
GCnnMZpZnSZpvDqFtftfjfZqrh
TbGMSRCRvWbPNsWB
NNNdsRddGNdZZTCBtqbtBgtC
zhFHppHhzcgmzQhccjgmjhQTnvvBFtBnCBbbnTvtCCtntt
HpjmhfSjQwfzwHmcggfzjSLfVWPDsWMsMdWdDSMsGWPPllVN
WSvcSSwrGzFsznqPNNWqPqlllB
djVDdHdSPRqlntjN
LpZZgpLgLHTDHVpDSTsffvGwrcfffGwv
wGlbWGVvGlWlrvppbFMjQjsBjCsjmCzzQzNv
ZgfdJcfZhMNCgSBRCQRz
hcLDZPZdqZhJPhcTHJfPHVqlqtFWMrGGrpwVGVpWrV
dsngCgdssHDVsHdsFDvMDvmMmjTjDFTL
qZpSqptZZGWLTLSjlLHFzl
NZqqRpWqhQpNhqhpZRWBJQQssJbbCsdbHsCbgb
QdGBjjbHsBsBbBdGcwwTGrCRRrFcPPTC
ZDtvWfMDvWScSrpzPccCdr
hhZMgffDhZNvtDgHQsQQVQmBVVHNdV
LhQLrzVdVmqcjmTNzm
tHMZDJDZCDDtZMWwCJjcffqqfjRmqSRqcq
CpHpZZWWtWpWwBplZWmQbhVBVPhnPrhbLQPvvs
FFgFSmJmSgGpZzsmgGmbDlDzMQPDNPzRQRDjQQzV
CLwnwWBdrtthttTWBWdPnVvRVVVNMSVQPvVnnV
BTtdLthfhTrLdftCwqrddmGFcSfpGbsmFGHpmGFHHc
JFJnMZwQBqnJJBqZJqPqMFBlbmBHblWbrmlfbWgbvmWrgW
spCTjtVzsNDdsNdTsjVTtNzgHfmWWgHSSrgrbSbbhHbVHS
TfCdjjsjzLNsfTszcdqcQMnRMPPRnFRPQRFP
VvDgDqTDtTNWTWfNFWlW
pzPvdssRNQFQRNZF
CCpBpsrrccGvttgGqBDG
jmZrrjlCJqmCVFMPbFbBZPVp
dfLLfRMGTdHbssPLLPbFwL
QWWHHTRQdRRHRMhzWQfvddngqJqjjNgqqjlgvrtjJmtn
sGGwJdHDDTfWbTcRzbbz
BmjvdhNVlFBZmSZvFrWpfpcBrbzbWcbqpf
SLmSZLhNhMhwtLswPHGssd
mGhlPclTmhhlJRWlRTDPlJtTFMngBcLSBHHBHLHSwncFgLwB
jQVbjprjVfzbZQrzdGnHrrBLgSGwGFLHHg
zzZqjQjdvsRlGqThGJ
GSPQPvVmSwpVQGVlSQmWJRcFBpnFBcBWcJcJDc
rTTCLmhTTbZNqMNbhjfhmDzsFDWzsDnfcBWDDDzcFs
qmjhrhCtbMCZNhZMhNTZbLjvQdHdHGgwgdtQHlllQwlQgv
ggpCCgvjPTJWjBjWWJgCWCdVVHRZdLfZhqLdZRHZrf
GsstmNslzzzGlMnGMnVZRZrLpZqdhZHZrZHM
lNbDsbltmzpsmmmnnccBJTwPgWvvvTwPwFPS
FWbTRTdWGCnThqQVBQqJ
rrDMPrDcSrvtcJdLVhVHQMQVBQ
rNtNwrZtDNPmZStwvcvRlGFRlzCRlpmdpplbpb
gHrHrlFgjCrNDfCMTzwwLN
WhvTvvWnmQvpGWNNLzwWfNzW
vTnRZhnRRBhscBVpcBTvnsjFltPqggqHPHHjHrPcgrFg
VzfWRVsnNzWfsvpQPvvFbdVQpQ
SqCqqhLDTTCTTCDcSdbpPvdPFFvhMbdMvF
BCLBDCDGLlTClCSrglrGzWmrszzmHRJmfJfJpHNz
dwGBHGdwdcCMCBzzZJJssZFsBBgt
NRqbRbQhLQRLrQlTggFWlZtRlTvW
FbNDFDLqnmLmNbqbLQbhLNDpPcVHMSVMwCVHcPnVGccwjdcM
LdHtrrrHrLZrBVbQjtPnnsVb
TwfhhcTCTCpfJJwpTJwhDDPnbGsbFjlQnnQjFBFslsBQDl
pwJCThfRCMMMvhchhwHSmWLZHLNHMdrdZzPg
LbMQbHbHQLLMsWLvszvzvqCfqCCqss
ScWlpmplWrDzlzvznJ
RNNcZWhSZmdVdPwHbQQTTwNwjP
jFFFtHZjwmLNmnQCFL
sVbdsqcqHBHqrQrLPmWqQnmr
sfGJVVzJJsczczfsczBzzvdbTMTptlTZZgDSDtGlplZSlgHt
MgMQJdqqMDQJDggzTMgVplvffmctcCzmfjRlmmmjjR
HrGbGswnBBtRvccBlljB
HZPHRRGGshZHnnnwPnshnVZqMJJDdpQDVgDdVDWDpQ
whwQRQGHRVhWRRcLLJgLmL
jSnnzgBnpCZdCBjNmnNNJmllJTlccT
jPSzrzpzpCjgfZZrZCFpdwQDQVVPttGDtVqQVtHqth
mvnGFmvGhTcSCBcBpv
bwMRzbQLwBQRWSctCcTtLpss
JJgHZqRrbqDnmBjhDh
MVvvGrsbGtVsgTggHjSFHJBBBg
PPNpCpQPZppplttDNwZPBdfTFPPTSBWSFjjSTH
CpNwChQCzDDNZwhZlpwZpqrqsGGsmmctGbbbzcmMms
pjMbgCgdQjCgBjQQCncwcGGLDZvFtGLsZZFZtH
zPhhrVhVVSmqVqhmzPqvDtsLLHrFWFvGFGFsvt
SVPzVTzJNBfjDQbQTb
CRDjjRmmLhjRFFChmHDNLZzsZNnPZNzlnnsvlv
SSqcMwdrctQVtqTwSSgnvZnsZvnBZpcPsvlvbz
trMGSSVdQQqdGMtwwQCmRHHhmJFhsfJGfjHh
phJzrnJJwNNSJhSnwpwGGZzmvNfmmDvfcvcDfvbRPNcvvR
tWtgQBqsqdLFLmZvTRTfDZcb
ttssdgQqsHQtZFsqVdgdgdCBJGSphnljnJhjwrhnpJrrzJHl
srzpVWrWTptbrPpPPtcWpNhNNNdfhhDgDNvfBDNNds
jmnQHmLqlnSlGMjqnLLljRHqdNdgwHZBgfhZvBdNhDwBhhtZ
MjSlnLmMLnCGjlSQLVWCzbrcTpPtpFbFWr
ZnQRczHZsMSRZQcBRSZRscQwJbWFbbQwpWTjdFLJTJTWwd
PVmGqDlGhDPVNvqDmmqtqLbbpJfFJwpbdJpdbfdjwdbl
VGNCgGPgqVqhNvmNCNZnSsRLRsMzzgBRnHrS
ZgMMgJMhjmZrZgggmlTTbfwTfRfbRGwlGTDf
nPqQttNVPzSPnqpGDwDDbGfwbJ
dJvQzzJtdSPWSthhHMjgMvrHghsv
cMvwHCWcMnwWnScWVFzTqHpHFpVBFtFp
bbblgRDhtlGgRPFBRqFpmzVFBTFp
fPbtGJGhfDfDsPhQJDPbbnjjSWnwjdvQCnSSCnCSCM
NcgDtwghTLntgNtLrjfHSSFlSbCfprlL
ZGGMmdmVZVvsRQvMGRVVZCHPfpZSfZbFPlbPjCfH
RVRjvRzMQQJBVmzzgWgzTWTWhNcWzN
gsgBqdsWprWddpBghBpwwJzbLcvhCZmwZCFcJC
PRPtStHfwmJvzPmF
HnSHHRQDVFsVVgsgTWsG
QRQTRrDHSLSNzzZLzZ
dBmPwfwffWtWRtzdhhLzLzLzzLFN
BtWnWCCVBWtCBmRPqVmqmntjjlJHJslJQVsQjsbbHrjHDQ
TwwJrHSMnHGvWHMvvSqrrZbRrRqfqVNfbNRc
GjhstmPFFhlFtmmjQtlgVcZVfcgqqNRNpgRcbP
CzdCdFCtdzGWGJwWWHdW
zfSVfSpHVpCHSZLnsttDnvDvpcsqRc
rWzMGWFFPBFjqjDjFDFs
PbQQWbJPrQwPrrPBwrJCVzZZLZdLSLLmfZfHJd
gPDPLgsLNslNLHqlLqqjhjnwwjJbDjnjwTRnGD
tzdMdMddmcRMdtcFFGWnwWjFwjFhGbTG
mRMmttpVHNCNpNZN
mfCFGfDDFCDWtvvstjjJ
njnVnrggLlwVVqLpvHVpMpMsHVhhMW
QQPPPnjlPPSgwBrnNLcdFCNNGFbmbZFcZzFf
NzNHFNFnFrtgwwPchvGFFS
LsjdQCVsTsLCTTdMCJtQgPPqwhPgqScPGvSZ
jdLdVjJtCVjRCMpmpNfNNWHrNzDrNrHrmr
NmggPPrPbPmdCbcfCNLVRRWpWTWRVTpdVVWspW
qGhDzGqnwGQnJrjllJWttMRDFRtMVsTDTTZs
SrnHhGQlvLmSfbfc
DmdPCJMLlQdSjGCqjcGGccHH
zWtBwfsgvVnBfftWtnnpTmnTRhppHpTqpc
wzFtwZWmsVFzZtvPJSPbMFJFDJJJJd
wrPRRSJSWrTSRzRWrqlfCLlcBfBGDqrL
gVNQjgdVhdfqqhlDCBDs
NmjgbtmNtjNnjbPbvRJPbpwZwZSD
tNHGccGNthtSGmVjjVmrrVPqSB
fgDTwRwDFmLTFlspBBqjjBgqBssB
mLCZwZRMJMbtdWMtvd
TPzHPPgChjsgPdPTjQvZLvnpLQnvlRQn
GScFSzFWWrfGGMrVFMqGqmrBnplmwmnlZZlmnvvvLRnJLLvJ
qVSVFtFtFtSzrTNNDsHhhNTHht
NQqtqmqmNhvvclvhcljJ
CSCfMZSgWMvfWgrbjwcMJwrrrclr
CGSCZgSGZPRTSCWWDgGBRtnFRvqNRsLLzmsLzqpq
tWmtCZjnWZWCGjtnnmtcwFvvlgSDTDTvVwsVgCfT
LpLhpLdqbBMNsQPBQhpLvgFqllgfllvVvwTDTwlw
pNQBBdLbBPpPHLmGsRWjRZJzWZHc
WtjBSvBjWzTtzvDTjBfbbthsMNRNgCMQDgRcCcQwLRgCQgNc
HJmqnHqHpplVnlPdqGrpGQNLCgSwLMwFwFFCgnMLRw
SdJGpHVZmqpVVVdZVJGddsjvzzvZTsZvWTbvszWjWj
FhRhhLZgLZhCRWZBFFWRmGbvSgHqvvbPvHTPccVncb
wzSMpjJdwssdrdDfJJJsJSvpGVPqGpvVqTVqTnccnTvH
rwfMMdtDjNwjzDrjDDdtChRZWSWhmCWBSmLQRW
RWLNLWrhtrhWJmLnSStBBdVtBGVVBt
wQqnzjCFbflqpQlQFTDDGGsGDBZBSZMsDVfG
QvqCTwjjTqwbTqjznFzQvqjFJgmvgghJgPmgmvPNmNRJJNgN
qLqwhztjhqqDDzjZqqjPMmFmCnVDsmgbggggTMDC
WBhWJQrJcRmnFnWMTTCF
lvvJSlGSvBvJQBrcpSfwwLjLPjLfhptjwNtp
sbFjnZpPPGZLZzCRhqbJhJMCqMgS
vtNvFHBcNwNDHffvtfQMSMJVRMBMChVqSMCBJV
cQlvTffDlFWTlcfFTlHQNtzzGGWGdLsGWdrnzspjGdGr
LMQtlzlMQLLrztVfVdfqDdrhrhdd
JPJTHcvPTPTJGPZgbmvGPmcZhwRVdDBdSWfdRHSBfqBSVHqq
sJchPZGccmcbvcmgmPcCnnnnpzppQppspFjQntMl
qtQQtsMDqtPDGQltPHbsLFnMccRNcVLLrVNVwMVM
LCSdzZdBZmvzZTCBfJrwnWppFcWrFpdRnWpR
ThSgBZTLJmPHlgQHjPtq
mrwGPrVrbjbPVmwmbdTwbGfJMDJMgsqhhDjsqjJppfqt
SQnLnWnWHLSFCRnlQRnFhqfsDMJMppqDfcWgpDfD
NCSvLQnRSQFBLBzdgvTbbwPrzbPZ
FFjvvHZbHZnZpvFHZcFbgQVwgwQnJfQPVNQJGqSq
RWmCmdClRtTzVRwVfVQPNQgN
shwhzTsmlbhZDLbBHL
PpPHllshHDTlsprJrsPQpltzjVzjLNggZNznLNLnhNnnjL
qRBvSwqBdRqvmfvCRSSLjcnVcVmLgmnNZjmQVg
vdfbSfBWffMbQqQdtprtslHJsWDGHptt
pqQdFWlQZpGZpLpS
wnjwJhjvVgjwvwvsgwgtsRTtssGTtLrNtrSrHS
VDJVMGCCChjccDJDwgwVJvMBzBfzbzbDPPFBFBbffzbQqq
gBwwBZGhcfhnFjvrQjMhrjQQ
PPLJNdNldlNSRmzLSlpbHQvbvdMtjjbMtMtt
lqDJmlSmlmPzqNmzmVnvnBZDgvBWgcZTfD
HMqrwWqzWJqHzrjgGFNNtQFMFQnFBt
LddPLdVmchPSvmcvTZlvghLLFBDNDtFGDQpRnntnFDQnFPnB
SbSvZTSLSgqbCHJWzr
TGcjzjgtNqjttgNNTTjmGwLhfQQfDnDLDwSQWTSCvh
PHJRJJbBVMPRMJHbJRMPbwCQSSvfCDhVhvvwwvQLnW
ZJPMbHbJJJsdsJplRRRZsPJztrFrqtzGrgmcrprcmFjDgN
tlDpSbpwgbgtpddJppgJwJDtNQWGQlcGQGhlhnGGWcrcWWFr
MTZLqzjfFLqLjRfvqsQhNPGnhGGsnchW
LMCzjzMTTjjFRfZMBTCvRfLRDDbVVpSbSgwwwtSBSSDJgStg
ZLVTrJmJDHFtzSTlpc
wNhhNfhvwwvvfvPnsNPhglszqpcHcFbbFSzSzzCHzb
NWjPwgNgRHGWvhwWPfgfGwjMDQJdQLVLJLQVVLRdBRJrZr
CPRJCFJTqZfJlJRqssHJftCWQMnHHwMbbngMMrQMgMWwQn
BmzVVhvvcvDdWgwVrTnrMb
BjzvhjLLczzBjLchDLmLJtsCqFClTqsZCPtPTCjq
DbWjNCWQCRRNsDPpFGcjjcqFqFfm
PZdMSzSZTtZZqVmpqmmmTpgg
ZvZMzBztzvhvddPMQlNCQDbQLBLrsRRW
WzWFhHpWhvCpPpPLswMHswMMHLbgmH
NNZSZTVQNrTnqDqrrwtwwLstsMGMnbntGm
TBmQcrNqNSQVmrmQBPdpFFzhFlPzzCPF
nBgmSrjgmjtmrbjSFGLWtLVpFVQQVGFL
JlChvCzvqCqWffwFdFVQfPVPHPFGLV
JzvTThZcCCMcMMwJzlbjTjmnRgRTTBnWgbBn
rppjbbDpGnwrGprVCLLJZDzQqZzLNQqc
htflFBFmBBlWTTgsggtZHMQLCCCcHqHMfZczHq
gFdFTWgRhBmWWTFSGQbVnSSPnvndpv
qFSRRGGgTgThTQhcllCWCJCctWWhfJ
bvbdzNDMzHZNNHFHfJWWjljWNNfcnWtn
PdbPdPBHmsdbdbPdBHBdmdmsgrTqsGQRTwSpSFrqrRSFpRwp
pQJZZGQtChQtpWZQTTWhNtVdVWSLBrsLSVrLvrvrLdBd
lMHnzGRgPRMSMBLcvBSS
nglFzflzHRDGgzfzPgHRbTDQthbZbhhppNbbCqhb
jVrvrJjpZfZCCGctwhbhMRcM
BQQnFFTBdBndzssFsdTbRwDGTPGbcMbwtDgbcG
HnLtQQBLtWNrVpqjJvWN
dnVlsnJlMqnlNqJdnMRvDHBRvbBLHLpRSPPPRS
NcGGCthFwcFwmjCTGDSfPSSHSPfPtDHfbD
zNWNZGWNzQnWlJWVJn
tMGSBtRtvjFcGpQrQQQQrp
FffbJTJfPLNbTnJJmlVcQVfpQmlWVVfH
FTdJJdhNvZhMtRSh
pSTfMtMLSTPsPsBszP
jdlmlFHHhVdmVHFNFRnHzHQJsGZBJbbJDvsDRPBsrGrDrJ
VHnFjcdccjlmNVmnzmNVmCMggfqwtLLfSMwWtcWMSg
                """.trimIndent(),
                output = 8139
            ),
        )

        tests.forEach {
            assert(D03Rucksack.getDuplicateScore(it.input) == it.output)
        }
    }
}