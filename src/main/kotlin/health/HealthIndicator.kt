package health

import com.justgifit.JustGifItProperties
import org.springframework.boot.actuate.health.Health
import org.springframework.boot.actuate.health.HealthIndicator
import org.springframework.stereotype.Component
import javax.inject.Inject

@Component
class JustGifItHealthIndicator : HealthIndicator {

    @Inject
    lateinit var properties: JustGifItProperties

    override fun health(): Health {
        if (!properties.gifLocation.canWrite()) {
            return Health.down().build()
        }

        return Health.up().build()
    }
}