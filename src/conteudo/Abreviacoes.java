package conteudo;

public enum Abreviacoes {
	
	µA("Microampere"),
	µm("Micrometre"),
	µs("Microsecond"),
	a("Alphabetic (see section 4.3, Data Element Format Conventions)"),
	AAC("Application Authentication Cryptogram"),
	AAR("Application Authorisation Referral"),
	AC("Application Cryptogram"),
	ACK("Acknowledgment"),
	ADF("Application Definition File"),
	AEF("Application Elementary File"),
	AFL("Application File Locator"),
	AID("Application Identifier"),
	AIP("Application Interchange Profile"),
	an("Alphanumeric see section 4.3"),
	ans("Alphanumeric Special (see section 4.3)"),
	APDU("Application Protocol Data Unit"),
	API("Application Program Interface"),
	ARC("Authorisation Response Code"),
	ARPC("Authorisation Response Cryptogram"),
	ARQC("Authorisation Request Cryptogram"),
	ASI("Application Selection Indicator"),
	ASN("Abstract Syntax Notation"),
	ATC("Application Transaction Counter"),
	ATM("Automated Teller Machine"),
	ATR("Answer to Reset"),
	AUC("Application Usage Control"),
	b("Binary (see section 4.3)"),
	BCD("Binary Coded Decimal"),
	BER("Basic Encoding Rules (defined in ISO/IEC 8825–1)"),
	BIC("Bank Identifier Code"),
	BGT("Block Guardtime"),
	BWI("Block Waiting Time Integer"),
	BWT("Block Waiting Time"),
	C("Celsius or Centigrade"),
	CAD("Card Accepting Device"),
	CAPDU("C-APDU","Command APDU"),
	CBC("Cipher Block Chaining"),
	CCD("Common Core Definitions"),
	CCI("Common Core Identifier"),
	CDA("Combined DDA/Application Cryptogram Generation"),
	CDOL("Card Risk Management Data Object List"),
	CID("Cryptogram Information Data"),
	CIN("Input Capacitance"),
	CLA("Class Byte of the Command Message"),
	CLK("Clock"),
	cn("Compressed Numeric (see section 4.3)"),
	CPU("Central Processing Unit"),
	CSU("Card Status Update"),
	CTPDU("C-TPDU", "Command TPDU"),
	CV("Cryptogram Version"),
	CVM("Cardholder Verification Method"),
	CVR("Card Verification Results"), 
	CVRule("CV Rule", "Cardholder Verification Rule"),
	CWI("Character Waiting Time Integer"),
	CWT("Character Waiting Time"),
	D("Bit Rate Adjustment Factor"),
	DAD("Destination Node Address"),
	DC("Direct Current"),
	DDA("Dynamic Data Authentication"),
	DDF("Directory Definition File"),
	DDOL("Dynamic Data Authentication Data Object List"),
	DES("Data Encryption Standard"),
	DF("Dedicated File"),
	DIR("Directory"),
	DOL("Data Object List"),
	ECB("Electronic Code Book"),
	EDC("Error Detection Code"),
	EF("Elementary File"),
	EN("European Norm"),
	etu("Elementary Time Unit"),
	f("Frequency"),
	FC("Format Code"),
	FCI("File Control Information"),
	FIPS("Federal Information Processing Standard"),
	GND("Ground"),
	GP("Grandparent key for session key generation"),
	Hex("Hexadecimal"),
	HHMMSS("Hours, Minutes, Seconds"),
	IO("I/O", "Input/Output"),
	IAC("Issuer Action Code (Denial, Default, Online)"),
	IAD("Issuer Application Data"),
	IBAN("International Bank Account Number"),
	Iblock("I-block", "Information Block"),
	IC("Integrated Circuit"),
	ICC("ICC", "Integrated Circuit(s) Card", " or Current drawn from VCC"),
	IEC("International Electrotechnical Commission"),
	IFD("Interface Device"),
	IFS("Information Field Size"),
	IFSC("Information Field Size for the ICC"),
	IFSD("Information Field Size for the Terminal"),
	IFSI("Information Field Size Integer"),
	IIN("Issuer Identification Number"),
	IK("Intermediate Key for session key generation"),
	INF("Information Field"),
	INS("Instruction Byte of Command Message"),
	IOH("High Level Output Current"),
	IOL("Low Level Output Current"),
	ISO("International Organization for Standardization"),
	IV("Initial Vector for session key generation"), 
	KM("Master Key"),
	KS("Session Key"),
	L("Length"),
	ls("l.s.","Least Significant"),
	Lc("Exact Length of Data Sent by the TAL in a Case 3 or 4 Command"),
	LCOL("Lower Consecutive Offline Limit"),
	LDD("Length of the ICC Dynamic Data"),
	Le("Maximum Length of Data Expected by the TAL in Response to a Case 2 or 4 Command"),
	LEN("Length"),
	Licc("Exact Length of Data Available or Remaining in the ICC (as Determined by the ICC) to be Returned in Response to the Case 2 or 4 Command Received by the ICC"),
	Lr("Length of Response Data Field"),
	LRC("Longitudinal Redundancy Check"),
	M("Mandatory"),
	mO("mΩ", "Milliohm"),
	MO("MΩ", "Megohm"),
	ms("m.s.", "Most Significant", " and m/s = Meters per Second"),	
	mA("Milliampere"),
	MAC("Message Authentication Code"),
	max("max.", "Maximum"),
	MF("Master File"),
	MHz("Megahertz"),
	min("Minimum"),
	MK("ICC Master Key for session key generation"),
	mm("Millimetre"),
	MMDD("Month, Day"),
	MMYY("Month, Year"),
	N("Newton"), 
	n("Numeric (see section 4.3)"),
	NAD("Node Address"),
	NAK("Negative Acknowledgment"),
	nAs("Nanoampere-second"),
	NCA("Length of the Certification Authority Public Key Modulus"),
	NF("Norme Française"),
	NI("Length of the Issuer Public Key Modulus"),
	NIC("Length of the ICC Public Key Modulus"),
	NPE("Length of the ICC PIN Encipherment Public Key Modulus"),
	ns("Nanosecond"),
	O("Optional"),
	OS("O/S", "Operating System"),
	P("Parent key for session key generation"),
	P1("Parameter 1"),
	P2("Parameter 2"),
	P3("Parameter 3"),
	PAN("Primary Account Number"),
	PC("Personal Computer"),
	PCA("Certification Authority Public Key"),
	PCB("Protocol Control Byte"),
	PDOL("Processing Options Data Object List"),
	pF("Picofarad"),
	PI("Issuer Public Key"),
	PIC("ICC Public Key"),
	PIN("Personal Identification Number"),
	PIX("Proprietary Application Identifier Extension"),
	POS("Point of Service"),
	pos("pos.", "Position"),
	PSE("Payment System Environment"),
	PTS("Protocol Type Selection"),
	RAPDU("R-APDU", "Response APDU"),
	RBLOCK("R-block", "Receive Ready Block"),
	RFU("Reserved for Future Use"),
	RID("Registered Application Provider Identifier"),
	RSA("Rivest, Shamir, Adleman Algorithm"),
	RST("Reset"),
	SAD("Source Node Address"),
	SBLOCK("S-block", "Supervisory Block"),
	SCA("Certification Authority Private Key"),
	SDA("Static Data Authentication"),
	SFI("Short File Identifier"),
	SHA1("SHA-1", "Secure Hash Algorithm 1"),
	SI("Issuer Private Key"),
	SIC("ICC Private Key"),
	SK("Session Key for session key generation"),
	SW1("Status Byte One"),
	SW2("Status Byte Two"),
	TAC("Terminal Action Code(s) (Default, Denial, Online)"),
	TAL("Terminal Application Layer"),
	TC("Transaction Certificate"),
	TCK("Check Character"),
	TDOL("Transaction Certificate Data Object List"),
	tF("Fall Time Between 90% and 10% of Signal Amplitude"),
	TLV("Tag Length Value"),
	TPDU("Transport Protocol Data Unit"),
	tR("Rise Time Between 10% and 90% of Signal Amplitude"),
	TS("Initial Character"),
	TSI("Transaction Status Information"),
	TTL("Terminal Transport Layer"),
	TVR("Terminal Verification Results"),
	UCOL("Upper Consecutive Offline Limit"),
	UL("Underwriters Laboratories Incorporated"),
	V("Volt"),
	var("var.", "Variable (see section 4.3)"),
	Vcc("Voltage Measured on VCC Contact"),
	VCC("Supply Voltage"),
	VIH("High Level Input Voltage"),
	VIL("Low Level Input Voltage"),
	VOH("High Level Output Voltage"),
	VOL("Low Level Output Voltage"),
	VPP("Programming Voltage"),
	Vpp("Voltage Measured on VPP contact"),
	WI("Waiting Time Integer"),
	WTX("Waiting Time Extension"),
	WWT("Work Waiting Time"),
	YYMM("Year, Month"),
	YYMMDD("Year, Month, Day");	
	
	private String descricao;
	private String abreviacao;
	private String or;
	
	private Abreviacoes(String descricao){
		this.descricao = descricao;
	}
	
	private Abreviacoes(String abreviacao, String descricao){
		this(descricao);
		this.abreviacao = abreviacao;		
	}
	
	private Abreviacoes(String abreviacao, String descricao, String or){
		this(abreviacao, descricao);
		this.or = or;
	} 
	
	public String getDescricao() {
		return descricao;
	}	
	
	@Override
	public String toString() {		
		return (this.abreviacao == null ? super.toString() : this.abreviacao) + " = " + this.descricao + (this.or == null ? "" : this.or);
	}	
	
	public static Abreviacoes myValueOf(String texto){		
		return valueOf(texto.replace("-", "").replace("/", "").replace(" ", "").replace(".", ""));
	}
}
