public class TcpUtil {

	// Packet structure
	// 2 byte : Packet length (Max 65,536)
	// 1 byte : Operation code
	// * byte : content
	// 1 byte : CRC (my own magic)

	public TcpUtil() {

	}

	// OPCode:0x00
	// Connect to server
	// Send my info
	public int SendRegisterMyInfo(UserInfo uinfo) {
		return 0;
	}

	// OPCode:0x80
	// Receive return code (1 byte)
	// 0 - success
	// -1 - network problem
	// -2 - invalid user info
	// -3 - lower client version
	public int RecvRegisterMyInfo(UserInfo uinfo) {
		return 0;
	}

	// OPCode:0x01
	// Disconnect from server
	public int SendUnregisterMyInfo() {
		return 0;
	}

	// OPCode:0x02
	// Send target info
	public int SendRequestStartMatchingTarget(UserInfo targetinfo) {
		return 0;
	}

	// OPCode:0x82
	// Receive return code (1 byte)
	// 0 - success (with target ID)
	// -1 - invalid condition
	// -2 - in searching
	// -3 - in wait (with wait man count)
	public int RecvRequestStartMatchingTarget(UserInfo targetinfo) {
		return 0;
	}

	// OPCode:0x03
	// Send target info
	public int SendRequestStopMatchingTarget(UserInfo targetinfo) {
		return 0;
	}

	// OPCode:0x83
	// Receive return code (1 byte)
	// 0 - success
	// -1 - fail
	public int RecvRequestStopMatchingTarget(UserInfo targetinfo) {
		return 0;
	}

	// OPCode:0x04
	// Send request wait man count
	public int SendRequestWaitManCount() {
		return 0;
	}

	// OPCode:0x84
	// Receive return code (1 byte)
	// 0 - success (with man count)
	// -1 - fail
	public int RecvRequestWaitManCount() {
		return 0;
	}

	// OPCode:0x05
	// Throw message
	public int SendThrowMessage() {
		return 0;
	}

	// OPCode:0x85
	// Receive return code (1 byte)
	// 0 - success
	// -1 - fail
	public int RecvThrowMessage() {
		return 0;
	}

	// OPCode:0x06
	// Send result code of receiving message (1 byte)
	// 0 - success
	// -1 - fail
	public int SendCatchMessage() {
		return 0;
	}

	// OPCode:0x86
	// Receive message (n byte)
	public int RecvCatchMessage() {
		return 0;
	}

	// OPCode:0x87
	// Receive status code (1 byte)
	// 0 - target's network is off
	// 1 - target said goodbye
	public int RecvStatusCode() {
		return 0;
	}
}
