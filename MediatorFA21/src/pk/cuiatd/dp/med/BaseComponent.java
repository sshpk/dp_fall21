package pk.cuiatd.dp.med;

public abstract class BaseComponent {
	protected Mediator mediator;
	
	public void setMediator(Mediator med){
		this.mediator = med;
	}
}
