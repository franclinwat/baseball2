	package com.sfeir.baseball;

	import java.util.Objects;

	public class Player {
	
	private String firstName ;
	private String name ;
	private Team currentTeam;

	public Player() {
	}
	public Player(String firstName, String name, String position) {
		this.firstName = firstName;
		this.name = name;
		this.position = position;
	}




	public String getName() {
		return name;
	}


	public Team getCurrentTeam() {

		return currentTeam;
	}
	public void setCurrentTeam(Team currentTeam) {

		this.currentTeam = currentTeam;
	}
	
	@Override
	public String toString() {
		return "\nPlayer [name=" + getName() + ", firstName=" + firstName + ", currentTeam="
				+ getCurrentTeam().getName() + ", position="+ position +"]";
	}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (!(o instanceof Player player)) return false;
			return Objects.equals(firstName, player.firstName);
		}

		@Override
		public int hashCode() {
			return Objects.hash(firstName);
		}


		String position;
	public String getPosition() {
		return position;
	}


}
