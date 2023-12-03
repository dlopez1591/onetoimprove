
const { createApp, ref, onMounted } = Vue;

    createApp({
        setup() {
            const usuario = ref({
                id: 0,
                nombre: '',
                cargo: '',
                imagen: ''
            });

            // Realizar la solicitud HTTP usando Axios al montar el componente
            onMounted(() => {
                axios.get('http://localhost:8080/api/superadmin')
                    .then(response => {
                        // Actualizar el objeto de usuario con los datos obtenidos
                        usuario.value = response.data[0];
                    })
                    .catch(error => {
                        console.error('Error al obtener los datos:', error);
                    });
            });

            return {
                usuario
            };
        }
    }).mount('#app');

 
