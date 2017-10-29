package com.techelevator.ssg.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AlienController {
		
	@RequestMapping("/alienAgeInput")
	public String handleAgeInput() {
		return "alienAgeInput";
	}
		
	@RequestMapping("/alienAgeOutput")
	public String handleAgeOutput(HttpServletRequest request) {
		String planet = request.getParameter("planet");
		double earthAge = Double.parseDouble(request.getParameter("earthage"));
		
		if (planet.equals("Mercury")) {
			request.setAttribute("planetAge", (earthAge / 0.241));
		} else if (planet.equals("Venus")) {
			request.setAttribute("planetAge", (earthAge / 0.616));
		} else if (planet.equals("Mars")) {
			request.setAttribute("planetAge", (earthAge / 1.882));
		} else if (planet.equals("Jupiter")) {
			request.setAttribute("planetAge", (earthAge / 11.862));
		} else if (planet.equals("Saturn")) {
			request.setAttribute("planetAge", (earthAge / 29.456));
		} else if (planet.equals("Uranus")) {
			request.setAttribute("planetAge", (earthAge / 84.07));
		} else if (planet.equals("Neptune")) {
			request.setAttribute("planetAge", (earthAge / 164.81));
		}
		
		return "alienAgeOutput";
	}
	
	@RequestMapping("/alienWeightInput")
	public String handleWeightInput() {
		return "alienWeightInput";
	}
	
	@RequestMapping("/alienWeightOutput")
	public String handleWeightOutput(HttpServletRequest request) {
		String planet = request.getParameter("planet");
		double earthWeight = Double.parseDouble(request.getParameter("earthWeight"));
		
		if (planet.equals("Mercury")) {
			request.setAttribute("planetWeight", (earthWeight * 0.37));
		} else if (planet.equals("Venus")) {
			request.setAttribute("planetWeight", (earthWeight * 0.90));
		} else if (planet.equals("Mars")) {
			request.setAttribute("planetWeight", (earthWeight * 0.38));
		} else if (planet.equals("Jupiter")) {
			request.setAttribute("planetWeight", (earthWeight * 2.65));
		} else if (planet.equals("Saturn")) {
			request.setAttribute("planetWeight", (earthWeight * 1.13));
		} else if (planet.equals("Uranus")) {
			request.setAttribute("planetWeight", (earthWeight * 1.09));
		} else if (planet.equals("Neptune")) {
			request.setAttribute("planetWeight", (earthWeight * 1.43));
		}
		
		return "alienWeightOutput";
	}
	
	@RequestMapping("/alienDriveTimeInput")
	public String handleDriveTimeInput() {
		return "alienDriveTimeInput";
	}
	
	@RequestMapping("/alienDriveTimeOutput")
	public String handleDriveTimeOutput(HttpServletRequest request) {
		String planet = request.getParameter("planet");
		String transport = request.getParameter("transport");
		double earthAge = Double.parseDouble(request.getParameter("earthage"));
		
		if (planet.equals("Mercury")) {
			if (transport.equals("Walking")) {
				request.setAttribute("travelTime", (2167.966));
				request.setAttribute("planetAge", (earthAge + 2167.966));
			} else if (transport.equals("Car")) {
				request.setAttribute("travelTime", (65.039));
				request.setAttribute("planetAge", (earthAge + 65.039));
			} else if (transport.equals("Bullet Train")) {
				request.setAttribute("travelTime", (32.519));
				request.setAttribute("planetAge", (earthAge + 32.519));
			} else if (transport.equals("Boeing 747")) {
				request.setAttribute("travelTime", (11.410));
				request.setAttribute("planetAge", (earthAge + 11.410));
			} else if (transport.equals("Concorde")) {
				request.setAttribute("travelTime", (4.818));
				request.setAttribute("planetAge", (earthAge + 4.818));
			}
			
		} else if (planet.equals("Venus")) {
			if (transport.equals("Walking")) {
				request.setAttribute("travelTime", (1575.342));
				request.setAttribute("planetAge", (earthAge + 1575.342));
			} else if (transport.equals("Car")) {
				request.setAttribute("travelTime", (47.260));
				request.setAttribute("planetAge", (earthAge + 47.260));
			} else if (transport.equals("Bullet Train")) {
				request.setAttribute("travelTime", (23.630));
				request.setAttribute("planetAge", (earthAge + 23.630));
			} else if (transport.equals("Boeing 747")) {
				request.setAttribute("travelTime", (8.291));
				request.setAttribute("planetAge", (earthAge + 8.291));
			} else if (transport.equals("Concorde")) {
				request.setAttribute("travelTime", (3.501));
				request.setAttribute("planetAge", (earthAge + 3.501));
			}
			
		} else if (planet.equals("Mars")) {
			if (transport.equals("Walking")) {
				request.setAttribute("travelTime", (2980.974));
				request.setAttribute("planetAge", (earthAge + 2980.974));
			} else if (transport.equals("Car")) {
				request.setAttribute("travelTime", (89.429));
				request.setAttribute("planetAge", (earthAge + 89.429));
			} else if (transport.equals("Bullet Train")) {
				request.setAttribute("travelTime", (44.715));
				request.setAttribute("planetAge", (earthAge + 44.715));
			} else if (transport.equals("Boeing 747")) {
				request.setAttribute("travelTime", (15.689));
				request.setAttribute("planetAge", (earthAge + 15.689));
			} else if (transport.equals("Concorde")) {
				request.setAttribute("travelTime", (6.624));
				request.setAttribute("planetAge", (earthAge + 6.624));
			}
			
		} else if (planet.equals("Jupiter")) {
			if (transport.equals("Walking")) {
				request.setAttribute("travelTime", (23924.277));
				request.setAttribute("planetAge", (earthAge + 23924.277));
			} else if (transport.equals("Car")) {
				request.setAttribute("travelTime", (717.728));
				request.setAttribute("planetAge", (earthAge + 717.728));
			} else if (transport.equals("Bullet Train")) {
				request.setAttribute("travelTime", (358.864));
				request.setAttribute("planetAge", (earthAge + 358.864));
			} else if (transport.equals("Boeing 747")) {
				request.setAttribute("travelTime", (125.917));
				request.setAttribute("planetAge", (earthAge + 125.917));
			} else if (transport.equals("Concorde")) {
				request.setAttribute("travelTime", (53.165));
				request.setAttribute("planetAge", (earthAge + 53.165));
			}
			
		} else if (planet.equals("Saturn")) {
			if (transport.equals("Walking")) {
				request.setAttribute("travelTime", (48515.982));
				request.setAttribute("planetAge", (earthAge + 48515.982));
			} else if (transport.equals("Car")) {
				request.setAttribute("travelTime", (1455.480));
				request.setAttribute("planetAge", (earthAge + 1455.480));
			} else if (transport.equals("Bullet Train")) {
				request.setAttribute("travelTime", (727.740));
				request.setAttribute("planetAge", (earthAge + 727.740));
			} else if (transport.equals("Boeing 747")) {
				request.setAttribute("travelTime", (255.347));
				request.setAttribute("planetAge", (earthAge + 255.347));
			} else if (transport.equals("Concorde")) {
				request.setAttribute("travelTime", (107.813));
				request.setAttribute("planetAge", (earthAge + 107.813));
			}
			
		} else if (planet.equals("Uranus")) {
			if (transport.equals("Walking")) {
				request.setAttribute("travelTime", (103651.065));
				request.setAttribute("planetAge", (earthAge + 103651.065));
			} else if (transport.equals("Car")) {
				request.setAttribute("travelTime", (3109.532));
				request.setAttribute("planetAge", (earthAge + 3109.532));
			} else if (transport.equals("Bullet Train")) {
				request.setAttribute("travelTime", (1554.766));
				request.setAttribute("planetAge", (earthAge + 1554.766));
			} else if (transport.equals("Boeing 747")) {
				request.setAttribute("travelTime", (545.532));
				request.setAttribute("planetAge", (earthAge + 545.532));
			} else if (transport.equals("Concorde")) {
				request.setAttribute("travelTime", (230.336));
				request.setAttribute("planetAge", (earthAge + 230.336));
			}
			
		} else if (planet.equals("Neptune")) {
			if (transport.equals("Walking")) {
				request.setAttribute("travelTime", (165578.387));
				request.setAttribute("planetAge", (earthAge + 165578.387));
			} else if (transport.equals("Car")) {
				request.setAttribute("travelTime", (4967.352));
				request.setAttribute("planetAge", (earthAge + 4967.352));
			} else if (transport.equals("Bullet Train")) {
				request.setAttribute("travelTime", (2483.676));
				request.setAttribute("planetAge", (earthAge + 2483.676));
			} else if (transport.equals("Boeing 747")) {
				request.setAttribute("travelTime", (871.465));
				request.setAttribute("planetAge", (earthAge + 871.465));
			} else if (transport.equals("Concorde")) {
				request.setAttribute("travelTime", (367.952));
				request.setAttribute("planetAge", (earthAge + 367.952));
			}
		}
		
		return "alienDriveTimeOutput";
	}
		
}
