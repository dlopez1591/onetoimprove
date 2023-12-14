const { createApp, ref } = Vue

  createApp({
    setup() {
      const message = ref('Testing Vue')
      return {
        message
      }
    }
  }).mount('#app')