def car_fueling(total_distance, tank, stops):
    """Return minimum number of stops required to travel the distance. 
    Given the tank is refilled to full at each stop.

    Args:
        distance (int): Total distance that need to be travelled
        tank (int): Fuel tank capacity in terms of distance that can be travelled with it.
        stops (list): List of Stops at distances e.g., [200 375 550 725] stop will come 
        after travelling that distance.
    """
    
    no_of_refills = 0
    fuel_capacity = tank
    
    for i in range(0, len(stops)-1):
        if i > 0:
            fuel_left -= (stops[i] - stops[i-1])
        else:
            fuel_left = tank - stops[i]   
             
        if i < len(stops):
            distance_to_next_stop = stops[i+1] - stops[i]
        else:
            distance_to_next_stop = total_distance - stops[i]
            
        if distance_to_next_stop > fuel_capacity:
            return -1
        
        if distance_to_next_stop > fuel_left:
            no_of_refills += 1
            tank += fuel_capacity
        
    return no_of_refills

print(car_fueling(500, 200, [100, 200, 300, 400]))
            
            
        
    