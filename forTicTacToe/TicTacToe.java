package forTicTacToe;

import javax.swing.JFrame;
/**
 * This is a simple TicTacToe game.
 * @author antoniosaavedra
 *
 */
public class TicTacToe
{
	public static void main(String[] args)
	{
		JFrame ticTacToe = new TicTacToeFrame();
		ticTacToe.setTitle("TicTacToe!");
		ticTacToe.setSize(600, 600);
		ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ticTacToe.setLocationRelativeTo(null);
		ticTacToe.setVisible(true);
	}
}
