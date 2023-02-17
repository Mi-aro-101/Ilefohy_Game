package menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.ilefohy.game.Ilefohy;

public class ScreenMenu implements Screen{
	String style = new String("small");
	Skin skin = new Skin(Gdx.files.external("Desktop/Tetikasa/Ilefohy/assets/skins/default/skin/uiskin.json"));
	Stage stage; Ilefohy games;
	Button play = new TextButton("PLAY", skin); Button quit = new TextButton("QUIT", skin);
	int width, height;
	
	public ScreenMenu(Ilefohy g) 
	{
		this.width = g.getWidth(); this.height = g.getHeight(); this.games = g;
	}
	@Override
	public void show() {
	
	}

	public void render(float delta) {
		setButton(play, height); setButton(quit, height-100);
		stage = new Stage(new ScreenViewport());
		stage.addActor(play); stage.addActor(quit);
		Gdx.input.setInputProcessor(stage);stage.draw();
	}

	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		
	}
	
	public void setButton(Button bt, int height)
	{
		bt.setPosition((width/2)-40, height/2); bt.setSize(100, 40);
		bt.setTransform(true); bt.setColor(Color.RED);
	}
}
