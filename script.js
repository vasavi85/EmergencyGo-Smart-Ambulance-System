window.onload = function () {
  getLocation();
};

function bookAmbulance() {
  const status = document.getElementById("status");
  status.innerText = "🚑 Ambulance booked successfully! Finding nearest ambulance...";

  setTimeout(() => {
    status.innerText = "🚦 Ambulance dispatched. Estimated arrival: 7 minutes.";
  }, 2000);
}

function getLocation() {
  const locationText = document.getElementById("location");

  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(
      (position) => {
        const lat = position.coords.latitude.toFixed(5);
        const lon = position.coords.longitude.toFixed(5);
        locationText.innerText = `Latitude: ${lat}, Longitude: ${lon}`;
      },
      () => {
        locationText.innerText = "Location access denied. Showing demo location: Guntur, Andhra Pradesh";
      }
    );
  } else {
    locationText.innerText = "Geolocation not supported by browser.";
  }
}